package com.adactin.integration;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.cucumber.baseclass.CucumberBaseClass;
import com.cucumber.pom.BookingConfirmationPage;
import com.cucumber.pom.BookingHotel;
import com.cucumber.pom.BookitineraryPage;
import com.cucumber.pom.CancelHotelPage;
import com.cucumber.pom.LogoutPage;
import com.cucumber.pom.SearchHotel;
import com.cucumber.pom.SelectHotel;
import com.cucumber.pom.SigninPage;

public class AdactinIntegration extends CucumberBaseClass{
	
	public static WebDriver driver;
	@Test
	public void sample() {

		driver=browserLaunch("chrome");
		geturl("http://adactinhotelapp.com/");
		
		SigninPage sp=new SigninPage(driver);
		inputValuestoWebelement(sp.getUserlogin(),"Prasanna1");
		inputValuestoWebelement(sp.getLogpasswrd(), "priya@123");
		clickonWebElement(sp.getLogin());
		
		SearchHotel ab= new SearchHotel(driver);
		selectDropDownOption(ab.getLocation(), "value", "Sydney");
		selectDropDownOption(ab.getHotels(),"value","Hotel Creek");
		selectDropDownOption(ab.getRoomType(),"value","Standard");
		selectDropDownOption(ab.getNoofrooms(),"value","1");
		inputValuestoWebelement(ab.getCheckIn(),"20/05/2020");
		inputValuestoWebelement(ab.getCheckout(),"21/05/2020");
		selectDropDownOption(ab.getAdults(),"value","2");
		selectDropDownOption(ab.getChildren(),"value","1");
		clickonWebElement(ab.getSearch());
		
		SelectHotel sh=new SelectHotel(driver);
		clickonWebElement(sh.getSelectradio());
		clickonWebElement(sh.getContinuemext());
		
		BookingHotel bh=new BookingHotel(driver);
		inputValuestoWebelement(bh.getFname(),"Prasanna");
		inputValuestoWebelement(bh.getLname(),"Priya");
		inputValuestoWebelement(bh.getAddress(),"12A/A,EVR Street,Chennai");
		inputValuestoWebelement(bh.getCreditcard(),"2233224300011000");
		selectDropDownOption(bh.getCardtype(),"value","VISA");
		selectDropDownOption(bh.getExpirymonth(),"value","8");
		selectDropDownOption(bh.getExpiryyear(),"value","2022");
		inputValuestoWebelement(bh.getCCV(),"004");
		clickonWebElement(bh.getBooknow());
		waitforElementVisibility(bh.getBooknow(), 5);
		
		BookingConfirmationPage bc= new BookingConfirmationPage(driver);
		clickonWebElement(bc.getMyitinerary());
		
		BookitineraryPage  bi= new BookitineraryPage(driver);
		clickonWebElement(bi.getBookitinerary());
		
		CancelHotelPage ch=new CancelHotelPage(driver);
		clickonWebElement(ch.getCancelbooking());
		confirmalert(ch.getCancelbooking(), "accept");
		
		LogoutPage lg=new LogoutPage(driver);
		clickonWebElement(lg.getLogout());
		
		
		
}
}
