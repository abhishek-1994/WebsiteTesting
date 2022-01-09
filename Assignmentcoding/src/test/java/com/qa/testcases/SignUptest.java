package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclass.Testbase;
import com.qa.pages.SignUp;

public class SignUptest extends Testbase {
	
	
	SignUp Signup;
	
	
	public SignUptest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		Signup=new SigUp();
	}
	
	@Test
	public void Registrionsuccess() {
		Assert.assertTrue(SignUp.validationregistrationMessage(),"message missing");
	}

}
