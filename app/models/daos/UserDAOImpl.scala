package models.daos

import models.User
import com.mohiva.play.silhouette.core.LoginInfo
import scala.concurrent.Future
import scala.collection.mutable
import java.util.UUID
import UserDAOImpl._

/**
 * Give access to the user object.
 */
class UserDAOImpl extends UserDAO {

  /**
   * Finds a user by its login info.
   *
   * @param loginInfo The login info of the user to find.
   * @return The found user or None if no user for the given login info could be found.
   */
  def find(loginInfo: LoginInfo) = Future.successful(
    users.find { case (id, user) => user.loginInfo == loginInfo }.map(_._2)
  )

  /**
   * Finds a user by its user ID.
   *
   * @param uuid The ID of the user to find.
   * @return The found user or None if no user for the given ID could be found.
   */
  def find(uuid: UUID) = Future.successful(users.get(uuid))

  /**
   * Saves a user.
   *
   * @param user The user to save.
   * @return The saved user.
   */
  def save(user: User) = {
    users += (user.uuid -> user)
    Future.successful(user)
  }
}

/**
 * The companion object.
 */
object UserDAOImpl {

  /**
   * The list of users.
   */
  val users: mutable.HashMap[UUID, User] = mutable.HashMap()
}
