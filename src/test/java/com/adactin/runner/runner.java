package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.utility.ConfigurationReader;
import com.adactin.utility.FileReaderManager;
import com.cucumber.baseclass.CucumberBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\", glue="com\\adactin\\stepdefinition",
				//tags= {"@Login"},
				monochrome=true,
				strict=true,
				dryRun=false,
				plugin= {"pretty","html:Report\\CucumberReport","json:Report\\cucumberReport.json",
	            "com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"})
                //plugin= {"pretty","html:Report\\CucumberReport"}

						

public class runner extends CucumberBaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void browseropen() throws IOException 
	{
		ConfigurationReader con=new ConfigurationReader();
		String browserName = FileReaderManager.getInstance().getCRInstance().getBrowserName();
		driver = browserLaunch(con.getBrowserName());
	}
	@AfterClass
	public static void browserclose()
	{
		driver.close();
				
	}
	
	
	
}