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

trait SubscriptionsComponent {
  self: HasDatabaseConfigProvider[JdbcProfile] =>
  import driver.api._

  class Subscriptions(tag: Tag) extends Table[Subscription](tag, "SUBSCRIPTIONS") {
    def id = column[Long]("ID", O.PrimaryKey, O.AutoInc)
    def date = column[String]("DATE")
    def cost = column[Double]("COST")
    def name = column[String]("NAME")
    def frequency = column[Int]("FREQUENCY")
    def userId = column[String]("USER_ID")
    def category = column[String]("CATEGORY")

    def * = (id.?, date, cost, name, frequency, userId, category) <>
      (Subscription.tupled, Subscription.unapply)
  }
}

@Singleton()
class SubscriptionsRepo @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) extends SubscriptionsComponent
  with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  val subscriptions = TableQuery[Subscriptions]

  def options(): Future[Seq[(String, String)]] = {
    val query = ( for {
     subscription <- subscriptions
    } yield (subscription.id, subscription.date)).sortBy(_._2)

    db.run(query.result).map(rows => rows.map {
        case (id, name) => (id.toString, name)
    })
  }

  def insert(subscription: Subscription): Future[Unit] = { db.run(subscriptions += subscription).map(_ => ()) }
}
