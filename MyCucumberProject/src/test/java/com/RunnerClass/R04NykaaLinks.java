package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F04NykaaLinks.feature",
					glue = "com.StepDef",
					tags = "@AllLinks",
					publish = true,
					plugin = {"json:Reports/Cucumber-json.json", 
								"junit:Reports/xmlReport.xml"})
public class R04NykaaLinks {
	/*
	 Execute Single Scenario	tags = "@Men"
	 Execute multiple scenarios	tags = "@Men or @Skin"
	 Skip Single Scenario		tags = "not @Skin"
	 Skip Multiple Scenarios	tags = "not @Skin and not @Makeup"
	 
	 */
}
