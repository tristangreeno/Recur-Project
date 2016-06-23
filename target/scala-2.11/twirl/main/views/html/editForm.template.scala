
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Long,Form[Subscription],Subscription,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, subscriptionForm: Form[Subscription], subscription: Subscription)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.107*/("""

    """),format.raw/*4.1*/("""
"""),_display_(/*5.2*/noUser/*5.8*/ {_display_(Seq[Any](format.raw/*5.10*/("""
    """),format.raw/*6.5*/("""<div class="container-fluid">
        <h1 class="modal-header">Edit Subscription</h1>

        """),_display_(/*9.10*/form(routes.Application.update(id))/*9.45*/ {_display_(Seq[Any](format.raw/*9.47*/("""

        """),format.raw/*11.9*/("""<fieldset>

            <dl class="form-group">
                <dt><label for="date">Date of renewal</label></dt>

                <dd>
                    <input type="date" class="form-control" id="date" name="date" value="" />
                </dd>
            </dl>

            <dl class="form-group" id="cost">
                <dt><label>Cost of renewal</label></dt>
                <dd><input type="number" class="form-control" name="cost" placeholder=""""),_display_(/*23.89*/subscription/*23.101*/.cost),format.raw/*23.106*/(""""/></dd>
            </dl>

            <dl class="form-group">
                <dt><label for="autocomplete">Subscription's Company Name</label></dt>

                <dd><select name="name" id="autocomplete" class="form-control" >
                </select></dd>
            </dl>


            <dl class="form-group" id="frequency">
                <dt><label for="frequency">Frequency of Renewal</label></dt>

                <dd><select name="frequency" class="form-control">
                    <option selected value=""""),_display_(/*38.46*/subscription/*38.58*/.frequency),format.raw/*38.68*/("""">Every """),_display_(/*38.77*/subscription/*38.89*/.frequency),format.raw/*38.99*/(""" """),format.raw/*38.100*/("""days</option>
                    <option value="7">Every week</option>
                    <option value="14">Every two weeks</option>
                    <option value="30">Once a month</option>
                    <option value="90">Every three months</option>
                    <option value="180">Every six months</option>
                    <option value="365">Every year</option>
                    <option value="730">Every two years</option>
                </select></dd>
            </dl>

            <dl class="form-group" id="category">
                <dt><label for="category">Subscription Category</label></dt>

                <dd><select name="category" class="form-control">
                    <option selected value=""""),_display_(/*53.46*/subscription/*53.58*/.category),format.raw/*53.67*/("""">"""),_display_(/*53.70*/subscription/*53.82*/.category),format.raw/*53.91*/("""</option>
                    <option value="Business">Business</option>
                    <option value="Education">Education</option>
                    <option value="Entertainment">Entertainment</option>
                    <option value="Health">Health</option>
                </select></dd>
            </dl>

            <input type="hidden" name="userId" value=""""),_display_(/*61.56*/subscription/*61.68*/.userId),format.raw/*61.75*/("""" />

        </fieldset>

        <div class="button-bar">
            <input type="submit" value="Save subscription" class="btn btn-success" style="width: 14.85em">
            <a href=""""),_display_(/*67.23*/routes/*67.29*/.Application.list()),format.raw/*67.48*/("""" class="btn btn-danger" style="width: 14.85em">Cancel</a>
        """)))}),format.raw/*68.10*/("""
        """),format.raw/*69.9*/("""</div>

        """),_display_(/*71.10*/form(routes.Application.delete(id))/*71.45*/ {_display_(Seq[Any](format.raw/*71.47*/("""
            """),format.raw/*72.13*/("""<input type="submit" value="Delete subscription" class="btn btn-warning" style="width: 30em">
        """)))}),format.raw/*73.10*/("""

    """),format.raw/*75.5*/("""</div>
""")))}),format.raw/*76.2*/("""

"""))
      }
    }
  }

  def render(id:Long,subscriptionForm:Form[Subscription],subscription:Subscription,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(id,subscriptionForm,subscription)(messages)

  def f:((Long,Form[Subscription],Subscription) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (id,subscriptionForm,subscription) => (messages) => apply(id,subscriptionForm,subscription)(messages)

  def ref: this.type = this

}


}

/**/
object editForm extends editForm_Scope0.editForm
              /*
                  -- GENERATED --
                  DATE: Thu Jun 23 14:29:39 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/editForm.scala.html
                  HASH: ec0a21987a30d2ba843430cf0f46924a51b031f2
                  MATRIX: 572->1|788->106|820->129|847->131|860->137|899->139|930->144|1052->240|1095->275|1134->277|1171->287|1660->749|1682->761|1709->766|2261->1291|2282->1303|2313->1313|2349->1322|2370->1334|2401->1344|2431->1345|3202->2089|3223->2101|3253->2110|3283->2113|3304->2125|3334->2134|3736->2509|3757->2521|3785->2528|4001->2717|4016->2723|4056->2742|4155->2810|4191->2819|4235->2836|4279->2871|4319->2873|4360->2886|4494->2989|4527->2995|4565->3003
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|32->9|32->9|32->9|34->11|46->23|46->23|46->23|61->38|61->38|61->38|61->38|61->38|61->38|61->38|76->53|76->53|76->53|76->53|76->53|76->53|84->61|84->61|84->61|90->67|90->67|90->67|91->68|92->69|94->71|94->71|94->71|95->72|96->73|98->75|99->76
                  -- GENERATED --
              */
          