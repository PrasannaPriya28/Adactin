package com.cucumber.pom;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.CucumberBaseClass;

public class SigninPage extends CucumberBaseClass
{
	
	
	
	//===sign in===
//	WebElement register = driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a"));
//	waitforElementVisibility(register, 5);
//	elementIsEnabled(register);
//	clickonWebElement(register);
//	WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
//	inputValuestoWebelement(Username,"Prasanna Priya");
//	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//	inputValuestoWebelement(password,"prasana@11");
//	WebElement Cpassword = driver.findElement(By.xpath("//input[@id='re_password']"));
//	inputValuestoWebelement(Cpassword,"prasana@11");
//	WebElement Fullname = driver.findElement(By.xpath("//input[@id='full_name']"));
//	inputValuestoWebelement(Fullname,"Prasana Priya");
//	WebElement email = driver.findElement(By.xpath("//input[@id='email_add']"));
//	inputValuestoWebelement(email,"ganapathypriya96@gmail.com");
//	WebElement captcha = driver.findElement(By.xpath("//input[@id='captcha-form']"));
//	inputValuestoWebelement(email,"courb");
//	WebElement agree = driver.findElement(By.xpath("//input[@id='tnc_box']"));
//	clickonWebElement(agree);
//	WebElement registernow = driver.findElement(By.xpath("//input[@id='Submit']"));
//	clickonWebElement(registernow);
	
		
//		browserLaunch("chrome");
//		geturl("http://adactinhotelapp.com/");
//		driver.manage().window().maximize();
//		WebElement userlogin = driver.findElement(By.xpath("//input[@id='username']"));
//		inputValuestoWebelement(userlogin,"Prasanna1");
//		WebElement logpasswrd = driver.findElement(By.xpath("//input[@id='password']"));
//		inputValuestoWebelement(logpasswrd, "priya@123");
//		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
//		clickonWebElement(login);
	
		
		public static WebDriver driver;

		
		
		public SigninPage(WebDriver ldriver) {
			this.driver=ldriver;
			PageFactory.initElements(driver, this);
	}



		@FindBy(xpath="//input[@id='username']")
		private WebElement userlogin;
			
		public WebElement getUserlogin()
		{
			return userlogin;
		}
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement logpasswrd;

	
		public WebElement getLogpasswrd()
		{
			return logpasswrd;
		}
		
		@FindBy(xpath="//input[@id='login']")
		private WebElement login;
		
		public WebElement getLogin()
		{
			return login;
		}



		public static WebDriver getDriver() {
			return driver;
		}
	
	
}
