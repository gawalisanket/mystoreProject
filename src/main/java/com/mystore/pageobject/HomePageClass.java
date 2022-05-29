package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class HomePageClass extends BaseClass
{
	
	
	@FindBy(xpath = "//span[text()='My wishlists']") WebElement wishListTab;
	@FindBy(xpath = "//span[text()='Order history and details']") WebElement orderHistory;



public HomePageClass() 
{
	
	PageFactory.initElements(driver, this);	
}

public boolean validateMyWishlist() {
	return wishListTab.isDisplayed();
}

public boolean validateorderHistory() {
	return orderHistory.isDisplayed();
}


}