package com.TN1.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TN1.base.TestBase;

public class Loginpage extends TestBase {
	
	

	@FindBy(xpath="//input[@id='email']") WebElement username;
	
	@FindBy(xpath="//input[@id='password']")WebElement password;
	
	@FindBy(xpath="//button[@id='btnLogin']") WebElement Signin;
	
	
	@FindBy(id="login-password-forgotten") WebElement Forgetpassword;
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	

	public void login(String uid, String pass)
	{
		
		System.out.println(" login method entered");
		System.out.println(username);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		username.sendKeys(uid);
		
		password.sendKeys(pass);
		Signin.click();
		
	}
	

}
