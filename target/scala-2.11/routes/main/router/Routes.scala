
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
// @DATE:Mon Jun 13 14:29:56 CDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:23
  AuthController_0: controllers.AuthController,
  // @LINE:28
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:23
    AuthController_0: controllers.AuthController,
    // @LINE:28
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, AuthController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, AuthController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions""", """controllers.Application.list"""),
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
    Application_2.index,
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
    Application_2.list,
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
  private[this] lazy val controllers_Application_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/new")))
  )
  private[this] lazy val controllers_Application_create2_invoker = createInvoker(
    Application_2.create,
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

  // @LINE:13
  private[this] lazy val controllers_Application_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_save3_invoker = createInvoker(
    Application_2.save(fakeValue[String]),
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

  // @LINE:16
  private[this] lazy val controllers_Application_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_edit4_invoker = createInvoker(
    Application_2.edit(fakeValue[Long]),
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

  // @LINE:17
  private[this] lazy val controllers_Application_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_update5_invoker = createInvoker(
    Application_2.update(fakeValue[Long]),
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

  // @LINE:20
  private[this] lazy val controllers_Application_delete6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Application_delete6_invoker = createInvoker(
    Application_2.delete(fakeValue[Long]),
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

  // @LINE:23
  private[this] lazy val controllers_AuthController_logIn7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_logIn7_invoker = createInvoker(
    AuthController_0.logIn(),
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

  // @LINE:24
  private[this] lazy val controllers_AuthController_callback8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("callback")))
  )
  private[this] lazy val controllers_AuthController_callback8_invoker = createInvoker(
    AuthController_0.callback(fakeValue[Option[String]]),
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

  // @LINE:25
  private[this] lazy val controllers_AuthController_logOut9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthController_logOut9_invoker = createInvoker(
    AuthController_0.logOut(),
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

  // @LINE:28
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:9
    case controllers_Application_list1_route(params) =>
      call { 
        controllers_Application_list1_invoker.call(Application_2.list)
      }
  
    // @LINE:12
    case controllers_Application_create2_route(params) =>
      call { 
        controllers_Application_create2_invoker.call(Application_2.create)
      }
  
    // @LINE:13
    case controllers_Application_save3_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Application_save3_invoker.call(Application_2.save(id))
      }
  
    // @LINE:16
    case controllers_Application_edit4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_edit4_invoker.call(Application_2.edit(id))
      }
  
    // @LINE:17
    case controllers_Application_update5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_update5_invoker.call(Application_2.update(id))
      }
  
    // @LINE:20
    case controllers_Application_delete6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_delete6_invoker.call(Application_2.delete(id))
      }
  
    // @LINE:23
    case controllers_AuthController_logIn7_route(params) =>
      call { 
        controllers_AuthController_logIn7_invoker.call(AuthController_0.logIn())
      }
  
    // @LINE:24
    case controllers_AuthController_callback8_route(params) =>
      call(params.fromQuery[Option[String]]("code", None)) { (code) =>
        controllers_AuthController_callback8_invoker.call(AuthController_0.callback(code))
      }
  
    // @LINE:25
    case controllers_AuthController_logOut9_route(params) =>
      call { 
        controllers_AuthController_logOut9_invoker.call(AuthController_0.logOut())
      }
  
    // @LINE:28
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
