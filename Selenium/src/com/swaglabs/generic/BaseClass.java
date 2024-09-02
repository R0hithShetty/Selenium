package com.swaglabs.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.swaglabs.pom.HomePage;
import com.swaglabs.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	FileLib1 f=new FileLib1();
	
	
	
	@BeforeTest
	public void OpenBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.getDataFromProperties("url");
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		LoginPage p=new LoginPage(driver);
		String un = f.getDataFromProperties("username");
		String pwd = f.getDataFromProperties("password");
		p.setLogin(un, pwd);
		
	}
	
	@AfterMethod
	
	public void logout() {
		HomePage h=new HomePage(driver);
		h.gethamberger().click();
		h.getlogout().click();
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
