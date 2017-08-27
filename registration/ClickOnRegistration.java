package registration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import BrowserFactory.BrowserPage;

public class ClickOnRegistration {
	
	
	WebDriver driver;
	public void ClickRegistration()
	{
		BrowserPage br= new BrowserPage();
		driver=br.Browser("Chrome");	
		
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//*[@id='menu-item-374']/a")).click();
	System.out.println("Registration link clicked");
	
	}
	
	
	

}
