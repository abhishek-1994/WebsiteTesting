package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.Testbase;

public class Homepage extends Testbase {
	
	
	@FindBy(xpath="//input[ @placeholder='Select Origin City' ]")
	WebElement Origincity;
	
	@FindBy(xpath="//*[@placeholder=\"Select Destination City\"]")
	WebElement Destinationcity;
	
	@FindBy(xpath="//label[contains(text(),'SAT,08 JAN')]")
	WebElement date;
	
	
	@FindBy(xpath="//p[contains(text(),'1 PAX, ECONOMY')]")
	WebElement Selectclass;

	@FindBy(xpath="//input[@type='button']")
	WebElement Search;
	
	@FindBy(xpath="//span[contains(text(),'abhishek')]")
	WebElement Verifyvaliduser;
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean Validateusername()   {
		return Verifyvaliduser.isDisplayed();
	}
}



