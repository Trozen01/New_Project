package pratic;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import oracle.jdbc.proxy.annotation.GetDelegate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

public class DatePicker {
public static WebDriver wd;
public static String url;
public String today;
public int TodayInt;
public String TodayString;
  
  @BeforeSuite
  public void beforeSuite() throws InterruptedException {
  
	  System.out.println("entering before suite");
      
         url ="https://www.seleniumeasy.com/test/basic-first-form-demo.html";
		 System.out.println(System.getProperty("user.dir"));
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
		 
		//2.open crome driver.
		wd =  new ChromeDriver();	
		wd.get(url);
		wd.manage().window().maximize();
	    wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    Thread.sleep(2000);
  }
  
  @Test
  public void testcase(){
	  try {
		  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[2]/a")).click();
		  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[2]/ul/li[1]/a")).click();
         
		  today = GetCurrentdate();
		  System.out.println("current date is :- "+today);
		
		  //Click and open the datepickers
		  wd.findElement(By.xpath("//*[@id='sandbox-container1']/div/span")).click();
		  
		  //This is from date picker table
		  WebElement datepickerTable =wd.findElement(By.xpath("/html/body/div[3]/div[1]/table"));
		  
		  //Their is column from the datepicker table.
		  List <WebElement> column =datepickerTable.findElements(By.tagName("td"));
		  
		  //DatePicker is a table. Thus we can navigate to each cell
	      //and if a cell matches with the current date then we will click it.
		  for (WebElement cell: column) {
	            //Select Today's Date
	            if (cell.getText().equals(today)) {
	                cell.click();
	                break;
	            }
	        }
		  // wait for to see todays date.
		  try {
			   Thread.sleep(4000);
		     }
		  catch (Exception e) 
		      {
			   e.printStackTrace();
		      }
		  
	} 
	  catch (Exception e) {
		
	}
	  
  }
  
  private String GetCurrentdate() {

	   //create calender object.
	   Calendar cal = Calendar.getInstance(TimeZone.getDefault());
	  
	   //get current day as a number.
	   TodayInt =cal.get(cal.DAY_OF_MONTH);
	   System.out.println("current day in number:- "+TodayInt);
	   
	   //integer to convert in string.
	   TodayString = Integer.toString(TodayInt);
	   System.out.println("current day in string :- "+TodayString);
	  
	   return TodayString;
    }


@AfterSuite
  public void testend(){
  	System.out.println("Entered in after suite method.");
  	
  	//wd.quit();
  	
  }
}
