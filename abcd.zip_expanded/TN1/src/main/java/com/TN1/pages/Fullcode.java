package com.TN1.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




import com.TN1.base.TestBase;

public class Fullcode extends TestBase
{

	
@BeforeMethod
public void setup()
	{
			initialisation();
			System.out.println("Browser Launched successfully");	
			driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		

	}
	@Test
	public void start() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		System.out.println("Clicking login button");
		
		driver.findElement(By.id("btnLogin")).click();
		String a= driver.findElement(By.xpath("//*[@id=\'loginForm']/div/div[3]/p")).getText();
	
		System.out.println("Error Message is:: "+a);
		
		String b=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/sub")).getText();
		
		System.out.println("Error code is:: "+b);
		
	
			WebElement Textbox1=driver.findElement(By.id("email"));
			Textbox1.sendKeys("d3");
			
			WebElement Textbox2=driver.findElement(By.id("password"));
			Textbox2.sendKeys("a");
			
			WebElement loginbtn=driver.findElement(By.id("btnLogin"));
			
			loginbtn.click();
			
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.id("startTestBtn"))).click().build().perform();
           
			
			
            driver.findElement(By.id("term-check")).click();
           
          
           
           WebElement TCContinue=driver.findElement(By.id("acceptTerms"));
           
          TCContinue.click();
          
          
          
          System.out.println("Navigate to start section screen");

          
          Thread.sleep(5000);
          driver.findElement(By.xpath("//*[@id=\"startSectionBtn\"]")).click();
          
          
          System.out.println("Item 1 loaded successfully");
          
          
          driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div/button")).click();          
          Select drpCountry1 = new Select(driver.findElement(By.id("interaction_response_4")));        	
  		  drpCountry1.selectByValue("choice_4");
  		 Select drpCountry2 = new Select(driver.findElement(By.id("interaction_response_1")));
 		  drpCountry2.selectByValue("choice_6");
 		 Select drpCountry3 = new Select(driver.findElement(By.id("interaction_response_2")));
 		  drpCountry3.selectByValue("choice_12");
 		 Select drpCountry4 = new Select(driver.findElement(By.id("interaction_response_3")));
 		  drpCountry4.selectByValue("choice_15");
 		  
 		  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[3]/div/button[2]")).click();
 		  
 		  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div/button")).click();

 		  
  	

              
          }
}
			
	


