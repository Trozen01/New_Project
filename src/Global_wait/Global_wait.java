package Global_wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Global_wait {
public static WebDriver dr;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      
			
			dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			dr.manage().window().maximize();
			Thread.sleep(5000);
			
			dr = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
			dr.get("www.gmail.com");
			
			
			dr = new InternetExplorerDriver();
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\IEDriverServer.exe");
			dr.get("www.gmail.com");
		}

	}

