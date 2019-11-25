package Example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		WebDriver wd = new ChromeDriver(options);
		wd.get("https://www.facebook.com");
		
		wd.findElement(By.cssSelector("#email")).sendKeys("laukikpanchal");
		wd.findElement(By.cssSelector("#pass")).sendKeys("123");
		
		
		
		
		
		
	}

}
