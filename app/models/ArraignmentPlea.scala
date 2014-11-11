package models

import java.time.LocalDateTime
import java.util.{ Calendar, UUID }

case class ArraignmentPlea(
  uuid: UUID,
  caseNumber: String,
  defendant: Defendant,
  date: LocalDateTime)

case class Defendant(
  uuid: UUID,
  firstName: Option[String],
  lastName: Option[String],
  fullName: Option[String])

// Arraignment Plea and Counsel
// Not For Use in Cases Involving Domestic Violence
// Pursuant to Penal Code Section 977 (a)(2)
