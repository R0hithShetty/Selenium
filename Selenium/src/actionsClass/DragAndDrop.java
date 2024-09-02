package actionsClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to drag and drop elements
public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement drag1 = d.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement drag2 = d.findElement(By.xpath("//h1[text()='Block 2']"));
	WebElement drop = d.findElement(By.id("column-3"));
	Actions a=new Actions(d);
	a.dragAndDrop(drag1, drop).perform();
	Thread.sleep(2000);
//whenever we perform composite actions we can make use of build() which returns Action type obj
	a.clickAndHold(drag2).pause(2000).moveToElement(drop).release().build().perform();
}
}




