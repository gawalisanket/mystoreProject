package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class SearchResultPage extends BaseClass {
	
	
	@FindBy(xpath = "//*[@id=\"center_column\"]//img") WebElement tShirtProduct;
	
	
	public SearchResultPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateProduct() 
	{
	return	tShirtProduct.isDisplayed();
	}
	 
	public AddToCartPage verifyNevigation()
	{
		tShirtProduct.click();
		return new AddToCartPage();
	}
	
	
	
	
	
	
	

}
