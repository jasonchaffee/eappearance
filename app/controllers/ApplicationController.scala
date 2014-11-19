package controllers

import java.time.LocalDateTime
import java.util.UUID

import models.{ArraignmentPlea, Defendant, User}
import com.mohiva.play.silhouette.core.{ LogoutEvent, Environment, Silhouette }
import com.mohiva.play.silhouette.contrib.services.CachedCookieAuthenticator
import scala.concurrent.Future
import javax.inject.Inject
import forms._

/**
 * The basic application controller.
 *
 * @param env The Silhouette environment.
 */
class ApplicationController @Inject() (implicit val env: Environment[User, CachedCookieAuthenticator])
    extends Silhouette[User, CachedCookieAuthenticator] {

  /**
   * Handles the index action.
   *
   * @return The result to display.
   */
  def index = SecuredAction.async { implicit request =>
    Future.successful(Redirect(routes.DocumentController.documents))
//    val user = request.identity
//    val list = List(
//      ArraignmentPlea(UUID.randomUUID(), user.barNumber.getOrElse(0), 8398098, Defendant(UUID.randomUUID(), Some("Jason"), Some("Chaffee"), Some("Jason Chaffee")), LocalDateTime.now()),
//      ArraignmentPlea(UUID.randomUUID(), user.barNumber.getOrElse(0), 3409893, Defendant(UUID.randomUUID(), Some("Brad"), Some("Koehn"), Some("Brad Koehn")), LocalDateTime.now()),
//      ArraignmentPlea(UUID.randomUUID(), user.barNumber.getOrElse(0), 34923345, Defendant(UUID.randomUUID(), Some("Steve"), Some("Simpson"), Some("Steve Simpson")), LocalDateTime.now()),
//      ArraignmentPlea(UUID.randomUUID(), user.barNumber.getOrElse(0), 20934890, Defendant(UUID.randomUUID(), Some("David"), Some("Morgan"), Some("David Morgan")), LocalDateTime.now()),
//      ArraignmentPlea(UUID.randomUUID(), user.barNumber.getOrElse(0), 20934891, Defendant(UUID.randomUUID(), Some("David"), Some("Morgan"), Some("David Morgan")), LocalDateTime.now())
//    )
//    Future.successful(Ok(views.html.documents(request.identity, list)))
  }

  def profile = SecuredAction.async { implicit request =>
    Future.successful(Ok(views.html.profile(request.identity)))
  }

  /**
   * Handles the Sign In action.
   *
   * @return The result to display.
   */
  def signIn = UserAwareAction.async { implicit request =>
    request.identity match {
      case Some(user) => Future.successful(Redirect(routes.ApplicationController.index))
      case None       => Future.successful(Ok(views.html.signIn(SignInForm.form)))
    }
  }

  /**
   * Handles the Sign Up action.
   *
   * @return The result to display.
   */
  def signUp = UserAwareAction.async { implicit request =>
    request.identity match {
      case Some(user) => Future.successful(Redirect(routes.ApplicationController.index))
      case None       => Future.successful(Ok(views.html.signUp(SignUpForm.form)))
    }
  }

  /**
   * Handles the Sign Out action.
   *
   * @return The result to display.
   */
  def signOut = SecuredAction.async { implicit request =>
    env.eventBus.publish(LogoutEvent(request.identity, request, request2lang))
    Future.successful(env.authenticatorService.discard(Redirect(routes.ApplicationController.index)))
  }
}
