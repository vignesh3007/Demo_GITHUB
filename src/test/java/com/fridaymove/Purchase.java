package com.fridaymove;
import Resources.Base;

import junit.framework.Assert;
import pageObjects.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




/**
 * This Test verifies purchase functionality via all the forms mentioned in the Home Page
 *
 */
public class Purchase extends Base
{
    public static WebDriver driver;
    public static String name;
    public static String number;
    public static String email;
    public static String price;
    public static String pcode;
    public static Logger Log = LogManager.getLogger(Purchase.class.getName());
    
	@BeforeTest
    public void initialise() throws IOException
    {
    	prop = propertiesFileLoad();
		driver = initiatebrowser(prop);
    	driver = enterWebPage(driver,prop);
    	price=prop.getProperty("price");
    	pcode=prop.getProperty("pcode");
    	name=prop.getProperty("name");
    	number=prop.getProperty("number");
    	email=prop.getProperty("email");
    	Log.info("All the global variables is initialised and the browser is opened with the correct URL");
    	   	
    }
	
	
	@Test
	public void purchaseResidential()  
    {
    	homePage hp = new homePage(driver);
    	Residential res = new Residential(driver);
    	
    	hp.residential().click();
    	res.purchase().click();
    	res.yes_P2().click();
    	res.yes_P3().click();
    	res.yes_P4().click();
    	res.freehold().click();
    	
    	res.price().sendKeys(price);
    	res.next().click();
    	res.postCode().sendKeys(pcode);
    	res.next_PC().click();
    	res.pName().sendKeys(name);
    	res.pNumber().sendKeys(number);
    	res.email().sendKeys(email);
    	Log.info("Purchase option is successfully completed");
    }
	
	@Test
	public void purchseresidence_mainmenu() 
	{
		homePage hp = new homePage(driver);
    	Residential res = new Residential(driver);
    	hp.home().click();
    	hp.residentialConveyance().click();
    	res.purchase().click();
    	res.yes_P2().click();
    	res.yes_P3().click();
    	res.yes_P4().click();
    	res.freehold().click();
    	res.price().sendKeys(price);
    	res.next().click();
    	res.postCode().sendKeys(pcode);
    	res.next_PC().click();
    	res.pName().sendKeys(name);
    	res.pNumber().sendKeys(number);
    	res.email().sendKeys(email);
    	Log.info("Purchase option from main menu is successfully completed");
	}
	
	@Test
	public void purchseresidence_button()  
	{
		homePage hp = new homePage(driver);
    	Residential res = new Residential(driver);
    	hp.home().click();
    	hp.conveyancingButton().click();
    	res.purchase().click();
    	res.yes_P2().click();
    	res.yes_P3().click();
    	res.yes_P4().click();
    	res.freehold().click();
    	res.price().sendKeys(price);
    	res.next().click();
    	res.postCode().sendKeys(pcode);
    	res.next_PC().click();
    	res.pName().sendKeys(name);
    	res.pNumber().sendKeys(number);
    	res.email().sendKeys(email);
    	Log.info("residential button is successfully validated");
	}
	@Test
	public void purchseresidence_quote() 
	{
		homePage hp = new homePage(driver);
    	Residential res = new Residential(driver);
    	hp.home().click();
    	hp.conveyancingLink().click();
    	res.purchase().click();
    	res.yes_P2().click();
    	res.yes_P3().click();
    	res.yes_P4().click();
    	res.freehold().click();
    	res.price().sendKeys(price);
    	res.next().click();
    	res.postCode().sendKeys(pcode);
    	res.next_PC().click();
    	res.pName().sendKeys(name);
    	res.pNumber().sendKeys(number);
    	res.email().sendKeys(email);
    	Log.info("Get quote option is successfully working");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
