package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclass.Testbase;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;

public class LoginPagetest extends Testbase {
	
	Loginpage loginPage;
	Homepage HomePage;
	
	public LoginPagetest() {
		super();
	}

	@BeforeMethod
	
	public void setUp() {
		initialization();
		loginPage=new Loginpage();
	}
	
	
	@Test(priority=1)
	public void LoginPageTitlePageTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"HappyFares.in - Best Deals & Discounts on Flight Tickets");
		
	}
	
	@Test(priority=2)
	public void loginTest() {
		HomePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
}
