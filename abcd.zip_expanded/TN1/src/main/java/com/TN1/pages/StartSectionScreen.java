package com.TN1.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TN1.base.TestBase;

public class StartSectionScreen extends TestBase{


	
	
	@FindBy(xpath="//*[@id=\"startSectionBtn\"]") WebElement startSectionBtn;
	
	
	public void startbutton()
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void startsection() throws Exception
	{
		
		Thread.sleep(5000);
		   driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		startSectionBtn.click();
		System.out.println("Clicking Start section");
		
	}
	
	
}
