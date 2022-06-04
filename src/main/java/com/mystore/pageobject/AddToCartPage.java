package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mystore.base.BaseClass;

public class AddToCartPage extends BaseClass {
	
	
	@FindBy(id="quantity_wanted")
	private WebElement quantity;
	
	@FindBy(name="group_1")
	private WebElement size;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//h2/i")
	private WebElement addToCartMessag;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedToCheckOutBtn;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterQuantity(String quantity1)  {
		quantity.sendKeys(quantity1);
	}
	
	public void selectSize() {
		Select slt = new Select(size);
		slt.selectByVisibleText("M");
	}
	
	public void clickOnAddToCart()  {
		addToCartBtn.click();
		}
		
	
	public boolean validateAddtoCart()  {
		
		return addToCartMessag.isDisplayed();
	}
	
	public OrderPageClass clickOnCheckOut() throws Throwable {
		proceedToCheckOutBtn.click();
		return new OrderPageClass();
	}
	
	
	

}
