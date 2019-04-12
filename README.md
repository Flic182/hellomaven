# HelloWorld Maven & Cucumber Demonstration

## About
This is a simple HelloWorld project that demonstrates how to set up a small
Maven project with Cucumber tests (on JUnit5).  It also uses Lombok.

## Execution
Build the program from the root of the project with `mvn clean install`.  You
may wish to add the `javadoc:javadoc` goal to generate Javadocs.

Javadocs are written to `target/site/apidocs` and test scenario reports to
`target/cucumber-reports`.

## Things to watch
Pay careful attention to how the Maven Lombok & Javadoc plugins are configured.
Javadocs will not be generated properly without de-lomboking the source and
running Javadoc against the de-lomboked code.  If the default output directory
is used for the `delombok` goal, your IDE may complain about duplicated classes.

At the time of writing, the IntelliJ Cucumber plugin was not compatible with
Cucumber 3.x.  In order to run Cucumber tests directly in IntelliJ, you must
downgrade to version 2.x and ensure your run configuration contains the
following program arguments:
`--plugin org.jetbrains.plugins.cucumber.java.run.CucumberJvm2SMFormatter`.
