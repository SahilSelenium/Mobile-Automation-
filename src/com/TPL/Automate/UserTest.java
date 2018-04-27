//CBL HYBRID APP !!!!!!!!!!!!!!!!!!!!!!!!!!!!

package com.TPL.Automate;
import com.login.TPL.*;

import io.appium.java_client.android.AndroidDriver;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



	@Listeners(com.login.TPL.Screenshot.class)
	public class UserTest {

	    WebDriver driver;
		Login loginPage;
		LoginCode LC;
		@BeforeClass
		public void configBeforeclass(){
			
			//loginPage = PageFactory.initElements(driver, Login.class);
		}
		
		@BeforeMethod
		public void LaunchAPP() throws MalformedURLException, InterruptedException 
			{
			
			
			
			 	File app= new File("C:\\Users\\Aezion.Dev10\\Downloads\\selendAapk\\CBL\\android-debug.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			 capabilities.setCapability("deviceName", "ASUS_Z00LD");
			capabilities.setCapability("platformVersion", "6.0.1");
			 
			 capabilities.setCapability("platformName", "Android");
			 
			capabilities.setCapability("appPackage", "com.ionicframework.cbl585813");
			 
	capabilities.setCapability("appActivity", "com.ionicframework.cbl585813.MainActivity");
			 
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			 
			 capabilities.setCapability("app", app.getAbsolutePath());

			 driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			 

			}
		
		@Test(priority=1)
		
		public void BuisnessDirectory()
		{                                    //classname                      //contentDesc
			driver.findElement(By.xpath("//android.widget.Button[@content-desc ='CrossBusiness Directory']")).click();
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			driver.findElement(By.xpath("//android.view.View[@content-desc ='Christian Bizlinks']")).click();
			driver.findElement(By.xpath("//android.view.View[@content-desc ='Online Marketing Company']")).click();
			
			String a ="t";
			String v ="b";
			
			assertEquals(a, v);
             
			
		}
		
		
@Test(priority=2)
		
		public void BuisnessSearch()
		{                                    //classname                      //contentDesc
			driver.findElement(By.xpath("//android.widget.Button[@content-desc ='CrossBusiness Directory']")).click();
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			
			driver.findElement(By.className("android.widget.EditText")).sendKeys("Zion AG");
		
			String a ="t";
			String v ="b";
			
			assertEquals(a, v);
             
		
		}
		
@Test(priority=3)
		
		public void upcomingEventSearch()
		{      
	driver.findElement(By.xpath("//android.widget.Button[@content-desc ='CrossUpcoming Events']")).click();
	
	driver.findElement(By.className("android.widget.EditText")).sendKeys("Cdsf");
	
	String a ="t";
	String v ="b";
	
	assertEquals(a, v);
     
		}
		
		
		
@Test(priority=4)
		
		public void upcomingEvents()
		{      
	driver.findElement(By.xpath("//android.widget.Button[@content-desc ='CrossUpcoming Events']")).click();
	
	driver.findElement(By.xpath("//android.view.View[@content-desc ='Meeting']")).click();
	String a ="t";
	String v ="b";
	
	assertEquals(a, v);
     
	
		}
		
		
@Test(priority=5)
		
		public void JObBoardSearch()
		{      
	driver.findElement(By.xpath("//android.widget.Button[@content-desc ='CrossJob Board']")).click();
	
	driver.findElement(By.className("android.widget.EditText")).sendKeys("Networking Job");
	String a ="t";
	String v ="b";
	
	assertEquals(a, v);
     
	
		}
		
		
		
@Test(priority=6)
		
		public void JobboardCheck()
		{      
	driver.findElement(By.xpath("//android.widget.Button[@content-desc ='CrossJob Board']")).click();
	
	driver.findElement(By.xpath("//android.view.View[@content-desc ='Networking Job']")).click();
	
     
		}

@Test(priority=7)

public void Applyjob()
{      
driver.findElement(By.className("android.widget.Button")).click();


}

@Test(priority=8)

public void FacebookTwitterIntegration()
{      
driver.findElement(By.className("android.widget.Button")).click();


}

@Test(priority=9)

public void Share()
{      
driver.findElement(By.className("android.widget.Button")).click();


}
@AfterMethod()

public void close()
{
	driver.quit();
}

	
		}
		
		
			
