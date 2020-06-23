package com.cucumber.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.CucumberBaseClass;

public class BookingHotel extends CucumberBaseClass {
	
//	public static void main(String[] args) {
//		
//
//		WebElement fname = driver.findElement(By.id("first_name"));
//		inputValuestoWebelement(fname,"Prasanna");
//		WebElement lname = driver.findElement(By.id("last_name"));
//		inputValuestoWebelement(lname,"Priya");
//		WebElement address = driver.findElement(By.id("address"));
//		inputValuestoWebelement(address,"12A/A,EVR Street,Chennai");
//		WebElement creditcard = driver.findElement(By.id("cc_num"));
//		inputValuestoWebelement(creditcard,"2233224300011000");
//		WebElement cardtype = driver.findElement(By.id("cc_type"));
//		selectDropDownOption(cardtype,"value","VISA");
//		WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
//		selectDropDownOption(expirymonth,"value","8");
//		WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
//		selectDropDownOption(expiryyear,"value","2022");
//		WebElement CCV = driver.findElement(By.id("cc_cvv"));
//		inputValuestoWebelement(CCV,"004");
//		WebElement booknow = driver.findElement(By.id("book_now"));
//		clickonWebElement(booknow);
//		waitforElementVisibility(booknow, 5);
//}

public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fname;
	public BookingHotel(WebDriver ldriver3) {
		this.driver=ldriver3;
		PageFactory.initElements(driver, this);
	}


	public WebElement getFname() {
		return fname;
	}
	
	@FindBy(id="last_name")
	private WebElement lname;
	public WebElement getLname() {
		return lname;
	}


	@FindBy(id="address")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(id="cc_num")
	private WebElement creditcard;
	public WebElement getCreditcard() {
		return creditcard;
	}
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	public WebElement getCardtype()
	{
		return cardtype;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth;
	public WebElement getExpirymonth() 
	{
		return expirymonth;
	}
	

	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	public WebElement getExpiryyear() 
	{
		return expiryyear;
	}
	
	@FindBy(id="cc_cvv")
	private WebElement CCV;
	public WebElement getCCV() {
		return CCV;
	}

	
	@FindBy(id="book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	
	
}

