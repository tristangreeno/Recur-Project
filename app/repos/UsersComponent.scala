package repos

import models.User

import javax.inject._
import scala.concurrent.Future
import play.api.db.slick._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import slick.driver.JdbcProfile
/**
  * Created by tristangreeno on 6/1/16.
  */
trait UsersComponent {
  self: HasDatabaseConfigProvider[JdbcProfile] => import driver.api._

  class Users (tag: Tag) extends Table[User](tag, "USERS"){
    def id = column[String]("ID", O.PrimaryKey)
    def name = column[String]("NAME")
    def avatarUrl = column[String]("AVATAR_URL")

    def * = (id, name, avatarUrl) <> (User.tupled, User.unapply)
  }
}

@Singleton()
class UsersRepo @Inject()(protected val dbConfigProver: DatabaseConfigProvider) extends UsersComponent
   {

  self: HasDatabaseConfigProvider[JdbcProfile] => import driver.api._

  val users = TableQuery[Users]

  def options(): Future[Seq[(String, String, String)]] = {
    val query = for {
      user <- users
    } yield (user.id, user.name, user.avatarUrl)

    db.run(query.result).map(rows => rows.map { case (id, name, avatarUrl) => (id, name, avatarUrl)})
  }
}
