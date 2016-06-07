package repos

import javax.inject._

import models._
import play.api.db.slick._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import slick.driver.JdbcProfile

import scala.concurrent.Future

/**
  * Created by tristangreeno on 6/1/16.
  */
trait UsersComponent {
  self: HasDatabaseConfigProvider[JdbcProfile] =>

  import driver.api._

  class UsersTable(tag: Tag) extends Table[User](tag, "users") {
    val id: Rep[String] = column[String]("auth0_user_id")
    val name: Rep[String] = column[String]("name")
    val avatarUrl: Rep[String] = column[String]("avatar_url")

    def * = (id, name, avatarUrl) <> (User.tupled, User.unapply)
  }

}

@Singleton()
class UsersRepo @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends UsersComponent
  with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  val users = TableQuery[UsersTable]

  def options(): Future[Seq[(String, String, String)]] = {
    val query = for {
      user <- users
    } yield (user.id, user.name, user.avatarUrl)

    db.run(query.result).map(rows => rows.map { case (userId, name, avatarUrl) => (userId, name, avatarUrl) })
  }

  def insert(user: User): Future[Unit] = db.run(users += user).map(_ => ())

}
