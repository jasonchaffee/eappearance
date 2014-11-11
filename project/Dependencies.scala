import sbt._

// scalastyle:off file.size.limit
object Dependencies {
  var depOverrides = Set[ModuleID]()

  lazy val aopalliance = "aopalliance" % "aopalliance" % "1.0"
  depOverrides = depOverrides ++ Set(aopalliance)

  lazy val oldAntlr = "antlr" % "antlr" % "2.7.7"
  lazy val oldAntlrStringtemplate = "antlr" % "stringtemplate" % "3.2.1"
  depOverrides = depOverrides ++ Set(
    oldAntlr,
    oldAntlrStringtemplate
  )

  lazy val oldAsm = "asm" % "asm" % "3.3.1"
  lazy val oldAsmAttrs = "asm" % "asm-attrs" % "2.2.3"
  lazy val oldAsmCommons = "asm" % "asm-commons" % "3.3.1"
  lazy val oldAsmTree = "asm" % "asm-tree" % "3.3.1"
  lazy val oldAsmUtil = "asm" % "asm-util" % "3.3.1"
  depOverrides = depOverrides ++ Set(
    oldAsm,
    oldAsmAttrs,
    oldAsmCommons,
    oldAsmTree,
    oldAsmUtil
  )

  lazy val batik = "batik" % "batik" % "1.5"
  lazy val batikBridge = "batik" % "batik-brdige" % Versions.batik
  lazy val batikCss = "batik" % "batik-css" % Versions.batik
  lazy val batikDom = "batik" % "batik-dom" % Versions.batik
  lazy val batikExt = "batik" % "batik-ext" % Versions.batik
  lazy val batikParser = "batik" % "batik-parser" % Versions.batik
  lazy val batikRasterizer = "batik" % "batik-rasterizer" % Versions.batik
  lazy val batikScript = "batik" % "batik-script" % Versions.batik
  lazy val batikTranscoder = "batik" % "batik-transcoder" % Versions.batik
  lazy val batikUtil = "batik" % "batik-util" % Versions.batik
  depOverrides = depOverrides ++ Set(
    batik,
    batikBridge,
    batikCss,
    batikDom,
    batikExt,
    batikParser,
    batikRasterizer,
    batikScript,
    batikTranscoder,
    batikUtil
  )

  lazy val oldBcmailJdk14 = "bouncycastle" % "bcmail-jdk14" % "138"
  lazy val oldBcprovJdk14 = "bouncycastle" % "bcprov-jdk14" % "140"
  lazy val oldbctspJdk14 = "bouncycastle" % "bctsp-jdk14" % "138"
  depOverrides = depOverrides ++ Set(
    oldBcmailJdk14,
    oldBcprovJdk14,
    oldbctspJdk14
  )

  lazy val oldC3p0 = "c3p0" % "c3p0" % "0.9.1.2"
  depOverrides = depOverrides ++ Set(oldC3p0)

  lazy val oldCglib = "cglib" % "cglib" % Versions.cglib
  lazy val oldCglibNodep = "cglib" % "cglib-nodep" % Versions.cglib
  depOverrides = depOverrides ++ Set(
    oldCglib,
    oldCglibNodep
  )

  lazy val logbackClassic = "ch.qos.logback" % "logback-classic" % Versions.logback
  lazy val logbackCore = "ch.qos.logback" % "logback-core" % Versions.logback
  lazy val logbackJackson = "ch.qos.logback.contrib" % "logback-jackson" % Versions.logback
  lazy val logbackJsonClassic = "ch.qos.logback.contrib" % "logback-json-classic" % Versions.logback
  lazy val logbackJsonCore = "ch.qos.logback.contrib" % "logback-json-core" % Versions.logback
  lazy val logbackMongodbAccess = "ch.qos.logback.contrib" % "logback-mongodb-access" % Versions.logback
  lazy val logbackMongodbClassic = "ch.qos.logback.contrib" % "logback-mongodb-classic" % Versions.logback
  lazy val logbackMongodbCore = "ch.qos.logback.contrib" % "logback-mongodb-core" % Versions.logback
  depOverrides = depOverrides ++ Set(
    logbackClassic,
    logbackCore,
    logbackJackson,
    logbackJsonClassic,
    logbackJsonCore,
    logbackMongodbAccess,
    logbackMongodbClassic,
    logbackMongodbCore
  )

  lazy val awsJavaSdk = "com.amazonaws" % "aws-java-sdk" % "1.8.10.2"
  depOverrides = depOverrides ++ Set(awsJavaSdk)

  lazy val codahaleMetricsAnnotation = "com.codahale.metrics" % "metrics-annotation" % Versions.codahaleMetrics
  lazy val codahaleMetricsCore = "com.codahale.metrics" % "metrics-core" % Versions.codahaleMetrics
  lazy val codahaleMetricsEhcache = "com.codahale.metrics" % "metrics-ehcache" % Versions.codahaleMetrics
  lazy val codahaleMetricsGanglia = "com.codahale.metrics" % "metrics-ganglia" % Versions.codahaleMetrics
  lazy val codahaleMetricsGraphite = "com.codahale.metrics" % "metrics-graphite" % Versions.codahaleMetrics
  lazy val codahaleMetricsHealthchecks = "com.codahale.metrics" % "metrics-healthchecks" % Versions.codahaleMetrics
  lazy val codahaleMetricsHttpclient = "com.codahale.metrics" % "metrics-httpclient" % Versions.codahaleMetrics
  lazy val codahaleMetricsJdbi = "com.codahale.metrics" % "metrics-jdbi" % Versions.codahaleMetrics
  lazy val codahaleMetricsJersey = "com.codahale.metrics" % "metrics-jersey" % Versions.codahaleMetrics
  lazy val codahaleMetricsJetty8 = "com.codahale.metrics" % "metrics-jetty8" % Versions.codahaleMetrics
  lazy val codahaleMetricsJetty9 = "com.codahale.metrics" % "metrics-jetty9" % Versions.codahaleMetrics
  lazy val codahaleMetricsJson = "com.codahale.metrics" % "metrics-json" % Versions.codahaleMetrics
  lazy val codahaleMetricsJvm = "com.codahale.metrics" % "metrics-jvm" % Versions.codahaleMetrics
  lazy val codahaleMetricsLog4j = "com.codahale.metrics" % "metrics-log4j" % Versions.codahaleMetrics
  lazy val codahaleMetricsLogback = "com.codahale.metrics" % "metrics-logback" % Versions.codahaleMetrics
  lazy val codahaleMetricsServlet = "com.codahale.metrics" % "metrics-servlet" % Versions.codahaleMetrics
  lazy val codahaleMetricsServlets = "com.codahale.metrics" % "metrics-servlets" % Versions.codahaleMetrics
  depOverrides = depOverrides ++ Set(
    codahaleMetricsAnnotation,
    codahaleMetricsCore,
    codahaleMetricsEhcache,
    codahaleMetricsGanglia,
    codahaleMetricsGraphite,
    codahaleMetricsHealthchecks,
    codahaleMetricsHttpclient,
    codahaleMetricsJdbi,
    codahaleMetricsJersey,
    codahaleMetricsJetty8,
    codahaleMetricsJetty9,
    codahaleMetricsJson,
    codahaleMetricsJvm,
    codahaleMetricsLog4j,
    codahaleMetricsLogback,
    codahaleMetricsServlet,
    codahaleMetricsServlets
  )

  lazy val couchbaseClient = "com.couchbase.client" % "couchbase-client" % Versions.couchbaseClient
  depOverrides = depOverrides ++ Set(couchbaseClient)

  lazy val jacksonAnnotations = "com.fasterxml.jackson.core" % "jackson-annotations" % Versions.jackson
  lazy val jacksonCore = "com.fasterxml.jackson.core" % "jackson-core" % Versions.jackson
  lazy val jacksonDatabind = "com.fasterxml.jackson.core" % "jackson-databind" % Versions.jackson
  lazy val jacksonDataformatXml = "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % Versions.jackson
  lazy val jacksonDataformatYaml = "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % Versions.jackson
  lazy val jacksonDatatypeGuava = "com.fasterxml.jackson.datatype" % "jackson-datatype-guava" % Versions.jackson
  lazy val jacksonDatatypeHppc = "com.fasterxml.jackson.datatype" % "jackson-datatype-hppc" % Versions.jackson
  lazy val jacksonDatatypeJoda = "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % Versions.jackson
  lazy val jacksonDatatypeJsonOrg = "com.fasterxml.jackson.datatype" % "jackson-datatype-json-org" % Versions.jackson
  lazy val jacksonDatatypeJsr353 = "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr353" % Versions.jackson
  lazy val jacksonJaxrsBase = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-base" % Versions.jackson
  lazy val jacksonJaxrsJsonProvider = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % Versions.jackson
  lazy val jacksonJaxrsSmileProvider = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-smile-provider" % Versions.jackson
  lazy val jacksonJaxrsXmlProvider = "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-xml-provider" % Versions.jackson
  lazy val jacksonModuleJaxbAnnotations = "com.fasterxml.jackson.module" % "jackson-module-jaxb-annotations" % Versions.jackson
  lazy val jacksonModuleAfterburner = "com.fasterxml.jackson.module" % "jackson-module-afterburner" % Versions.jackson
  lazy val jacksonModuleScala = "com.fasterxml.jackson.module" %% "jackson-module-scala" % Versions.jackson
  depOverrides = depOverrides ++ Set(
    jacksonAnnotations,
    jacksonCore,
    jacksonDatabind,
    jacksonDataformatXml,
    jacksonDataformatYaml,
    jacksonDatatypeGuava,
    jacksonDatatypeHppc,
    jacksonDatatypeJoda,
    jacksonDatatypeJsonOrg,
    jacksonDatatypeJsr353,
    jacksonJaxrsBase,
    jacksonJaxrsJsonProvider,
    jacksonJaxrsSmileProvider,
    jacksonJaxrsXmlProvider,
    jacksonModuleAfterburner,
    jacksonModuleJaxbAnnotations,
    jacksonModuleScala
  )

  lazy val kxbmapConfigs = "com.github.kxbmap" %% "configs" % "0.2.2"
  depOverrides = depOverrides ++ Set(kxbmapConfigs)

  lazy val slugify = "com.github.slugify" % "slugify" % "2.1.2"
  depOverrides = depOverrides ++ Set(slugify)

  lazy val googleCollections = "com.google.collections" % "google-collections" % "1.0"
  depOverrides = depOverrides ++ Set(googleCollections)

