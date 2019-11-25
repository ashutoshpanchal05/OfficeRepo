package com.TN1.base;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	
	static WebDriver driver;
	
	
	
public static WebDriver startBrowser(String BrowserName,String url)
	{
		if(BrowserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\vm\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName(BrowserName);
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			ChromeOptions option = new ChromeOptions();
			option.addArguments("disable-infobars");
			System.setProperty("webdriver.chrome.driver", "D:\\vm\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		return driver;
		
		
	}

}
