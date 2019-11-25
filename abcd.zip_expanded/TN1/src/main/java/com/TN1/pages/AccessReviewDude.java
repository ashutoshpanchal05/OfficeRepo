package com.TN1.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.TN1.base.TestBase;

public class AccessReviewDude extends TestBase{
	
	@FindBy(xpath="//*[@id='btnOverview']") WebElement reviewdude;
	
	
	public void clickreviewbutton()
	{
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		reviewdude.click();
		
	}
	

}
