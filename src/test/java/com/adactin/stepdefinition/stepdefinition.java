package com.adactin.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.adactin.runner.runner;
import com.adactin.utility.ConfigurationReader;
import com.adactin.utility.FileReaderManager;
import com.adactin.utility.PageObjectManager;
import com.cucumber.baseclass.CucumberBaseClass;
import com.cucumber.pom.BookingConfirmationPage;
import com.cucumber.pom.BookingHotel;
import com.cucumber.pom.BookitineraryPage;
import com.cucumber.pom.CancelHotelPage;
import com.cucumber.pom.LogoutPage;
import com.cucumber.pom.SearchHotel;
import com.cucumber.pom.SelectHotel;
import com.cucumber.pom.SigninPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends CucumberBaseClass{
	
	public static WebDriver driver=runner.driver;
	PageObjectManager pom= new PageObjectManager(driver);
	
	@Given("^the user is logged in$")
	public void the_user_is_logged_in() throws Throwable {
		System.out.println("logged in");
	    	}

	@Given("^goes to landing page$")
	public void goes_to_landing_page() throws Throwable {
		System.out.println("successfully landed to homepage");
	}

	@Given("^User launch the adacting application$")
	public void user_launch_the_adacting_application() throws Throwable
	{
//		driver=browserLaunch("chrome");
//		geturl("http://adactinhotelapp.com/");
		//ConfigurationReader con=new ConfigurationReader();
		String url= FileReaderManager.getInstance().getCRInstance().getUrl();
		geturl(url);
	}



//	@When("^User enter the valid username$")
//	public void user_enter_the_valid_username() throws Throwable
//	{
//		//SigninPage sp=new SigninPage(driver);
//		inputValuestoWebelement(pom.getSp().getUserlogin(),"Prasanna1");
//	}
//
//	@When("^User enter the valid password$")
//	public void user_enter_the_valid_password() throws Throwable
//	{
//		//SigninPage sp=new SigninPage(driver);
//		inputValuestoWebelement(pom.getSp().getLogpasswrd(),"priya@123"); 
//	}
	@When("^User enter the \"([^\"]*)\" valid username$")
	public void user_enter_the_valid_username(String username) throws Throwable {
		inputValuestoWebelement(pom.getSp().getUserlogin(),username);
	}

	@When("^User enter the \"([^\"]*)\" valid password$")
    public void user_enter_the_valid_password(String password) throws Throwable {
	inputValuestoWebelement(pom.getSp().getLogpasswrd(),password);
	}



	@When("^User enter in the login button$")
	public void user_enter_in_the_login_button() throws Throwable
	{
		//SigninPage sp=new SigninPage(driver);
		clickonWebElement(pom.getSp().getLogin());
	}

	@Then("^It lands to the homepage successfully$")
	public void it_lands_to_the_homepage_successfully() throws Throwable
	{
		System.out.println("Successsfully landed to home page");
	    
	}
	
	//==========//Search for hotel code when values are passed here=========
//			
//	@When("^User select the location$")
//	public void user_select_the_location() throws Throwable {
//		//SearchHotel ab= new SearchHotel(driver);
//		selectDropDownOption(pom.getSh().getLocation(), "value", "Sydney");	
//	}
//
//	@When("^User select the hotel$")
//	public void user_select_the_hotel() throws Throwable {
//		//SearchHotel ab= new SearchHotel(driver);
//		selectDropDownOption(pom.getSh().getHotels(),"value","Hotel Creek");
//		//assertEquals('S', 's');
//	}
//
//	@When("^User select the roomtype$")
//	public void user_select_the_roomtype() throws Throwable {
//		
//		//SearchHotel ab= new SearchHotel(driver);
//		selectDropDownOption(pom.getSh().getRoomType(),"value","Standard");
//		
//	}
//
//	@When("^User select number of rooms required$")
//	public void user_select_number_of_rooms_required() throws Throwable {
//		//SearchHotel ab= new SearchHotel(driver);
//		//selectDropDownOption(ab.getNoofrooms(),"value","1");
//		selectDropDownOption(pom.getSh().getNoofrooms(),"value","1");
//	}
//
//	@When("^User enter the Check in date$")
//	public void user_enter_the_Check_in_date() throws Throwable {
//		//SearchHotel ab= new SearchHotel(driver);
//		inputValuestoWebelement(pom.getSh().getCheckIn(),"20/05/2020");
//	}
//
//	@When("^User enter the check out date$")
//	public void user_enter_the_check_out_date() throws Throwable {
//		//SearchHotel ab= new SearchHotel(driver);
//		inputValuestoWebelement(pom.getSh().getCheckout(),"21/05/2020");
//	}
//
//	@When("^User select number of adults$")
//	public void user_select_number_of_adults() throws Throwable {
//		//SearchHotel ab= new SearchHotel(driver);
//		selectDropDownOption(pom.getSh().getAdults(),"value","2");
//	}
//
//	@When("^User select number of children$")
//	public void user_select_number_of_children() throws Throwable {
//	//	SearchHotel ab= new SearchHotel(driver);
//		selectDropDownOption(pom.getSh().getChildren(),"value","1");
//		
//	}
//
//	@When("^User search for the hotel$")
//	public void user_search_for_the_hotel() throws Throwable {
//		//SearchHotel ab= new SearchHotel(driver);
//		clickonWebElement(pom.getSh().getSearch());
//	}
//
//	@Then("^It lands to the selecthotel page successfully$")
//	public void it_lands_to_the_selecthotel_page_successfully() throws Throwable {
//		System.out.println("Successfully landed to select page");
//	}
	//====as the values were being passed in the feature file ,now the below code will be followed for all the 8 POM==///
	
	
	@When("^User select the \"([^\"]*)\" location$")
	public void user_select_the_location(String location) throws Throwable 
	{
		selectDropDownOption(pom.getSh().getLocation(), "value",location);
	}

	@When("^User select the \"([^\"]*)\" hotel$")
	public void user_select_the_hotel(String hotel) throws Throwable
	{
		selectDropDownOption(pom.getSh().getHotels(),"value",hotel);
	}

	@When("^User select the \"([^\"]*)\" roomtype$")
	public void user_select_the_roomtype(String roomtype) throws Throwable
	{
		selectDropDownOption(pom.getSh().getRoomType(),"value",roomtype);
	   
	}

	@When("^User select number of rooms \"([^\"]*)\" required$")
	public void user_select_number_of_rooms_required(String roomsrequired) throws Throwable
	{
		selectDropDownOption(pom.getSh().getNoofrooms(),"value",roomsrequired);
	    
	}

	@When("^User enter the \"([^\"]*)\" Check in date$")
	public void user_enter_the_Check_in_date(String checkin) throws Throwable
	{
		inputValuestoWebelement(pom.getSh().getCheckIn(),checkin);
	}

	@When("^User enter the \"([^\"]*)\" check out date$")
	public void user_enter_the_check_out_date(String checkout) throws Throwable
	{
		inputValuestoWebelement(pom.getSh().getCheckout(),checkout);
	}

	@When("^User select \"([^\"]*)\" number of adults$")
	public void user_select_number_of_adults(String adults) throws Throwable 
	{
		selectDropDownOption(pom.getSh().getAdults(),"value",adults);
	}

	@When("^User select \"([^\"]*)\" number of children$")
	public void user_select_number_of_children(String arg1) throws Throwable
	{
		selectDropDownOption(pom.getSh().getChildren(),"value","1");
	}
	
	@When("^User search for the hotel$")
	public void user_search_for_the_hotel() throws Throwable {
		//SearchHotel ab= new SearchHotel(driver);
		clickonWebElement(pom.getSh().getSearch());
	}

	@Then("^It lands to the selecthotel page successfully$")
	public void it_lands_to_the_selecthotel_page_successfully() throws Throwable {
		System.out.println("Successfully landed to select page");
	}

	//============Select Page=================
	

	@When("^User select the hotel by clicking the radio option$")
	public void user_select_the_hotel_by_clicking_the_radio_option() throws Throwable {
		//SelectHotel sh=new SelectHotel(driver);
		clickonWebElement(pom.getSl().getSelectradio());
		
	}

	@When("^User clicks on the continue nutton$")
	public void user_clicks_on_the_continue_nutton() throws Throwable {
//		SelectHotel sh=new SelectHotel(driver);
		clickonWebElement(pom.getSl().getContinuemext());
		
	}

	@Then("^It lands to the Booking hotel page successfully$")
	public void it_lands_to_the_Booking_hotel_page_successfully() throws Throwable {
	   System.out.println("successfully landed to booking hotel page");
	}
	
	//=======booking hotel page==============
	
//	@When("^User enter the first name$")
//	public void user_enter_the_first_name() throws Throwable {
//	    
//		//BookingHotel bh=new BookingHotel(driver);
//		inputValuestoWebelement(pom.getBh().getFname(),"Prasanna");	
//	}
//
//	@When("^User enter the last name$")
//	public void user_enter_the_last_name() throws Throwable {
//		//BookingHotel bh=new BookingHotel(driver);
//		inputValuestoWebelement(pom.getBh().getLname(),"Priya");
//	}
//
//	@When("^User enter the address$")
//	public void user_enter_the_address() throws Throwable {
//		//BookingHotel bh=new BookingHotel(driver);
//		inputValuestoWebelement(pom.getBh().getAddress(),"12A/A,EVR Street,Chennai");
//	}
//
//	@When("^User enter the creditcard number$")
//	public void user_enter_the_creditcard_number() throws Throwable {
//		//BookingHotel bh=new BookingHotel(driver);
//		inputValuestoWebelement(pom.getBh().getCreditcard(),"2233224300011000");
//	}
//
//	@When("^User select the card type$")
//	public void user_select_the_card_type() throws Throwable {
//	//	BookingHotel bh=new BookingHotel(driver);
//		selectDropDownOption(pom.getBh().getCardtype(),"value","VISA");
//	}
//
//	@When("^User select the expiry month$")
//	public void user_select_the_expiry_month() throws Throwable {
//		//BookingHotel bh=new BookingHotel(driver);
//		selectDropDownOption(pom.getBh().getExpirymonth(),"value","8");
//	}
//
//	@When("^User select the expiry year$")
//	public void user_select_the_expiry_year() throws Throwable {
//		//BookingHotel bh=new BookingHotel(driver);
//		selectDropDownOption(pom.getBh().getExpiryyear(),"value","2022");
//	}
//
//	@When("^User enter the CCV number$")
//	public void user_enter_the_CCV_number() throws Throwable {
//		//BookingHotel bh=new BookingHotel(driver);
//		inputValuestoWebelement(pom.getBh().getCCV(),"004");
//	}
//
//	@When("^User click on the booknow option$")
//	public void user_click_on_the_booknow_option() throws Throwable {
//		//BookingHotel bh=new BookingHotel(driver);
//		clickonWebElement(pom.getBh().getBooknow());
//	}
//
//	@When("^User wait for the page to load$")
//	public void user_wait_for_the_page_to_load() throws Throwable {
//	//	BookingHotel bh=new BookingHotel(driver);
//		waitforElementVisibility(pom.getBh().getBooknow(), 5);
//	}
//
//	@Then("^It lands to the Booking confirmation page successfully$")
//	public void it_lands_to_the_Booking_confirmation_page_successfully() throws Throwable {
//	  System.out.println("It is successfully landed to the booking confirmation page");
//	}
	//=======================================================================
	

@When("^User enter the \"([^\"]*)\" first name$")
public void user_enter_the_first_name(String firstname) throws Throwable
{
	inputValuestoWebelement(pom.getBh().getFname(),firstname);	
}

@When("^User enter the \"([^\"]*)\" last name$")
public void user_enter_the_last_name(String lastname) throws Throwable 
{
	inputValuestoWebelement(pom.getBh().getLname(),lastname);
}

@When("^User enter the \"([^\"]*)\" address$")
public void user_enter_the_address(String address) throws Throwable
{
	inputValuestoWebelement(pom.getBh().getAddress(),address);
}

@When("^User enter the \"([^\"]*)\" creditcard number$")
public void user_enter_the_creditcard_number(String creditcard) throws Throwable
{
	inputValuestoWebelement(pom.getBh().getCreditcard(),creditcard);
}

@When("^User select the \"([^\"]*)\" card type$")
public void user_select_the_card_type(String cardtype) throws Throwable
{
	selectDropDownOption(pom.getBh().getCardtype(),"value",cardtype);
}

@When("^User select the \"([^\"]*)\" expiry month$")
public void user_select_the_expiry_month(String expmonth) throws Throwable
{
	selectDropDownOption(pom.getBh().getExpirymonth(),"value",expmonth);
}

@When("^User select the \"([^\"]*)\" expiry year$")
public void user_select_the_expiry_year(String expyear) throws Throwable 
{
	selectDropDownOption(pom.getBh().getExpiryyear(),"value",expyear);
}

@When("^User enter the \"([^\"]*)\" CCV number$")
public void user_enter_the_CCV_number(String arg1) throws Throwable
{
	inputValuestoWebelement(pom.getBh().getCCV(),"004");
}
@When("^User click on the booknow option$")
public void user_click_on_the_booknow_option() throws Throwable {
	//BookingHotel bh=new BookingHotel(driver);
	clickonWebElement(pom.getBh().getBooknow());
}

@When("^User wait for the page to load$")
public void user_wait_for_the_page_to_load() throws Throwable {
//	BookingHotel bh=new BookingHotel(driver);
	waitforElementVisibility(pom.getBh().getBooknow(), 5);
}

@Then("^It lands to the Booking confirmation page successfully$")
public void it_lands_to_the_Booking_confirmation_page_successfully() throws Throwable {
  System.out.println("It is successfully landed to the booking confirmation page");
}


//===============BookConfirmation page====================
	@When("^User click on the myitinerary button$")
	public void user_click_on_the_myitinerary_button() throws Throwable {
		//BookingConfirmationPage bc= new BookingConfirmationPage(driver);
		clickonWebElement(pom.getBp().getMyitinerary());
	}

	@Then("^It lands to the book itinerary page successfully$")
	public void it_lands_to_the_book_itinerary_page_successfully() throws Throwable {
	   System.out.println("It lands to the book itinerary page");
	}
//-================Bookitinerary Page==========================
	
	
	@When("^User click on the checkbox$")
	public void user_click_on_the_checkbox() throws Throwable {
		//BookitineraryPage  bi= new BookitineraryPage(driver);
		clickonWebElement(pom.getBi().getBookitinerary());
	}

	@Then("^It lands to the cancel hotel page successfully$")
	public void it_lands_to_the_cancel_hotel_page_successfully() throws Throwable {
	   System.out.println("it lands to the cancel hotel page");
	}
//==============cancel hotel page===========================
	@When("^User click the cancel button$")
	public void user_click_the_cancel_button() throws Throwable {
	//	CancelHotelPage ch=new CancelHotelPage(driver);
		clickonWebElement(pom.getCl().getCancelbooking());
	}

//	@When("^User click on the yes button to cancel the booked hotel$")
//	public void user_click_on_the_yes_button_to_cancel_the_booked_hotel() throws Throwable {
//	//	CancelHotelPage ch=new CancelHotelPage(driver);
//		confirmalert(pom.getCl().getCancelbooking(), "accept");
//	}
	
	@When("^User click on the \"([^\"]*)\" yes button to cancel the booked hotel$")
	public void user_click_on_the_yes_button_to_cancel_the_booked_hotel(String accept) throws Throwable
	{
		confirmalert(pom.getCl().getCancelbooking(),accept);
	}
	    

	@Then("^It lands to the logout page$")
	public void it_lands_to_the_logout_page() throws Throwable {
	  System.out.println("It lands to the logout page");
	}
	
	//============logout page====================================

	@When("^User click on the logout button$")
	public void user_click_on_the_logout_button() throws Throwable {
		//LogoutPage lg=new LogoutPage(driver);
		clickonWebElement(pom.getLg().getLogout());
		
	}






}
