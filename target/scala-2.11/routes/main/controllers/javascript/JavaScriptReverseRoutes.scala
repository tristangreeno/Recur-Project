
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
// @DATE:Tue Jun 21 16:56:49 CDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:34
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseWSController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def findCompaniesFromInput: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WSController.findCompaniesFromInput",
      """
        function(input0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companies/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("input", encodeURIComponent(input0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:18
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/new"})
        }
      """
    )
  
    // @LINE:22
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:23
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:19
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.save",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/save/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:9
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseEmailController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def sendEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmailController.sendEmail",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/email"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def logIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.logIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:30
    def callback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.callback",
      """
        function(code0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "callback" + _qS([(""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("code", code0)])})
        }
      """
    )
  
    // @LINE:31
    def logOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.logOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
  }


}
