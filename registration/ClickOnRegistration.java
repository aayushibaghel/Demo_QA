package registration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import BrowserFactory.BrowserPage;
import demoqa.RegistrationForm;

public class ClickOnRegistration {
	
	
	WebDriver driver;
	
	public WebDriver getDriverValue()
	{
		BrowserPage br= new BrowserPage();
		driver=br.Browser("Chrome");
		return driver;
	}
	
	public void ClickRegistration()
	{
		getDriverValue();
		
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//*[@id='menu-item-374']/a")).click();
	System.out.println("Registration link clicked");
	
	String current_url = driver.getCurrentUrl();
	System.out.println(current_url);
	RegistrationForm reg_form = new RegistrationForm();
	reg_form.Form(current_url, driver);
	
	
	}
	
	
	
	
	

}
