/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author P7111022
 *
 */
public class LoginPage {
	WebDriver driver; 
	By Email = By.id("email");
	By Password = By.id("password");
	By Signin = By.id("btnLogin");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		System.out.print(driver.getCurrentUrl());
		
	}
	
	public void typeEmail(String temp)
	{
		
		driver.findElement(Email).sendKeys(temp);
		
	}
	
	public void typePassword(String temp)
	{
		
		driver.findElement(Password).sendKeys(temp);
		
	}
	
	public void pressSign()
	{
		
		driver.findElement(Signin).click();
		
	}
	
	
	

}
