package com.swaglabs.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class HomePage {
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	@FindBy(linkText ="1")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//button[text()='Checkout']")
	private WebElement checkoutButton;
	
	@FindBy(id = "first-name")
	private WebElement firstNametxtbx;
	
	@FindBy(id = "last-name")
	private WebElement lastNametxtbx;
	
	@FindBy(id = "postal-code")
	private WebElement postalCode;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	@FindBy(xpath = "//button[text()='Finish']")
	private WebElement finishButton;
	
	@FindBy(id = "back-to-products")
	private WebElement backToProducts;
	
	@FindBy(xpath = "//button[@id=\"react-burger-menu-btn\"]")
	private WebElement hamberger;
	
	@FindBy(xpath="//a[@id=\"logout_sidebar_link\"]")
	private WebElement logout;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public WebElement getaddToCart() {
		return addToCart;
	}
	
	public WebElement getcartIcon() {
		return cartIcon;
	}
	
	public WebElement getcheckoutButton() {
		return checkoutButton;
	}
	
	public WebElement getfirstNametxtbx() {
		return firstNametxtbx;
	}
	
	public WebElement getlastNametxtbx() {
		return lastNametxtbx;
	}
	
	public WebElement getpostalCode() {
		return postalCode;
	}
	
	public WebElement getcontinueButton() {
		return continueButton;
	}
	
	public WebElement getfinishButton() {
		return finishButton;
	}
	
	public WebElement getbackToProducts() {
		return backToProducts;
	}
	
	public WebElement gethamberger() {
		return hamberger;
	}
	
	public WebElement getlogout() {
		return logout;
	}
	
	
	
	
	
	
	
	
}