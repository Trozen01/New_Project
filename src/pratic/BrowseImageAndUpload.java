package pratic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.modules.thread.thread;

public class BrowseImageAndUpload {
public static WebDriver dr;
public static String vUrl,vFileAddress;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        vUrl="http://demo.guru99.com/test/upload/";
		vFileAddress="C:\\Users\\Public\\Pictures\\Sample Pictures\\New folder\\Koala.jpg";
        
		try {
			
		//1.Lounch Driver.
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get(vUrl);
		dr.manage().window().maximize();
		
		dr.findElement(By.id("uploadfile_0")).sendKeys(vFileAddress);
 
		// check the "I accept the terms of service" check box
        dr.findElement(By.id("terms")).click();
        
        // click the "UploadFile" button
        dr.findElement(By.name("send")).click();
		
        Thread.sleep(4000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			dr.close();
		}

	}

}
