package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	
features="/Users/sumittulsyan/eclipse-workspace/TaxiApp1/src/main/java/com/qa/features",
glue= {"com/qa/stepdefinition"},
dryRun=false,
monochrome=true,
plugin = {"pretty", "html:target/cucumber"}
)


public class TestRunner {

}
