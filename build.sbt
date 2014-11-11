import play.PlayImport.PlayKeys._
import net.virtualvoid.sbt.graph.Plugin._
import sbtbuildinfo.Plugin._
import scalariform.formatter.preferences._
import Dependencies._
import Webjars._

organization := "com.eappearance"

name := "eappearance"

version := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

shellPrompt in ThisBuild := { state => "sbt (%s)> ".format(Project.extract(state).currentProject.id) }

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

graphSettings

scalariformSettings

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

buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoPackage := "com.eappearance"

buildInfoKeys := Seq[BuildInfoKey](
  name,
  organization,
  version,
  scalaVersion,
  sbtVersion,
  "buildTime" -> System.currentTimeMillis,
  "commit" -> Process("git rev-parse HEAD").lines.head,
  scalacOptions,
  javacOptions,
  resolvers,
  libraryDependencies
)
