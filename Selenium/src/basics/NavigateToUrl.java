package basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateToUrl {

	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
     WebDriver d= new ChromeDriver(options);
     d.manage().window().maximize();
     d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     d.get("https://pib.gov.in/indexd.aspx");
      Alert a = d.switchTo().alert();
      a.accept();
     d.findElement(By.linkText("Ministry of Defence")).click();
   // d.quit();
    
	}

}
