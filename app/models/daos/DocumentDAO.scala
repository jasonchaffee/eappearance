package models.daos

import java.util.UUID

import models.Document

import scala.concurrent.Future

/**
 * Give access to the document object.
 */
trait DocumentDAO {


  def find(barNumber: Int): Future[Option[List[Document]]]

  /**
   * Finds a document by its document ID.
   *
   * @param uuid The ID of the document to find.
   * @return The found document or None if no document for the given ID could be found.
   */
  def find(uuid: UUID): Future[Option[Document]]

  /**
   * Saves a document.
   *
   * @param document The document to save.
   * @return The saved document.
   */
  def save(document: Document): Future[Document]
}
