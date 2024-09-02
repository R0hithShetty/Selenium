package handlingPopUps;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClosingOnlyParent {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    driver.get("https://secure.indeed.com");
	    driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
	    driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	  String Title  = driver.getTitle();
	 Set<String> allWid=driver.getWindowHandles();
	  for (String wid : allWid) {
		  driver.switchTo().window(wid);
	    	String actualTitle=driver.getTitle();

		if(actualTitle.contains(Title))
		{
			driver.close();
		}
	}
	}
}