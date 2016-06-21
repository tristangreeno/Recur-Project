
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object noUser_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class noUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang='en'>
<head>
    <title>Recur</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    """),format.raw/*8.97*/("""
    """),format.raw/*9.5*/("""<link href='https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/css/select2.min.css' rel='stylesheet' />
    <link rel='stylesheet' href='"""),_display_(/*10.35*/routes/*10.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.82*/("""'>
</head>
<body>
    <nav class="navbar navbar-default navbar-static-top">
        <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href=""""),_display_(/*23.48*/routes/*23.54*/.Application.index()),format.raw/*23.74*/("""">Recur</a>
            </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href=""""),_display_(/*29.35*/routes/*29.41*/.Application.list()),format.raw/*29.60*/("""">Subscriptions List</a></li>
                    <li><a href=""""),_display_(/*30.35*/routes/*30.41*/.Application.create()),format.raw/*30.62*/("""">Add New Subscription</a></li>
                </ul>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href=""""),_display_(/*34.35*/routes/*34.41*/.AuthController.logOut()),format.raw/*34.65*/("""">Sign Out</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

<section id="main" class="container">
"""),_display_(/*41.2*/content),format.raw/*41.9*/("""
"""),format.raw/*42.1*/("""</section>

<script src='https://code.jquery.com/jquery-3.0.0.min.js'></script>
<script src=""""),_display_(/*45.15*/routes/*45.21*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*45.70*/("""" type="text/javascript"></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/js/select2.full.min.js' type='text/javascript'></script>
<script src=""""),_display_(/*47.15*/routes/*47.21*/.Assets.versioned("javascripts/autocomplete.js")),format.raw/*47.69*/(""""></script>
</body>
</html>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}

/**/
object noUser extends noUser_Scope0.noUser
              /*
                  -- GENERATED --
                  DATE: Tue Jun 21 17:59:00 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/noUser.scala.html
                  HASH: 64bad48b7612478fd19820b610e758f9c5d2c176
                  MATRIX: 527->1|637->16|665->18|866->284|897->289|1064->429|1079->435|1141->476|1855->1163|1870->1169|1911->1189|2219->1470|2234->1476|2274->1495|2365->1559|2380->1565|2422->1586|2595->1732|2610->1738|2655->1762|2860->1941|2887->1948|2915->1949|3036->2043|3051->2049|3121->2098|3320->2270|3335->2276|3404->2324
                  LINES: 20->1|25->1|27->3|32->8|33->9|34->10|34->10|34->10|47->23|47->23|47->23|53->29|53->29|53->29|54->30|54->30|54->30|58->34|58->34|58->34|65->41|65->41|66->42|69->45|69->45|69->45|71->47|71->47|71->47
                  -- GENERATED --
              */
          