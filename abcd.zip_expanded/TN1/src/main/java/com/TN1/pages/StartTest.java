package com.TN1.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TN1.base.TestBase;

public class StartTest extends TestBase {
	
	
	
	@FindBy(xpath="//button[@id='startTestBtn']") WebElement starttest;
	
	
	public StartTest()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickstarttest() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		System.out.println("Clicking start test button");
		Thread.sleep(5000);
		starttest.click();
		driver.findElement(By.id("term-check")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='acceptTerms']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"startSectionBtn\"]")).click();
	}

}
