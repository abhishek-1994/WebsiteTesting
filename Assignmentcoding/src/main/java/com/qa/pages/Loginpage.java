package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.Testbase;

public class Loginpage extends Testbase {
	
	
	
	@FindBy(xpath="//*[@class='ng-scope' and contains(text(),'Sign In')]")
	WebElement thesignin;
	
	
	@FindBy(xpath="//a[contains(text(),'Customer Login')]")
	WebElement clickcustomerlogin;
	
	

	@FindBy(xpath="//input[@id='txtMobileNumber1']")
	WebElement entermobileno;
	
	@FindBy(xpath="//input[@type='password' and @id='txtPassword1']")
	WebElement enterpassword;
	
	@FindBy(xpath="//*[@ng-click='ShowOTPFormVisible=0' and contains(text(),'Sign In')]")
	WebElement clicksignin;
	
	
	public Loginpage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
		
	public Homepage login(String un,String pwd) {
		thesignin.click();
		clickcustomerlogin.click();
		entermobileno.sendKeys(un);
		enterpassword.sendKeys(pwd);
		clicksignin.click();
		
		return new Homepage();
			
	}
	
	
}
