package TestNG.MultithreadTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserParalleltesting {
public static WebDriver wd;
public static String url;


    @Parameters("browsername")
	@BeforeTest
	public void beforeSuite(String browsername) throws InterruptedException {
	 
		System.out.println("entering before suite");
	      System.out.println("Browser name is:-" +browsername);
	      
	     
	      
		  if(browsername.equalsIgnoreCase("chrome")){
			  
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
				wd = new ChromeDriver();
			
		  }
		  else if (browsername.equalsIgnoreCase("firefox")) {
			
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\geckodriver.exe");
			  wd = new FirefoxDriver();
		
		  }
		  else{
			  
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\IEDriverServer.exe"); 
			 wd= new InternetExplorerDriver();
		 
		  }
		
	}
	@Test
	public void testcase() throws InterruptedException{
		
		
	            url ="https://www.google.com/";
				wd.get(url);
				wd.manage().window().maximize();
			    wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			    Thread.sleep(2000);
	}

}
