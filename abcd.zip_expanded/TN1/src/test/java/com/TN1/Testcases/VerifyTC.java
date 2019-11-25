package com.TN1.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN1.base.TestBase;
import com.TN1.pages.Loginpage;
import com.TN1.pages.StartTest;
import com.TN1.pages.TC;

public class VerifyTC extends TestBase {
	TC chechTC;
	StartTest Start;
	Loginpage lpage;

	public VerifyTC() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialisation();
		System.out.println("Browser Launched successfully");
		lpage = new Loginpage();
		Start = new StartTest();
		chechTC = new TC();
	}

	@Test
	public void clickTC() throws Exception {

		lpage.login("m3", "v");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Start.clickstarttest();

		Thread.sleep(2000);
		chechTC.selectTC();

	}

}
