package com.cucumber.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.CucumberBaseClass;

public class LogoutPage extends CucumberBaseClass {

//	public static void main(String[] args)
//	{
//		WebElement logout = driver.findElement(By.name("logout"));
//		clickonWebElement(logout);
//	}
	
	public static WebDriver driver;

	@FindBy(id="logout")
	private WebElement logout;
	public LogoutPage(WebDriver ldriver7) {
		this.driver=ldriver7;
		PageFactory.initElements(driver, this);
	
	}


	public WebElement getLogout() {
		return logout;
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	

}
