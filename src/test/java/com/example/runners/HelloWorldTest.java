package com.example.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This class is the test harness for all features in the project.  It outputs
 * pretty reports in HTML, JSON and XML formats for anything not tagged to be
 * ignored.
 *
 * @author Felicity Hughes
 * @since 10
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue="com/example/steps",
        monochrome = true,
        plugin = {
                    "pretty",
                    "html:target/cucumber-reports",
                    "json:target/cucumber-reports/Cucumber.json",
                    "junit:target/cucumber-reports/Cucumber.xml"
                 },
        tags = {"not @ignored"}
)
public class HelloWorldTest {
}
