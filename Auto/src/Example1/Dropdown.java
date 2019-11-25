package Example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.spicejet.com");
		
		wd.findElement(By.cssSelector(".paxinfo")).click();
		Thread.sleep(2000);
		for(int i=0;i<5;i++)
		{
		wd.findElement(By.cssSelector("#hrefIncAdt")).click();
		}
		wd.findElement(By.cssSelector("#btnclosepaxoption")).click();
		
		wd.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		wd.findElement(By.linkText("Guwahati (GAU)")).click();
		
		wd.findElement(By.cssSelector("ctl00_mainContent_ddl_destinationStation1_CTXT")).clear();
		wd.findElement(By.xpath("//*[@value='AIP']")).click();
		

	}

}
