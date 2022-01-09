package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.baseclass.Testbase;

public class SignUp extends Testbase {

	@FindBy(xpath="//*[@class='ng-scope' and contains(text(),'Sign Up')]")
	WebElement Clicksignup;
	
	@FindBy(xpath="//a[contains(text(),'Customer Signup')]")
	WebElement Customersignup;
	
	@FindBy(xpath="driver.findElements(By.xpath(\"//select[@id = 'txtName')]/option[contains(text(), 'Mr')]\")).click()")
	WebElement Optionselect;
	
	
	@FindBy(xpath="//input[@ng-model='Signup.FirstName']")
	WebElement Enterfirstname;
		
	
	@FindBy(xpath="//input[@ng-model='Signup.LastName']")
	WebElement Enterlastname;
	
	@FindBy(xpath="//input[@ng-model='Signup.CustomerMobile']")
	WebElement Entermobile;
	
	@FindBy(xpath="//input[@ng-model='Signup.EmailID']")
	WebElement Enteremailid;
	
	
	@FindBy(xpath="//button[@id='btnsignUp']")
	WebElement Entersignup ;
	
	@FindBy(xpath="//div[@id='DivErrorMsg']")
	WebElement registrationsuccess;
		
	
	public SignUp(){
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validationregistrationMessage() {
		return registrationsuccess.isDisplayed();
	}
	
	public void Registration(String title,String first,String lastname,String mobileno,String emailide) {
	
		Clicksignup.click();
		Customersignup.click();
		Optionselect.sendkeys(title);
		Enterfirstname.sendKeys(first);
		Enterlastname.sendKeys(lastname);
		Entermobile.sendKeys(mobileno);
		Enteremailid.sendKeys(emailide);
		
		
		
		
		}
		
	
	
	}	

