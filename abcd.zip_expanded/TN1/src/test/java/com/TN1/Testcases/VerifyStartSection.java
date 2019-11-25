package com.TN1.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN1.base.TestBase;
import com.TN1.pages.Loginpage;
import com.TN1.pages.StartSectionScreen;
import com.TN1.pages.StartTest;


public class VerifyStartSection extends TestBase{
	
	StartSectionScreen Clickstart;
	
	//TC chechTC;
	StartTest Start;
	Loginpage lpage;
	
	public VerifyStartSection()
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
				//chechTC = new TC();
				
				Clickstart = new StartSectionScreen();
		}
	
	
	 @Test
		public void StartSection1() throws Exception 
		{
			
		 lpage.login("m3", "v");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Start.clickstarttest();

			Thread.sleep(2000);
			//chechTC.selectTC();
		 Clickstart.startsection();

			
			
		}
	
}
