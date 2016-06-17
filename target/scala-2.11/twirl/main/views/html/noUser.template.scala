
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

<html lang="en">
    <head>
        <title>Recur</title>
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*8.95*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*9.78*/("""" type="text/javascript"></script>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/css/select2.min.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/js/select2.min.js"></script>
    </head>
    <header class="topbar">
        <h1 class="fill">
            <a href=""""),_display_(/*15.23*/routes/*15.29*/.Application.index()),format.raw/*15.49*/("""">
        Recur &mdash; Subscriptions Database
      </a>
        </h1>
    </header>

    <section id="main">
    """),_display_(/*22.6*/content),format.raw/*22.13*/("""
    """),format.raw/*23.5*/("""</section>
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
                  DATE: Fri Jun 17 15:00:02 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/noUser.scala.html
                  HASH: d2712e3f5f01486d97e50dba93958b0294d81b88
                  MATRIX: 527->1|637->16|665->18|803->130|817->136|887->186|938->211|952->217|1021->266|1388->606|1403->612|1444->632|1587->749|1615->756|1647->761
                  LINES: 20->1|25->1|27->3|32->8|32->8|32->8|33->9|33->9|33->9|39->15|39->15|39->15|46->22|46->22|47->23
                  -- GENERATED --
              */
          