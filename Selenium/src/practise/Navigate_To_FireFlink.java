package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_To_FireFlink {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://beta.fireflink.com/");
    WebElement emailId = driver.findElement(By.id("emailId"));
    emailId.sendKeys("ambulgi3683@gmail.com");
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("Password@123");
    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
   WebElement fireFlinkPlatform = driver.findElement(By.xpath("//div[@class=\"product_1\"]"));
   fireFlinkPlatform.click();
   Thread.sleep(5000);
   String title = driver.getTitle();
   System.out.println("the title of the landing page is"+title);
   driver.quit();
   
	}

}
