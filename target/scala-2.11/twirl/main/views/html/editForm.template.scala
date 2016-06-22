
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

class editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Form[Subscription],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, subscriptionForm: Form[Subscription])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.79*/("""

    """),format.raw/*4.1*/("""
    """),_display_(/*5.6*/noUser/*5.12*/ {_display_(Seq[Any](format.raw/*5.14*/("""
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
                <dt><label>Cost of Renewal</label></dt>
                <dd><input type="number" class="form-control" name="cost" placeholder="Cost of Renewal"/></dd>
            </dl>

            <dl class="form-group">
                <dt><label for="autocomplete">Subscription's Company Name</label></dt>

                <dd><select name="name" id="autocomplete" class="form-control" >
                </select></dd>
            </dl>


            <dl class="form-group" id="frequency">
                <dt><label for="frequency">Frequency of Renewal</label></dt>

                <dd><select name="frequency" class="form-control">
                    <option selected disabled>Select a frequency...</option>
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
                    <option selected disabled>Choose a category...</option>
                    <option value="Business">Business</option>
                    <option value="Education">Education</option>
                    <option value="Entertainment">Entertainment</option>
                    <option value="Health">Health</option>
                </select></dd>
            </dl>

        </fieldset>

        <div class="button-bar">
            <input type="submit" value="Save subscription" class="btn btn-success" style="width: 14.85em">
            <a href=""""),_display_(/*65.23*/routes/*65.29*/.Application.list()),format.raw/*65.48*/("""" class="btn btn-danger" style="width: 14.85em">Cancel</a>

        """)))}),format.raw/*67.10*/("""

        """),_display_(/*69.10*/form(routes.Application.delete(id))/*69.45*/ {_display_(Seq[Any](format.raw/*69.47*/("""
            """),format.raw/*70.13*/("""<input type="submit" value="Delete subscription" class="btn btn-warning" style="width: 30em">
        """)))}),format.raw/*71.10*/("""
    """),format.raw/*72.5*/("""</div>
    </div>
""")))}),format.raw/*74.2*/("""

"""))
      }
    }
  }

  def render(id:Long,subscriptionForm:Form[Subscription],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(id,subscriptionForm)(messages)

  def f:((Long,Form[Subscription]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (id,subscriptionForm) => (messages) => apply(id,subscriptionForm)(messages)

  def ref: this.type = this

}


}

/**/
object editForm extends editForm_Scope0.editForm
              /*
                  -- GENERATED --
                  DATE: Wed Jun 22 14:25:04 CDT 2016
                  SOURCE: /Users/tristangreeno/workspace/PlayProject/app/views/editForm.scala.html
                  HASH: 76cc351f522011ce6030a858180b2574caa2a244
                  MATRIX: 559->1|746->78|778->101|809->107|823->113|862->115|893->120|1015->216|1058->251|1097->253|1134->263|3448->2550|3463->2556|3503->2575|3603->2644|3641->2655|3685->2690|3725->2692|3766->2705|3900->2808|3932->2813|3981->2832
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|32->9|32->9|32->9|34->11|88->65|88->65|88->65|90->67|92->69|92->69|92->69|93->70|94->71|95->72|97->74
                  -- GENERATED --
              */
          