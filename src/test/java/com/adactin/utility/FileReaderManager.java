package com.adactin.utility;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager()
{
		
		
}
	
	public static FileReaderManager getInstance() 
	{
		
		
		FileReaderManager f= new FileReaderManager();
		return f;
		
	}
	
	public ConfigurationReader getCRInstance() throws IOException
	{
		ConfigurationReader cr= new ConfigurationReader();
		return cr;
	}

}
