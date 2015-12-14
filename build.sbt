import play.PlayImport.PlayKeys._
//import sbtbuildinfo.Plugin._
import scalariform.formatter.preferences._
import Dependencies._
import Webjars._

organization := "com.eappearance"

name := "eappearance"

version := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

shellPrompt in ThisBuild := { state => "sbt (%s)> ".format(Project.extract(state).currentProject.id) }

scalaVersion := Versions.scala

scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-deprecation",
  "-feature",
  "-unchecked",
  "-language:dynamics",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:reflectiveCalls",
  "-language:experimental.macros",
  "-Xfatal-warnings", // Fail the compilation if there are any warnings.
  "-Xlint", // Enable recommended additional warnings.
  "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver.
  "-Ywarn-dead-code", // Warn when dead code is identified.
  "-Ywarn-inaccessible", // Warn about inaccessible types in method signatures.
  "-Ywarn-nullary-override", // Warn when non-nullary overrides nullary, e.g. def foo() over def foo.
  "-Ywarn-numeric-widen" // Warn when numerics are widened.
)

scalacOptions in Test ~= { (options: Seq[String]) =>
  options filterNot (_ == "-Ywarn-dead-code")  // Allow dead code in tests to support using mockito.
}

scalacOptions in ScoverageTest ~= { (options: Seq[String]) =>
  options filterNot (_ == "-Ywarn-dead-code")  // The same when running under scoverage.
}

scalacOptions in (Compile, doc) ++= Seq(
  "-no-link-warnings"
)

javacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-source", Versions.java,
  "-target", Versions.java,
  "-Xlint:all"
)

javacOptions in (Compile, doc) ++= Seq(
  "-external-urls:java=http://www.scala-lang.org/api/current/",
  "-no-link-warnings"
)

updateOptions := updateOptions.value.withCircularDependencyLevel(CircularDependencyLevel.Error)

updateOptions := updateOptions.value.withCachedResolution(true)

//pipelineStages := Seq(rjs, digest, gzip)

closureCompilerOptions += "ecmascript5"

resolvers += Resolver.sonatypeRepo("releases")

dependencyOverrides := Dependencies.depOverrides ++ Webjars.depOverrides

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  playSilhouette,
  playSlick,
  twirlApi,
  scalaGuice,
  mysqlConnectorJava,
  webjarsPlay,
  webjarsAirbrakeJs,
  webjarsAngularjs,
  webjarsAngularUiBootstrap,
  webjarsAngularUiRouter,
  webjarsBootstrap,
  webjarsCoffeeScript,
  webjarsJquery,
  webjarsJqueryUi,
  webjarsRequireCss,
  webjarsRequirejs
)

instrumentSettings

//scalariformSettings
defaultScalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignParameters, true)
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(CompactControlReadability, true)
  .setPreference(CompactStringConcatenation, false)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(FormatXml, true)
  .setPreference(IndentLocalDefs, false)
  .setPreference(IndentPackageBlocks, true)
  .setPreference(IndentSpaces, 2)
  .setPreference(IndentWithTabs, false)
  .setPreference(MultilineScaladocCommentsStartOnFirstLine, false)
  .setPreference(PreserveDanglingCloseParenthesis, true)
  .setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk, false)
  .setPreference(PreserveSpaceBeforeArguments, false)
  .setPreference(RewriteArrowSymbols, false)
  .setPreference(SpaceBeforeColon, false)
  .setPreference(SpaceInsideBrackets, false)
  .setPreference(SpaceInsideParentheses, false)
  .setPreference(SpacesWithinPatternBinders, true)

//buildInfoSettings
//
//sourceGenerators in Compile <+= buildInfo
//
//buildInfoKeys := Seq[BuildInfoKey](
//  name,
//  organization,
//  version,
//  scalaVersion,
//  sbtVersion,
//  "buildDateTime" -> System.currentTimeMillis,
//  "commit" -> Process("git rev-parse HEAD").lines.head,
//  scalacOptions,
//  javacOptions,
//  resolvers,
//  libraryDependencies
//)
//
//buildInfoPackage := "com.eappearance"
