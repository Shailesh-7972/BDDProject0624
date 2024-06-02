package testRunner;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features={"Features"}, glue = {"stepDefinition"},

monochrome = true, dryRun = false,

plugin = {"pretty","html:CucumbeReport/Cucumberhtml/cucumber.html",
		
		"json:CucumberReport/CucumberJson/cucumber.json",
		"junit:CucumberReport/Cucumberxml/cucumber.xml"})

public class RunTest {
	
		

}
