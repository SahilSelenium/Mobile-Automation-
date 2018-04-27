
package com.TPL.Automate;
import com.login.TPL.*;
import io.appium.java_client.android.AndroidDriver;
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
import org.testng.annotations.Test;



	
	public class TPLCrewApp{

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
			
			//C:\Users\Aezion.Dev10\Downloads\selendAapk\TPLCREW\app-debug.apk
			
			 File app= new File("C:\\Users\\Aezion.Dev10\\Downloads\\selendAapk\\TPLCREW\\app-debug.apk");
			 DesiredCapabilities capabilities = new DesiredCapabilities();
			 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			 capabilities.setCapability("deviceName", "ASUS_Z00LD");
			 capabilities.setCapability("platformVersion", "6.0.1");
			 
			 capabilities.setCapability("platformName", "Android");
			 
			 capabilities.setCapability("appPackage", "com.example.aezion.tplcrew");
			 
	         capabilities.setCapability("appActivity", "com.example.aezion.tplcrew.SplashActivity");
			 
			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			 
			 capabilities.setCapability("app", app.getAbsolutePath());

			 driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			 

			}
		
		@BeforeMethod
		
		public void Login() throws InterruptedException
		{                                    //classname                //contentDesc
			 driver.findElement(By.id("com.example.aezion.tplcrew:id/usernamee")).sendKeys("chris.kambala@aezion.com");
		     Thread.sleep(2000);
			 driver.findElement(By.id("com.example.aezion.tplcrew:id/passe")).sendKeys("dallaslights1");
			
			 driver.findElement(By.id("com.example.aezion.tplcrew:id/log")).click();
             Thread.sleep(4000);
			
		}
		
	
	
@Test(priority=1)
		
		public void Appointments() throws InterruptedException
		{                                    
			
	driver.findElement(By.id("com.example.aezion.tplcrew:id/yes")).click();
		Thread.sleep(2000);
	driver.findElement(By.id("com.example.aezion.tplcrew:id/title1")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	

	
	
	
	
	
	driver.findElement(By.id("com.example.aezion.tplcrew:id/tod")).click();
	Thread.sleep(2000);
	
	
	 
		
    driver.findElement(By.id("com.example.aezion.tplcrew:id/title1")).click();
    Thread.sleep(2000);
    driver.navigate().back();
    
    
    
    
    
    
    
    driver.findElement(By.id("com.example.aezion.tplcrew:id/Tomorrow")).click();
	Thread.sleep(2000);
    driver.findElement(By.id("com.example.aezion.tplcrew:id/title1")).click();
    Thread.sleep(2000);
    driver.navigate().back();
	
    
		}
@Test(priority=2)




public void Transfercheckinother() throws InterruptedException
{ 
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Transfers']")).click();	
	
	Thread.sleep(2000);
	driver.findElement(By.id("com.example.aezion.tplcrew:id/others")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.id("com.example.aezion.tplcrew:id/status")).click();
	
	driver.navigate().back();
	
}






 @Test(priority=3)

public void TransferSend() throws InterruptedException
{ 
	
		
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Transfers']")).click();
	driver.findElement(By.id("com.example.aezion.tplcrew:id/fab1")).click();
	
	
	driver.findElement(By.id("com.example.aezion.tplcrew:id/spnr")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Crew - Warehouse']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Select']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='North Dallas']")).click();
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Select']")).click();
	
	for(int i=1;i<=2;i++){
		
	driver.findElement(By.id("com.example.aezion.tplcrew:id/transferAddBtn")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("com.example.aezion.tplcrew:id/transferProductName")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Facia LED - 3']")).click();
	
	
	
	
	driver.findElement(By.id("com.example.aezion.tplcrew:id/transferQty")).click();
	
	driver.findElement(By.id("com.example.aezion.tplcrew:id/transferQty")).sendKeys("2");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Select']")).click();
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Yellow']")).click();
	
	

	driver.findElement(By.id("com.example.aezion.tplcrew:id/transferAdd")).click();
	
	
}	
	driver.findElement(By.id("com.example.aezion.tplcrew:id/note")).sendKeys("Notes for sending or recieving  Material Transfer");
	driver.navigate().back();
	Thread.sleep(3000);
	driver.findElement(By.id("com.example.aezion.tplcrew:id/action_setting")).click();
}
	
 
 
 
 
 
@Test(priority=4)


public void TransferRecieve() throws InterruptedException
{ 
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Transfers']")).click();
	driver.findElement(By.id("com.example.aezion.tplcrew:id/fab1")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("com.example.aezion.tplcrew:id/others")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("com.example.aezion.tplcrew:id/spnr")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Crew - Warehouse']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Select']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='North Dallas']")).click();
	
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Select']")).click();
	
	driver.findElement(By.id("com.example.aezion.tplcrew:id/transferAddBtn")).click();
	
	
	Thread.sleep(3000);
    driver.findElement(By.id("com.example.aezion.tplcrew:id/transferProductName")).click();
	

	Thread.sleep(3000);
    driver.findElement(By.xpath("//android.widget.TextView[@text='Facia LED - 3']")).click();
	
	
	
	
    driver.findElement(By.id("com.example.aezion.tplcrew:id/transferQty")).click();
	
    driver.findElement(By.id("com.example.aezion.tplcrew:id/transferQty")).sendKeys("2");
	
	Thread.sleep(2000);
	
    driver.findElement(By.xpath("//android.widget.TextView[@text='Select']")).click();
	
    driver.findElement(By.xpath("//android.widget.TextView[@text='Yellow']")).click();
	
	

    driver.findElement(By.id("com.example.aezion.tplcrew:id/transferAdd")).click();

    driver.findElement(By.id("com.example.aezion.tplcrew:id/action_setting")).clear();
	
	
    driver.navigate().back();
	
}
	
	
	
		@AfterMethod
		public void configAfterMtd(){
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//android.widget.TextView[@text='Profile']")).click();
		//driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
		driver.findElement(By.id("com.example.aezion.tplcrew:id/singout")).click();
			
		
		
		
		driver.quit();
		
		}
				
		
		
		
//		
//		@AfterClass
//		
//			public void configAfterclass(){
//			
//	
//				}
	}