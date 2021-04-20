package OtherExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMS {
public static String browser;
public static String url, fName, sName; 	
public static WebDriver dr;


	public static void main(String[] args) throws InterruptedException {
		url ="http://toolsqa.com/automation-practice-form/";
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
			
			//2.open crome driver.
		    dr =  new ChromeDriver();	
		    dr.get(url);
		    dr.manage().window().maximize();
		    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    Thread.sleep(2000);

	}

}
