package repos

import models._

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

  class UsersTable(tag: Tag) extends Table[User](tag, "users"){
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def userId = column[String]("auth0_user_id")
    def name = column[String]("name")
    def avatarUrl = column[String]("avatar_url")

    def * = (id.?, userId, name, avatarUrl) <> (User.tupled, User.unapply)
  }
}

@Singleton()
class UsersRepo @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends UsersComponent
  with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  val users = TableQuery[UsersTable]

  def options(): Future[Seq[(Long, String, String, String)]] = {
    val query = for {
      user <- users
    } yield (user.id, user.userId, user.name, user.avatarUrl)

    db.run(query.result).map(rows => rows.map { case (id, userId, name, avatarUrl) => (id, userId, name, avatarUrl) })
  }

  def insert(user: User): Future[Unit] = db.run(users += user).map(_ => ())

}
