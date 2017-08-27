package BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserPage {

	 WebDriver driver;
	
		
	public WebDriver Browser(String BrowserName)
	{
		if(BrowserName.equalsIgnoreCase("FireFox"))
		{
			driver= new FirefoxDriver();
			
		}
		
		else if(BrowserName.equalsIgnoreCase("Chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Aayushi\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		
		else
		{
			System.out.println("Invalid Browser");
		}
		return driver;
		
		
		
	}
	
	
	
	
	
	
}
