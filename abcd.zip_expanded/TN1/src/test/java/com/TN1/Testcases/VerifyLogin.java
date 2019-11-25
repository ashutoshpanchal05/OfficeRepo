package com.TN1.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN1.base.TestBase;
import com.TN1.pages.Loginpage;

public class VerifyLogin extends TestBase {
	Loginpage lpage;
	
	
	public VerifyLogin()
	{
		super();
	}
	

	
 @BeforeMethod
 public void setup()
	{
			initialisation();
			System.out.println("Browser Launched successfully");	
			lpage = new Loginpage();
			
	}
 
	@Test
	public void Verifylogin()	
	{
		
		lpage.login("m3", "v");

		
		
	}
	

}
