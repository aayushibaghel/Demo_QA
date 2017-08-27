package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BrowserFactory.BrowserPage;
import readExcel.ReadExcelSheet;


public class RegistrationForm {
	
	WebDriver driver;
	ReadExcelSheet rd= new ReadExcelSheet();
	String td1= rd.ReadExcel(0, 0, 0);
	String td2= rd.ReadExcel(0, 0, 1);
	
	
	
	
	public void Form()
	{
		
		BrowserPage br= new BrowserPage();
		driver=br.Browser("Chrome");	
	
	
	 driver.findElement(By.xpath("//*[@id='name_3_firstname']")).sendKeys(td1);
	 driver.findElement(By.xpath("//*[@id='name_3_lastname']")).sendKeys(td2);
	 
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
