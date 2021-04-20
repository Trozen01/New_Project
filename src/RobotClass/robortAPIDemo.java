package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class robortAPIDemo {
public static WebDriver wd;
public static String url;

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// this is for save Downloaded file.
		
		 System.out.println("entering before suite");
	      
		     url="https://github.com/mozilla/geckodriver/releases/tag/v0.26.0";
			 System.out.println(System.getProperty("user.dir"));
			 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\geckodriver.exe");
			 
			
			wd =  new FirefoxDriver();	
			wd.get(url);
			wd.manage().window().maximize();
		    wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    Thread.sleep(2000);
		    
		    wd.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/div[3]/div/div[2]/details/div/div/div[5]/a/span")).click();
		    
		    Robot robot = new Robot();
		 // need to do following action for download file.
		 //1. click on down arror.
		 //2. 3 time tab.
		 //3. Click on enter button.
		    
		    robot.keyPress(KeyEvent.VK_DOWN);  //1. click on down arror.
		    robot.keyPress(KeyEvent.VK_TAB);    //2. 3 time tab.
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyPress(KeyEvent.VK_TAB);
		    
		    robot.keyPress(KeyEvent.VK_ENTER);   //3. Click on enter button.

	}

}










