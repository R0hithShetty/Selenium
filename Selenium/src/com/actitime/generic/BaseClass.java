package com.actitime.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	 public WebDriver driver;
	 
	 @BeforeClass
	 public void openBrowser() {
		 driver=new ChromeDriver();
		 driver.get("http://localhost/login.do");
		 org.testng.Reporter.log("Browser Opened successfully", true);
		 
	 }@BeforeMethod
	  public void login() {
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 org.testng.Reporter.log("logged in successfully", true);
		 
	 }@AfterMethod
	  public void logout() {
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 org.testng.Reporter.log("logged out  successfully", true);
		 
	 }@AfterClass
	 public void closeBrowser() {
		 driver.quit();
		 org.testng.Reporter.log("Closed Browser", true);
	 }

}
