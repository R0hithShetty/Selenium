package javascriptExecutor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entering_The_Text_Based_On_Enabled_Or_Disabled {


	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("file:///C:/Users/User/Desktop/combOfenabledAndDisabledTextbox.html"); Thread.sleep(2000);
    List<WebElement> allTheTextfield = driver.findElements(By.tagName("input"));
    for (WebElement ele : allTheTextfield) {
    	boolean var = ele.isEnabled();
    	if(var==true){
    		ele.sendKeys("entered the value for the enabled textbox");
    		
    	}
    	else {
    		JavascriptExecutor js=(JavascriptExecutor) driver;
    		String id = ele.getAttribute("id");
    		js.executeScript("document.getElementById('"+id+"').value='values for disbaled textfield'");
    	}
		
	}
    Thread.sleep(3000);
    driver.close();
	}

}
