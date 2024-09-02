package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Move_To_Particular_Element {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.bbc.com");Thread.sleep(1000);
    WebElement ele = driver.findElement(By.xpath("//h2[text()='Follow BBC on:']"));
     JavascriptExecutor js = (JavascriptExecutor)driver;
     int yaxis = ele.getLocation().getY();
     js.executeScript("window.scrollTo(0,"+yaxis+")");Thread.sleep(3000);
    driver.close();
	}

}
