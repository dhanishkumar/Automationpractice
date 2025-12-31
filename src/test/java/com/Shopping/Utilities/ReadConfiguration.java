package com.Shopping.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration
{
	String path="/Users/dhanishkumar/eclipse-workspace/Shopping/Configuration/config.properties";
	Properties Pro;
	
	public ReadConfiguration()
	{
		FileInputStream fn=null;
		try {
			fn=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pro =new Properties();
		try {
			Pro.load(fn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getUrl()
	{
		String u=Pro.getProperty("url");
		if(u!=null)
		{
			return u;
		}
		else 
		{
			throw new RuntimeException("url not found");
		}
	}
	public String getBrowser()
	{
		String v=Pro.getProperty("browser");
		if(v!=null)
		{
			return v;
		}
		else
		{
			throw new RuntimeException("Browser not found");
		}
	}
}
