package com.Shopping.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin 
{
	public WebDriver ldriver;
	public Signin(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(linkText = "Sign in")WebElement signin;
	@FindBy(id = "email_create")WebElement email;
	@FindBy(css = "i.icon-user")WebElement createaccount;
	
	public void clickSignin()
	{
		signin.click();
	}
	public void getEmail(String Email)
	{
		email.sendKeys(Email);
	}
	public void clickCreate()
	{
		createaccount.click();
	}
}
