package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;



public class Base {
	public static WebDriver driver;
	public Properties prop;
	public static Logger Log = LogManager.getLogger(Base.class.getName());
	
	
	public Properties propertiesFileLoad() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Selenium_Training\\E2EProject\\src\\main\\java\\Resources\\config.properties");
		prop.load(fis);
		return (prop);
	}
	public WebDriver initiatebrowser(Properties prop) throws IOException {
		String browser = prop.getProperty("browser");
		
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
				driver = new ChromeDriver();
				//driver.get("google.co.in");
			}
			
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "D://Selenium/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public WebDriver enterWebPage(WebDriver driver,Properties prop) {
		String URL=prop.getProperty("URL");
		driver.get(URL);
		return driver;
	}
	public void takescreenshot(String result) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Selenium_Training\\E2EProject\\Screenshot\\"+result+"screenshot.png"));
		
	}

}
