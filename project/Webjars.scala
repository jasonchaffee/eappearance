import sbt._

object Webjars {
  lazy val webjarsPlay = "org.webjars" %% "webjars-play" % "2.3.0-2"
  lazy val webjarsAirbrakeJs = "org.webjars" % "airbrake-js" % "0.3"
  lazy val webjarsAngularjs = "org.webjars" % "angularjs" % "1.3.2"
  lazy val webjarsAngularUiBootstrap = "org.webjars" % "angular-ui-bootstrap" % "0.11.2"
  lazy val webjarsAngularUiRouter = "org.webjars" % "angular-ui-router" % "0.2.11"
  lazy val webjarsBootstrap = "org.webjars" % "bootstrap" % "3.3.0"
  lazy val webjarsCoffeeScript = "org.webjars" % "coffee-script" % "1.8.0"
  lazy val webjarsJquery = "org.webjars" % "jquery" % "2.1.1"
  lazy val webjarsJqueryUi = "org.webjars" % "jquery-ui" % "1.11.1"
  lazy val webjarsRequireCss = "org.webjars" % "require-css" % "0.1.7"
  lazy val webjarsRequirejs = "org.webjars" % "requirejs" % "2.1.15"

  lazy val depOverrides = Set[ModuleID](
    webjarsAirbrakeJs,
    webjarsAngularjs,
    webjarsAngularUiBootstrap,
    webjarsAngularUiRouter,
    webjarsBootstrap,
    webjarsCoffeeScript,
    webjarsJquery,
    webjarsJqueryUi,
    webjarsPlay,
    webjarsRequireCss,
    webjarsRequirejs
  )
}
