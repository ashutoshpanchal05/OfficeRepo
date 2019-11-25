package com.TN1.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			prop.load(ip);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void initialisation()
	{
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName(browsername);
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("disable-infobars");
			System.setProperty("webdriver.chrome.driver", "D:\\vm\\chromedriver.exe");
			driver = new ChromeDriver(option);
		}
		else if (browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\vm\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		String url = prop.getProperty("url");
		driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        
         driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

	}
	
//	@BeforeTest
//	public void initialSetup()
//	{
////		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/Texas.html");
////		extent = new ExtentReports();
////		extent.attachReporter(reporter);
//		
//	}
//	@AfterTest
//	public void extentflush()
//	{
////		extent.flush();
//	}
//	public static String getScreenshot(WebDriver driver, String methodname) throws Exception
//	{
//		// Create object of SimpleDateFormat class and decide the format
//		 DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
//		 
//		 //get current date time with Date()
//		 Date date = new Date();
//		 
//		// Now format the date
//		 String todaydate= dateFormat.format(date);
//		 
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		//after execution, you could see a folder "FailedTestsScreenshots" under src folder
//		String destination = System.getProperty("user.dir") + "/ScreenShots/"+methodname+"_"+ todaydate+".png";
//		File finalDestination = new File(destination);
//		//FileUtils.copyFile(source, finalDestination);
//		//Returns the captured file path
//		return destination;
//	}
////	public static void pass()
////	{
////		Reporter.log("Test Case Passed");
////		//test.log(Status.PASS, "Test Case Passed");
////
////	}
////	public static void fail(String methodname)
////	{
////		
////		try {
////			getScreenshot(driver,methodname);
////			//test.log(Status.FAIL, "Test Case Failed");
////		} catch (Exception e1) {
////			// TODO Auto-generated catch block
////			e1.printStackTrace();
////		}
////		
////	}



}
