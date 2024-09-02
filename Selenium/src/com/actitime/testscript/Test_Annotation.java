package com.actitime.testscript;

import static org.testng.Assert.fail;

import org.dataloader.impl.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class Test_Annotation {

	@Test
	public void methodA() {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("google is opened");
		
		driver.close();
	}
	
	@Test
	public void methodB() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.swiggy.com");
		System.out.println("swiggy is opened");
		driver.close();
		
	}
	
	@Test(dependsOnMethods ={"methodB","methodA"})
	public void methodC() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.zomato.com");
		System.out.println("zomato is opened");
		driver.close();
		
	}
	
	
	
	
	
}
