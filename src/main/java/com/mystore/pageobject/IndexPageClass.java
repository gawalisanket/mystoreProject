package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class IndexPageClass extends BaseClass {
	
	
	
	@FindBy(xpath = "//a[@class='login']")  WebElement signInBtn;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']") WebElement myStoreLogo;
	
	@FindBy(id="search_query_top") WebElement searchProductBox;
	
	@FindBy(name="submit_search") WebElement searchButton;
	
	public IndexPageClass() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPageClass clickOnSignIn() throws Throwable {
		signInBtn.click();
		return new LoginPageClass();
	}
	
	public boolean validateLogo() throws Throwable {
		return myStoreLogo.isDisplayed();
	}
	
	public String getMyStoreTitle() {
		String myStoreTitel=driver.getTitle();
		return myStoreTitel;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
