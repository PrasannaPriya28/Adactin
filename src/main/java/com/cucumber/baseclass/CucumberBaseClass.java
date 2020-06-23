package com.cucumber.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.AcceptedW3CCapabilityKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CucumberBaseClass {

	public static WebDriver driver;
	public static WebDriver browserLaunch(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\AdactinCucumber\\drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(browsername.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumConcepts\\drivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}else
		{
			System.out.println("invalid browser name");
		}
		driver.manage().window().maximize();
		return driver;
		
		 
	}
	
	public static void geturl(String url)
	{
		driver.get(url);
		
	}
	
	public static void implicitwait(int number)
	{
		driver.manage().timeouts().implicitlyWait(number, TimeUnit.SECONDS);
	}
	
	public static void confirmalert(WebElement element,String condition)
	{
		try
		{
		Alert confirmalert = driver.switchTo().alert();
		if(condition.equalsIgnoreCase("accept"))
		{
			confirmalert.accept();
		}else if(condition.equalsIgnoreCase("dismiss"))
		{
			confirmalert.dismiss();
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

	public static void inputValuestoWebelement(WebElement element,String value)
	{
		try
		{
	//	waitforElementVisibility(element);
		if(elementIsDisplayed(element) && elementIsEnabled(element))
		{
			element.sendKeys(value);
	
		}
		}catch (Exception e)
		{
			
			e.printStackTrace();

			
		}
		}
	

	public static void waitforElementVisibility(WebElement element,int number) {
		
	
try {
	WebDriverWait wb= new WebDriverWait(driver,number);
	wb.until(ExpectedConditions.invisibilityOf(element));
}catch (Exception e) {

	e.printStackTrace();
}
	
}
	
	public static boolean elementIsEnabled(WebElement element)
	{
		try {
			boolean enabled= element.isEnabled();
			return enabled;
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();		
		}
		
	}
	
	public static boolean elementIsDisplayed(WebElement element)
	{
		try {
			boolean displayed= element.isDisplayed();
			return displayed;
			
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();		
		}
		
		
	}
	
	public static  void ScrollUsingElement(WebElement element, String option){
		
		try {
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			if(option.equalsIgnoreCase("down")) {
				
				js.executeScript("argument[0],scrollIntoView(false);", element);
				
			}else if(option.equalsIgnoreCase("up"))
			{
				js.executeScript("argument[0],scrollIntoView(true);", element);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	public static void clickonWebElement(WebElement element)
	{
		try {
			//waitforElementVisibility(element);
			if (elementIsDisplayed(element)) {
				element.click();
				
			}
				
			}
		catch (Exception e)
		{
				e.printStackTrace();
				throw new RuntimeException();
		}
	}
	
	
	public static void selectDropDownOption(WebElement element,String option,String Value) {
		try {
			Select s=new Select(element);
			if(option.equalsIgnoreCase("value")) {
				s.selectByValue(Value);
			}else if(option.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(Value);
				
			}else if(option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(Value));
			}
			
		} catch (Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException();
			
		}
	}
	
	public static void mouseHoverToElement(WebElement element) {
		
		try {
			Actions ac=new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		
	}
	
	public static void frameUsingID(WebElement element) {
		try {
				driver.switchTo().frame(element);
			}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static  void getScreenshot(String filename) throws IOException {
		try {
			TakesScreenshot ts= (TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("D:\\Eclipse\\AdactinCucumber\\Screenshot\\"+filename+".png");
			FileUtils.copyFile(source, destination);
		}catch(WebDriverException e)
		{
			
			e.printStackTrace();
		}
		
	}
		
}


