package demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		String td3= rd.getData(0, 0, 2);
		String td4= rd.getData(0, 0, 3);
		String td5= rd.getData(0, 0, 4);
		String td6= rd.getData(0, 0, 5);
		String td7= rd.getData(0, 0, 6);
		String td8= rd.getData(0, 0, 7);
		String td9= rd.getData(0, 0, 8);
		String td10= rd.getData(0, 0, 9);
		String td11= rd.getData(0, 0, 10);
		String td12= rd.getData(0, 0, 11);
		String td13= rd.getData(0, 0, 12);
		String td14= rd.getData(0, 0, 13);
		String td15= rd.getData(0, 0, 14);
		
		/*System.out.println("reched");
		//ClickOnRegistration cl= new ClickOnRegistration();
		//driver=cl.getDriverValue();
		
//		System.out.println("fetched driver is "+ driver);
		//driver.get(current_url);
		System.out.println("Fetched url is ");*/
		driver.findElement(By.xpath("//*[@id='name_3_firstname']")).sendKeys(td1);
		driver.findElement(By.xpath("//*[@id='name_3_lastname']")).sendKeys(td2);
		
		List <WebElement> radio= driver.findElements(By.xpath("//input[@type='radio' and @name='radio_4[]']"));
		for(int i=0;i<radio.size();i++)
		{
			WebElement loc_rad= radio.get(i);
			String val= loc_rad.getAttribute("value");
			if(val.equalsIgnoreCase(td3))
			{
				loc_rad.click();
				
			}
		}
		
		List<WebElement> chkbox= driver.findElements(By.xpath("//input[@type='checkbox' and @name='checkbox_5[]']"));
		for(int i=0;i<chkbox.size();i++)
		{
			WebElement loc_chk= chkbox.get(i);
			String sval= loc_chk.getAttribute("value");
			if(sval.equalsIgnoreCase(td4))
			{
				loc_chk.click();
		}
			else if(sval.equalsIgnoreCase(td5))
					{
		
					loc_chk.click();
					}
			}
		
		WebElement drpdwn_country= driver.findElement(By.id("dropdown_7"));
		Select val= new Select(drpdwn_country);
		val.selectByVisibleText(td6);
				
		WebElement drpdwn_dob1= driver.findElement(By.id("mm_date_8"));
		Select dob_month= new Select(drpdwn_dob1);
		dob_month.selectByVisibleText(td7);
			
		WebElement drpdwn_dob2= driver.findElement(By.id("dd_date_8"));
		Select dob_day= new Select(drpdwn_dob2);
		dob_day.selectByVisibleText(td8);
				
		WebElement drpdwn_dob3= driver.findElement(By.id("yy_date_8"));
		Select dob_year= new Select(drpdwn_dob3);
		dob_year.selectByVisibleText(td9);
				
		driver.findElement(By.id("phone_9")).sendKeys(td10);
				
		driver.findElement(By.id("username")).sendKeys(td11);
		
		driver.findElement(By.id("email_1")).sendKeys(td12);
		
		driver.findElement(By.id("description")).sendKeys(td13);
		
		driver.findElement(By.id("password_2")).sendKeys(td14);
		
		driver.findElement(By.id("confirm_password_password_2")).sendKeys(td15);
		
		driver.findElement(By.name("pie_submit")).click();
		
	}
}
	
	
	
	

