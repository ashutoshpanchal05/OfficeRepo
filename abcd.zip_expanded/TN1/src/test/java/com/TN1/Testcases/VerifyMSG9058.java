package com.TN1.Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN1.base.TestBase;
import com.TN1.pages.Loginpage;


public class VerifyMSG9058 extends TestBase{
	
	Loginpage error;
	
	
	 @BeforeMethod
	 public void setup()
		{
				initialisation();
				System.out.println("Browser Launched successfully");	
				error=new Loginpage();
		}
	
	@Test
	public void errormsgdisplayed()
	{
		error.login("", "");
		driver.findElement(By.id("btnLogin")).click();
		String a= driver.findElement(By.xpath("//*[@id=\'loginForm']/div/div[3]/p")).getText();
	
		System.out.println("Error Message is:: "+a);
		
		String b=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/sub")).getText();
		
		System.out.println("Error code is:: "+b);
		
		
	}
	

}
