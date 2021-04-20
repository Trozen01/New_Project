package pratic;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.python.core.exceptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRM {
	public static WebDriver wd;
	public static String url;	
	

	@BeforeSuite
	public void testsetup() throws InterruptedException{
             System.out.println("entering before suite");
             
             url ="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
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
	public void testcase() {
		try{
	
			wd.findElement(By.id("txtUsername")).sendKeys("Admin");
			wd.findElement(By.id("txtPassword")).sendKeys("admin123");
			wd.findElement(By.id("btnLogin")).click();
			
			Thread.sleep(5000);
			
			 Actions action = new Actions(wd);
			
			 
			 
			 action.moveToElement(wd.findElement(By.id("menu_admin_viewAdminModule"))).build().perform();
			 action.moveToElement(wd.findElement(By.id("menu_admin_UserManagement"))).build().perform();
			
			Thread.sleep(5000);
			
			wd.findElement(By.id("menu_admin_viewSystemUsers")).click();
			
			
		}
		catch (Exception e)
		{
			
		
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
