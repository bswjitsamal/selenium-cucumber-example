package com.common;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/features", glue = "com.stepdefinations", 
                 tags = { " @signup , @login" } , monochrome= true ,
                 plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json" })

public class RunnerTest {
	
}
