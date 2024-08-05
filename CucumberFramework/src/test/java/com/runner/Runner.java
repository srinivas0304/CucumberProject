package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"com.stepDefinition"},
//This option can either set as true or false. If it is set as true, it means that the console output for cucumber test are much more readable.
monochrome=true,
//plugin Option is used to specify different formatting options for the output reports.
plugin={"html:Reports\\HtmlReport\\index.html","json:Reports\\JsonReport\\Cucumber.json","junit:Reports\\JunitReport\\Cucumber.xml"},
//dryRun=true --> checks if all the steps have the step definition
dryRun=true

)

public class Runner 
{
	
}
