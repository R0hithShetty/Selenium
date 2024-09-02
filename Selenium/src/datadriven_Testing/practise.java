package datadriven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Write;

public class practise {

	public static void main(String[] args) throws IOException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    FileInputStream fis=new FileInputStream("./data/commondata.properties");
    Properties p=new Properties();
    p.load(fis);
    String url = p.getProperty("url");
    
    driver.get(url);
    
    FileInputStream fis2=new FileInputStream("./data/testscript.xlsx");
    Workbook wb = WorkbookFactory.create(fis2);
    int count = wb.getSheet("Sheet1").getLastRowNum();
    System.out.println(count);
    
    for(int i=0;i<=count;i++) {
    	
    	String un = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
    	String pwd = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
    	
    	   driver.findElement(By.id("username")).sendKeys(un);
	       driver.findElement(By.name("pwd")).sendKeys(pwd);
	       driver.findElement(By.xpath("//div[text()='Login ']")).click();
	       
	       try {
	    	   driver.findElement(By.linkText("Logout")).click();
	    	   wb.getSheet("Sheet1").getRow(i).getCell(2).setCellValue("pass");
	       } catch(NoSuchElementException e) {
	    	   
	    	   wb.getSheet("Sheet1").getRow(i).getCell(2).setCellValue("fail");
	    	   
	       }
	      
    	
    }
       FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
       wb.write(fos);
    
    driver.close();
	}

}
