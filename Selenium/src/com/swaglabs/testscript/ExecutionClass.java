package com.swaglabs.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.swaglabs.generic.FileLib1;
import com.swaglabs.pom.LoginPage;

public class ExecutionClass {

	public static void main(String[] args) throws IOException {
		   WebDriver driver=new ChromeDriver();
		   FileInputStream fis=new FileInputStream("./data/commondataswaglabs.properties");
			Properties p=new Properties();
			p.load(fis);
			String un = p.getProperty("username");
			String pwd = p.getProperty("password");
			String url = p.getProperty("url");
			String fn = p.getProperty("firstname");
			String ln = p.getProperty("lastname");
			String pincode = p.getProperty("pincode");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		     driver.get(url);
		     LoginPage obj =new LoginPage(driver);
		     obj.setLogin(un, pwd);
//		     driver.findElement(By.id("user-name")).sendKeys(un);
//		     driver.findElement(By.id("password")).sendKeys(pwd);
//		     driver.findElement(By.id("login-button")).click();
		     
		     driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		     driver.findElement(By.linkText("1")).click();
		     driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		     driver.findElement(By.id("first-name")).sendKeys(fn);
		     driver.findElement(By.id("last-name")).sendKeys(ln);
		     driver.findElement(By.id("postal-code")).sendKeys(pincode);
		     driver.findElement(By.id("continue")).click();
		     driver.findElement(By.xpath("//button[text()='Finish']")).click();
		     driver.findElement(By.id("back-to-products")).click();
		     
		     driver.findElement(By.id("react-burger-menu-btn")).click();
		     driver.findElement(By.id("logout_sidebar_link")).click();
		     driver.close();
	}

}
