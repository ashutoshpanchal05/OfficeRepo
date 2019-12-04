package com.inetbanking.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		logger.info("URL opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username Entered");
		lp.setPassword(password);
		logger.info("Entered Password");
        lp.clickSubmit();
        logger.info("Submitted sucessfully");
        
        if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
        {
        	
        	Assert.assertTrue(true);
        }
        else
        {
        	
        	Assert.assertTrue(false);
        }
	}


}
