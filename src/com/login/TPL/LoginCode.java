package com.login.TPL;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LoginCode extends Login {

	
	
	public static AndroidDriver driver;
		@FindBy(id="Email")
		public WebElement usreNAmEdt;
		
		@FindBy(id="Password")
		public WebElement pswEdt;
		
		@FindBy(xpath ="//input[@class='btn btn-primary']")
		public WebElement loginBtn;
		
		@Test
		public void loginToTPL() throws MalformedURLException, InterruptedException{
		
			Login lo  =new Login();
			lo.LaunchAPP();
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			usreNAmEdt.sendKeys(Constant.userNAme);
			pswEdt.sendKeys(Constant.password);
			loginBtn.click();		
			
		}}
		
	