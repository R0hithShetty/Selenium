package handlingPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class HandlingClildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://secure.indeed.com");
    driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
    driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
    Set<String> allWid = driver.getWindowHandles();
    for (String wid : allWid) {
    	driver.switchTo().window(wid);
    	Thread.sleep(2000);
    	driver.close();
		
	}
    
    
    
    
	}

}
