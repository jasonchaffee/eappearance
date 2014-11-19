package models.services

import java.util.UUID

import models.Document

import scala.concurrent.Future

/**
 * Handles actions to documents.
 */
trait DocumentService {

  def retrieve(uuid: UUID): Future[Option[Document]]

  def retrieveAll(barNumber: Int): Future[Option[List[Document]]]

  def save(document: Document): Future[Document]
}
