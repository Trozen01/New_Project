package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class robotDemoUploadFile {
public static WebDriver wd;
public static String url;


	public static void main(String[] args) throws AWTException {
		
		// upload file 
		//1.Key press event.
		//2.key release event.
		 System.out.println("entering before suite");
	      
	     url="http://demo.automationtesting.in/Register.html";
		 System.out.println(System.getProperty("user.dir"));
		 
		// System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\geckodriver.exe");
		// wd =  new FirefoxDriver();	
		 
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
		 wd = new ChromeDriver();
		 
		 wd.get(url);
		 
		 wd.findElement(By.id("imagesrc")).click();
		 
		 Robot robot = new Robot();
		 robot.delay(2000);

		 StringSelection stringSelection = new StringSelection("C:\\Jitu\\Local\\Pitchers\\Jitu\\1.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
		 robot.delay(1000);
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);

		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 System.out.println("-------------------------------------");
		 
		 robot.keyPress(KeyEvent.VK_CONTROL); // with robot class you can easily achieve anything if you know the shortcut keys.
		 robot.keyPress(KeyEvent.VK_2); //robot.keyPress(KeyEvent.VK_2);
		 robot.keyRelease(KeyEvent.VK_CONTROL);  // 
		 robot.keyRelease(KeyEvent.VK_2);
	}

}
