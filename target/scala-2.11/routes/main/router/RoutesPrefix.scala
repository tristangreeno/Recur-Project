
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tristangreeno/workspace/PlayProject/conf/routes
// @DATE:Wed Jun 22 15:11:56 CDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
