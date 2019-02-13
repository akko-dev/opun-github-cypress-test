name := """opun-koropo"""
organization := "fr.maif"

version := "1.2-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SwaggerPlugin) //enable plugin

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "de.svenkubiak"            % "jBCrypt"             % "0.4.1", //  ISC/BSD
  "com.auth0"                % "java-jwt"            % "3.1.0", // MIT license
  "com.github.pureconfig"    %% "pureconfig"         % "0.8.0", // Apache 2.0
  "com.github.etaty"         %% "rediscala"          % "1.8.0", // Apache 2.0
  "org.scalactic"            %% "scalactic"          % "3.0.4", // Apache 2.0
  "org.webjars"              % "swagger-ui"          % "3.12.1",
  "com.softwaremill.macwire" %% "macros"             % "2.3.0" % "provided", // Apache 2.0
  "org.scalatest"            %% "scalatest"          % "3.0.4" % "test", // Apache 2.0
  "org.scalatestplus.play"   %% "scalatestplus-play" % "3.1.0" % "test", // Apache 2.0,
  "com.typesafe.akka"        %% "akka-testkit"       % "2.5.11" % Test, // Apache 2.0
  "com.github.kstyrc"        % "embedded-redis"      % "0.6" % Test // Apache 2.0
)

scalacOptions ++= Seq(
  "-feature",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:existentials"
)

scalafmtOnCompile in ThisBuild := true

scalafmtTestOnCompile in ThisBuild := true

scalafmtVersion in ThisBuild := "1.2.0"

swaggerDomainNameSpaces := Seq("models")

swaggerV3 := true
