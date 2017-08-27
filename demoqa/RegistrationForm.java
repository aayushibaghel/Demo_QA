package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BrowserFactory.BrowserPage;
import readExcel.ReadExcelSheet;
import registration.ClickOnRegistration;


public class RegistrationForm {
	
	WebDriver driver;
	
	public void Form(String current_url,WebDriver driver)
	{
		ReadExcelSheet rd= new ReadExcelSheet("C:\\Aayushi\\Selenium\\ExcelData\\TestData1.xlsx");
		String td1= rd.getData(0, 0, 0);
		String td2= rd.getData(0, 0, 1);
		/*System.out.println("reched");
		//ClickOnRegistration cl= new ClickOnRegistration();
		//driver=cl.getDriverValue();
		
//		System.out.println("fetched driver is "+ driver);
		//driver.get(current_url);
		System.out.println("Fetched url is ");*/
		driver.findElement(By.xpath("//*[@id='name_3_firstname']")).sendKeys(td1);
		driver.findElement(By.xpath("//*[@id='name_3_lastname']")).sendKeys(td2);
	 
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
