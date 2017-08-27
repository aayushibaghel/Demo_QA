package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public String ReadExcel(int sheetnum, int row,int col)
	{
	
	File src= new File("C:\\Aayushi\\Selenium\\ExcelData\\TestData1.xlsx");
	
	try {
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	XSSFSheet sheet1= wb.getSheetAt(sheetnum);
	String td= sheet1.getRow(row).getCell(col).getStringCellValue();
	
	return td;
	
	
	}
	
	
	
	
	
	
	

}
