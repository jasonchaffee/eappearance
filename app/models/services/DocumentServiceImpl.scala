package models.services

import java.util.UUID
import javax.inject.Inject


import models.Document
import models.daos.DocumentDAO
import play.api.libs.concurrent.Execution.Implicits._

import scala.concurrent.Future

/**
 * Handles actions to documents.
 *
 * @param documentDAO The document DAO implementation.
 */
class DocumentServiceImpl @Inject() (documentDAO: DocumentDAO) extends DocumentService {


  def retrieve(uuid: UUID): Future[Option[Document]] = documentDAO.find(uuid)

  def retrieveAll(barNumber: Int): Future[Option[List[Document]]] = documentDAO.find(barNumber)


  def save(document: Document) = documentDAO.save(document)
  
}
