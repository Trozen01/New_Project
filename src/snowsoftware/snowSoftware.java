package snowsoftware;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.naming.PartialResultException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class snowSoftware {
public static WebDriver dr;
public static String url;
public static String Structure_type;	
    
	
	@Test
	public void initiation() throws InterruptedException {

		try {

			url ="https://www.snowsoftware.com/";
		    System.out.println(System.getProperty("user.dir"));

			//1.lunch driver.    
		    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
			
			//2.open crome driver.
		    dr =  new ChromeDriver();	
		    dr.get(url);
		    dr.manage().window().maximize();
		    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    Thread.sleep(3000);
			
		    
		    Actions action = new Actions(dr);
		    WebElement success = dr.findElement(By.xpath("//a[normalize-space()='Success']"));
		    //WebElement success = dr.findElement(By.xpath("//*[@id='block-gavias-emon-mainnavigation']/div/div[1]/ul/li[3]/a"));
		    action.moveToElement(success).perform();
		    
			
			//System.out.println("success");
			dr.findElement(By.xpath("//a[contains(text(),'Snow Globe Community')]")).click();
			Thread.sleep(2000);
			
			
			String Abc =dr.findElement(By.xpath("//div/h2[@class='contentTitle']")).getText();
			System.out.println("Text is:"+Abc);
			
			
			dr.findElement(By.xpath("//input[@role='combobox' and @placeholder='How can we help?']")).sendKeys("Snow liances manager");
			dr.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
			Thread.sleep(30000);
			
			dr.findElement(By.xpath("//a[@href='/s/article/ReleaseNotesSnowLicenseManager971-v2']")).click();
			
			
			List<WebElement> list = dr.findElements(By.xpath("//*[contains(text(),'000013119')]"));
			Assert.assertTrue(list.size() > 0);
			
			
			//System.out.println("Article number is:-" +list);
			
			dr.close();
			
		}
		catch (Exception e) {
			System.out.println("problem is =" + e);

		}
	}

}
