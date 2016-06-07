package repos

import models._
import javax.inject.Singleton
import javax.inject.Inject

import play.api.db.slick._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import slick.driver.JdbcProfile

import scala.concurrent._



/**
  * Repository for the subscriptions.
  */

@Singleton()
class SubscriptionsRepo @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends UsersComponent
  with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  class SubscriptionsTable(tag: Tag) extends Table[Subscription](tag, "subscriptions") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def date = column[java.sql.Date]("date")
    def cost = column[Long]("cost")
    def name = column[String]("name")
    def frequency = column[Int]("frequency")
    def userId = column[Option[Long]]("user_id")

    def * = (id, date, cost, name, frequency, userId) <>
      (Subscription.tupled, Subscription.unapply)
  }

  val subscriptions = TableQuery[SubscriptionsTable]
  val users = TableQuery[UsersTable]

  def count(): Future[Int] = db.run(subscriptions.length.result)

  def count(filter: String): Future[Int] = db.run(subscriptions.filter { subscription => subscription.name.toLowerCase like filter.toLowerCase }.length.result)

  def list(page: Int = 0, pageSize: Int = 10, orderBy: Int = 1, filter: String = "%"): Future[Page[(Subscription)]] = {

    val offset = pageSize * page
    val query =
      (for {
        (subscription, users) <- subscriptions join users on (_.userId === _.id)
        if subscription.name.toLowerCase like filter.toLowerCase
      } yield subscription)
        .drop(offset)
        .take(pageSize)

    for {
      totalRows <- count(filter)
      list = query.result.map { rows => rows.collect { case (subscription) => subscription } }
      result <- db.run(list)
    } yield Page(result, page, offset, totalRows)
  }

  def insert(subscription: Subscription): Future[Unit] = { db.run(subscriptions += subscription).map(_ => ()) }

  def findByUserId(id: Long): Future[Option[Subscription]] =
    db.run(subscriptions.filter(_.userId === id).result.headOption)

  def findById(id: Long): Future[Option[Subscription]] =
    db.run(subscriptions.filter(_.id === id).result.headOption)

  def update(id: Long, subscription: Subscription): Future[Unit] = {
    val subscriptionToUpdate: Subscription = subscription.copy(id)
    db.run(subscriptions.filter(_.id === id).update(subscriptionToUpdate)).map(_ => ())
  }

  def delete(id: Long): Future[Unit] = db.run(subscriptions.filter(_.id === id).delete).map(_ => ())
}