  lazy val guava = "com.google.guava" % "guava" % "18.0"
  depOverrides = depOverrides ++ Set(guava)

  lazy val guice = "com.google.inject" % "guice" % Versions.guice
  lazy val guiceAssistedInject = "com.google.inject.extensions" % "guice-assistedinject" % Versions.guice
  lazy val guiceJmx = "com.google.inject.extensions" % "guice-jmx" % Versions.guice
  lazy val guiceJndi = "com.google.inject.extensions" % "guice-jndi" % Versions.guice
  lazy val guiceMultibindings = "com.google.inject.extensions" % "guice-multibindings" % Versions.guice
  lazy val guiceServlet = "com.google.inject.extensions" % "guice-servlet" % Versions.guice
  depOverrides = depOverrides ++ Set(
    guice,
    guiceAssistedInject,
    guiceJmx,
    guiceJndi,
    guiceMultibindings,
    guiceServlet
  )

  lazy val findbugs = "com.google.code.findbugs" % "findbugs" % Versions.findbugs
  lazy val findbugsAnnotations = "com.google.code.findbugs" % "findbugs-annotations" % Versions.findbugs
  lazy val findbugsJsr305 = "com.google.code.findbugs" % "jsr305" % Versions.findbugs
  depOverrides = depOverrides ++ Set(
    findbugs,
    findbugsAnnotations,
    findbugsJsr305
  )

  lazy val jsonSimple = "com.googlecode.json-simple" % "json-simple" % "1.1.1"
  depOverrides = depOverrides ++ Set(jsonSimple)

  lazy val pojosr = "com.googlecode.pojosr" % "de.kalpatec.pojosr.framework" % "0.2.1"
  depOverrides = depOverrides ++ Set(pojosr)

  lazy val hazelcast = "com.hazelcast" % "hazelcast" % "3.1.6"
  depOverrides = depOverrides ++ Set(hazelcast)

  lazy val jsch = "com.jcraft" % "jsch" % "0.1.50"
  depOverrides = depOverrides ++ Set(jsch)

  lazy val itext = "com.lowagie" % "itext" % "4.2.1"
  depOverrides = depOverrides ++ Set(itext)

  lazy val c3p0 = "com.mchange" % "c3p0" % "0.9.2.1"
  depOverrides = depOverrides ++ Set(c3p0)

  lazy val base64 = "com.mindprod" % "base64" % "1.6"
  depOverrides = depOverrides ++ Set(base64)

  lazy val mockrunnerJdbc = "com.mockrunner" % "mockrunner-jdbc" % "1.0.0"
  depOverrides = depOverrides ++ Set(mockrunnerJdbc)

  lazy val playSilhouette = "com.mohiva" %% "play-silhouette" % "1.0"
  depOverrides = depOverrides ++ Set(playSilhouette)

  lazy val asyncHttpClient = "com.ning" % "async-http-client" % "1.8.13"
  depOverrides = depOverrides ++ Set(asyncHttpClient)

  lazy val metricsGuice = "com.palominolabs.metrics" % "metrics-guice" % "3.0.2"
  depOverrides = depOverrides ++ Set(metricsGuice)

  lazy val checkstyle = "com.puppycrawl.tools" % "checkstyle" % "5.7"
  depOverrides = depOverrides ++ Set(checkstyle)

  lazy val rabbitmqAmqpClient = "com.rabbitmq" % "amqp-client" % "3.2.4"
  depOverrides = depOverrides ++ Set(rabbitmqAmqpClient)

  lazy val metricsSpring = "com.ryantenney.metrics" % "metrics-spring" % "3.0.2"
  depOverrides = depOverrides ++ Set(metricsSpring)

  lazy val jersey1Client = "com.sun.jersey" % "jersey-client" % Versions.jersey1
  lazy val jersey1Core = "com.sun.jersey" % "jersey-core" % Versions.jersey1
  lazy val jersey1Server = "com.sun.jersey" % "jersey-server" % Versions.jersey1
  lazy val jersey1Servlet = "com.sun.jersey" % "jersey-servlet" % Versions.jersey1
  depOverrides = depOverrides ++ Set(
    jersey1Client,
    jersey1Core,
    jersey1Server,
    jersey1Servlet
  )

  lazy val jersey1Guice = "com.sun.jersey.contribs" % "jersey-guice" % Versions.jersey1
  lazy val jersey1Mulitpart = "com.sun.jersey.contribs" % "jersey-multipart" % Versions.jersey1
  lazy val jersey1Spring = "com.sun.jersey.contribs" % "jersey-spring" % Versions.jersey1
  depOverrides = depOverrides ++ Set(
    jersey1Guice,
    jersey1Mulitpart,
    jersey1Spring
  )

  lazy val jersey1OauthClient = "com.sun.jersey.contribs.jersey-oauth" % "oauth-client" % Versions.jersey1
  lazy val jersey1OauthSignature = "com.sun.jersey.contribs.jersey-oauth" % "oauth-signature" % Versions.jersey1
  lazy val jersey1OauthServer = "com.sun.jersey.contribs.jersey-oauth" % "oauth-server" % Versions.jersey1
  depOverrides = depOverrides ++ Set(
    jersey1OauthClient,
    jersey1OauthSignature,
    jersey1OauthServer
  )

  lazy val jaxbImpl = "com.sun.xml.bind" % "jaxb-impl" % "2.2.8-b01"
  lazy val jaxbXjc = "com.sun.xml.bind" % "jaxb-xjc" % "2.2.8-b01"
  depOverrides = depOverrides ++ Set(
    jaxbImpl,
    jaxbXjc
  )

  lazy val paranamer = "com.thoughtworks.paranamer" % "paranamer" % "2.6"
  depOverrides = depOverrides ++ Set(paranamer)

  lazy val xstream = "com.thoughtworks.xstream" % "xstream" % "1.4.7"
  depOverrides = depOverrides ++ Set(xstream)

  lazy val typesafeConfig = "com.typesafe" % "config" % "1.2.1"
  depOverrides = depOverrides ++ Set(typesafeConfig)

  lazy val webdriver = "com.typesafe" %% "webdriver" % "1.0.0"
  lazy val jse = "com.typesafe" %% "jse" % "1.0.0"
  lazy val npm = "com.typesafe" %% "npm" % "1.0.0"
  depOverrides = depOverrides ++ Set(
    webdriver,
    jse,
    npm
  )

  lazy val akkaActor = "com.typesafe.akka" %% "akka-actor" % Versions.akka
  lazy val akkaRemote = "com.typesafe.akka" %% "akka-remote" % Versions.akka
  lazy val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % Versions.akka
  lazy val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % Versions.akka
  depOverrides = depOverrides ++ Set(
    akkaActor,
    akkaRemote,
    akkaSlf4j,
    akkaTestkit
  )

  lazy val play = "com.typesafe.play" %% "play" % Versions.play
  lazy val playTest = "com.typesafe.play" %% "play-test" % Versions.play
  lazy val playWs = "com.typesafe.play" %% "play-ws" % Versions.play
  lazy val playJavaWs = "com.typesafe.play" %% "play-java-ws" % Versions.play
  lazy val playJson = "com.typesafe.play" %% "play-json" % Versions.play
  lazy val playSlick = "com.typesafe.play" %% "play-slick" % "0.8.0"
  lazy val twirlApi = "com.typesafe.play" %% "twirl-api" % "1.0.3"
  depOverrides = depOverrides ++ Set(
    play,
    playTest,
    playWs,
    playJavaWs,
    playJson,
    playSlick,
    twirlApi
  )

  lazy val slick = "com.typesafe.slick" %% "slick" % Versions.slick
  lazy val slickCodegen = "com.typesafe.slick" %% "slick-codegen" % Versions.slick
  lazy val slickTest = "com.typesafe.slick" %% "slick-test" % Versions.slick
  depOverrides = depOverrides ++ Set(
    slick,
    slickCodegen,
    slickTest
  )

  lazy val proweb = "com.qas" % "proweb" % "4.0"
  depOverrides = depOverrides ++ Set(proweb)

  lazy val swaggerAnnotations = "com.wordnik" % "swagger-annotations" % Versions.swagger
  lazy val swaggerCore = "com.wordnik" %% "swagger-core" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  lazy val swaggerJaxrs = "com.wordnik" %% "swagger-jaxrs" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  lazy val swaggerJaxrsUtils = "com.wordnik" %% "swagger-jaxrs-utils" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  lazy val swaggerJerseyJaxrs = "com.wordnik" %% "swagger-jersey-jaxrs" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  lazy val swaggerJersey2Jaxrs = "com.wordnik" %% "swagger-jersey2-jaxrs" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  lazy val swaggerOauth2Server = "com.wordnik" %% "swagger-oauth2-server" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  lazy val swaggerPlay2 = "com.wordnik" %% "swagger-play2" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  lazy val swaggerPlay2Utils = "com.wordnik" %% "swagger-play2-utils" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  lazy val swaggerScalaServlet = "com.wordnik" %% "swagger-scala-servlet" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  lazy val swaggerServlet = "com.wordnik" %% "swagger-servlet" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  lazy val swaggerUtils = "com.wordnik" %% "swagger-utils" % Versions.swagger exclude ("javax.ws.rs", "jsr311-api")
  depOverrides = depOverrides ++ Set(
    swaggerAnnotations,
    swaggerCore,
    swaggerJaxrs,
    swaggerJaxrsUtils,
    swaggerJersey2Jaxrs,
    swaggerJerseyJaxrs,
    swaggerOauth2Server,
    swaggerPlay2,
    swaggerPlay2Utils,
    swaggerScalaServlet,
    swaggerServlet,
    swaggerUtils
  )

  lazy val yammerMetricsAnnotation = "com.yammer.metrics" % "metrics-annotation" % Versions.yammerMetrics
  lazy val yammerMetricsCore = "com.yammer.metrics" % "metrics-core" % Versions.yammerMetrics
  lazy val yammerMetricsEhcache = "com.yammer.metrics" % "metrics-ehcache" % Versions.yammerMetrics
  lazy val yammerMetricsGuice = "com.yammer.metrics" % "metrics-guice" % Versions.yammerMetrics
  lazy val yammerMetricsJersey = "com.yammer.metrics" % "metrics-jersey" % Versions.yammerMetrics
  lazy val yammerMetricsServlet = "com.yammer.metrics" % "metrics-servlet" % Versions.yammerMetrics
  lazy val yammerMetricsSpring = "com.yammer.metrics" % "metrics-spring" % Versions.yammerMetrics
  lazy val yammerMetricsWeb = "com.yammer.metrics" % "metrics-web" % Versions.yammerMetrics
  depOverrides = depOverrides ++ Set(
    yammerMetricsAnnotation,
    yammerMetricsCore,
    yammerMetricsEhcache,
    yammerMetricsGuice,
    yammerMetricsJersey,
    yammerMetricsServlet,
    yammerMetricsSpring,
    yammerMetricsWeb
  )

