package com.mysotre.testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.mystore.base.BaseClass;
import com.mystore.pageobject.IndexPageClass;

public class IndexPageTestClass extends BaseClass {
	
	IndexPageClass indexPage;
	
	@BeforeMethod
	public void setup() {
		launchApp(); 
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verifyLogo() throws Throwable {
		
		indexPage= new IndexPageClass();
		boolean result=indexPage.validateLogo();
		Assert.assertTrue(result);
		
	}
	
	@Test
	public void verifyTitle() {
		
		String actTitle=indexPage.getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Store1");
	
	}

}
