name := "tapandpipe-sample"

version := "0.1"

scalaVersion := "2.12.6"

resolvers += Resolver.typesafeRepo("releases")

libraryDependencies ++= Seq(
  "com.github.bigwheel" %% "tapandpipe" % "1.0"
)
