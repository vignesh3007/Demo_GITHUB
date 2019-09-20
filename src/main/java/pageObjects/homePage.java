package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	public WebDriver driver;
	
	
	By home =By.xpath("//li[@class='first leaf']//a[contains(text(),'Home')]");
	By logo =By.cssSelector("#mainlogo");
	By mainMenu = By.xpath("//div[@class='col-md-12 col-sm-12 hidden-xs text-center mainnav']");
	By callback = By.xpath("//span[contains(text(),'Request a Callback')]");
	By callbackfullname = By.id("edit-full-name");
	By callbacktelephone = By.id("edit-telephone");
	By callbackprefdatetime = By.id("edit-pref-time");
	By callbackextrainfo = By.id("edit-extra-info");
	By residentialConveyance = By.xpath("//span[contains(text(),'Residential Conveyancing')]");
	
	By residential = By.xpath("//li[@class='leaf']//a[contains(text(),'Residential')]");
	By conveyancingLink = By.xpath("//a[contains(text(),'Quote for conveyancing')]");
	By conveyancingButton = By.xpath("//button[contains(text(),'Get a Conveyancing quote')]");
	
	By homeBuyersSurvey = By.xpath("//a[contains(text(),'Home Buyers Survey')]");
	By homeBuyersSurveySecondMenu = By.xpath("//ul[@class='secondary-menu']");
	By homeBuyersSurveyTitle = By.xpath("//h1[@id='homebuyer_title']");
	By homeBuyersSurveyLink = By.xpath("//a[contains(text(),'Quote for property survey')]");
	By homeBuyersSurveyButton = By.xpath("//button[contains(text(),'Get a survey quote')]");
	
	By propertyAuction = By.xpath("//a[contains(text(),'Property Auctions')]");
	By propertyAuctionSecondMenu = By.xpath("//ul[@class='secondary-menu']");
	By propertyAuctionTitle = By.xpath("//h1[@id='homebuyer_title']");
	
	By commercial = By.xpath("//li[@class='collapsed']//a[contains(text(),'Commercial')]");
	By commercialSecondMenu = By.xpath("//ul[@class='secondary-menu']");
	By commercialTitle = By.xpath("//h1[@id='homebuyer_title']");
	By commercialButton = By.xpath("//button[contains(text(),'Get a Commercial quote')]");
	
	By reviews = By.xpath("//div[@class='col-md-12 hidden-xs text-center mainnav']//a[contains(text(),'Reviews')]");
	By reviewsAuctionTitle = By.xpath("//h1[@class='page-header']");
	
	By aboutUs = By.xpath("//li[@class='last leaf']//a[contains(text(),'About Us')]");
	By aboutUsTitle = By.xpath("//h1[contains(text(),'About Us')]");
	By ourTeam = By.xpath("//a[contains(text(),'Our Team')]");
	By contactUs = By.xpath("//li[@class='leaf']//a[contains(text(),'Contact Us')]");
	By propertyBlog = By.xpath("//li[@class='leaf']//a[contains(text(),'Property Blog')]");
	By termsAndCondition = By.xpath("//a[contains(text(),'Terms and Conditions')]");
	By privacyPolicy = By.xpath("//a[contains(text(),'Privacy Policy')]");
	
	public homePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	public WebElement mainMenu()
	{
		return driver.findElement(mainMenu);
	}
	
	public WebElement home() 
	{
		return driver.findElement(home);
	}
	public WebElement ClickCallBack()
	{
		return driver.findElement(callback);
	}
	
	public WebElement callbackfullname()
	{
		return driver.findElement(callbackfullname);
	}
	public WebElement callbacktelephone()
	{
		return driver.findElement(callbacktelephone);
	}
	public WebElement callbackprefdatetime()
	{
		return driver.findElement(callbackprefdatetime);
	}
	public WebElement callbackextrainfo()
	{
		return driver.findElement(callbackextrainfo);
	}
	public WebElement Logo()
	{
		return driver.findElement(logo);
	}
	public WebElement residential()
	{
		return driver.findElement(residential);
	}
	public WebElement residentialConveyance()
	{
		return driver.findElement(residentialConveyance);
	}
	public WebElement conveyancingButton()
	{
		return driver.findElement(conveyancingButton);
	}
	
	public WebElement conveyancingLink()
	{
		return driver.findElement(conveyancingLink);
	}
	
	public WebElement aboutUs()
	{
		return driver.findElement(aboutUs);
	}
	
	public WebElement contactUs()
	{
		return driver.findElement(contactUs);
	}
}
