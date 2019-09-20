package com.fridaymove;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Resources.Base;
import pageObjects.Residential;
import pageObjects.homePage;

public class logoVerify extends Base {
	
	
	@BeforeTest
	public void initialize() throws IOException {
		prop = propertiesFileLoad();
		driver = initiatebrowser(prop);
    	driver = enterWebPage(driver,prop);
		
	}
	
	@Test 
	public void residentialLogo() throws IOException
	{
		
		homePage LP = new homePage(driver);
		Residential Resi = new Residential(driver);
		LP.residential().click();
		assertTrue(Resi.residentiallogo().isDisplayed());
		Log.info("Logo is present in residential page");
		
	}
	
	@Test
	public void HomepageLandingLogo() throws IOException
	{
		
		homePage LP = new homePage(driver);
		System.out.println(LP.Logo().getText());
		assertTrue(LP.Logo().isDisplayed());
		Log.info("Logo is present in home page");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
	
					
	
		
		
	

}
