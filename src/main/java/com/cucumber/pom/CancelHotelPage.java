package com.cucumber.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.CucumberBaseClass;

public class CancelHotelPage extends CucumberBaseClass{
//	public static void main(String[] args) 
//	{
//		WebElement cancelbooking = driver.findElement(By.name("cancelall"));
//		clickonWebElement(cancelbooking);
//		confirmalert(cancelbooking,"accept");
//	}
//
//}

public static WebDriver driver;

@FindBy(name="cancelall")
private WebElement cancelbooking;

public CancelHotelPage(WebDriver ldriver6) {
	this.driver=ldriver6;
	PageFactory.initElements(driver, this);
}

public WebElement getCancelbooking() {
	return cancelbooking;
}

public static WebDriver getDriver() {
	return driver;
}


}