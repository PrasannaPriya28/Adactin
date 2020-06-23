package com.cucumber.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.CucumberBaseClass;

public class BookitineraryPage extends CucumberBaseClass{

//	public static void main(String[] args) {
//
//		WebElement bookitinerary = driver.findElement(By.name("ids[]"));
//		clickonWebElement(bookitinerary);
//		
//		
//		
//	}
	
public static WebDriver driver;
	
	@FindBy(name="ids[]")
	private WebElement bookitinerary;
	public BookitineraryPage(WebDriver ldriver5) {
		this.driver=ldriver5;
		PageFactory.initElements(driver, this);	}


	public WebElement getBookitinerary() {
		return bookitinerary;
	}
	

	public static WebDriver getDriver() {
		return driver;
	}

	

}
