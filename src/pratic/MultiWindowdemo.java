package pratic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowdemo {
public static WebDriver dr;
public static String vUrl,vMainWindow,vSecondwindow;
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		vUrl="https://phptravels.com/demo/";
		//1.Lounch Driver.
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get(vUrl);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//get id of the each window(first window).
		vMainWindow=dr.getWindowHandle();
		System.out.println("parent window is:-" +vMainWindow);
		
		//click on link and open new window.
		dr.findElement(By.xpath("//form[@class='button_to' and @method='GET'] //input[@type='submit']")).click();//webdriver open second window.
		
		//get id of the second window.
		Set<String> allwindow=dr.getWindowHandles();
		int windowcount = allwindow.size();
		System.out.println("Windoes count is:-" +windowcount);
		
	    for(String child : allwindow){
	    	
	    	if(!vMainWindow.equalsIgnoreCase(child))
	    	{
	    		dr.switchTo().window(child);
	    		dr.findElement(By.xpath("//*[@id='header']/div/ul/li[3]/a")).click();
	    
	    		// close current window
	    	    //dr.close();
	    		
	    		//
	    		//dr.switchTo().window(vMainWindow);   // switch to main window and close first window.
	    		//dr.close();
	    	}
	    }
	    
	    

}
}
