package pratic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {
public static String browser;
public static String url, fName, sName; 
public static WebDriver dr;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		 // TODO Auto-generated method stub
        url ="http://10.10.11.176/InsightPlusMOPAD/default.aspx";
        
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
        
        //2.open crome driver.
     dr =  new ChromeDriver();     
     dr.get(url);
     dr.manage().window().maximize();
     dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     Thread.sleep(2000);
   
        dr.findElement(By.id("lnkLogin")).click();
         
        dr.findElement(By.id("txtLoginID")).sendKeys("sbimum"); 
          
        dr.findElement(By.id("txtPassword")).sendKeys("Atos@1234"); 
         
         dr.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000); 
        //dr.findElement(By.id("Menu2_mnuMain"))
        
        Actions action = new Actions(dr);
        
        action.moveToElement(dr.findElement(By.xpath("//*[@id='Menu2_mnuMain']/ul/li[1]/a"))).build().perform();
        
         //customise xpath with link text
        //action.moveToElement(dr.findElement(By.xpath("//*[text()='User Management']"))).build().perform();

        dr.findElement(By.id("Menu2_mnuMain:submenu:2")).click();
        
        WebElement iFrame =dr.findElement(By.id("ContentPlaceHolder1_frmMain"));
        
        dr.switchTo().frame(iFrame);
        
        dr.findElement(By.id("ContentPlaceHolder1_txtOldPassword")).sendKeys("HGJJGUJG");
        
	}

}