  lazy val commonsBeanutils = "commons-beanutils" % "commons-beanutils" % "1.9.1"
  lazy val commonsCli = "commons-cli" % "commons-cli" % "1.2"
  lazy val commonsCodec = "commons-codec" % "commons-codec" % "1.9"
  lazy val commonsCollections = "commons-collections" % "commons-collections" % "3.2.1"
  lazy val commonsDaemon = "commons-daemon" % "commons-daemon" % "1.0.15"
  lazy val commonsDbcp = "commons-dbcp" % "commons-dbcp" % "1.4"
  lazy val commonsDigester = "commons-digester" % "commons-digester" % "2.1"
  lazy val commonsFileupload = "commons-fileupload" % "commons-fileupload" % "1.3.1"
  lazy val commonsHttpclient = "commons-httpclient" % "commons-httpclient" % "3.1"
  lazy val commonsIo = "commons-io" % "commons-io" % "2.4"
  lazy val commonsLang = "commons-lang" % "commons-lang" % "2.6"
  lazy val commonsLogging = "commons-logging" % "commons-logging" % "1.1.3"
  lazy val commonsLoggingApi = "commons-logging" % "commons-logging-api" % "1.1"
  lazy val commonsPool = "commons-pool" % "commons-pool" % "1.6"
  lazy val commonsNet = "commons-net" % "commons-net" % "3.3"
  depOverrides = depOverrides ++ Set(
    commonsBeanutils,
    commonsCli,
    commonsCodec,
    commonsCollections,
    commonsDaemon,
    commonsDbcp,
    commonsDigester,
    commonsFileupload,
    commonsHttpclient,
    commonsIo,
    commonsLang,
    commonsLogging,
    commonsLoggingApi,
    commonsPool,
    commonsNet
  )

  lazy val dom4j = "dom4j" % "dom4j" % "1.6.1"
  depOverrides = depOverrides ++ Set(dom4j)

  lazy val oldFreemarker = "freemarker" % "freemarker" % "2.3.15"
  depOverrides = depOverrides ++ Set(oldFreemarker)

  lazy val cucumberAndroid = "info.cukes" % "cucumber-android" % Versions.cucumber
  lazy val cucumberClojure = "info.cukes" % "cucumber-clojure" % Versions.cucumber
  lazy val cucumberCore = "info.cukes" % "cucumber-core" % Versions.cucumber
  lazy val cucumberGroovy = "info.cukes" % "cucumber-groovy" % Versions.cucumber
  lazy val cucumberGuice = "info.cukes" % "cucumber-guice" % Versions.cucumber
  lazy val cucumberIoke = "info.cukes" % "cucumber-ioke" % Versions.cucumber
  lazy val cucumberJava = "info.cukes" % "cucumber-java" % Versions.cucumber
  lazy val cucumberJruby = "info.cukes" % "cucumber-jruby" % Versions.cucumber
  lazy val cucumberJunit = "info.cukes" % "cucumber-junit" % Versions.cucumber
  lazy val cucumberJython = "info.cukes" % "cucumber-jython" % Versions.cucumber
  lazy val cucumberNeedle = "info.cukes" % "cucumber-needle" % Versions.cucumber
  lazy val cucumberOpenejb = "info.cukes" % "cucumber-openejb" % Versions.cucumber
  lazy val cucumberPicocontainer = "info.cukes" % "cucumber-picocontainer" % Versions.cucumber
  lazy val cucumberScala = "info.cukes" % "cucumber-scala" % Versions.cucumber
  lazy val cucumberSpring = "info.cukes" % "cucumber-spring" % Versions.cucumber
  lazy val cucumberWeld = "info.cukes" % "cucumber-weld" % Versions.cucumber
  depOverrides = depOverrides ++ Set(
    cucumberAndroid,
    cucumberClojure,
    cucumberCore,
    cucumberGroovy,
    cucumberGuice,
    cucumberIoke,
    cucumberJava,
    cucumberJruby,
    cucumberJunit,
    cucumberJython,
    cucumberNeedle,
    cucumberOpenejb,
    cucumberPicocontainer,
    cucumberScala,
    cucumberSpring,
    cucumberWeld
  )

  lazy val metricsAnnotation = "io.dropwizard.metrics" % "metrics-annotation" % Versions.metrics
  lazy val metricsCore = "io.dropwizard.metrics" % "metrics-core" % Versions.metrics
  lazy val metricsEhcache = "io.dropwizard.metrics" % "metrics-ehcache" % Versions.metrics
  lazy val metricsGanglia = "io.dropwizard.metrics" % "metrics-ganglia" % Versions.metrics
  lazy val metricsGraphite = "io.dropwizard.metrics" % "metrics-graphite" % Versions.metrics
  lazy val metricsHealthchecks = "io.dropwizard.metrics" % "metrics-healthchecks" % Versions.metrics
  lazy val metricsHttpasyncclient = "io.dropwizard.metrics" % "metrics-httpasyncclient" % Versions.metrics
  lazy val metricsHttpclient = "io.dropwizard.metrics" % "metrics-httpclient" % Versions.metrics
  lazy val metricsJdbi = "io.dropwizard.metrics" % "metrics-jdbi" % Versions.metrics
  lazy val metricsJersey = "io.dropwizard.metrics" % "metrics-jersey" % Versions.metrics
  lazy val metricsJersey2 = "io.dropwizard.metrics" % "metrics-jersey2" % Versions.metrics
  lazy val metricsJetty8 = "io.dropwizard.metrics" % "metrics-jetty8" % Versions.metrics
  lazy val metricsJetty9 = "io.dropwizard.metrics" % "metrics-jetty9" % Versions.metrics
  lazy val metricsJson = "io.dropwizard.metrics" % "metrics-json" % Versions.metrics
  lazy val metricsJvm = "io.dropwizard.metrics" % "metrics-jvm" % Versions.metrics
  lazy val metricsLog4j = "io.dropwizard.metrics" % "metrics-log4j" % Versions.metrics
  lazy val metricsLogback = "io.dropwizard.metrics" % "metrics-logback" % Versions.metrics
  lazy val metricsServlet = "io.dropwizard.metrics" % "metrics-servlet" % Versions.metrics
  lazy val metricsServlets = "io.dropwizard.metrics" % "metrics-servlets" % Versions.metrics
  depOverrides = depOverrides ++ Set(
    metricsAnnotation,
    metricsCore,
    metricsEhcache,
    metricsGanglia,
    metricsGraphite,
    metricsHealthchecks,
    metricsHttpasyncclient,
    metricsHttpclient,
    metricsJdbi,
    metricsJersey,
    metricsJersey2,
    metricsJetty8,
    metricsJetty9,
    metricsJson,
    metricsJvm,
    metricsLog4j,
    metricsLogback,
    metricsServlet,
    metricsServlets
  )

  lazy val netty = "io.netty" % "netty" % "3.9.2.Final"
  lazy val nettyAll = "io.netty" % "netty-all" % Versions.netty
  lazy val nettyBuffer = "io.netty" % "netty-buffer" % Versions.netty
  lazy val nettyCodec = "io.netty" % "netty-codec" % Versions.netty
  lazy val nettyCommon = "io.netty" % "netty-common" % Versions.netty
  lazy val nettyExample = "io.netty" % "netty-example" % Versions.netty
  lazy val nettyHandler = "io.netty" % "netty-handler" % Versions.netty
  lazy val nettyTransport = "io.netty" % "netty-transport" % Versions.netty
  depOverrides = depOverrides ++ Set(
    netty,
    nettyAll,
    nettyBuffer,
    nettyCodec,
    nettyCommon,
    nettyExample,
    nettyHandler,
    nettyTransport
  )

  lazy val sprayCaching = "io.spray" % "spray-caching" % Versions.spray
  lazy val sprayCan = "io.spray" % "spray-can" % Versions.spray
  lazy val sprayClient = "io.spray" % "spray-client" % Versions.spray
  lazy val sprayHttp = "io.spray" % "spray-http" % Versions.spray
  lazy val sprayHttpx = "io.spray" % "spray-httpx" % Versions.spray
  lazy val sprayIo = "io.spray" % "spray-io" % Versions.spray
  lazy val sprayRouting = "io.spray" % "spray-routing" % Versions.spray
  lazy val sprayServlet = "io.spray" % "spray-servlet" % Versions.spray
  lazy val sprayTestkit = "io.spray" % "spray-testkit" % Versions.spray
  lazy val sprayUtil = "io.spray" % "spray-util" % Versions.spray
  depOverrides = depOverrides ++ Set(
    sprayCaching,
    sprayCan,
    sprayClient,
    sprayHttp,
    sprayHttpx,
    sprayIo,
    sprayRouting,
    sprayServlet,
    sprayTestkit,
    sprayUtil
  )

  lazy val javassistOld = "javassist" % "javassist" % "3.12.1.GA"
  depOverrides = depOverrides ++ Set(javassistOld)

  lazy val activation = "javax.activation" % "activation" % "1.1.1"
  depOverrides = depOverrides ++ Set(activation)

  lazy val jsr250Api = "javax.annotation" % "jsr250-api" % "1.0"
  depOverrides = depOverrides ++ Set(jsr250Api)

  lazy val javaxAnnotationApi = "javax.annotation" % "javax.annotation-api" % "1.2"
  depOverrides = depOverrides ++ Set(javaxAnnotationApi)

  lazy val javaxCacheApi = "javax.cache" % "cache-api" % "1.0.0-RC1"
  depOverrides = depOverrides ++ Set(javaxCacheApi)

  lazy val elApi = "javax.el" % "el-api" % "2.2"
  depOverrides = depOverrides ++ Set(elApi)

  lazy val javaxElApi = "javax.el" % "javax.el-api" % "3.0.0"
  depOverrides = depOverrides ++ Set(javaxElApi)

  lazy val javaxInject = "javax.inject" % "javax.inject" % "1"
  depOverrides = depOverrides ++ Set(javaxInject)

  lazy val j2ee = "javax.j2ee" % "j2ee" % "1.5"
  depOverrides = depOverrides ++ Set(j2ee)

