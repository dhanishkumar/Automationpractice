package com.Shopping.TestCase;
import org.testng.annotations.Test;

import com.Shopping.PageObject.MyAccount;
import com.Shopping.PageObject.PersonalInfo;
import com.Shopping.PageObject.Signin;
import com.Shopping.PageObject.YourAddress;

public class TestCases extends BaseClass
{
	
	@Test(priority = 0)
	public void SignUp()
	{
		driver.get(url);
		Signin s=new Signin(driver);
		s.clickSignin();
		s.getEmail("ussqw@gmail.com");
		s.clickCreate();
	}
	@Test(priority = 1)
	public void Personalinfo() throws Exception
	{
		PersonalInfo p=new PersonalInfo(driver);
		p.ClickRadio();
		p.FirstName("Rohit");
		p.Lastname("Kumar");
		p.Password("123456789");
		p.SelectDay("1");
		p.SelectMonth("5");
		p.SelctYear("2000");
		p.Clicknewsletter();
		p.ClickReceive();
		p.ClickRegister();
	}
	@Test(priority = 2)
	public void MyAccount() throws Exception
	{
		MyAccount m=new MyAccount(driver);
		m.ClickMyAddress();
		
	}
	@Test(priority = 3)
	public void Youraddress()
	{
		YourAddress y=new YourAddress(driver);
		y.ClickCompany("DuCat");
		y.ClickAddress("Noida");
		y.ClickAddress2("Delhi");
		y.ClickCity("UP");
		y.ClickState("14");
		y.ClickPostalCode("46048");
		y.ClickCountry("India");
		y.ClickPhone("1223234565");
		y.ClickMobilePhone("8789874567");
		y.ClickAdditionalInformation("Hello this is my account");
		y.ClickPleaseAssign("yes this is my address");
		y.ClickSave();
	}
	
}
