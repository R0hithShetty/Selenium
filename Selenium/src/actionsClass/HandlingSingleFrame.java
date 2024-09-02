package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSingleFrame {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("C:/Users/QSP/Desktop/T1.html");
	d.findElement(By.id("t1")).sendKeys("1");
//frame(String Id/name)will transfer the control to frame with the specified id/name att in <iframe> tag
	d.switchTo().frame("f1");
	d.findElement(By.id("t2")).sendKeys("2");
	//frame(int Index) will transfer the control to frame with the respective index in the current HTML
	d.switchTo().frame(0);
	d.findElement(By.id("t3")).sendKeys("3");
	//parentFrame() is used to transfer the control from current frame to previous frame
	d.switchTo().parentFrame();
	d.findElement(By.id("t2")).sendKeys("4");
	WebElement frameElement = d.findElement(By.id("f2"));
	//frame(WebEle ele)will transfer the control to frame with the element "address of <iframe> tag"
	d.switchTo().frame(frameElement);
	d.findElement(By.id("t3")).sendKeys("5");
	//defaultContent() will transfer the control to the main browser webpage
	d.switchTo().defaultContent();
	d.findElement(By.id("t1")).sendKeys("6");
}
}