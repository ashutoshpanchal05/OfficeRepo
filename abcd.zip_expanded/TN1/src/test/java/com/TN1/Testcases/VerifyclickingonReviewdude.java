package com.TN1.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN1.base.TestBase;
import com.TN1.pages.AccessReviewDude;
import com.TN1.pages.Loginpage;
import com.TN1.pages.StartSectionScreen;
import com.TN1.pages.StartTest;

public class VerifyclickingonReviewdude extends TestBase {
	
	AccessReviewDude review;
	StartSectionScreen Clickstart;
	
	//TC chechTC;
	StartTest Start;
	Loginpage lpage;
	
	
	 @BeforeMethod
	 public void setup()
		{
				initialisation();
				System.out.println("Browser Launched successfully");	
				lpage = new Loginpage();
				Start = new StartTest();
				//chechTC = new TC();
				//Clickstart = new StartSectionScreen();
				review=new AccessReviewDude();
		}
	@Test
	public void reviewDude() throws Exception
	{
		
	lpage.login("m3", "v");
	Start.clickstarttest();
	//Clickstart.startsection();
	review.clickreviewbutton();
	
		
		
		
	}

}
