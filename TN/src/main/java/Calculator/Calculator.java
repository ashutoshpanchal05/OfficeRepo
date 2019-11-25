package Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator {
	
	WebDriver driver;
	By inputfield = By.name("Input");
	
	public void SetDriver(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void SendKeys(String keys)
	{
		
		driver.findElement(inputfield).sendKeys(keys);
		
	}
	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.math.com/students/calculators/source/basic.html");
    }
	
}
