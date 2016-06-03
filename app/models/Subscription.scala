package models

import play.api.libs.json._
import play.api.libs.functional.syntax._

// TODO: Implement https://autocomplete.clearbit.com/v1/companies/suggest?query= API
// JSON values - domain, logo, name

/**
  * Defines what goes into a Subscription, and holds the data.
  */

case class Subscription(id: Option[Long], date: java.sql.Date, cost: Long, name: String, frequency: Int,
                        userId: String, category: String)

/*
!!! Caused problems as a companion object !!!
object Subscription {
  implicit val subscriptionReads: Reads[Subscription] = (
    (JsPath \ "ID").readNullable[Int] and
      (JsPath \ "DATE").read[String] and
      (JsPath \ "COST").read[Double] and
      (JsPath \ "NAME").read[String] and
      (JsPath \ "FREQUENCY").read[Int]
    ) (Subscription.apply _)

  implicit val subscriptionWrites: Writes[Subscription] = (
    (JsPath \ "ID").writeNullable[Int] and
      (JsPath \ "DATE").write[String] and
      (JsPath \ "COST").write[Double] and
      (JsPath \ "NAME").write[String] and
      (JsPath \ "FREQUENCY").write[Int]
    ) (unlift(Subscription.unapply)) } */

