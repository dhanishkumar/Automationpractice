package com.Shopping.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyAccount 
{
	public WebDriver ldriver;
	public MyAccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//span[text()='Add my first address']")WebElement addmyaddress;
	
	public void ClickMyAddress() throws Exception
	{
		Thread.sleep(3000);
		addmyaddress.click();
	}
	
	
	
}
