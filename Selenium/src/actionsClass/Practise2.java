package actionsClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to drag and drop elements
public class Practise2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	
	WebElement drag1 = driver.findElement(By.xpath("//p[text()='This great script is created by Michel Hiemstra. For more information, visit his ']/..//h1[text()='Block 1']"));
	WebElement drop=driver.findElement(By.xpath("//div[@id=\"block-4\"]"));
	WebElement drag2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
	Actions a=new Actions(driver);
	a.dragAndDrop(drag1, drop).perform();
	Thread.sleep(3000);
	
	a.clickAndHold(drag2).moveToElement(drop).release().build().perform();
	Thread.sleep(3000);
	driver.close();
}
}




