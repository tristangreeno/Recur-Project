package models

// TODO: Implement https://autocomplete.clearbit.com/v1/companies/suggest?query= API
// JSON values - domain, logo, name

/**
  * Defines what goes into a Subscription, and holds the data.
  */

case class Subscription(id: Option[Long] = None, date: java.sql.Date, cost: BigDecimal, name: String, frequency: Int,
                        category: String, userId: Option[Long])