  lazy val jms = "javax.jms" % "jms" % "1.1"
  depOverrides = depOverrides ++ Set(jms)

  lazy val mail = "javax.mail" % "mail" % "1.4.7"
  depOverrides = depOverrides ++ Set(mail)

  lazy val javaxMailApi = "javax.mail" % "javax.mail-api" % "1.5.1"
  depOverrides = depOverrides ++ Set(javaxMailApi)

  lazy val persistenceApi = "javax.persistence" % "persistence-api" % "1.0.2"
  depOverrides = depOverrides ++ Set(persistenceApi)

  lazy val jsr94 = "javax.rules" % "jsr94" % "1.1"
  depOverrides = depOverrides ++ Set(jsr94)

  lazy val servletApi = "javax.servlet" % "servlet-api" % "2.5"
  depOverrides = depOverrides ++ Set(servletApi)

  lazy val javaxServletApi = "javax.servlet" % "javax.servlet-api" % "3.1.0"
  depOverrides = depOverrides ++ Set(javaxServletApi)

  lazy val jstl = "javax.servlet" % "jstl" % "1.2"
  depOverrides = depOverrides ++ Set(jstl)

  lazy val jspApi = "javax.servlet.jsp" % "jsp-api" % "2.2"
  depOverrides = depOverrides ++ Set(jspApi)

  lazy val javaxJspApi = "javax.servlet.jsp" % "javax.servlet.jsp-api" % "2.3.1"
  depOverrides = depOverrides ++ Set(javaxJspApi)

  lazy val jstlApi = "javax.servlet.jsp.jstl" % "jstl-api" % "1.2"
  depOverrides = depOverrides ++ Set(jstlApi)

  lazy val jta = "javax.transaction" % "jta" % "1.1"
  depOverrides = depOverrides ++ Set(jta)

  lazy val validationApi = "javax.validation" % "validation-api" % "1.1.0.Final"
  depOverrides = depOverrides ++ Set(validationApi)

  lazy val jsr311Api = "javax.ws.rs" % "jsr311-api" % "1.1.1"
  depOverrides = depOverrides ++ Set(jsr311Api)

  lazy val javaxWsRsApi = "javax.ws.rs" % "javax.ws.rs-api" % "2.0.1"
  depOverrides = depOverrides ++ Set(javaxWsRsApi)

  lazy val jsr173 = "javax.xml" % "jsr173" % "1.0"
  depOverrides = depOverrides ++ Set(jsr173)

  lazy val jaxbApi = "javax.xml.bind" % "jaxb-api" % "2.2.11"
  depOverrides = depOverrides ++ Set(jaxbApi)

  lazy val staxApi = "javax.xml.stream" % "stax-api" % "1.0-2"
  depOverrides = depOverrides ++ Set(staxApi)

  lazy val jaxen = "jaxen" % "jaxen" % "1.1.4"
  depOverrides = depOverrides ++ Set(jaxen)

  lazy val jdepend = "jdepend" % "jdepend" % "2.9.1"
  depOverrides = depOverrides ++ Set(jdepend)

  lazy val jline = "jline" % "jline" % "2.11"
  depOverrides = depOverrides ++ Set(jline)

  lazy val jodaTime = "joda-time" % "joda-time" % "2.3"
  depOverrides = depOverrides ++ Set(jodaTime)

  lazy val junit = "junit" % "junit" % "4.11"
  depOverrides = depOverrides ++ Set(junit)

  lazy val jxl = "jxl" % "jxl" % "2.6.10"
  depOverrides = depOverrides ++ Set(jxl)

  lazy val log4j = "log4j" % "log4j" % "1.2.17"
  lazy val log4jExtras = "log4j" % "apache-log4j-extras" % "1.2.17"
  depOverrides = depOverrides ++ Set(
    log4j,
    log4jExtras
  )

  lazy val mysqlConnectorJava = "mysql" % "mysql-connector-java" % "5.1.34"
  depOverrides = depOverrides ++ Set(mysqlConnectorJava)

  lazy val ficus = "net.ceedubs" %% "ficus" % "1.1.1"
  depOverrides = depOverrides ++ Set(ficus)

  val scalaGuice = "net.codingwell" %% "scala-guice" % "4.0.0-beta4"
  depOverrides = depOverrides ++ Set(scalaGuice)

  lazy val jerichoHtml = "net.htmlparser.jericho" % "jericho-html" % "3.3"
  depOverrides = depOverrides ++ Set(jerichoHtml)

  lazy val jets3t = "net.java.dev.jets3t" % "jets3t" % "0.9.2"
  depOverrides = depOverrides ++ Set(jets3t)

  lazy val dozer = "net.sf.dozer" % "dozer" % "5.5.1"
  depOverrides = depOverrides ++ Set(dozer)

  lazy val ehcache = "net.sf.ehcache" % "ehcache" % "2.8.1"
  depOverrides = depOverrides ++ Set(ehcache)

  lazy val flexjson = "net.sf.flexjson" % "flexjson" % "3.2"
  depOverrides = depOverrides ++ Set(flexjson)

  lazy val cobertura = "net.sourceforge.cobertura" % "cobertura" % "2.0.3"
  depOverrides = depOverrides ++ Set(cobertura)

  lazy val pmd = "net.sourceforge.pmd" % "pmd" % Versions.pmd
  depOverrides = depOverrides ++ Set(pmd)

  lazy val saxon = "net.sourceforge.saxon" % "saxon" % "9.1.0.8"
  depOverrides = depOverrides ++ Set(saxon)

  lazy val spymemcached = "net.spy" % "saxon" % "2.11.3"
  depOverrides = depOverrides ++ Set(spymemcached)

  lazy val metricsScala = "nl.grons" %% "metrics-scala" % "3.2.0_a2.3"
  depOverrides = depOverrides ++ Set(metricsScala)

  lazy val ognl = "ognl" % "ognl" % "3.0.8"
  depOverrides = depOverrides ++ Set(ognl)

  lazy val opencsv = "opencsv" % "opencsv" % "1.8"
  depOverrides = depOverrides ++ Set(opencsv)

  lazy val antlr = "org.antlr" % "antlr" % "3.5.1"
  lazy val antlrStringtemplate = "org.antlr" % "stringtemplate" % "4.0.2"
  depOverrides = depOverrides ++ Set(
    antlr,
    antlrStringtemplate
  )

  lazy val jakartaOro = "org.apache" % "jakarta-oro" % "2.0.8"
  depOverrides = depOverrides ++ Set(jakartaOro)

  lazy val activemqAll = "org.apache.activemq" % "activemq-all" % Versions.activemq
  lazy val activemqCamel = "org.apache.activemq" % "activemq-camel" % Versions.activemq
  lazy val activemqPool = "org.apache.activemq" % "activemq-pool" % Versions.activemq
  depOverrides = depOverrides ++ Set(
    activemqAll,
    activemqCamel,
    activemqPool
  )

  lazy val ant = "org.apache.ant" % "ant" % Versions.ant
  lazy val antLauncher = "org.apache.ant" % "ant-launcher" % Versions.ant
  depOverrides = depOverrides ++ Set(
    ant,
    antLauncher
  )

  lazy val avro = "org.apache.avro" % "avro" % Versions.avro
  lazy val avroIpc = "org.apache.avro" % "avro-ipc" % Versions.avro
  depOverrides = depOverrides ++ Set(
    avro,
    avroIpc
  )

  lazy val bsfAll = "org.apache.bsf" % "bsf-all" % "3.0-beta3"
  depOverrides = depOverrides ++ Set(bsfAll)

  lazy val camelAws = "org.apache.camel" % "camel-aws" % Versions.camel
  lazy val camelBeanValidator = "org.apache.camel" % "camel-bean-lazy validator" % Versions.camel
  lazy val camelBindy = "org.apache.camel" % "camel-bindy" % Versions.camel
  lazy val camelCache = "org.apache.camel" % "camel-cache" % Versions.camel
  lazy val camelCore = "org.apache.camel" % "camel-core" % Versions.camel
  lazy val camelCoreXml = "org.apache.camel" % "camel-core-xml" % Versions.camel
  lazy val camelCsv = "org.apache.camel" % "camel-csv" % Versions.camel
  lazy val camelCxf = "org.apache.camel" % "camel-cxf" % Versions.camel
  lazy val camelCxfTransport = "org.apache.camel" % "camel-cxf-transport" % Versions.camel
  lazy val camelDozer = "org.apache.camel" % "camel-dozer" % Versions.camel
  lazy val camelEclipse = "org.apache.camel" % "camel-eclipse" % Versions.camel
  lazy val camelFtp = "org.apache.camel" % "camel-ftp" % Versions.camel
  lazy val camelHttp4 = "org.apache.camel" % "camel-http4" % Versions.camel
  lazy val camelJackson = "org.apache.camel" % "camel-jackson" % Versions.camel
  lazy val camelJaxb = "org.apache.camel" % "camel-jaxb" % Versions.camel
  lazy val camelJdbc = "org.apache.camel" % "camel-jdbc" % Versions.camel
  lazy val camelJms = "org.apache.camel" % "camel-jms" % Versions.camel
  lazy val camelJpa = "org.apache.camel" % "camel-jpa" % Versions.camel
  lazy val camelLucene = "org.apache.camel" % "camel-lucene" % Versions.camel
  lazy val camelMail = "org.apache.camel" % "camel-mail" % Versions.camel
  lazy val camelMongodb = "org.apache.camel" % "camel-mongodb" % Versions.camel
  lazy val camelQuartz = "org.apache.camel" % "camel-quartz" % Versions.camel
  lazy val camelRabbitmq = "org.apache.camel" % "camel-rabbitmq" % Versions.camel
  lazy val camelScala = "org.apache.camel" % "camel-scala" % Versions.camel
  lazy val camelScript = "org.apache.camel" % "camel-script" % Versions.camel
  lazy val camelSmpp = "org.apache.camel" % "camel-smpp" % Versions.camel
  lazy val camelSolr = "org.apache.camel" % "camel-solr" % Versions.camel
  lazy val camelSpring = "org.apache.camel" % "camel-spring" % Versions.camel
  lazy val camelTest = "org.apache.camel" % "camel-test" % Versions.camel
  lazy val camelTestng = "org.apache.camel" % "camel-testng" % Versions.camel
  lazy val camelVelocity = "org.apache.camel" % "camel-velocity" % Versions.camel
  lazy val camelWeb = "org.apache.camel" % "camel-web" % Versions.camel
  lazy val camelWebsocket = "org.apache.camel" % "camel-websocket" % Versions.camel
  lazy val camelXmljson = "org.apache.camel" % "camel-xmljson" % Versions.camel
  lazy val camelXmpp = "org.apache.camel" % "camel-xmpp" % Versions.camel
  lazy val camelXstream = "org.apache.camel" % "camel-xstream" % Versions.camel
  lazy val camelZookeeper = "org.apache.camel" % "camel-zookeeper" % Versions.camel
  depOverrides = depOverrides ++ Set(
    camelAws,
    camelBeanValidator,
    camelBindy,
    camelCache,
    camelCore,
    camelCoreXml,
    camelCsv,
    camelCxf,
    camelCxfTransport,
    camelDozer,
    camelEclipse,
    camelFtp,
    camelHttp4,
    camelJackson,
    camelJaxb,
    camelJdbc,
    camelJms,
    camelJpa,
    camelLucene,
    camelMail,
    camelMongodb,
    camelQuartz,
    camelRabbitmq,
    camelScala,
    camelScript,
    camelSmpp,
    camelSolr,
    camelSpring,
    camelTest,
    camelTestng,
    camelVelocity,
    camelWeb,
    camelWebsocket,
    camelXmljson,
    camelXmpp,
    camelXstream,
    camelZookeeper
  )

