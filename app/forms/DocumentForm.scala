package forms

import play.api.data.Form
import play.api.data.Forms._


object DocumentForm {


  val form = Form(
    mapping(
      "caseNumber" -> number,
      "firstName" -> nonEmptyText,
      "lastName" -> nonEmptyText
//      "email" -> email,
//      "barNumber" -> number,
//      "password" -> nonEmptyText
    )(Data.apply)(Data.unapply)
  )

//ArraignmentPlea(UUID.randomUUID(), "8398098", Defendant(UUID.randomUUID(), Some("Jason"), Some("Chaffee"), Some("Jason Chaffee")), LocalDateTime.now()),

  case class Data(
    caseNumber: Int,
    firstName: String,
    lastName: String
//    email: String,
//    barNumber: Int,
//    password: String
  )
}
