package com.adactin.utility;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.BookingConfirmationPage;
import com.cucumber.pom.BookingHotel;
import com.cucumber.pom.BookitineraryPage;
import com.cucumber.pom.CancelHotelPage;
import com.cucumber.pom.LogoutPage;
import com.cucumber.pom.SearchHotel;
import com.cucumber.pom.SelectHotel;
import com.cucumber.pom.SigninPage;

public class PageObjectManager {
	public static WebDriver driver;
	
	private BookingConfirmationPage bp;
	private BookingHotel bh;
	private SearchHotel sh;
	private SigninPage sp;
	private SelectHotel sl;
	private BookitineraryPage bi;
	private CancelHotelPage cl;
	private LogoutPage lg;
	
	public PageObjectManager(WebDriver ldriver) 
	{
		this.driver=ldriver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	public SigninPage getSp() {
		sp=new SigninPage(driver);
		return sp;
	}
	public SelectHotel getSl() {
		sl=new SelectHotel(driver);
		return sl;
	}
	public BookitineraryPage getBi() {
		bi=new BookitineraryPage(driver);
		return bi;
	}
	public BookingConfirmationPage getBp() {
		bp=new BookingConfirmationPage(driver);
		return bp;
	}
	public BookingHotel getBh() {
		bh=new BookingHotel(driver);
		return bh;
	}
	public SearchHotel getSh() {
		sh=new SearchHotel(driver);
		return sh;
	}
	public CancelHotelPage getCl() {
		cl=new CancelHotelPage(driver);
		return cl;
	}
	public LogoutPage getLg() {
		lg=new LogoutPage(driver);
		return lg;
	}
	

}
