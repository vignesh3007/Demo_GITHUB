package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Residential {
	
	public WebDriver driver;
	
	By residentiallogo =By.xpath("//h1[@id='homebuyer_title']");
	By purchase = By.xpath("//a[@class='choice']//span[contains(text(),'Purchase')]");
	By sale = By.xpath("//div[@class='col-xs-12 col-md-12']//div[2]//a[1]");
	By sale_purchase = By.xpath("//div[@class='row']//div[3]//a[1]");
	By remortgage = By.xpath("//span[contains(text(),'Remortgage')]");
	By transferequity = By.xpath("//span[contains(text(),'Transfer of Equity')]");
	
	By yes_P2 = By.xpath("//div[@class='fieldset-container purchase-container']//fieldset[1]//div[1]//div[1]//label[1]");
	By no_P2 = By.xpath("//div[@class='fieldset-container purchase-container']//fieldset[1]//div[1]//div[2]//label[1]");
	
	By yes_P3 = By.xpath("//div[@class='fieldset-container purchase-container']//fieldset[2]//div[1]//div[1]//label[1]");
	By no_P3 = By.xpath("/div[@class='fieldset-container purchase-container']//fieldset[2]//div[1]//div[2]//label[1]");
	
	By yes_P4 = By.xpath("//div[@class='choice_container']//span[contains(text(),'Yes')]");
	//By yes_P4 = By.cssSelector("body.html.not-front.not-logged-in.no-sidebars.page-quotebuilder-purchase-conveyancing:nth-child(2) div.main-container.container:nth-child(9) div.region.region-header section.block.block-rquip-dynamic-quote.clearfix div.small-12.medium-12.large-12.columns div.fieldset-container.purchase-container:nth-child(3) fieldset:nth-child(3) div.choice_container_container div.choice_container:nth-child(1) label.choice.next.allow-default-behaviour:nth-child(1) > span:nth-child(1)");
	By no_P4 = By.xpath("//div[@class='choice_container_container']/div[2]/label[1]/span[1]");
	//div[@class='fieldset-container purchase-container']//fieldset[3]//div[1]//div[2]//label[1]//span[1]
	//div[@class='choice_container_container']/div[2]/label[1]/span[1]
	
	By question = By.xpath("//h3[@class='fs-subtitle']");
	By question2 = By.xpath("/div[@class='fieldset-container purchase-container']//h3[@class='fs-subtitle'][contains(text(),'Are you buying with a mortgage?')]");
	By question3 = By.xpath("//div[@class='fieldset-container purchase-container']//h3[@class='fs-subtitle'][contains(text(),'Are you buying with \"Help to Buy\"?')]");
	By question4 = By.xpath("//h3[contains(text(),'Are you a first time buyer?')]");
	By question5 = By.xpath("//h3[contains(text(),'What is the type of property?')]");
	
	By freehold = By.xpath("//fieldset[4]//div[1]//div[1]//label[1]//span[1]");
	By leasehold = By.xpath("//div[@class='fieldset-container purchase-container']//span[contains(text(),'Leasehold')]");
	By shareOfFreehold = By.xpath("//span[contains(text(),'Share of Freehold')]");
	
	By price = By.xpath("//input[@id='p_property_value']");
	By next = By.xpath("//div[@class='fieldset-container purchase-container']//fieldset[5]//div[2]//input[1]");
	
	By postCode = By.xpath("//input[@id='p_property_postcode']");
	By next_PC = By.xpath("//div[@class='fieldset-container purchase-container']//fieldset[6]//div[2]//input[1]");
	
	By back = By.xpath("//div[@class='fieldset-container purchase-container']//p[@class='previous redoService'][contains(text(),'Back')]");
	
	@FindBy (xpath = "//input[@id='personal_fname']")
	WebElement pName;
	
	@FindBy (xpath = "//input[@id='personal_phone']")
	WebElement pNnumber;
	
	@FindBy (xpath="//input[@id='personal_email']")
	WebElement email;
	
	public Residential(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement residentiallogo()
	{
		return driver.findElement(residentiallogo);
	}
	
	public WebElement purchase()
	{
		return driver.findElement(purchase);
	}
	public WebElement sale()
	{
		return driver.findElement(sale);
	}
	public WebElement sale_purchase()
	{
		return driver.findElement(sale_purchase);
	}
	public WebElement mortgage()
	{
		return driver.findElement(remortgage);
	}
	public WebElement transferequity()
	{
		return driver.findElement(transferequity);
	}
	public WebElement yes_P2()
	{
		return driver.findElement(yes_P2);
	}
	public WebElement no_P2()
	{
		return driver.findElement(no_P2);
	}
	
	public WebElement yes_P3()
	{
		return driver.findElement(yes_P3);
	}
	public WebElement no_P3()
	{
		return driver.findElement(no_P3);
	}
	public WebElement yes_P4()
	{
		return driver.findElement(yes_P4);
	}
	public WebElement no_P4()
	{
		return driver.findElement(no_P4);
	}
	public WebElement question()
	{
		return driver.findElement(question);
	}
	public WebElement back()
	{
		return driver.findElement(back);
	}
	public WebElement freehold()
	{
		return driver.findElement(freehold);
	}
	public WebElement leasehold()
	{
		return driver.findElement(leasehold);
	}
	public WebElement shareOfFreehold()
	{
		return driver.findElement(shareOfFreehold);
	}
	public WebElement price()
	{
		return driver.findElement(price);
	}
	public WebElement next()
	{
		return driver.findElement(next);
	}
	public WebElement postCode()
	{
		return driver.findElement(postCode);
	}
	public WebElement next_PC()
	{
		return driver.findElement(next_PC);
	}
	public WebElement pName()
	{
		return pName;
	}
	
	public WebElement pNumber()
	{
		return pNnumber;
	}
	public WebElement email()
	{
		return email;
	}
	

}
