# First use of Scala for Scraping

brew update && brew install coursier/formulas/coursier && cs setup

//brew install sbt 
https://github.com/sbt/sbt/releases/download/v1.8.2/sbt-1.8.2.zip

touch build.sbt

scalaVersion := "3.2.1" your current scala version
version := "1.0"
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.2"
sbt
mkdir -p src/main/scala
mkdir -p src/test/scala
cd src/main/scala
touch com/nimp/Main.scala

sbt
compile
run || runMain com.nimp.Main

touch src/test/scala/com/nimp/SimpleTest.scala
sbt test