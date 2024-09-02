package com.swaglabs.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenernsImplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res=result.getName();
		org.testng.Reporter.log(res+"passed", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res = result.getName();
		TakesScreenshot js=(TakesScreenshot) driver;
		File src = js.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+res+".png");
		try {
			FileUtils.copyFile(src,dest );
		} catch (IOException e) {
     			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String res=result.getName();
		org.testng.Reporter.log(res+"skipped", true);
	}
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	

}
