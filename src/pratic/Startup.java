package pratic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.win32.Netapi32Util.User;

public class Startup {
public static WebDriver wd;
public static String url;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		url ="http://toolsqa.com/automation-practice-form/";
		
		 System.out.println(System.getProperty("user.dir"));
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
		 
		
		//2.open crome driver.
	    wd =  new ChromeDriver();	
	    wd.get(url);
	}

}
