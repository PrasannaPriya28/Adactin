
package com.adactin.stepdefinition;

import java.io.IOException;

import com.cucumber.baseclass.CucumberBaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class hooksconcept extends CucumberBaseClass {
@Before
public void beforehooks(Scenario scenario)
{
System.out.println(scenario.getName());	
System.out.println("Started");
}
@After
public void afterhooks(Scenario scenario) throws IOException
{
	System.out.println("Status:"+scenario.getStatus());
	if(scenario.isFailed()) {
		getScreenshot(scenario.getId());
		System.out.println("Screenshot taken");
		
	//System.out.println(scenario.getName());	
	System.out.println("Completed");
}
}
}
