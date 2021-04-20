package pratic;

import java.util.List;
import java.util.ListResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

public class NewTest {
public static WebDriver wd;
public static String url;
public static String Structure_type;


  @BeforeSuite
  public void testsetup() throws InterruptedException {
	  System.out.println("entering before suite");
      
      url ="https://www.seleniumeasy.com/test/table-pagination-demo.html";
		 System.out.println(System.getProperty("user.dir"));
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
		 
		//2.open crome driver.
		wd =  new ChromeDriver();	
		wd.get(url);
		wd.manage().window().maximize();
	    wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    Thread.sleep(2000);
  }
  
  /* @Test
  public void testcase() {
  	try {
  	                                                         
  		 // find header of the table and find size of the column.    
	    List<WebElement> Column = wd.findElements(By.xpath("//*[@id='content']/table/thead/tr/th"));  // find the table.
		System.out.println("COLUMN SIZE:"+Column.size()); 
		
		List<WebElement> row = wd.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));  // find the table.
		System.out.println("ROW SIZE:"+row.size());
		
		 
              for (int i = 0; i < Column.size() ; i++){
				 
			 
			 for (int j = 0; j < row.size() ; j++){
            	
            	 WebElement cellIn = wd.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+ (j+1) +"]/td["+(i+1)+"]"));
                 String tableValue1 = cellIn.getText();
                 System.out.println("Row value is : " + tableValue1);
			 }
                 
		 }
		
	} 
  	catch (Exception e) {
	
	}
  }*/
  
  /*
  @Test   // find one element from table.
  public void secondtest(){
	  
	  try {
		  
		    // find header of the table and find size of the column.    
		    List<WebElement> Column = wd.findElements(By.xpath("//*[@id='content']/table/thead/tr/th"));  // find the table.
			System.out.println("COLUMN SIZE:"+Column.size()); 
		  
		    // find header of the table and find size of the column.    
		    List<WebElement> row = wd.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));  // find the table.
			System.out.println("ROW SIZE:"+row.size());
			
		       for (int i = 0; i < row.size()-1 ; i++){
		    	                                            
		    	 WebElement cellIn = wd.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+(i+1)+"]/th"));
		    	 String listvalue = cellIn.getText();
		    	 System.out.println("list value is:"+listvalue);
		    	   
		    	 Structure_type = "Financial Center";
		    	 if (listvalue.equalsIgnoreCase(Structure_type)){
		    	
		    		 for (int k = 0; k < Column.size() ; k++){
						 
		    			 
		    			 for (int j = 0; j < row.size()-1 ; j++){
		                	
		                	 WebElement cellInc = wd.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+ (j+1) +"]/td["+(k+1)+"]"));
		                     String tableValue1 = cellInc.getText();
		                     String Country ="China";
		                     if (tableValue1.equalsIgnoreCase(Country)){
		                    
		                    	 System.out.println("Country : " + tableValue1);
		                    	 
		                     }	
		        		 }
		        	 }
		    	 }
	       }
		
	} catch (Exception e) {
		// TODO: handle exception
	}
 }
*/
  @Test
  public void thirdcaes() throws InterruptedException
  {
	  // find header of the table and find size of the column.    
	    //List<WebElement> Pagesize = wd.findElements(By.xpath("/html/body/div[2]/div/div[2]/section/div/table/thead/tr/th"));  // find the table.
	    List<WebElement> Pagesize = wd.findElements(By.xpath("//*[@id='myTable']/tr"));  // find the table 
	    System.out.println("Page Count:"+Pagesize.size()); 
	     
	    wd.findElement(By.xpath("//*[@id='myPager']/li[3]/a")).click();
	    Thread.sleep(2000);
		                                                       
  }
  
@AfterSuite
public void testend(){
	System.out.println("Entered in after suite method.");
	
	wd.quit();
	
}

}
