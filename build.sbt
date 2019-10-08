lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.mitre",
      version      := "0.0.1-SNAPSHOT",
      scalaVersion := "2.12.6",
      crossPaths := false,
      testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
    )),
    name := "ipfix",
    libraryDependencies := Seq(
      "org.apache.daffodil" %% "daffodil-tdml-processor" % "2.4.0" % "test",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.11" % "test"
    ))  
  //
  // Uncomment this line below to run against IBM DFDL.
  // You need to have IBM DFDL installed and the IBM DFDL Cross Tester
  //
  // .settings(IBMDFDLCrossTesterPlugin.settings)