  val camelCouchbase = "org.apache-extras.camel-extra" % "camel-couchbase" % Versions.camel
  depOverrides = depOverrides ++ Set(camelCouchbase)

  lazy val commonsLang3 = "org.apache.commons" % "commons-lang3" % "3.3.2"
  depOverrides = depOverrides ++ Set(commonsLang3)

  lazy val commonsMath3 = "org.apache.commons" % "commons-math3" % "3.2"
  depOverrides = depOverrides ++ Set(commonsMath3)

  lazy val cxfApi = "org.apache.cxf" % "cxf-api" % Versions.cxf
  lazy val cxfBundle = "org.apache.cxf" % "cxf-bundle" % Versions.cxf
  lazy val cxfCore = "org.apache.cxf" % "cxf-core" % Versions.cxf
  lazy val cxfRtBindingsSoap = "org.apache.cxf" % "cxf-rt-bindings-soap" % Versions.cxf
  lazy val cxfRtBindingsXml = "org.apache.cxf" % "cxf-rt-bindings-xml" % Versions.cxf
  lazy val cxfRtCore = "org.apache.cxf" % "cxf-rt-core" % Versions.cxf
  lazy val cxfRtDatabindingJaxb = "org.apache.cxf" % "cxf-rt-databinding-jaxb" % Versions.cxf
  lazy val cxfRtFeaturesClustering = "org.apache.cxf" % "cxf-rt-features-clustering" % Versions.cxf
  lazy val cxfRtFrontendJaxrs = "org.apache.cxf" % "cxf-rt-frontend-jaxrs" % Versions.cxf
  lazy val cxfRtFrontendJaxws = "org.apache.cxf" % "cxf-rt-frontend-jaxws" % Versions.cxf
  lazy val cxfRtFrontendSimple = "org.apache.cxf" % "cxf-rt-frontend-simple" % Versions.cxf
  lazy val cxfRtRsClient = "org.apache.cxf" % "cxf-rt-rs-client" % Versions.cxf
  lazy val cxfRtRsExtensionProviders = "org.apache.cxf" % "cxf-rt-rs-extension-providers" % Versions.cxf
  lazy val cxfRtRsExtensionSearch = "org.apache.cxf" % "cxf-rt-rs-extension-search" % Versions.cxf
  lazy val cxfRtRsServiceDescription = "org.apache.cxf" % "cxf-rt-rs-service-description" % Versions.cxf
  lazy val cxfRtRsSecurityCors = "org.apache.cxf" % "cxf-rt-rs-security-cors" % Versions.cxf
  lazy val cxfRtRsSecurityOauth = "org.apache.cxf" % "cxf-rt-rs-security-oauth" % Versions.cxf
  lazy val cxfRtRsSecurityOauth2 = "org.apache.cxf" % "cxf-rt-rs-security-oauth2" % Versions.cxf
  lazy val cxfRtTransportsHttp = "org.apache.cxf" % "cxf-rt-transports-http" % Versions.cxf
  lazy val cxfRtTransportsHttpJetty = "org.apache.cxf" % "cxf-rt-transports-http-jetty" % Versions.cxf
  lazy val cxfRtWsAddr = "org.apache.cxf" % "cxf-rt-ws-addr" % Versions.cxf
  lazy val cxfTestutils = "org.apache.cxf" % "cxf-testutils" % Versions.cxf
  lazy val cxfSystestsJaxrs = "org.apache.cxf.systests" % "cxf-systests-jaxrs" % Versions.cxf
  depOverrides = depOverrides ++ Set(
    cxfApi,
    cxfBundle,
    cxfCore,
    cxfRtBindingsSoap,
    cxfRtBindingsXml,
    cxfRtCore,
    cxfRtDatabindingJaxb,
    cxfRtFeaturesClustering,
    cxfRtFrontendJaxrs,
    cxfRtFrontendJaxws,
    cxfRtFrontendSimple,
    cxfRtRsClient,
    cxfRtRsExtensionProviders,
    cxfRtRsExtensionSearch,
    cxfRtRsServiceDescription,
    cxfRtRsSecurityCors,
    cxfRtRsSecurityOauth,
    cxfRtRsSecurityOauth2,
    cxfRtTransportsHttp,
    cxfRtTransportsHttpJetty,
    cxfRtWsAddr,
    cxfTestutils,
    cxfSystestsJaxrs
  )

  lazy val geronimoAnnotation10Spec = "org.apache.geronimo.specs" % "geronimo-annotation_1.0_spec" % "1.1.1"
  depOverrides = depOverrides ++ Set(geronimoAnnotation10Spec)

  lazy val geronimoJ2ee11Spec = "org.apache.geronimo.specs" % "geronimo-j2ee-management_1.1_spec" % "1.0.1"
  depOverrides = depOverrides ++ Set(geronimoJ2ee11Spec)

  lazy val geronimoJaspic10Spec = "org.apache.geronimo.specs" % "geronimo-jaspic_1.0_spec" % "1.1"
  depOverrides = depOverrides ++ Set(geronimoJaspic10Spec)

  lazy val geronimoJms11Spec = "org.apache.geronimo.specs" % "geronimo-jms_1.1_spec" % "1.1.1"
  depOverrides = depOverrides ++ Set(geronimoJms11Spec)

  lazy val geronimoJta101BSpec = "org.apache.geronimo.specs" % "geronimo-jta_1.0.1B_spec" % "1.1.1"
  depOverrides = depOverrides ++ Set(geronimoJta101BSpec)

  lazy val geronimoJta11Spec = "org.apache.geronimo.specs" % "geronimo-jta_1.1_spec" % "1.1.1"
  depOverrides = depOverrides ++ Set(geronimoJta11Spec)

  lazy val geronimoServlet25Spec = "org.apache.geronimo.specs" % "geronimo-servlet_2.5_spec" % "1.2"
  depOverrides = depOverrides ++ Set(geronimoServlet25Spec)

  lazy val geronimoServlet30Spec = "org.apache.geronimo.specs" % "geronimo-servlet_3.0_spec" % "1.0"
  depOverrides = depOverrides ++ Set(geronimoServlet30Spec)

  lazy val geronimoStaxApi10Spec = "org.apache.geronimo.specs" % "geronimo-stax-api_1.0_spec" % "1.0.1"
  depOverrides = depOverrides ++ Set(geronimoStaxApi10Spec)

  lazy val httpclient = "org.apache.httpcomponents" % "httpclient" % Versions.httpComponents
  lazy val httpclientCache = "org.apache.httpcomponents" % "httpclient-cache" % Versions.httpComponents
  lazy val httpcore = "org.apache.httpcomponents" % "httpcore" % "4.3.2"
  lazy val httpcoreNio = "org.apache.httpcomponents" % "httpcore-nio" % "4.3.2"
  lazy val httpmime = "org.apache.httpcomponents" % "httpmime" % Versions.httpComponents
  depOverrides = depOverrides ++ Set(
    httpclient,
    httpclientCache,
    httpcore,
    httpcoreNio,
    httpmime
  )

  lazy val log4j2 = "org.apache.logging.log4j" % "log4j" % "2.0-rc1"
  depOverrides = depOverrides ++ Set(log4j2)

  lazy val lucenceAnalyzersCommon = "org.apache.lucene" % "lucene-analyzers-common" % Versions.lucene
  lazy val lucenceCore = "org.apache.lucene" % "lucene-core" % Versions.lucene
  depOverrides = depOverrides ++ Set(
    lucenceAnalyzersCommon,
    lucenceCore
  )

  lazy val olingoOdata2Core = "org.apache.olingo" % "olingo-odata2-core-incubating" % Versions.olingo
  depOverrides = depOverrides ++ Set(olingoOdata2Core)

  lazy val sparkAssembly = "org.apache.spark" %% "spark-assembly" % Versions.spark
  lazy val sparkBagel = "org.apache.spark" %% "spark-bagel" % Versions.spark
  lazy val sparkCatalyst = "org.apache.spark" %% "spark-catalyst" % Versions.spark
  lazy val sparkCore = "org.apache.spark" %% "spark-core" % Versions.spark
  lazy val sparkExamples = "org.apache.spark" %% "spark-examples" % Versions.spark
  lazy val sparkGangliaLgpl = "org.apache.spark" %% "spark-ganglia-lgpl" % Versions.spark
  lazy val sparkGraphx = "org.apache.spark" %% "spark-graphx" % Versions.spark
  lazy val sparkHive = "org.apache.spark" %% "spark-hive" % Versions.spark
  lazy val sparkRepl = "org.apache.spark" %% "spark-repl" % Versions.spark
  lazy val sparkMllib = "org.apache.spark" %% "spark-mllib" % Versions.spark
  lazy val sparkStreaming = "org.apache.spark" %% "spark-streaming" % Versions.spark
  lazy val sparkStreamingFlume = "org.apache.spark" %% "spark-streaming-flume" % Versions.spark
  lazy val sparkStreamingKafka = "org.apache.spark" %% "spark-streaming-kafka" % Versions.spark
  lazy val sparkStreamingMqtt = "org.apache.spark" %% "spark-streaming-mqtt" % Versions.spark
  lazy val sparkStreamingTwitter = "org.apache.spark" %% "spark-streaming-twitter" % Versions.spark
  lazy val sparkStreamingZeromq = "org.apache.spark" %% "spark-streaming-zeromq" % Versions.spark
  lazy val sparkSql = "org.apache.spark" %% "spark-sql" % Versions.spark
  lazy val sparkTools = "org.apache.spark" %% "spark-tools" % Versions.spark
  lazy val sparkYarn = "org.apache.spark" %% "spark-yarn" % Versions.spark
  depOverrides = depOverrides ++ Set(
    sparkAssembly,
    sparkBagel,
    sparkCatalyst,
    sparkCore,
    sparkExamples,
    sparkGangliaLgpl,
    sparkGraphx,
    sparkHive,
    sparkRepl,
    sparkMllib,
    sparkStreaming,
    sparkStreamingFlume,
    sparkStreamingKafka,
    sparkStreamingMqtt,
    sparkStreamingTwitter,
    sparkStreamingZeromq,
    sparkSql,
    sparkTools,
    sparkYarn
  )

