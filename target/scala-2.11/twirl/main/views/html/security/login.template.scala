
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
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        <title>Welcome to Recur</title>

        <style>
        body,html"""),format.raw/*13.18*/("""{"""),format.raw/*13.19*/("""padding:0;margin:0"""),format.raw/*13.37*/("""}"""),format.raw/*13.38*/(""".table"""),format.raw/*13.44*/("""{"""),format.raw/*13.45*/("""display:table;position:absolute;height:100%;width:100%;
                                         background: #e8ebef linear-gradient(rgba(255, 255, 255, .3), rgba(255, 255, 255, 0));
                                     """),format.raw/*15.38*/("""}"""),format.raw/*15.39*/("""  """),format.raw/*15.41*/(""".cell"""),format.raw/*15.46*/("""{"""),format.raw/*15.47*/("""display:table-cell;vertical-align:middle"""),format.raw/*15.87*/("""}"""),format.raw/*15.88*/("""  """),format.raw/*15.90*/(""".content"""),format.raw/*15.98*/("""{"""),format.raw/*15.99*/("""padding:25px 0;margin-left:auto;margin-right:auto;width:280px"""),format.raw/*15.160*/("""}"""),format.raw/*15.161*/("""
        """),format.raw/*16.9*/("""</style>
    </head>

    <body class="container">
        <div class="table">
            <div class="cell">
                <div class="content">
                        <!-- WIDGET -->
                    <div id="root"></div>
                </div>
            </div>
        </div>

            <!--[if IE 8]>
  <script src="//cdnjs.cloudflare.com/ajax/libs/ie8/0.2.5/ie8.js"></script>
  <![endif]-->

            <!--[if lte IE 9]>
  <script src="https://cdn.auth0.com/js/base64.js"></script>
  <script src="https://cdn.auth0.com/js/es5-shim.min.js"></script>
  <![endif]-->

        <script src="https://cdn.auth0.com/js/lock-9.1.js"></script>
        <script>
            var lock = new Auth0Lock('"""),_display_(/*40.40*/clientId),format.raw/*40.48*/("""', '"""),_display_(/*40.53*/domain),format.raw/*40.59*/("""');
            lock.show("""),format.raw/*41.23*/("""{"""),format.raw/*41.24*/("""
                """),format.raw/*42.17*/("""container: 'root',
                callbackURL: '"""),_display_(/*43.32*/redirectUri),format.raw/*43.43*/("""',
                responseType: 'code',
                authParams: """),format.raw/*45.29*/("""{"""),format.raw/*45.30*/("""scope: 'openid profile'"""),format.raw/*45.53*/("""}"""),format.raw/*45.54*/(""",
                rememberLastLogin:  !prompt,
                icon: 'https://s32.postimg.org/crvhtoazp/Recurlogo_300x300b.png'
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/(""");
    </script>
    </body>

</html>

"""))
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
                  DATE: Wed Jun 22 15:18:10 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/security/login.scala.html
                  HASH: 424086e5d92ccd55613401ce4316c33c652f62fc
                  MATRIX: 550->1|700->56|728->58|1086->388|1115->389|1161->407|1190->408|1224->414|1253->415|1501->635|1530->636|1560->638|1593->643|1622->644|1690->684|1719->685|1749->687|1785->695|1814->696|1904->757|1934->758|1970->767|2704->1474|2733->1482|2765->1487|2792->1493|2846->1519|2875->1520|2920->1537|2997->1587|3029->1598|3126->1667|3155->1668|3206->1691|3235->1692|3403->1832|3432->1833
                  LINES: 20->1|25->1|27->3|37->13|37->13|37->13|37->13|37->13|37->13|39->15|39->15|39->15|39->15|39->15|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|64->40|64->40|64->40|64->40|65->41|65->41|66->42|67->43|67->43|69->45|69->45|69->45|69->45|72->48|72->48
                  -- GENERATED --
              */
          