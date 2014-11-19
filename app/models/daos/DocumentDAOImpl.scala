package models.daos

import DocumentDAOImpl._

import java.util.UUID

import models.Document

import scala.collection.mutable
import scala.concurrent.Future

/**
 * Give access to the document object.
 */
class DocumentDAOImpl extends DocumentDAO {


  def find(barNumber: Int) = Future.successful(
    Option(documents.values.toList.filter(_.barNumber == barNumber))
  )

  def find(uuid: UUID) = Future.successful(documents.get(uuid))


  def save(document: Document) = {
    documents += (document.uuid -> document)
    Future.successful(document)
  }
}

/**
 * The companion object.
 */
object DocumentDAOImpl {

  /**
   * The list of documents.
   */
  val documents: mutable.HashMap[UUID, Document] = mutable.HashMap()
}
