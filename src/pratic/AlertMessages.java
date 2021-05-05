package pratic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AlertMessages {
public static WebDriver wd;
public static String url;
public static String Structure_type;


	@BeforeSuite
	  public void beforeSuite() throws InterruptedException {

		try {
		
		 System.out.println("entering before suite");
	      
	      url ="https://www.seleniumeasy.com/test/bootstrap-modal-demo.html";
			 System.out.println(System.getProperty("user.dir"));
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
			 
			//2.open crome driver.
			wd =  new ChromeDriver();	
			wd.get(url);
			wd.manage().window().maximize();
		    wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    Thread.sleep(2000);
	  }
		catch (Exception e)
		   {
		System.out.println("problem is =" +e);
			
	       }
	}
	

	@Test
  public void Alertmsg() {

		try {
		
			//Click on button.
			wd.findElement(By.xpath("//*[@href='#myModal0']")).click();
			
			//Swatch to alert.
			Alert alert = wd.switchTo().alert();
			
						
			//captcher message from alert window.
			String message =wd.switchTo().alert().getText();
			
			alert.accept();
			
			System.out.println("Alert message is:-" +message);
			
		   } 
		
		catch (Exception e)
		   {
		System.out.println("issue=" +e);
			
	       }
		
	}
	
	@AfterSuite
	  public void afterSuite() {
		  
		  System.out.println("Entered in after suite method.");
			
			wd.quit();
	  }
}
