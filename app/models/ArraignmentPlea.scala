package models

import java.time.LocalDateTime
import java.util.{ Calendar, UUID }

trait Document {
  val uuid: UUID
  val barNumber: Int
  val caseNumber: Int
  val defendant: Defendant
  val date: LocalDateTime
}

case class ArraignmentPlea(
  uuid: UUID,
  barNumber: Int,
  caseNumber: Int,
  defendant: Defendant,
  date: LocalDateTime) extends Document

case class Defendant(
  uuid: UUID,
  firstName: Option[String],
  lastName: Option[String],
  fullName: Option[String])

// Arraignment Plea and Counsel
// Not For Use in Cases Involving Domestic Violence
// Pursuant to Penal Code Section 977 (a)(2)
