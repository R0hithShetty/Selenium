package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandlingScrollBar {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	WebElement link = d.findElement(By.linkText("Sign Up"));
	Actions a=new Actions(d);Thread.sleep(2000);
//scrollByAmount(x,y) will scroll the webPage based on the mentioned pixels
	a.scrollByAmount(0, 200).perform();
//scrollToElement(ele) will scroll the webPage until webElement is visible
	a.scrollToElement(link).perform();
	d.close();
	
}
}
