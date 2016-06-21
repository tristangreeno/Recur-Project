package repos

import java.time._
import javax.inject.{Inject, Singleton}

import models._
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
    def cost = column[BigDecimal]("cost")
    def name = column[String]("name")
    def frequency = column[Int]("frequency")
    def category = column[String]("category")
    def userId = column[Option[Long]]("user_id")

    def * = (id.?, date, cost, name, frequency, category, userId) <>
      (Subscription.tupled, Subscription.unapply)
  }

  val subscriptions = TableQuery[SubscriptionsTable]
  val users = TableQuery[UsersTable]

  def count(): Future[Int] = db.run(subscriptions.length.result)


  def count(filter: String): Future[Int] = db.run(subscriptions.filter { subscription => subscription.name.toLowerCase like filter.toLowerCase }.length.result)

  def list(id: Long): Future[SubscriptionList[(Subscription)]] = {

    for {
      (sub, user) <- subscriptions join users on (_.userId === _.id)
    } yield (sub, user.name)

    db.run(subscriptions.filter(_.userId === id).result).map(f => SubscriptionList(f))
  }

  def insert(subscription: Subscription): Future[Unit] = { db.run(subscriptions += subscription).map(_ => ()) }

  def findByUserId(id: Long): Future[Option[Subscription]] =
    db.run(subscriptions.filter(_.userId === id).result.headOption)

  def findById(id: Long): Future[Option[Subscription]] =
    db.run(subscriptions.filter(_.id === id).result.headOption)

  def update(id: Long, subscription: Subscription): Future[Unit] = {
    val subscriptionToUpdate: Subscription = subscription.copy(Some(id))
    db.run(subscriptions.filter(_.id === id).update(subscriptionToUpdate)).map(_ => ())
  }

  def delete(id: Long): Future[Unit] = {
    db.run(subscriptions.filter(_.id === id).delete).map(_ => ())

  }

  def updateSubsThatHaveRenewed(subscription: Subscription) = {
    val subLocalDate = subscription.date.toLocalDate
    if(subLocalDate.toEpochDay - LocalDate.now().toEpochDay <= 0){
      update(subscription.id.get, Subscription(subscription.id, java.sql.Date.valueOf(subLocalDate.plusDays(subscription.frequency)),
        subscription.cost, subscription.name, subscription.frequency, subscription.category, subscription.userId))
    }
  }

  def listSubsAboutToRenew(id: Long): Future[SubscriptionList[Subscription]] = {
    list(id).map(f => f.items.filter(p => {
      updateSubsThatHaveRenewed(p)
      isRenewDateSoon(p.date.toLocalDate)
    })).map(
      s => SubscriptionList(s)
    )
  }

  def isRenewDateSoon(date: LocalDate): Boolean = {
    val timeDifference: Long = date.toEpochDay - LocalDate.now().toEpochDay
    timeDifference <= 5
  }
}
