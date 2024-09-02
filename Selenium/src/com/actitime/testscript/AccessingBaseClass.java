package com.actitime.testscript;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class AccessingBaseClass extends BaseClass {
	
	@Test
	public void one() {
		BaseClass var=new BaseClass();
		var.openBrowser();
		var.login();
		var.logout();
		var.closeBrowser();
	}
	
	

}
