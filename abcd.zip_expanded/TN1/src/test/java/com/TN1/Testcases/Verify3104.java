package com.TN1.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN1.base.TestBase;
import com.TN1.pages.Loginpage;

public class Verify3104 extends TestBase{
	Loginpage error;
	@FindBy(xpath="//*[@id='error-modal']/div/div[3]/div/p/text()") WebElement select;
	
	public Verify3104()
	{
		super();
	}
	
	@BeforeMethod
	public void startbrowser()
	{
		initialisation();
		error=new Loginpage();
		
	}
	
	@Test
	public void displayed3104() throws Exception
	{
		Thread.sleep(2000);
		error.login("m1", "v");
		String b=driver.findElement(By.xpath("//*[@id='error-modal']/div/div[3]/div/span")).getText();	
		System.out.println("Error code is:: "+b);
		String a=select.getText();
		System.out.println("Error Message is:: "+a);
		
		
	}
	

}
