package models

/**
  * Model for pagination of the list of subscriptions.
  */

case class SubscriptionList[A](items: Seq[A])

