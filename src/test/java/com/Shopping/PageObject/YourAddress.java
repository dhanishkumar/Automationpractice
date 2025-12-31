package com.Shopping.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class YourAddress 
{
	public WebDriver ldriver;
	public YourAddress(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id = "company")WebElement Company;
	@FindBy(id = "address1")WebElement Address;
	@FindBy(id = "address2")WebElement Address2;
	@FindBy(id = "city")WebElement City;
	@FindBy(id = "id_state")WebElement State;
	@FindBy(id = "postcode")WebElement PostalCode;
	@FindBy(id = "id_country")WebElement Country;
	@FindBy(id = "phone")WebElement Phone;
	@FindBy(id = "phone_mobile")WebElement MobilePhone;
	@FindBy(id = "other")WebElement AdditionalInformation;
	@FindBy(id = "alias")WebElement PleaseAssign;
	@FindBy(id = "submitAddress")WebElement Save;
	public void ClickCompany(String company)
	{
		Company.sendKeys(company);
	}
	public void ClickAddress(String address)
	{
		Address.sendKeys(address);
	}
	public void ClickAddress2(String addres2)
	{
		Address2.sendKeys(addres2);
	}
	public void ClickCity(String citY)
	{
		City.sendKeys(citY);
	}
	public void ClickState(String statE)
	{
		Select s=new Select(State);
		s.selectByValue(statE);
	}
	public void ClickPostalCode(String Postalcode)
	{
		PostalCode.sendKeys(Postalcode);
	}
	public void ClickCountry(String country)
	{
		Country.sendKeys(country);
	}
	public void ClickPhone(String phonE)
	{
		Phone.sendKeys(phonE);
	}
	public void ClickMobilePhone(String mobilephone)
	{
		MobilePhone.sendKeys(mobilephone);
	}
	public void ClickAdditionalInformation(String addInfo)
	{
		AdditionalInformation.sendKeys(addInfo);
	}
	public void ClickPleaseAssign(String pleaseassign)
	{
		PleaseAssign.sendKeys(pleaseassign);
	}
	public void ClickSave()
	{
		Save.click();
	}
}
