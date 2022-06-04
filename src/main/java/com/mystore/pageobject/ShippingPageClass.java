package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class ShippingPageClass extends BaseClass{
	
	
	@FindBy(id="cgv")
	 WebElement terms;
	
	@FindBy(xpath="//button/span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedToCheckOutBtn;
	
	public ShippingPageClass() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkTheTerms() {
		terms.click();
	}
	
	public PaymentPageClass clickOnProceedToCheckOut() throws Throwable {
		proceedToCheckOutBtn.click();
		return new PaymentPageClass();
	}
	
	

}
