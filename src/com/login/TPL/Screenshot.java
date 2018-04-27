package com.login.TPL;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.steadystate.css.util.Output;

import io.appium.java_client.android.AndroidDriver;

public class Screenshot implements ITestListener
{
	
	private static AndroidDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("***** Error "+result.getName()+" test has failed *****");
    	String methodName=result.getName().toString().trim();
    	takeScreenShot(methodName);
    }
    
    public void takeScreenShot(String methodName) {
    	String filepath ="D:\\Sahil_workspace\\autommateTPL\\FailedTestScreen";
      
    	// driver = (AndroidDriver) new Augmenter().augment(driver);
    	
    	WebDriver driver1 = new Augmenter().augment(driver);
    	
    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          
            try {
				FileUtils.copyFile(scrFile, new File(filepath+methodName+".jpg"));
				System.out.println("***Placed screen shot in "+filepath+" ***");
			} catch (IOException e) {
				e.printStackTrace();
			}
    }
		
		
		

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