  lazy val tomcat = "org.apache.tomcat" % "tomcat" % Versions.tomcat
  depOverrides = depOverrides ++ Set(tomcat)

  lazy val xbeanSpring = "org.apache.xbean" % "xbean-spring" % "3.16"
  depOverrides = depOverrides ++ Set(xbeanSpring)

  lazy val xmlbeans = "org.apache.xmlbeans" % "xmlbeans" % "2.5.0"
  depOverrides = depOverrides ++ Set(xmlbeans)

  lazy val aspectjrt = "org.aspectj" % "aspectjrt" % Versions.aspectj
  lazy val aspectjtools = "org.aspectj" % "aspectjtools" % Versions.aspectj
  lazy val aspectjweaver = "org.aspectj" % "aspectjweaver" % Versions.aspectj
  lazy val aspectjWeaverEchoWeave = "org.aspectj" % "aspectjweaver" % Versions.aspectj % "echo-weave"
  depOverrides = depOverrides ++ Set(
    aspectjrt,
    aspectjtools,
    aspectjweaver,
    aspectjWeaverEchoWeave
  )

  lazy val bcmailJdk14 = "org.bouncycastle" % "bcmail-jdk14" % Versions.bouncycastle
  lazy val bcmailJdk15on = "org.bouncycastle" % "bcmail-jdk15on" % Versions.bouncycastle
  lazy val bcpgJdk14 = "org.bouncycastle" % "bcpg-jdk14" % Versions.bouncycastle
  lazy val bcpgJdk15on = "org.bouncycastle" % "bcpg-jdk15on" % Versions.bouncycastle
  lazy val bcpkixJdk14 = "org.bouncycastle" % "bcpkix-jdk14" % Versions.bouncycastle
  lazy val bcpkixJdk145on = "org.bouncycastle" % "bcpkix-jdk145on" % Versions.bouncycastle
  lazy val bcprovJdk14 = "org.bouncycastle" % "bcprov-jdk14" % Versions.bouncycastle
  lazy val bcprovJdk15on = "org.bouncycastle" % "bcprov-jdk15on" % Versions.bouncycastle
  lazy val bcprovExtJdk14 = "org.bouncycastle" % "bcprov-ext-jdk14" % Versions.bouncycastle
  lazy val bcprovExtJdk15on = "org.bouncycastle" % "bcprov-ext-jdk15on" % Versions.bouncycastle
  depOverrides = depOverrides ++ Set(
    bcmailJdk14,
    bcmailJdk15on,
    bcpgJdk14,
    bcpgJdk15on,
    bcpkixJdk14,
    bcpkixJdk145on,
    bcprovJdk14,
    bcprovJdk15on,
    bcprovExtJdk14,
    bcprovExtJdk15on
  )

  lazy val enunciateCoreAnnotations = "org.codehaus.enunciate" % "enunciate-core-annotations" % "1.28"
  depOverrides = depOverrides ++ Set(enunciateCoreAnnotations)

  lazy val groovy = "org.codehaus.groovy" % "groovy" % "2.2.2"
  lazy val groovyAll = "org.codehaus.groovy" % "groovy-all" % "2.2.2"
  depOverrides = depOverrides ++ Set(
    groovy,
    groovyAll
  )

  lazy val jackson1CoreAsl = "org.codehaus.jackson" % "jackson-core-asl" % Versions.jackson1
  lazy val jackson1Jaxrs = "org.codehaus.jackson" % "jackson-jaxrs" % Versions.jackson1
  lazy val jackson1MapperAsl = "org.codehaus.jackson" % "jackson-mapper-asl" % Versions.jackson1
  lazy val jackson1Xc = "org.codehaus.jackson" % "jackson-xc" % Versions.jackson1
  depOverrides = depOverrides ++ Set(
    jackson1CoreAsl,
    jackson1Jaxrs,
    jackson1MapperAsl,
    jackson1Xc
  )

  lazy val janino = "org.codehaus.janino" % "janino" % "2.7.6"
  depOverrides = depOverrides ++ Set(janino)

  lazy val jettison = "org.codehaus.jettison" % "jettison" % "1.3.5"
  depOverrides = depOverrides ++ Set(jettison)

  lazy val woodstoxCore = "org.codehaus.woodstox" % "woodstox-core-asl" % "4.2.0"
  depOverrides = depOverrides ++ Set(woodstoxCore)

  lazy val easymock = "org.easymock" % "easymock" % "3.2"
  depOverrides = depOverrides ++ Set(easymock)

  lazy val jettyAll = "org.eclipse.jetty.aggregate" % "jetty-all" % Versions.jetty
  lazy val jettyAnt = "org.eclipse.jetty" % "jetty-ant" % Versions.jetty
  lazy val jettyDistribution = "org.eclipse.jetty" % "jetty-distribution" % Versions.jetty
  lazy val jettyHttp = "org.eclipse.jetty" % "jetty-http" % Versions.jetty
  lazy val jettyIo = "org.eclipse.jetty" % "jetty-io" % Versions.jetty
  lazy val jettyJndi = "org.eclipse.jetty" % "jetty-jndi" % Versions.jetty
  lazy val jettyPlus = "org.eclipse.jetty" % "jetty-plus" % Versions.jetty
  lazy val jettyRunner = "org.eclipse.jetty" % "jetty-runner" % Versions.jetty
  lazy val jettySecurity = "org.eclipse.jetty" % "jetty-security" % Versions.jetty
  lazy val jettyServer = "org.eclipse.jetty" % "jetty-server" % Versions.jetty
  lazy val jettyUtil = "org.eclipse.jetty" % "jetty-util" % Versions.jetty
  lazy val jettyWebapp = "org.eclipse.jetty" % "jetty-webapp" % Versions.jetty
  lazy val jettyXml = "org.eclipse.jetty" % "jetty-xml" % Versions.jetty
  depOverrides = depOverrides ++ Set(
    jettyAll,
    jettyAnt,
    jettyDistribution,
    jettyHttp,
    jettyIo,
    jettyJndi,
    jettyPlus,
    jettyRunner,
    jettyServer,
    jettyUtil,
    jettyWebapp,
    jettyXml
  )

  lazy val jettyJstl = "org.eclipse.jetty.orbit" % "javax.servlet.jsp.jstl" % "1.2.0.v201105211821"
  lazy val jettyJdtCore = "org.eclipse.jetty.orbit" % "org.eclipse.jdt.core" % "3.8.2.v20130121"
  lazy val jettySchemas = "org.eclipse.jetty.toolchain" % "jetty-schemas" % "3.1.RC0"
  depOverrides = depOverrides ++ Set(
    jettyJstl,
    jettyJdtCore,
    jettySchemas
  )

  lazy val eclipseLink = "org.eclipse.persistence" % "eclipselink" % "2.5.2"
  depOverrides = depOverrides ++ Set(eclipseLink)

  lazy val javaxPersistence = "org.eclipse.persistence" % "javax.persistence" % "2.1.0"
  depOverrides = depOverrides ++ Set(javaxPersistence)

  lazy val freemarker = "org.freemarker" % "freemarker" % Versions.freemarker
  lazy val freemarkerGae = "org.freemarker" % "freemarker-gae" % Versions.freemarker
  depOverrides = depOverrides ++ Set(
    freemarker,
    freemarkerGae
  )

  lazy val jerseyJettyConnector = "org.glassfish.jersey.connector" % "jersey-jetty-connector" % Versions.jersey
  depOverrides = depOverrides ++ Set(jerseyJettyConnector)

  lazy val jerseyClient = "org.glassfish.jersey.core" % "jersey-client" % Versions.jersey
  lazy val jerseyCommon = "org.glassfish.jersey.core" % "jersey-common" % Versions.jersey
  lazy val jerseyServer = "org.glassfish.jersey.core" % "jersey-server" % Versions.jersey
  depOverrides = depOverrides ++ Set(
    jerseyClient,
    jerseyCommon,
    jerseyServer
  )

  lazy val jerseyBeanValidation = "org.glassfish.jersey.ext" % "jersey-bean-lazy validation" % Versions.jersey
  lazy val jerseyDeclarativeLinking = "org.glassfish.jersey.media" % "jersey-declarative-linking" % Versions.jersey
  lazy val jerseySpring3 = "org.glassfish.jersey.media" % "jersey-spring3" % Versions.jersey
  depOverrides = depOverrides ++ Set(
    jerseyBeanValidation,
    jerseyDeclarativeLinking,
    jerseySpring3
  )

  lazy val jerseyMediaJson = "org.glassfish.jersey.media" % "jersey-media-json" % Versions.jersey
  lazy val jerseyMediaJsonJackson = "org.glassfish.jersey.media" % "jersey-media-json-jackson" % Versions.jersey
  lazy val jerseyMediaJsonJettison = "org.glassfish.jersey.media" % "jersey-media-json-jettison" % Versions.jersey
  lazy val jerseyMediaMultipart = "org.glassfish.jersey.media" % "jersey-media-multipart" % Versions.jersey
  depOverrides = depOverrides ++ Set(
    jerseyMediaJson,
    jerseyMediaJsonJackson,
    jerseyMediaJsonJettison,
    jerseyMediaMultipart
  )

  lazy val jerseyOauth2Client = "org.glassfish.jersey.security" % "oauth2-client" % Versions.jersey
  depOverrides = depOverrides ++ Set(jerseyOauth2Client)

