package com.TN1.Testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN1.base.TestBase;
import com.TN1.pages.Loginpage;

public class VerifySigninPageText extends TestBase{
	
	Loginpage login;
	
	public VerifySigninPageText()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@BeforeMethod
	public void start()
	{
		initialisation();
		
		
	}

	@Test(priority=1)
	public void tittle()
	{
		String actualTitle = driver.getTitle();
		System.out.println("Tittle displayed as:"     +actualTitle);
		String expectedTitle = "Sign In - TestNav";
		assertEquals(expectedTitle,actualTitle);
		driver.quit();
		
	}
	
	@Test(priority=2)
	public void selectuserdude()
	{
		String a=driver.findElement(By.xpath("//*[@id='userMenu']")).getText();
		System.out.println("Text is " +a);
		driver.findElement(By.xpath("//button[@id='menuDrop']")).click();
		
		driver.quit();
	}



}
