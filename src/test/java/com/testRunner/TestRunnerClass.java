package com.testRunner;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.utility.ParentClass_OR_BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src\\test\\resources\\BDDFramework"} ,
//Features location/path
plugin = {"json:target/cucumber.json"},// pluging for report
glue = "stepDefinition")
// package name for StepDef ),
//tags= "@iPadPro")

public class TestRunnerClass extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void annotationMethod_LaunchingURL() {
	ParentClass_OR_BaseClass openObj = new ParentClass_OR_BaseClass();
	openObj.browserinitialization();
	
	

	}
	
	@AfterTest
	public void annotationMethod_ClosingURL() {
		ParentClass_OR_BaseClass closeObj = new ParentClass_OR_BaseClass();	
		closeObj.driver.quit();
	
		
	}
}



























