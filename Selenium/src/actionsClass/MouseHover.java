package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAS to mouse hover on company tab and click on contact us link and fetch the number under Blor
public class MouseHover {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://www.vtiger.com/");
	WebElement company = d.findElement(By.linkText("Company"));
	Actions a=new Actions(d);
	a.moveToElement(company).perform();
	d.findElement(By.linkText("Contact Us")).click();
String contact = d.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
System.out.println(contact);
d.quit();
}
}
