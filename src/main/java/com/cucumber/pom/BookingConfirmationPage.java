package com.cucumber.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.CucumberBaseClass;

public class BookingConfirmationPage extends CucumberBaseClass {

//	public static void main(String[] args) {
//
//		WebElement myitinerary = driver.findElement(By.id("my_itinerary"));
//		waitforElementVisibility(myitinerary, 5);
//		clickonWebElement(myitinerary);
//	}
public static WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement myitinerary;

	public BookingConfirmationPage(WebDriver ldriver4) {
		this.driver=ldriver4;
		PageFactory.initElements(driver, this);	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}

}
