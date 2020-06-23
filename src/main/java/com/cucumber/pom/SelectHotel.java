package com.cucumber.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.CucumberBaseClass;

public class SelectHotel extends CucumberBaseClass {
	
		
//		WebElement selectradio = driver.findElement(By.id("radiobutton_0"));
//		clickonWebElement(selectradio);
//		waitforElementVisibility(selectradio, 5);
//		WebElement continuenext = driver.findElement(By.id("continue"));
//		clickonWebElement(continuenext);
//		waitforElementVisibility(continuenext, 5);
		
		public static WebDriver driver;
		

		@FindBy(id="radiobutton_0")
		private WebElement selectradio;
		public SelectHotel(WebDriver ldriver2)
		{
			this.driver=ldriver2;
			PageFactory.initElements(driver, this);
		}

		public WebElement getSelectradio() 
		{
			return selectradio;
		}
		
		@FindBy(id="continue")
		private WebElement continuemext;
		public WebElement getContinuemext() {
			return continuemext;
		}
	
		public static WebDriver getDriver() {
			return driver;
		}

		

		
		
		
	}


