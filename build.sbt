import play.PlayImport.PlayKeys._

organization := "com.eappearance"

name := "eappearance"

version := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.4"

scalacOptions ++= Seq(
  "-encoding",
  "UTF-8",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:dynamics",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:reflectiveCalls",
  "-language:experimental.macros"
)

scalacOptions in (Compile, doc) ++= Seq(
  "-no-link-warnings"
)

javacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-source", "1.8",
  "-target", "1.8",
  "-Xlint:all"
)

javacOptions in (Compile, doc) ++= Seq(
  "-external-urls:java=http://www.scala-lang.org/api/current/",
  "-no-link-warnings"
)

updateOptions := updateOptions.value.withCircularDependencyLevel(CircularDependencyLevel.Error)

updateOptions := updateOptions.value.withCachedResolution(true)

pipelineStages := Seq(rjs, digest, gzip)

closureCompilerOptions += "ecmascript5"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "com.mohiva" %% "play-silhouette" % "1.0",
  "net.codingwell" %% "scala-guice" % "4.0.0-beta4",
  "com.typesafe.play" %% "play-slick" % "0.8.0",
  "mysql" % "mysql-connector-java" % "5.1.33",
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "org.webjars" % "airbrake-js" % "0.3",
  "org.webjars" % "angularjs" % "1.2.26",
  "org.webjars" % "angular-ui-bootstrap" % "0.11.2",
  "org.webjars" % "angular-ui-router" % "0.2.11",
  "org.webjars" % "bootstrap" % "3.3.0",
  "org.webjars" % "coffee-script" % "1.8.0",
  "org.webjars" % "jquery" % "2.1.1",
  "org.webjars" % "jquery-ui" % "1.11.1",
  "org.webjars" % "require-css" % "0.1.7",
  "org.webjars" % "requirejs" % "2.1.15"
)
