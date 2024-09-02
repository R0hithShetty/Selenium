package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {
	
	public static void main(String[] args) throws InterruptedException {
	
	    
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demoqa.com/buttons");
	    WebElement emailId = driver.findElement(By.id("doubleClickBtn"));
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript(("""
	    	    var overlay = document.createElement('div');
	    	    overlay.id = 'overlay';
	    	    overlay.style.position = 'absolute';
	    	    overlay.style.top = '0';
	    	    overlay.style.left = '0';
	    	    overlay.style.width = '100%';
	    	    overlay.style.height = '100%';
	    	    overlay.style.background = 'rgba(0, 0, 0, 0.5)';
	    	    overlay.style.zIndex = '9999';
	    	    document.body.appendChild(overlay);
	    	    """));
	    emailId.click();
	    driver.quit();
	    
	
	    
}}
