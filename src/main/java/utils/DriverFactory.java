package utils;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	//So here we use to setup the driver instance & get the driver instance
	
	//ThreadLocal -- is a Class -- helps in parallel testing -- it provides thread safety to the driver instance
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();//null -- ChromeDriver opened OrgangeHRM	
	
	public static void setDriver(WebDriver drv) //ChromeDriver opened OrgangeHRM
	{
		driver.set(drv);
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void removeDriver()
	{
		driver.remove();
	}
	
}
