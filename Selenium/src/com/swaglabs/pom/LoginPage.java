package com.swaglabs.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="user-name")
	private WebElement usernameTextbox;
	
	@FindBy(id="password")
	private WebElement passwordTextbox;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un, String pwd) {
		usernameTextbox.sendKeys(un);
		passwordTextbox.sendKeys(pwd);
		loginButton.click();
		
		
	}

}
