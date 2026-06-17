package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	//All the reusable methods or generic methods are present here
	
	
	public static void launchApplication(String browser, String URL) 
	{
		WebDriver driver=null;
		//Chrome, Firefox, Edge
				if(browser.equalsIgnoreCase("chrome"))
				{
					//Incognito mode, headless mode, maximize the window, delete cookies, disable notoficatios
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--incognito");
//					options.addArguments("--headless");
					options.addArguments("--start-maximized");
					options.addArguments("--disable-notifications");
					
					 driver = new ChromeDriver(options);
				}
				else if(browser.equalsIgnoreCase("firefox"))
				{
					//Incognito mode, headless mode, maximize the window, delete cookies, disable notoficatios
					FirefoxOptions options = new FirefoxOptions();
					options.addArguments("--private");
//					options.addArguments("--headless");
					options.addArguments("--start-maximized");
					options.addArguments("--disable-notifications");
					
					 driver = new FirefoxDriver(options);
				}
				else if(browser.equalsIgnoreCase("edge"))
				{
					//Incognito mode, headless mode, maximize the window, delete cookies, disable notoficatios
					EdgeOptions options = new EdgeOptions();
					options.addArguments("--inprivate");
//					options.addArguments("--headless");
					options.addArguments("--start-maximized");
					options.addArguments("--disable-notifications");
					
					 driver = new EdgeDriver(options);
				}
				else
				{
//					Throw new RuntimeException("Invalid browser name provided");
				}
		
		
				driver.get(URL);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				DriverFactory.setDriver(driver);
		
	}
	
	public static Properties getDetailsFromPropertiesFile(String filePath) throws IOException
	{
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop;	
	}
	
	public static void waitForVisibleOfElement(WebDriver driver, String elementXpath)
	{
		//Explict wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
	}
	
	public static void waitForElementToBeClickable(WebDriver driver, String elementXpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
	}
	
	public static void scrollByActions(WebDriver driver, String elementXpath)
	{
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(elementXpath));
		act.scrollToElement(element).perform();
	}
	
	public static void scrollByJS(WebDriver driver, String elementXpath)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(elementXpath));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static String uniqueUsername() 
	{
		String uniqueUsername = "User" + System.currentTimeMillis(); //User310520261601
		return uniqueUsername;
	}
	
	public static void switchToFrame(WebDriver driver, String frameXpath)
	{
		
	}
	
	public static void switchToWindow(WebDriver driver, String frameXpath)
	{
		
	}
	
	public String captureScreenshotBase64(WebDriver driver) {
	    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}
	
	
	
	
}
