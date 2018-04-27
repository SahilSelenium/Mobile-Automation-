package com.login.TPL;

import java.io.File;
 
import java.net.MalformedURLException;
 
import java.net.URL;
 
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
 
import org.openqa.selenium.remote.CapabilityType;
 
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
 
public class Login {
 
public static AndroidDriver driver;
 
@Test
public void LaunchAPP() throws MalformedURLException, InterruptedException 
{
 	File app= new File("C:\\Users\\Aezion.Dev10\\Downloads\\selendAapk\\adebug.apk");
DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
 capabilities.setCapability("deviceName", "ASUS_Z00LD");
capabilities.setCapability("platformVersion", "6.0.1");
 
 capabilities.setCapability("platformName", "Android");
 
capabilities.setCapability("appPackage", "com.example.aezion.tpl");
 
capabilities.setCapability("appActivity", "com.example.aezion.tpl.SplashActivity");
 
driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 
 capabilities.setCapability("app", app.getAbsolutePath());

 driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
 

 driver.findElement(By.id("com.example.aezion.tpl:id/username")).sendKeys("chris.kambala@aezion.com");
 driver.findElement(By.id("com.example.aezion.tpl:id/pass")).sendKeys("test");
 driver.findElement(By.id("com.example.aezion.tpl:id/signin")).click();
} 
}