  lazy val glassfishJstl = "org.glassfish.web" % "javax.servlet.jsp.jstl" % "1.2.2"
  lazy val glassfishJsp = "org.glassfish.web" % "javax.servlet.jsp" % "2.3.2"
  lazy val glassfishEl = "org.glassfish" % "javax.el" % "3.0.0"
  depOverrides = depOverrides ++ Set(
    glassfishJstl,
    glassfishJsp,
    glassfishEl
  )

  lazy val hibernateC3p0 = "org.hibernate" % "hibernate-c3p0" % Versions.hibernate
  lazy val hibernateCore = "org.hibernate" % "hibernate-core" % Versions.hibernate
  lazy val hibernateEhcache = "org.hibernate" % "hibernate-ehcache" % Versions.hibernate
  lazy val hibernateEntitymanager = "org.hibernate" % "hibernate-entitymanager" % Versions.hibernate
  lazy val hibernateSearch = "org.hibernate" % "hibernate-search" % "4.5.0.Final"
  lazy val hibernateValidator = "org.hibernate" % "hibernate-validator" % "5.1.2.Final"
  depOverrides = depOverrides ++ Set(
    hibernateC3p0,
    hibernateCore,
    hibernateEhcache,
    hibernateEntitymanager,
    hibernateSearch,
    hibernateValidator
  )

  lazy val hsqldb = "org.hsqldb" % "hsqldb" % "2.3.2"
  depOverrides = depOverrides ++ Set(hsqldb)

  lazy val jacoco = "org.jacoco" % "jacoco" % Versions.jacoco
  lazy val jacocoAgent = "org.jacoco" % "org.jacoco.agent" % Versions.jacoco
  depOverrides = depOverrides ++ Seq(
    jacoco,
    jacocoAgent
  )

  lazy val jadira = "org.jadira.usertype" % "usertype.core" % "3.2.0.GA"
  depOverrides = depOverrides ++ Set(jadira)

  lazy val javassist = "org.javassist" % "javassist" % "3.18.1-GA"
  depOverrides = depOverrides ++ Set(javassist)

  lazy val jdom = "org.jdom" % "jdom" % "2.0.2"
  depOverrides = depOverrides ++ Set(jdom)

  lazy val jencks = "org.jencks" % "jencks" % Versions.jencks
  lazy val jencksAmqpool = "org.jencks" % "jencks-amqpool" % Versions.jencks
  depOverrides = depOverrides ++ Set(
    jencks,
    jencksAmqpool
  )

  lazy val json4sExt = "org.json4s" %% "json4s-ext" % Versions.json4s
  lazy val json4sJackson = "org.json4s" %% "json4s-jackson" % Versions.json4s
  lazy val json4sNative = "org.json4s" %% "json4s-native" % Versions.json4s
  depOverrides = depOverrides ++ Set(
    json4sExt,
    json4sJackson,
    json4sNative
  )

  lazy val annox = "org.jvnet.annox" % "annox" % "0.5.1"
  depOverrides = depOverrides ++ Set(annox)

  lazy val jetty6 = "org.mortbay.jetty" % "jetty" % Versions.jetty6
  lazy val jettyManagement6 = "org.mortbay.jetty" % "jetty-management" % Versions.jetty6
  lazy val jettyUtil6 = "org.mortbay.jetty" % "jetty-util" % Versions.jetty6
  lazy val jettyHightide = "org.mortbay.jetty" % "jetty-hightide" % "8.1.15.v20140411"
  depOverrides = depOverrides ++ Set(
    jetty6,
    jettyManagement6,
    jettyUtil6,
    jettyHightide
  )

  lazy val mybatis = "org.mybatis" % "mybatis" % "3.2.5"
  lazy val mybatisEhcache = "org.mybatis" % "mybatis-ehcache" % "1.0.0"
  lazy val mybatisGuice = "org.mybatis" % "mybatis-guice" % "3.5"
  lazy val mybatisSpring = "org.mybatis" % "mybatis-spring" % "1.2.2"
  depOverrides = depOverrides ++ Set(
    mybatis,
    mybatisEhcache,
    mybatisGuice,
    mybatisSpring
  )

  lazy val mockitoAll = "org.mockito" % "mockito-all" % "1.9.5"
  depOverrides = depOverrides ++ Set(mockitoAll)

  lazy val mongoJavaDriver = "org.mongodb" % "mongo-java-driver" % "2.11.4"
  depOverrides = depOverrides ++ Set(mongoJavaDriver)

  lazy val mvel2 = "org.mvel" % "mvel2" % "2.1.9.Final"
  depOverrides = depOverrides ++ Set(mvel2)

  lazy val objenesis = "org.objenesis" % "objenesis" % "2.1"
  depOverrides = depOverrides ++ Set(objenesis)

  lazy val ostermillerUtils = "org.ostermiller" % "utils" % "1.07.00"
  depOverrides = depOverrides ++ Set(ostermillerUtils)

  lazy val asm = "org.ow2.asm" % "asm" % Versions.asm
  lazy val asmAll = "org.ow2.asm" % "asm-all" % Versions.asm
  lazy val asmAnalysis = "org.ow2.asm" % "asm-analysis" % Versions.asm
  lazy val asmCommons = "org.ow2.asm" % "asm-commons" % Versions.asm
  lazy val asmDebugAll = "org.ow2.asm" % "asm-debug-all" % Versions.asm
  lazy val asmTree = "org.ow2.asm" % "asm-tree" % Versions.asm
  lazy val asmUtil = "org.ow2.asm" % "asm-util" % Versions.asm
  lazy val asmXml = "org.ow2.asm" % "asm-xml" % Versions.asm
  depOverrides = depOverrides ++ Set(
    asm,
    asmAll,
    asmAnalysis,
    asmCommons,
    asmDebugAll,
    asmTree,
    asmUtil,
    asmXml
  )

  lazy val parboiled = "org.parboiled" %% "parboiled" % "2.0.0"
  depOverrides = depOverrides ++ Set(parboiled)

  lazy val pegdown = "org.pegdown" % "pegdown" % "1.4.2"
  depOverrides = depOverrides ++ Set(pegdown)

  lazy val powermockApi = "org.powermock" % "powermock-api" % Versions.powermock
  lazy val powermockCore = "org.powermock" % "powermock-core" % Versions.powermock
  lazy val powermockEasymockReleaseFull = "org.powermock" % "powermock-easymock-release-full" % Versions.powermock
  lazy val powermockMockitoReleaseFull = "org.powermock" % "powermock-mockito-release-full" % Versions.powermock
  lazy val powermockModuleJunit4 = "org.powermock" % "powermock-module-junit4" % Versions.powermock
  lazy val powermockModuleJunit4Common = "org.powermock" % "powermock-module-junit4-common" % Versions.powermock
  lazy val powermockModuleTestng = "org.powermock" % "powermock-module-testng" % Versions.powermock
  lazy val powermockModuleTestngCommon = "org.powermock" % "powermock-module-testng-common" % Versions.powermock
  depOverrides = depOverrides ++ Set(
    powermockApi,
    powermockCore,
    powermockEasymockReleaseFull,
    powermockMockitoReleaseFull,
    powermockModuleJunit4,
    powermockModuleJunit4Common,
    powermockModuleTestng,
    powermockModuleTestngCommon
  )

  lazy val quartz = "org.quartz-scheduler" % "quartz" % "2.2.1"
  depOverrides = depOverrides ++ Set(quartz)

  lazy val scalatra = "org.scalatra" %% "scalatra" % Versions.scalatra
  lazy val scalatraAtmosphere = "org.scalatra" %% "scalatra-atomosphere" % Versions.scalatra
  lazy val scalatraAuth = "org.scalatra" %% "scalatra-auth" % Versions.scalatra
  lazy val scalatraCommands = "org.scalatra" %% "scalatra-commands" % Versions.scalatra
  lazy val scalatraCommon = "org.scalatra" %% "scalatra-common" % Versions.scalatra
  lazy val scalatraExample = "org.scalatra" %% "scalatra-example" % Versions.scalatra
  lazy val scalatraFileupload = "org.scalatra" %% "scalatra-fileuplad" % Versions.scalatra
  lazy val scalatraJetty = "org.scalatra" %% "scalatra-jetty" % Versions.scalatra
  lazy val scalatraJson = "org.scalatra" %% "scalatra-json" % Versions.scalatra
  lazy val scalatraProject = "org.scalatra" %% "scalatra-project" % Versions.scalatra
  lazy val scalatraScalate = "org.scalatra" %% "scalatra-scalate" % Versions.scalatra
  lazy val scalatraScalatest = "org.scalatra" %% "scalatra-scalatest" % Versions.scalatra
  lazy val scalatraSpecs2 = "org.scalatra" %% "scalatra-specs2" % Versions.scalatra
  lazy val scalatraSpring = "org.scalatra" %% "scalatra-spring" % Versions.scalatra
  lazy val scalatraSwagger = "org.scalatra" %% "scalatra-swagger" % Versions.scalatra
  lazy val scalatraTest = "org.scalatra" %% "scalatra-test" % Versions.scalatra
  depOverrides = depOverrides ++ Set(
    scalatra,
    scalatraAtmosphere,
    scalatraAuth,
    scalatraCommands,
    scalatraCommon,
    scalatraExample,
    scalatraFileupload,
    scalatraJetty,
    scalatraJson,
    scalatraProject,
    scalatraScalate,
    scalatraScalatest,
    scalatraSpecs2,
    scalatraSpring,
    scalatraSwagger,
    scalatraTest
  )

  lazy val scalaActors = "org.scala-lang" % "scala-actors" % Versions.scala
  lazy val scalaCompiler = "org.scala-lang" % "scala-compiler" % Versions.scala
  lazy val scalaDist = "org.scala-lang" % "scala-dist" % Versions.scala
  lazy val scalaLibrary = "org.scala-lang" % "scala-library" % Versions.scala
  lazy val scalaLibraryAll = "org.scala-lang" % "scala-library-all" % Versions.scala
  lazy val scalaReflect = "org.scala-lang" % "scala-reflect" % Versions.scala
  lazy val scalap = "org.scala-lang" % "scalap" % Versions.scala
  depOverrides = depOverrides ++ Set(
    scalaActors,
    scalaCompiler,
    scalaDist,
    scalaLibrary,
    scalaLibraryAll,
    scalaReflect,
    scalap
  )

