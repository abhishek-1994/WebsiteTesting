package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclass.Testbase;
import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;

public class Homepagetest extends Testbase {
	
	
	Loginpage loginPage;
	Homepage HomePage;
	
	public Homepagetest() {
		super();
	}

	@BeforeMethod
		public void setUp() {
			initialization();
			loginPage=new Loginpage();
			HomePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
    @Test
    public void Verifyuser() {
    	Assert.assertTrue(HomePage.Validateusername(),"user name is missing")
    }
}
