package com.swaglabs.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.swaglabs.generic.BaseClass;
import com.swaglabs.generic.FileLib1;
import com.swaglabs.pom.HomePage;
import com.swaglabs.pom.LoginPage;
@Listeners(com.swaglabs.generic.ListenernsImplementation.class)

public class MainExecutionClass extends BaseClass {
	@Test
	public void crud() throws IOException {
    HomePage h=new HomePage(driver);
    h.getaddToCart().click();
    h.getcartIcon().click();
    h.getcheckoutButton().click();
    
    FileLib1 f=new FileLib1();
    String fn = f.getDataFromProperties("firstname");
    String ln = f.getDataFromProperties("lastname");
    String pin = f.getDataFromProperties("pincode");
    
   
   h.getfirstNametxtbx().sendKeys(fn);
   h.getlastNametxtbx().sendKeys(ln);
   h.getpostalCode().sendKeys(pin);
   h.getcontinueButton().click();
   h.getfinishButton().click();
   h.getbackToProducts().click();
		
		
		
		
	}
	
	

}
