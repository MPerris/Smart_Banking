package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/main/resources/Login.feature",
        glue     = {"com.cucumber.bdd.login"},
        plugin   = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"},//"json:target/cucumber.json"
	 monochrome  = true
			      
		)


public class Runner extends AbstractTestNGCucumberTests {
}
