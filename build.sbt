name := "bazel-sbt-protoc-issue"
version := "2019.16.0-SNAPSHOT"
description := "Bazel and sbt-protoc issue example"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
