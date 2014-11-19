package controllers

import java.time.LocalDateTime
import java.util.UUID
import javax.inject.Inject

import com.mohiva.play.silhouette.contrib.services.CachedCookieAuthenticator
import com.mohiva.play.silhouette.core.exceptions.AuthenticationException
import com.mohiva.play.silhouette.core.providers.CredentialsProvider
import com.mohiva.play.silhouette.core._
import forms._
import models.{ArraignmentPlea, Defendant, User}
import play.api.mvc.Action
import java.util.UUID
import javax.inject.Inject
import scala.concurrent.Future
import play.api.mvc.Action
import play.api.libs.concurrent.Execution.Implicits._
import com.mohiva.play.silhouette.core._
import com.mohiva.play.silhouette.core.providers._
import com.mohiva.play.silhouette.core.utils.PasswordHasher
import com.mohiva.play.silhouette.core.services.{ AvatarService, AuthInfoService }
import com.mohiva.play.silhouette.core.exceptions.AuthenticationException
import com.mohiva.play.silhouette.contrib.services.CachedCookieAuthenticator
import models.services.{DocumentService, UserService}
import models.User
import forms.SignUpForm

import scala.concurrent.Future

class DocumentController @Inject() (
  implicit val env: Environment[User, CachedCookieAuthenticator],
  val documentService: DocumentService)
  extends Silhouette[User, CachedCookieAuthenticator] {


  def documentForm = SecuredAction.async { implicit request =>
    Future.successful(Ok(views.html.document(request.identity, DocumentForm.form)))
  }

  def documents = SecuredAction.async { implicit request =>
    val user = request.identity
    for {
      docs <- documentService.retrieveAll(user.barNumber.getOrElse(0))
    } yield {
      Ok(views.html.documents(user, docs))
    }
  }

  def submit = SecuredAction.async { implicit request =>
    DocumentForm.form.bindFromRequest.fold(
      form => Future.successful(BadRequest(views.html.document(request.identity, form))),
      data => {
        val user = request.identity
        val defendant = Defendant(UUID.randomUUID(), Some(data.firstName), Some(data.lastName),
          Some(data.firstName + " " + data.lastName))
        val document = ArraignmentPlea(UUID.randomUUID(), user.barNumber.getOrElse(0), data.caseNumber, defendant, LocalDateTime.now())

        for {
            document <- documentService.save(document)

//          maybeAuthenticator <- env.authenticatorService.create(user)
        } yield {
          Redirect(routes.DocumentController.documents)
//          maybeAuthenticator match {
//            case Some(authenticator) =>
//              env.eventBus.publish(SignUpEvent(user, request, request2lang))
//              env.eventBus.publish(LoginEvent(user, request, request2lang))
//              env.authenticatorService.send(authenticator, Redirect(routes.ApplicationController.index))
//            case None => throw new AuthenticationException("Couldn't create an authenticator")
//          }
        }
      }
    )
  }
}
