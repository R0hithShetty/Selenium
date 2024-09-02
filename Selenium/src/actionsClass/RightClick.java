package actionsClass;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		WebElement forgotPassword = driver.findElement(By.xpath("//span[text()='Forgot password?']"));
		Actions a=new Actions(driver);
		a.contextClick(forgotPassword).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(3000);
		
		//driver.close();
		
	}
	
	

}
