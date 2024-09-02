package com.actitime.testscript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taking_Screen_Shot {

	public static void main(String[] args) throws IOException {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.swiggy.com");
    TakesScreenshot ts=(TakesScreenshot) driver;
   File src = ts.getScreenshotAs(OutputType.FILE);
   File obj=new File("./screenshot/img1.png");
   FileUtils.copyFile(src, obj);
	}

}
