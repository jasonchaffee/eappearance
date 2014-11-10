package controllers

import play.api.mvc._
import securesocial.core._
import model.User

class Application(override implicit val env: RuntimeEnvironment[User]) extends Controller with
                                                                                   securesocial.core.SecureSocial[User] {

  //  def index = Action {
  //    Ok(views.html.index("Your new application is ready."))
  //  }

  def index = SecuredAction { implicit request =>
    Ok(views.html.index(request.user.main))
  }

}