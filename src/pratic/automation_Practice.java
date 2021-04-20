package pratic;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.ui.Select;

public class automation_Practice {
public static String browser;
public static String url, fName, sName; 	
public static WebDriver dr;
public static final java.util.List<WrapsElement> WebElement = null;

	public static void main(String[] args) {
		
		try {
			  
			 
			JavascriptExecutor js = (JavascriptExecutor)dr;
			url ="http://toolsqa.com/automation-practice-form/";
			fName="Jitu";
			sName="Sawant";
	        System.out.println(System.getProperty("user.dir"));
			
			//1.lunch driver.
	        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
			
			//2.open crome driver.
		    dr =  new ChromeDriver();	
		    dr.get(url);
		    dr.manage().window().maximize();
		    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    Thread.sleep(2000);
		    
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    dr.findElement(By.xpath("//a[@title='Automation Practice Table']")).click();
		                                                             
		    // find header of the table and find size of the column. 
		    List<WebElement> Column = dr.findElements(By.xpath("//*[@id='content']/table/thead/tr/th"));  // find header of the table.
			System.out.println("COLUMN SIZE:"+Column.size()); 
		    
			Thread.sleep(2000);
			//find size of the Row.
		    List<WebElement> ROW = dr.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));
		   System.out.println("ROW SIZE:-"+ROW.size());

		    //select and print first value of the column.
		     WebElement arf  = dr.findElement(By.xpath("//*[@id='content']/table/tbody/tr/td"));
	         String tableValue = arf.getText();
	         System.out.println("Row value is : " + tableValue);
	        
	         Thread.sleep(4000);
	            for (int i = 0; i < ROW.size() ; i++){
	          
	             WebElement cellIn = arf.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+ (i+1) +"]/td[2]"));
	             String tableValue1 = cellIn.getText();
	             System.out.println("Row value is : " + tableValue1);
	             System.out.print("Row value is: +TableValue1");            
	            }
	            Thread.sleep(4000);   
	            dr.navigate().back();
	            dr.findElement(By.name("firstname")).sendKeys(fName);
	            Thread.sleep(4000);  
	            dr.findElement(By.name("lastname")).sendKeys(sName);
	            dr.findElement(By.id("sex-0")).click();
	            Thread.sleep(4000);  
	            dr.findElement(By.id("exp-1")).click();
	            Thread.sleep(4000);  
	            dr.findElement(By.id("datepicker")).sendKeys("22/08/2018");
	            dr.findElement(By.id("profession-0")).click();
	            dr.findElement(By.id("profession-1")).click();
	            
	          //scrool dowm 
				
				js.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(4000);
				
	            dr.findElement(By.id("photo")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
	            dr.findElement(By.id("tool-0")).click();
	            dr.findElement(By.id("tool-1")).click();
	            dr.findElement(By.id("tool-2")).click();
	            
	            
	            
	            Select Cont = new Select (dr.findElement(By.id("continents")));
	            Cont.selectByIndex(1);
	            
	            
	            Select cont1 = new Select (dr.findElement(By.id("selenium_commands")));
	            cont1.selectByVisibleText("Navigation Commands");
	            cont1.selectByVisibleText("Switch Commands");
	            
	            dr.findElement(By.id("submit")).submit();

	            
	            File src1 = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);

	            try {
					FileUtils.copyFile(src1, new File("D:\\jitu\\migration\\selenium\\Assignment_Project\\src\\Sereenshot\\capturecd2.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	            dr.close(); 
			
		} catch (Exception e) {
			
			System.out.println("Exception is:- " + e);
		}

	}

}
