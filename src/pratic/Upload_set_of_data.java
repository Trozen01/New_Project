package pratic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_set_of_data {
public static String browser;
public static String url, fName, sName, fileExteationName, userName, uPassword;
public static int p,q,rCount;
public static WebDriver dr;
	
	public static void main(String[] args) throws IOException {
		 url ="https://app.hubspot.com/login?__cf_chl_jschl_tk__=167cd1b58635067beb335e9f1550b7f4cce24c80-1585556354-0-Ae53PCdo1Gy3ikOzdru0SQuwryGFyAnupzpgv8PuQmr0Rg8_bX8fE3BME34m_65Ufh60aPTzymqTUPBaMJqa2V3JvQCgYVws52QcVTvK3QEIDZcfK6bPj1NyH65KILxKrETCCPVOFz5eKerXHBzFgVtYhiuZmbKMHR0VJWc-KPl-pFiOCfbcrI8g2NsJ6F3HgF1vnQ15nPQ9u3fBytxyP_Bym1GfnKiPfizUXJUxjND60qrTzwDSaCtKxp2y_O-ka__K6XCK7-3VpqktmC-b1snKoOKk6OQKo1jx22HU7txE5_VXo7tBm_J3MtIHkxkQPQGePWHMkD6WDlpCLBhaPN8";
		  
		  System.out.println(System.getProperty("user.dir"));
			
			//1.lunch driver.
		    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
			
			//2.open crome driver.
		    dr = new ChromeDriver();	
		    dr.get(url);
		    dr.manage().window().maximize();
		    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    
		    File exlpath = new File("D:\\jitu\\migration\\selenium\\DataRead\\src\\com\\data\\util\\TestData.xlsx");

			FileInputStream fis = new FileInputStream(exlpath);

			XSSFWorkbook workbok = new XSSFWorkbook(fis);    //load full workbook.
			
			//HSSFWorkbook worok = new HSSFWorkbook(fis); it will use when your excel format is .xls    
			
		    XSSFSheet sheet1=	workbok.getSheetAt(0);    // read first sheet from workbook.
		    
		    String data0 = sheet1.getRow(2).getCell(1).getStringCellValue();
		    
		    System.out.println("Data from excel is: " +data0);
		    
		    workbok.close();
	}

}
