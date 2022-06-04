package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class AddressPageClass extends BaseClass {
	
	

	@FindBy(xpath="//span[text()='Proceed to checkout']")
	
	private WebElement proceedToCheckOut;
	
	public AddressPageClass() {
		PageFactory.initElements(driver, this);
	}

	public ShippingPageClass clickOnCheckOut() throws Throwable {
		proceedToCheckOut.click();
		return new ShippingPageClass();
	}

}
