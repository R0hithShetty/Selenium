package javascriptExecutor;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entering_Values_In_DisabledArea {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("file:///C:/Users/User/Desktop/disabledbox.html");
     WebElement firstTextfield = driver.findElement(By.id("t1"));
     WebElement secondTextfield = driver.findElement(By.id("t2"));
     firstTextfield.sendKeys("successfully entered the name");
     JavascriptExecutor js=(JavascriptExecutor) driver;
     js.executeScript("document.getElementById('t2').value='entered the value in disbaled textfield'");Thread.sleep(2000); // entering the values.
    
     js.executeScript("document.getElementById('t2').value=' '");// clearing the values in the textfield
     Thread.sleep(2000);
     driver.close();
	}

}
