
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
// @DATE:Wed Jun 22 15:11:56 CDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_4: controllers.Application,
  // @LINE:12
  EmailController_1: controllers.EmailController,
  // @LINE:15
  WSController_0: controllers.WSController,
  // @LINE:29
  AuthController_2: controllers.AuthController,
  // @LINE:34
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_4: controllers.Application,
    // @LINE:12
    EmailController_1: controllers.EmailController,
    // @LINE:15
    WSController_0: controllers.WSController,
    // @LINE:29
    AuthController_2: controllers.AuthController,
    // @LINE:34
    Assets_3: controllers.Assets
  ) = this(errorHandler, Application_4, EmailController_1, WSController_0, AuthController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, EmailController_1, WSController_0, AuthController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions""", """controllers.Application.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions/email""", """controllers.EmailController.sendEmail"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """companies/""" + "$" + """input<[^/]+>""", """controllers.WSController.findCompaniesFromInput(input:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions/new""", """controllers.Application.create"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions/save/""" + "$" + """id<[^/]+>""", """controllers.Application.save(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions/""" + "$" + """id<[^/]+>""", """controllers.Application.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions/""" + "$" + """id<[^/]+>""", """controllers.Application.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions/""" + "$" + """id<[^/]+>/delete""", """controllers.Application.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthController.logIn()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """callback""", """controllers.AuthController.callback(code:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AuthController.logOut()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_4.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home Page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions")))
  )
  private[this] lazy val controllers_Application_list1_invoker = createInvoker(
    Application_4.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "list",
      Nil,
      "GET",
      """ List of subscriptions""",
      this.prefix + """subscriptions"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_EmailController_sendEmail2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/email")))
  )
  private[this] lazy val controllers_EmailController_sendEmail2_invoker = createInvoker(
    EmailController_1.sendEmail,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmailController",
      "sendEmail",
      Nil,
      "GET",
      """ Route to start program that sends emails""",
      this.prefix + """subscriptions/email"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_WSController_findCompaniesFromInput3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("companies/"), DynamicPart("input", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WSController_findCompaniesFromInput3_invoker = createInvoker(
    WSController_0.findCompaniesFromInput(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WSController",
      "findCompaniesFromInput",
      Seq(classOf[String]),
      "GET",
      """ Route to return JSON of autocomplete API for company logos/information""",
      this.prefix + """companies/""" + "$" + """input<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_create4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/new")))
  )
  private[this] lazy val controllers_Application_create4_invoker = createInvoker(
    Application_4.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "create",
      Nil,
      "GET",
      """ Add subsciption""",
      this.prefix + """subscriptions/new"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_save5_invoker = createInvoker(
    Application_4.save(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "save",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """subscriptions/save/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_edit6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_edit6_invoker = createInvoker(
    Application_4.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """ Edit an existing subscription""",
      this.prefix + """subscriptions/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_update7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_update7_invoker = createInvoker(
    Application_4.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """subscriptions/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_delete8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Application_delete8_invoker = createInvoker(
    Application_4.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "delete",
      Seq(classOf[Long]),
      "POST",
      """ Delete a subscription""",
      this.prefix + """subscriptions/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_AuthController_logIn9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_logIn9_invoker = createInvoker(
    AuthController_2.logIn(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "logIn",
      Nil,
      "GET",
      """ Login Page""",
      this.prefix + """login"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_AuthController_callback10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("callback")))
  )
  private[this] lazy val controllers_AuthController_callback10_invoker = createInvoker(
    AuthController_2.callback(fakeValue[Option[String]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "callback",
      Seq(classOf[Option[String]]),
      "GET",
      """""",
      this.prefix + """callback"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_AuthController_logOut11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthController_logOut11_invoker = createInvoker(
    AuthController_2.logOut(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "logOut",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned12_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_4.index)
      }
  
    // @LINE:9
    case controllers_Application_list1_route(params) =>
      call { 
        controllers_Application_list1_invoker.call(Application_4.list)
      }
  
    // @LINE:12
    case controllers_EmailController_sendEmail2_route(params) =>
      call { 
        controllers_EmailController_sendEmail2_invoker.call(EmailController_1.sendEmail)
      }
  
    // @LINE:15
    case controllers_WSController_findCompaniesFromInput3_route(params) =>
      call(params.fromPath[String]("input", None)) { (input) =>
        controllers_WSController_findCompaniesFromInput3_invoker.call(WSController_0.findCompaniesFromInput(input))
      }
  
    // @LINE:18
    case controllers_Application_create4_route(params) =>
      call { 
        controllers_Application_create4_invoker.call(Application_4.create)
      }
  
    // @LINE:19
    case controllers_Application_save5_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_save5_invoker.call(Application_4.save(id))
      }
  
    // @LINE:22
    case controllers_Application_edit6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_edit6_invoker.call(Application_4.edit(id))
      }
  
    // @LINE:23
    case controllers_Application_update7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_update7_invoker.call(Application_4.update(id))
      }
  
    // @LINE:26
    case controllers_Application_delete8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_delete8_invoker.call(Application_4.delete(id))
      }
  
    // @LINE:29
    case controllers_AuthController_logIn9_route(params) =>
      call { 
        controllers_AuthController_logIn9_invoker.call(AuthController_2.logIn())
      }
  
    // @LINE:30
    case controllers_AuthController_callback10_route(params) =>
      call(params.fromQuery[Option[String]]("code", None)) { (code) =>
        controllers_AuthController_callback10_invoker.call(AuthController_2.callback(code))
      }
  
    // @LINE:31
    case controllers_AuthController_logOut11_route(params) =>
      call { 
        controllers_AuthController_logOut11_invoker.call(AuthController_2.logOut())
      }
  
    // @LINE:34
    case controllers_Assets_versioned12_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned12_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
