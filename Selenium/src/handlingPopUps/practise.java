package handlingPopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://secure.indeed.com");
	     String	parentTitle=driver.getTitle();
	     driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
	     driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	    Set<String> awid= driver.getWindowHandles();
	    for (String wid : awid) {
	    	driver.switchTo().window(wid);
	    	String allTitle=driver.getTitle();
	    	if(!allTitle.contains(parentTitle)) {
	    		driver.close();
	    	}
			
		}

	}

}
