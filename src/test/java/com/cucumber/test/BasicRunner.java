package com.cucumber.test;

import org.testng.annotations.BeforeTest;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "pretty", 
		"html:target/site/cucumber-pretty.html", 
		"rerun:target/rerun.txt",
			"json:target/cucumber.json"}, 

			features = {"src/main/resources/Automation Login.feature" },
			glue = { "com.cucumber.test" }, // package name
		
			monochrome = true,
			dryRun =false,
			strict = true,
		 tags= {"@SmokeTest"}
			
	)

	public class BasicRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void setup() {
		//code
	}
}
