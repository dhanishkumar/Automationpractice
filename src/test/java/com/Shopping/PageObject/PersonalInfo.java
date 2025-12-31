package com.Shopping.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalInfo 
{
	public WebDriver ldriver;
	public PersonalInfo(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(id = "id_gender1")WebElement selectRadio;
	@FindBy(id = "customer_firstname")WebElement firstname;
	@FindBy(id = "customer_lastname")WebElement lastname;
	@FindBy(id = "passwd")WebElement password;
	@FindBy(id = "days")WebElement day;
	@FindBy(id = "months")WebElement month;
	@FindBy(id = "years")WebElement year;
	@FindBy(id = "newsletter")WebElement Newsletter;
	@FindBy(id = "optin")WebElement ReceiveSpecial;
	@FindBy(id = "submitAccount")WebElement Register;
	
	public void ClickRadio() throws Exception
	{
		Thread.sleep(3000);
		selectRadio.click();
	}
	public void FirstName(String firstName)
	{
		firstname.sendKeys(firstName);
	}
	public void Lastname(String lastName)
	{
		lastname.sendKeys(lastName);
	}
	public void Password(String pasword)
	{
		password.sendKeys(pasword);
	}
	public void SelectDay(String days)
	{
		Select d=new Select(day);
		d.selectByValue(days);
	}
	public void SelectMonth(String months)
	{
		Select m=new Select(month);
		m.selectByValue(months);
	}
	public void SelctYear(String years)
	{
		Select y=new Select(year);
		y.selectByValue(years);
	}
	public void Clicknewsletter()
	{
		Newsletter.click();
	}
	public void ClickReceive()
	{
		ReceiveSpecial.click();
	}
	public void ClickRegister()
	{
		Register.click();
	}
	
	
	
	
	
}
