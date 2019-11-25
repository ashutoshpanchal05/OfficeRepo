package com.TN1.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN1.base.TestBase;
import com.TN1.pages.Loginpage;
import com.TN1.pages.StartTest;

public class VerifyStartTest extends TestBase {
	
	StartTest Start;
	Loginpage lpage;
	
	public VerifyStartTest()
	{
		super();
	}
	

	
 @BeforeMethod
 public void setup()
	{
			initialisation();
			System.out.println("Browser Launched successfully");
			lpage = new Loginpage();
			Start = new StartTest();
	}
 
	@Test
	public void Verifylogin() throws Exception	
	{
		

		lpage.login("m3", "v");
		Start.clickstarttest();

		
		
	}
	

}

