package com.Shopping.TestCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.Shopping.Utilities.ReadConfiguration;



public class BaseClass
{
	public static WebDriver driver;
	//Browser and URL
	public ReadConfiguration r=new ReadConfiguration();
	String browser=r.getBrowser();//load browser
	String url=r.getUrl();//load URL
	@BeforeTest
	public void setup()
	{
		switch(browser.toLowerCase())
		{
		case"chrome":
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case"msedge":
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			break;
		case"fireFox":
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		default:
			driver=null;
		}
	}
	
	//Screenshot
	public void screenshot() throws IOException
	{
	TakesScreenshot sc=(TakesScreenshot)driver;
	File f1=sc.getScreenshotAs(OutputType.FILE);
//	String name="Screenshot"+System.currentTimeMillis()+".png";
	File f2=new File("/Users/dhanishkumar/eclipse-workspace/practic/Screenshots/p.png");
	FileUtils.copyFile(f1, f2);
	}
}
