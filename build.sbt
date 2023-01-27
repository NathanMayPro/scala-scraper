scalaVersion := "3.2.1"
sbtVersion := "1.5.5"

version := "1.0"

name := "scala-scraper"
organization := "com.nimp"

libraryDependencies ++= Seq(
    "com.lihaoyi" %% "fansi" % "0.4.0",
    "org.scalatest" %% "scalatest" % "3.2.15" % "test"
) 
