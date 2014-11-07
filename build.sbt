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
  "-external-urls:scala=http://www.scala-lang.org/api/current/",
  "-no-link-warnings"
)

javacOptions ++= Seq(
  "-encoding",
  "UTF-8",
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

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "ws.securesocial" %% "securesocial" % "3.0-M1"
)
