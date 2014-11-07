package controllers

import play.api.mvc._
import securesocial.core._
import service.DemoUser

class Application(override implicit val env: RuntimeEnvironment[DemoUser]) extends Controller with
                                                                                   securesocial.core.SecureSocial[DemoUser] {

  //  def index = Action {
  //    Ok(views.html.index("Your new application is ready."))
  //  }

  def index = SecuredAction { implicit request =>
    Ok(views.html.index("Your new application is ready."))
  }

}