// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/diego.goez/other/scala-dojo-heroku/conf/routes
// @DATE:Sat Mar 24 12:57:28 COT 2018


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