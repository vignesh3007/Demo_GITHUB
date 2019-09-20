package com.fridaymove;

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

//import com.sun.tools.sjavac.Log;

import Resources.Base;
import pageObjects.homePage;

public class CallbackFunctionality extends Base {
	
	
	
	@BeforeTest
	public void initialize() throws IOException {
		prop = propertiesFileLoad();
		Log.debug("Properties File loaded");
		driver = initiatebrowser(prop);
		Log.debug("Browser initated");
    	driver = enterWebPage(driver,prop);
    	Log.info("URL successfully entered");
    	Log.info("Add this info for GIT purposes");
	}
	
	@Test (dataProvider="Getdata")
	public void Callback(String name,String telephone, String preftime, String info) throws IOException, InterruptedException
	{
		
		homePage LP = new homePage(driver);
		LP.ClickCallBack().click();
		Log.info("Successfully clicked the callback option in homepage");
		Log.info("This is for debugging purposes");
		Log.info("Test");
		LP.callbackfullname().sendKeys(name);
		LP.callbacktelephone().sendKeys(telephone);
		LP.callbackprefdatetime().sendKeys(preftime);
		LP.callbackextrainfo().sendKeys(info);
		Log.info("Entered all the datas successfully");
		Thread.sleep(3000);
		LP.callbackfullname().clear();
		LP.callbacktelephone().clear();
		LP.callbackprefdatetime().clear();
		LP.callbackextrainfo().clear();
		LP.ClickCallBack().click();
		

	}
	
	@Test 
	public void contactUs() 
	{
		homePage LP = new homePage(driver);
		LP.aboutUs().click();
		LP.contactUs().click();
		LP.callbackfullname().sendKeys("name");
		LP.callbacktelephone().sendKeys("12345678");
		LP.callbackprefdatetime().sendKeys("ANytime");
		LP.callbackextrainfo().sendKeys("info");
		Log.info("ContactUs Callback validation is completed successfully");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
	
					
	@DataProvider 
	
	public Object[][] Getdata() {
		Object[][] data = new Object[2][4];
		
		data[0][0] = "Name1";
		data[0][1] = "12345";
		data[0][2] = "Anyday morning";
		data[0][3] = "Info1";
		
		data[1][0] = "Name2";
		data[1][1] = "56789";
		data[1][2] = "Weekend afternoon";
		data[1][3] = "Info2";
		
		return data;
	}
		
		
	

}
