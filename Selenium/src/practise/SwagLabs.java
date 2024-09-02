package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://www.saucedemo.com/");
     driver.findElement(By.id("user-name")).sendKeys("standard_user");
     driver.findElement(By.id("password")).sendKeys("secret_sauce");
     driver.findElement(By.id("login-button")).click();
     
     driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
     driver.findElement(By.linkText("1")).click();
     driver.findElement(By.xpath("//button[text()='Checkout']")).click();
     driver.findElement(By.id("first-name")).sendKeys("rohith");
     driver.findElement(By.id("last-name")).sendKeys("m");
     driver.findElement(By.id("postal-code")).sendKeys("560086");
     driver.findElement(By.id("continue")).click();
     driver.findElement(By.xpath("//button[text()='Finish']")).click();
     driver.findElement(By.id("back-to-products")).click();
     
     driver.findElement(By.id("react-burger-menu-btn")).click();
     driver.findElement(By.id("logout_sidebar_link")).click();
     driver.close();
	}

}
