val root = (project in file("."))
  .settings(
    name := "dfdl-ipfix",

    organization := "org.mitre",

    version := "0.0.1-SNAPSHOT"
  )
  .daffodilProject()
