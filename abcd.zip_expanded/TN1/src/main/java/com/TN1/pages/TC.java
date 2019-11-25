package com.TN1.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TN1.base.TestBase;

public class TC extends TestBase{

	@FindBy(xpath="//input[@id='term-check']") WebElement termsandconditions;
	@FindBy(xpath="//button[@id='acceptTerms']") WebElement clickcontinue;
	

	public TC()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void selectTC()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		termsandconditions.click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='acceptTerms']")));
		
		clickcontinue.click();
	}
}
