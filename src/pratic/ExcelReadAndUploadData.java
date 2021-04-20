package pratic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReadAndUploadData {

public static String browser;
public static String url, fName, sName, fileExteationName, userName, uPassword;
public static int p,q,rCount;
public static WebDriver dr;

	
  public static void main(String[] args) throws IOException {
	  // how to read dat in excel sheet? using poi and jxl

	  url ="http://10.10.11.176/InsightPlusMOPAD/Login.aspx";
	  
	  System.out.println(System.getProperty("user.dir"));
		
		//1.lunch driver.
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
		
		//2.open crome driver.
	    dr = new ChromeDriver();	
	    dr.get(url);
	    dr.manage().window().maximize();
	    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    try {
	    	
	    	//excel path.
	    	File src=new File("D:\\jitu\\migration\\testcases.xlsx");   

	    	//Create an object of the class for read excel file.
		    FileInputStream  fsxis = new FileInputStream(src);
		    
		    //create object of the XSSFWorkbook and pass object of the file path. (XSSFWorkbook is nothink but classes). 
		    XSSFWorkbook  wb = new  XSSFWorkbook(fsxis);
		    
		    // provide sheet name.Select sheet by using two method getSheet and getSheetAt   
		    // HSSFSheet hs = wb.getSheet("LogInDetails"); // by using this need provide sheet name.
		    
		    
		    XSSFSheet sheet1 = wb.getSheetAt(0);  // by using this need provide sheet index No.
		    
		    //userName =sheet1.getRow(1).getCell(0).getStringCellValue();
		    //uPassword =sheet1.getRow(1).getCell(1).getStringCellValue();
		     
		    //System.out.println("User name is-->" +userName);
		    //System.out.println("User name is-->" +uPassword);
		   
		     rCount =sheet1.getLastRowNum(); // to get total row count.
		     
		    System.out.println("Total row Count is-->" +rCount);

		    for (int i = 1; i < rCount; i++)
		    {
		    	for (int j = 0; j < i; j++){
		    	userName=sheet1.getRow(i).getCell(j).getStringCellValue();
		    	uPassword =sheet1.getRow(i).getCell(j+1).getStringCellValue();	
		    	
		    	System.out.println("User name is-->" +userName);
		    	System.out.println("Password is-->" +uPassword);  
		    	}
		    }   
		  
		    wb.close(); // need close the workbook.
		    dr.quit();
	    	
		} 
	    catch (Exception e) {
		
	    	 e.printStackTrace();
		}
	    
	    
	}

}
