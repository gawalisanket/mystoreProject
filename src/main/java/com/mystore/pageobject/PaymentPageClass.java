package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class PaymentPageClass extends BaseClass {
	
	@FindBy(xpath = "//a[contains(text(),'Pay by bank wire')]")
	private WebElement bankWireMethod;
	
	@FindBy(xpath = "//a[contains(text(),'Pay by check')]")
	private WebElement payByCheckMethod;
	
	public PaymentPageClass() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderSummaryClass clickOnPaymentMethod() {
		bankWireMethod.click();
		return new OrderSummaryClass();
	}

}
