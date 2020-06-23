package com.adactin.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigurationReader {
	
	public static Properties p;
	public ConfigurationReader() throws IOException {
	File file=new File(".//src//test//java//com//adactin//properties//adactin.properties");
	FileInputStream fis= new FileInputStream(file);
	p=new Properties();
	p.load(fis);
	}
	

	public static String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

//remove'static'is selected in runner filereadermanager.getinstance line so it removed here
	public String getBrowserName() {
		String browsername = p.getProperty("browsername");
		return browsername;
	}
	
	
	}
