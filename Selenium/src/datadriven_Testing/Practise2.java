package datadriven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise2 {

	public static void main(String[] args) throws IOException, InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    FileInputStream fis=new FileInputStream("./data/commondata.properties");
    Properties p=new Properties();
    p.load(fis);
    
   String url = p.getProperty("url2");
    driver.get(url);
    
    FileInputStream fis1=new FileInputStream("./data/credentials.xlsx");
    Workbook wb = WorkbookFactory.create(fis1);
    int count = wb.getSheet("Sheet1").getLastRowNum();
    
    for(int i=0;i<=count;i++) {
    	String un = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
    	String pwd = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
    	
    	WebElement emailtextfield = driver.findElement(By.id("emailId"));
    	
    	emailtextfield.sendKeys(un);
    	emailtextfield.clear();
    	WebElement passTextfield = driver.findElement(By.name("password"));
    	
    	passTextfield.sendKeys(pwd);
    	emailtextfield.clear();
    	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    	driver.findElement(By.xpath("//button[@id=\"rcc-confirm-button\"]")).click();
    	
    	boolean isNotDisplayed = false;
    	try {
    		WebElement errorMessage = driver.findElement(By.xpath("//span[text()='Email or Password is invalid, please try again']"));
    		isNotDisplayed = !errorMessage.isDisplayed();
    	} catch (NoSuchElementException noSuchElementException) {
    		isNotDisplayed = true;	
    	}
    	
    	if(isNotDisplayed) {
    		driver.findElement(By.xpath("//div[@class=\"product_1\"]")).click();
    		List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
    		if (windowHandles.size() > 1) {
    			driver.switchTo().window(windowHandles.get(0));
    		}
    		Thread.sleep(5000);
//    		driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1bwrc3q\"]")).click();
    		driver.findElement(By.xpath("//button[@aria-label=\"User Profile\"]")).click();
    		driver.findElement(By.xpath("//li[text()='Sign out']")).click();
    		wb.getSheet("Sheet1").getRow(i).getCell(2).setCellValue("ValidCredentials");
    	}
    		else{
    		     wb.getSheet("Sheet1").getRow(i).getCell(2).setCellValue("InvalidCredentials");
    		}
    		
    	}
          FileOutputStream fos=new FileOutputStream("./data/credentials.xlsx");
          wb.write(fos);
    	
    }
}
