package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class AccountCreationPage extends BaseClass {
	
	
	@FindBy(xpath = "//h1[text()='Create an account']") WebElement createAccountTitle;
	
	
	public AccountCreationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateCreateAccountPageTitle() 
	{
		 return createAccountTitle.getText(); 
	}
	
	
	
	
	

}
