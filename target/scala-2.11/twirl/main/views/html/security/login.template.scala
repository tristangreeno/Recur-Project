
package views.html.security

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clientId: String, domain: String, redirectUri: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
        body """),format.raw/*12.14*/("""{"""),format.raw/*12.15*/("""
            """),format.raw/*13.13*/("""background-color: black;
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/("""
        """),format.raw/*15.9*/("""</style>
        <title>Welcome</title>
    </head>

    <body>
        <div id="root">
      Log-in area
        </div>
        <script src="https://cdn.auth0.com/js/lock-7.12.min.js"></script>
        <script>
            var lock = new Auth0Lock('"""),_display_(/*25.40*/clientId),format.raw/*25.48*/("""', '"""),_display_(/*25.53*/domain),format.raw/*25.59*/("""');
            lock.show("""),format.raw/*26.23*/("""{"""),format.raw/*26.24*/("""
                """),format.raw/*27.17*/("""container: 'root',
                callbackURL: '"""),_display_(/*28.32*/redirectUri),format.raw/*28.43*/("""',
                responseType: 'code',
                authParams: """),format.raw/*30.29*/("""{"""),format.raw/*30.30*/("""scope: 'openid profile'"""),format.raw/*30.53*/("""}"""),format.raw/*30.54*/("""
            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/(""");
    </script>
    </body>

</html>"""))
      }
    }
  }

  def render(clientId:String,domain:String,redirectUri:String): play.twirl.api.HtmlFormat.Appendable = apply(clientId,domain,redirectUri)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (clientId,domain,redirectUri) => apply(clientId,domain,redirectUri)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Jun 14 12:28:51 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/security/login.scala.html
                  HASH: 6db7d6c3f18cde91f9d02b0ffc894df5ed038c32
                  MATRIX: 550->1|700->56|728->58|1076->378|1105->379|1146->392|1206->425|1235->426|1271->435|1549->686|1578->694|1610->699|1637->705|1691->731|1720->732|1765->749|1842->799|1874->810|1971->879|2000->880|2051->903|2080->904|2121->917|2150->918
                  LINES: 20->1|25->1|27->3|36->12|36->12|37->13|38->14|38->14|39->15|49->25|49->25|49->25|49->25|50->26|50->26|51->27|52->28|52->28|54->30|54->30|54->30|54->30|55->31|55->31
                  -- GENERATED --
              */
          