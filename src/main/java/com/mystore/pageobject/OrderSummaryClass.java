package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class OrderSummaryClass extends BaseClass {
	

	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	private WebElement confirmOrderBtn;
	
	public OrderSummaryClass() {
		PageFactory.initElements(driver, this);
	}

	public OrderConfirmationPageClass clickOnconfirmOrderBtn() {
		confirmOrderBtn.click();
		return new OrderConfirmationPageClass();
	}

}
