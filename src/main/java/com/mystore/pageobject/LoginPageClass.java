package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class LoginPageClass extends BaseClass {
	
	
	@FindBy(id = "email") WebElement EmailBox;
	@FindBy(id = "passwd") WebElement PasswordBox;
	@FindBy(id = "SubmitLogin") WebElement signOutBtn;
	@FindBy(id = "email_create") WebElement EmailNewCreateAcct;
	@FindBy(id = "SubmitCreate") WebElement NewAccountBtn;
	
	public LoginPageClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePageClass loginAccount() throws InterruptedException
	{
		EmailBox.sendKeys(prop.getProperty("username"));
		PasswordBox.sendKeys(prop.getProperty("password"));
		signOutBtn.click();
		Thread.sleep(3000);
		return new HomePageClass();
	}
	
	public AccountCreationPage newAccount() {
		
		EmailNewCreateAcct.sendKeys(prop.getProperty("username"));
		NewAccountBtn.click();
		return new AccountCreationPage();
	}
	
	
	
	
	
	
	

}
