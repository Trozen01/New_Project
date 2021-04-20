package praticone;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleMap {
public static WebDriver wd;
public static String url;
public static void main(String[] args) throws Exception {
		
		 url ="https://www.google.com/maps";
		 System.out.println(System.getProperty("user.dir"));
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
		 
		//2.open crome driver.
		wd =  new ChromeDriver();	
		wd.get(url);
		wd.manage().window().maximize();
	    wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    
	    wd.findElement(By.xpath("//*[contains(@id,'searchbox-directions')]")).click();
	    wd.findElement(By.xpath("//*[@id='sb_ifc51']/input")).sendKeys("Thane stn");
	    wd.findElement(By.xpath("//*[@id='sb_ifc52']/input")).sendKeys("LogiNext Solutions");
	    wd.findElement(By.xpath("//*[@id='directions-searchbox-1']//button[1]")).click();
	    Thread.sleep(5000);
	    wd.findElement(By.xpath("//*[@id='section-directions-trip-0']/div[2]/div[2]/div[4]/button")).click();
	    wd.findElement(By.xpath("//button[@aria-label=' Print ']")).click();
	    wd.findElement(By.xpath("//button[@vet='7974']")).click();
	  
	    getscreenshot();
	  
	}

    public static void getscreenshot() throws Exception 
   {
    	// Call getScreenshot method to create image file.
        File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);      
     
        //The below method will save the screen shot in d drive with name "screenshot.png"
        FileUtils.copyFile(scrFile, new File("D:\\jitu\\migration\\selenium\\New_Project\\screeshot\\Googlemap.png"));
       Thread.sleep(2000);
        wd.close();
        
   }


}