  lazy val scalaAsync = "org.scala-lang.modules" %% "scala-async" % "0.9.1"
  lazy val scalaPartest = "org.scala-lang.modules" %% "scala-partest" % "1.0.10"
  lazy val scalaPartestInterface = "org.scala-lang.modules" %% "scala-partest-interface" % "0.4.0"
  lazy val scalaSwing = "org.scala-lang.modules" %% "scala-swing" % "1.0.1"
  lazy val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.0.1"
  depOverrides = depOverrides ++ Set(
    scalaAsync,
    scalaPartest,
    scalaPartestInterface,
    scalaSwing,
    scalaXml
  )

  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % Versions.scalacheck
  depOverrides = depOverrides ++ Set(scalaCheck)

  lazy val scalastyleDep = "org.scalastyle" %% "scalastyle" % Versions.scalastyle
  depOverrides = depOverrides ++ Set(scalastyleDep)

  lazy val scalaTest = "org.scalatest" %% "scalatest" % Versions.scalaTest
  lazy val scalactic = "org.scalactic" %% "scalactic" % Versions.scalaTest
  lazy val scalatestplusPlay = "org.scalatestplus" %% "play" % Versions.scalaTestPlus
  depOverrides = depOverrides ++ Set(
    scalaTest,
    scalactic,
    scalatestplusPlay
  )

  lazy val seleniumApi = "org.seleniumhq.selenium" % "selenium-api" % Versions.selenium
  lazy val seleniumJava = "org.seleniumhq.selenium" % "selenium-java" % Versions.selenium
  lazy val seleniumServer = "org.seleniumhq.selenium" % "selenium-server" % Versions.selenium
  lazy val seleniumSupport = "org.seleniumhq.selenium" % "selenium-support" % Versions.selenium
  lazy val seleniumChromeDriver = "org.seleniumhq.selenium" % "selenium-chrome-driver" % Versions.selenium
  lazy val seleniumFirefoxDriver = "org.seleniumhq.selenium" % "selenium-firefox-driver" % Versions.selenium
  lazy val seleniumHtmlunitDriver = "org.seleniumhq.selenium" % "selenium-htmlunit-driver" % Versions.selenium
  lazy val seleniumIeDriver = "org.seleniumhq.selenium" % "selenium-ie-driver" % Versions.selenium
  lazy val seleniumRemoteDriver = "org.seleniumhq.selenium" % "selenium-remote-driver" % Versions.selenium
  lazy val seleniumSafariDriver = "org.seleniumhq.selenium" % "selenium-safariDriver" % Versions.selenium
  lazy val seleniumAndroidDriver = "org.seleniumhq.selenium" % "selenium-android-driver" % "2.39.0"
  lazy val seleniumIphoneDriver = "org.seleniumhq.selenium" % "selenium-iphone-driver" % "2.39.0"
  depOverrides = depOverrides ++ Set(
    seleniumApi,
    seleniumJava,
    seleniumServer,
    seleniumSupport,
    seleniumChromeDriver,
    seleniumFirefoxDriver,
    seleniumHtmlunitDriver,
    seleniumIeDriver,
    seleniumRemoteDriver,
    seleniumSafariDriver,
    seleniumAndroidDriver,
    seleniumIphoneDriver
  )

  lazy val jclOverSlf4j = "org.slf4j" % "jcl-over-slf4j" % Versions.slf4j
  depOverrides = depOverrides ++ Set(jclOverSlf4j)

  lazy val slf4jAndroid = "org.slf4j" % "slf4j-android" % Versions.slf4j
  lazy val slf4jApi = "org.slf4j" % "slf4j-api" % Versions.slf4j
  lazy val slf4jExt = "org.slf4j" % "slf4j-ext" % Versions.slf4j
  lazy val slf4jJcl = "org.slf4j" % "slf4j-jcl" % Versions.slf4j
  lazy val slf4jLog4j12 = "org.slf4j" % "slf4j-log4j12" % Versions.slf4j
  lazy val slf4jSimple = "org.slf4j" % "slf4j-simple" % Versions.slf4j
  depOverrides = depOverrides ++ Set(
    slf4jAndroid,
    slf4jApi,
    slf4jExt,
    slf4jJcl,
    slf4jLog4j12,
    slf4jSimple
  )

  lazy val specs2 = "org.specs2" %% "specs2" % "2.3.11"
  depOverrides = depOverrides ++ Set(specs2)

  lazy val springAop = "org.springframework" % "spring-aop" % Versions.spring
  lazy val springAsm = "org.springframework" % "spring-asm" % Versions.spring
  lazy val springAspects = "org.springframework" % "spring-aspects" % Versions.spring
  lazy val springBeans = "org.springframework" % "spring-beans" % Versions.spring
  lazy val springContext = "org.springframework" % "spring-context" % Versions.spring
  lazy val springContextSupport = "org.springframework" % "spring-context-support" % Versions.spring
  lazy val springCore = "org.springframework" % "spring-core" % Versions.spring
  lazy val springExpression = "org.springframework" % "spring-expression" % Versions.spring
  lazy val springInstrument = "org.springframework" % "spring-instrument" % Versions.spring
  lazy val springJdbc = "org.springframework" % "spring-jdbc" % Versions.spring
  lazy val springJms = "org.springframework" % "spring-jms" % Versions.spring
  lazy val springOrm = "org.springframework" % "spring-orm" % Versions.spring
  lazy val springOxm = "org.springframework" % "spring-oxm" % Versions.spring
  lazy val springTest = "org.springframework" % "spring-test" % Versions.spring
  lazy val springTx = "org.springframework" % "spring-tx" % Versions.spring
  lazy val springWeb = "org.springframework" % "spring-web" % Versions.spring
  lazy val springWebmvc = "org.springframework" % "spring-webmvc" % Versions.spring
  depOverrides = depOverrides ++ Set(
    springAop,
    springAsm,
    springAspects,
    springBeans,
    springContext,
    springContextSupport,
    springCore,
    springExpression,
    springInstrument,
    springJdbc,
    springJms,
    springOrm,
    springOxm,
    springTest,
    springTx,
    springWeb,
    springWebmvc
  )

  lazy val springIntegrationCore = "org.springframework.integration" % "spring-integration-core" % Versions.springIntegration
  lazy val springIntegrationEvent = "org.springframework.integration" % "spring-integration-event" % Versions.springIntegration
  lazy val springIntegrationFile = "org.springframework.integration" % "spring-integration-file" % Versions.springIntegration
  lazy val springIntegrationHttp = "org.springframework.integration" % "spring-integration-http" % Versions.springIntegration
  lazy val springIntegrationJms = "org.springframework.integration" % "spring-integration-jms" % Versions.springIntegration
  lazy val springIntegrationMail = "org.springframework.integration" % "spring-integration-mail" % Versions.springIntegration
  lazy val springIntegrationRmi = "org.springframework.integration" % "spring-integration-rmi" % Versions.springIntegration
  lazy val springIntegrationSecurity = "org.springframework.integration" % "spring-integration-security" % Versions.springIntegration
  lazy val springIntegrationStream = "org.springframework.integration" % "spring-integration-stream" % Versions.springIntegration
  lazy val springIntegrationWs = "org.springframework.integration" % "spring-integration-ws" % Versions.springIntegration
  lazy val springIntegrationXml = "org.springframework.integration" % "spring-integration-xml" % Versions.springIntegration
  depOverrides = depOverrides ++ Set(
    springIntegrationCore,
    springIntegrationEvent,
    springIntegrationFile,
    springIntegrationHttp,
    springIntegrationJms,
    springIntegrationMail,
    springIntegrationRmi,
    springIntegrationSecurity,
    springIntegrationStream,
    springIntegrationWs,
    springIntegrationXml
  )

  lazy val springSecurityAcl = "org.springframework.security" % "spring-security-acl" % Versions.springSecurity
  lazy val springSecurityCas = "org.springframework.security" % "spring-security-cas" % Versions.springSecurity
  lazy val springSecurityConfig = "org.springframework.security" % "spring-security-config" % Versions.springSecurity
  lazy val springSecurityCore = "org.springframework.security" % "spring-security-core" % Versions.springSecurity
  lazy val springSecurityCrypto = "org.springframework.security" % "spring-security-crypto" % Versions.springSecurity
  lazy val springSecurityLdap = "org.springframework.security" % "spring-security-ldap" % Versions.springSecurity
  lazy val springSecurityOpenId = "org.springframework.security" % "spring-security-openid" % Versions.springSecurity
  lazy val springSecurityWeb = "org.springframework.security" % "spring-security-web" % Versions.springSecurity
  depOverrides = depOverrides ++ Set(
    springSecurityAcl,
    springSecurityCas,
    springSecurityConfig,
    springSecurityCore,
    springSecurityCrypto,
    springSecurityLdap,
    springSecurityOpenId,
    springSecurityWeb
  )

  lazy val springSecurityOauth2 = "org.springframework.security.oauth" % "spring-security-oauth2" % Versions.springSecurityOauth
  depOverrides = depOverrides ++ Set(springSecurityOauth2)

  lazy val testng = "org.testng" % "testng" % "6.8.8"
  depOverrides = depOverrides ++ Set(testng)

  lazy val snakeYaml = "org.yaml" % "snakeyaml" % "1.13"
  depOverrides = depOverrides ++ Set(snakeYaml)

  lazy val bootstrap = "org.webjars" % "bootstrap" % "3.0.0"
  depOverrides = depOverrides ++ Set(bootstrap)

  lazy val oldStaxApi = "stax" % "stax-api" % "1.0.1"
  depOverrides = depOverrides ++ Set(oldStaxApi)

  lazy val taglibsStandard = "taglibs" % "standard" % "1.1.2"
  depOverrides = depOverrides ++ Set(taglibsStandard)

  lazy val xalan = "xalan" % "xalan" % "2.7.1"
  depOverrides = depOverrides ++ Set(xalan)

  lazy val xerces = "xerces" % "xerces" % "2.4.0"
  lazy val xercesImpl = "xerces" % "xercesImpl" % "2.11.0"
  depOverrides = depOverrides ++ Set(
    xerces,
    xercesImpl
  )

  lazy val xmlApis = "xml-apis" % "xml-apis" % "1.4.01"
  depOverrides = depOverrides ++ Set(xmlApis)

  lazy val xmlunit = "xmlunit" % "xmlunit" % "1.5"
  depOverrides = depOverrides ++ Set(xmlunit)

  lazy val xom = "xom" % "xom" % "1.2.5"
  depOverrides = depOverrides ++ Set(xom)

  lazy val xpp3min = "xpp3_min" % "xpp3_min" % "1.1.4c"
  depOverrides = depOverrides ++ Set(xpp3min)
}
