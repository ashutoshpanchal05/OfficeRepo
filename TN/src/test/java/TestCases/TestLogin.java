/**
 * 
 */
package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;

/**
 * @author P7111022
 *
 */
public class TestLogin {
	WebDriver driver;
	LoginPage login;
	
	
	
	@Test
	public void verifyLogin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test812-tn8.pearsondev.com/client/index.html");
		 login = new LoginPage(driver);
		
		
		Thread.sleep(1000);
		
		
		login.typeEmail("m3");
		Thread.sleep(1000);
		login.typePassword("v");
		login.pressSign();
		
		System.in.read();
		driver.close();
		
		
	}
	

}
