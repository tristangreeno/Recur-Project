package controllers

import javax.inject.Inject

import models.Company
import play.api.libs.json._
import play.api.libs.ws._
import play.api.mvc._
import scala.concurrent.duration._
import scala.concurrent._

/**
  * Controls web service consumption. Used for the autocomplete API provided by Clearbit.
  */
class WSController @Inject()(ws: WSClient)(implicit context: ExecutionContext) extends Controller {

  implicit val companyReads = Json.reads[Company]

  def findCompaniesFromInput(input: String) = Action {
    val futureResult = ws.url(s"https://autocomplete.clearbit.com/v1/companies/suggest?query=$input").get().map {
      response =>
        response.json
    }

    Ok(Await.result(futureResult, 4.seconds))
  }
}

  /*
  class CompanyList {
     List[Company] companyList = ArrayList;
   }



    {  "companyList":
      [
      {
      "domain": "stripe.com",
      "logo": "https://logo.clearbit.com/stripe.com",
      "name": "Stripe"
      },
      {
      "domain": "stripesgroup.com",
      "logo": "https://logo.clearbit.com/stripesgroup.com",
      "name": "Stripes Group"
      }
      ]
   }
  */