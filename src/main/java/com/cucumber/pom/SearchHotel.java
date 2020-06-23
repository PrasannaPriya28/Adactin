package com.cucumber.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.CucumberBaseClass;

public class SearchHotel extends CucumberBaseClass {
	
//	public static void main(String[] args) throws InterruptedException
//	{
//	
//		WebElement location = driver.findElement(By.id("location"));
//		selectDropDownOption(location,"value","Sydney");
//		WebElement Hotels = driver.findElement(By.id("hotels"));
//		selectDropDownOption(Hotels,"value","Hotel Creek");
//		WebElement RoomType = driver.findElement(By.id("room_type"));
//		selectDropDownOption(RoomType,"value","Standard");
//		WebElement Noofrooms = driver.findElement(By.id("room_nos"));
//		selectDropDownOption(Noofrooms,"value","1");
//		WebElement CheckIn = driver.findElement(By.id("datepick_in"));
//		inputValuestoWebelement(CheckIn,"20/05/2020");
//		waitforElementVisibility(CheckIn, 5);
//		WebElement Checkout = driver.findElement(By.id("datepick_out"));
//		inputValuestoWebelement(Checkout,"21/05/2020");
//		waitforElementVisibility(Checkout, 5);
//		WebElement adults = driver.findElement(By.id("adult_room"));
//		selectDropDownOption(adults,"value","2");
//		WebElement children = driver.findElement(By.id("child_room"));
//		selectDropDownOption(children,"value","1");
//		WebElement search = driver.findElement(By.id("Submit"));
//		clickonWebElement(search);
		
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	public SearchHotel(WebDriver ldriver1) 
	
	{
		this.driver=ldriver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() 
	{
		return location;
	}
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	public WebElement getHotels() {
		return Hotels;
	}

	@FindBy(id="room_type")
	private WebElement RoomType;
	public WebElement getRoomType()
	{
		return RoomType;
	}
	
	@FindBy(id="room_nos")
	private WebElement Noofrooms;
	public WebElement getNoofrooms() {
		return Noofrooms;
	}
	
	@FindBy(id="datepick_in")
	private WebElement CheckIn;
	public WebElement getCheckIn() {
		return CheckIn;
	}
	
	
	@FindBy(id="datepick_out")
	private WebElement Checkout;
	
	public WebElement getCheckout() {
		return Checkout;
	}
	@FindBy(id="adult_room")
	private WebElement adults;
	public WebElement getAdults() {
		return adults;
	}
	
	@FindBy(id="child_room")
	private WebElement children;
	public WebElement getChildren() {
		return children;
	}
	@FindBy(id="Submit")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
	
}
	
	


