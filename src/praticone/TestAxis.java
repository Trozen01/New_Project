package praticone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAxis {
public static WebDriver dr;
public static String url;

	public static void main(String[] args) throws Throwable {
	
	
		url ="https://testipg.eazy2pay.com/AXISEDGESIT/Login.aspx";
		
		//1.lunch driver.
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
		
		//2.open crome driver.
	    dr =  new ChromeDriver();	
	    dr.get(url);
	    dr.manage().window().maximize();
	    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    
	    dr.findElement(By.id("txtUserID")).sendKeys("MAOPS_TEST");
	    dr.findElement(By.id("txtPassword")).sendKeys("New@12345");
	    dr.findElement(By.id("btnLogin")).click();	  
	   // dr.switchTo().frame("ContentPlaceHolder1_frmMain");
	    
	    dr.findElement(By.xpath("//a[contains(text(),'Terminal Manage')]")).click();
	    Thread.sleep(1000);
	  
	    dr.findElement(By.xpath("//a[contains(text(),'Application Activation Manage')]")).click();
	  
	    Thread.sleep(1000);
	    dr.close();
	    
	}

}
