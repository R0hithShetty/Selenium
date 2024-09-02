package handlingPopUps;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import zmq.util.Draft;

public class ProgramToCloseSpecificBrowser {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("The partial title is");
	String expectedTitle=scan.nextLine();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.get("https://secure.indeed.com");
    driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
    driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
    Set<String> awid=driver.getWindowHandles();
    for (String wid : awid) {
    	driver.switchTo().window(wid);
    	String actualTitle=driver.getTitle();
    	if(actualTitle.contains(expectedTitle)) {
    		driver.close();
    		
    	}
    		
    	
    	}
		
	}
    
	}


