package pratic;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click_in_Selenium {
public static String vUrl;
public static WebDriver dr;

	
	public static void main(String[] args) {
		
		try{
			
			vUrl="https://demoqa.com/tooltip-and-double-click/";
			//Lunch Driver.
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
			
			dr = new ChromeDriver();
			dr.get(vUrl);
			
			dr.manage().window().maximize();
    	    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	    Thread.sleep(2000);
			
       	  //Instantiate Action Class
			Actions actions = new Actions(dr);
			
			 //Retrieve WebElement to perform right click
			WebElement elementLocator = dr.findElement(By.id("rightClickBtn"));
		
			 //Right Click the button to display Context Menu&nbsp;
			actions.contextClick(elementLocator).perform();                      // contextClick means right click.
			
			 //Select and click 'Copy me' i.e. 2nd option in Context menu 
			   WebElement elementOpen = dr.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));  
			   elementOpen.click();
			
			
			   // Accept the Alert 
			   dr.switchTo().alert().accept();
			   System.out.println("Right click Alert Accepted");
			
			   // Close the main window 
			   dr.close();
			   
			   //actions.doubleClick(elementLocator).perform();   this is use for doubleClick on element.    
			
		}
		catch(Exception ex){
			
			
		}

	}

}
