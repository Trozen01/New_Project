package pratic;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SliderBar {
public static WebDriver wd;
public static String url;
public static String Structure_type;	
	
	
	@BeforeSuite
	  public void beforeSuite() throws InterruptedException {
		
		 System.out.println("entering before suite");
	      
	      url ="https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html";
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
  public void Sliderbar() {

	  try {
		
		  WebElement Slider = wd.findElement(By.xpath("//*[@id='slider1']/div/input"));
		  Actions move = new Actions(wd);
		  move.dragAndDropBy(Slider, 50, 0).release().build().perform();
		  Slider.click();
		  
	} 
	  catch (Exception e) {
		
	}
	  
  }
 
  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("Entered in after suite method.");
		
		wd.quit();
  }

}
