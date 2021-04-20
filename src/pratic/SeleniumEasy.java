package pratic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.thoughtworks.selenium.webdriven.commands.Click;



public class SeleniumEasy {
public static ExtentTest test;
public static ExtentReports report;
public static WebDriver wd;
public static String url;



public static void scrolltoElement(WebElement element) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) wd;
		
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	// 
}

@BeforeSuite
	public void testsetup() throws InterruptedException{
             System.out.println("entering before suite");
             
             url ="https://www.seleniumeasy.com/test/basic-first-form-demo.html";
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
public void testcase() {
	try{
         
    //simple form demo.
	wd.findElement(By.id("user-message")).click();
	wd.findElement(By.id("user-message")).sendKeys("test_click");
	wd.findElement(By.xpath("//*[@id='get-input']/button")).click();
	 Thread.sleep(2000);
	
	 //Two input fields. 
	  scrolltoElement(wd.findElement(By.id("sum1")));
	  wd.findElement(By.id("sum1")).sendKeys("5");
	  Thread.sleep(2000);
	  wd.findElement(By.id("sum2")).sendKeys("10");
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@id='gettotal']/button")).click();
	
	  
	  
	  //Single Check box demo.  
	  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/a")).click();
	  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/ul/li[2]/a")).click();
	  wd.findElement(By.id("isAgeSelected")).click();
	  
	  
	  //Multiple Check box demo.
	  scrolltoElement(wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/a")));
	  Thread.sleep(2000);
	  List<WebElement> ckbox = wd.findElements(By.className("cb1-element"));
	  System.out.println("SIZE OF CHECK BOX:"+ckbox.size());
	  for ( WebElement el : ckbox ) {
	     if ( !el.isSelected() ) {
		        el.click();
		    }
		   }
	  wd.findElement(By.id("check1")).click();
	
	  //redio button demo.
	  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/a")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/ul/li[3]/a")).click();
	  wd.findElement(By.name("optradio")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.id("buttoncheck")).click();
	  
	  //Group redio button demo.
	  wd.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label[1]/input")).click();
	  wd.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[3]/input")).click();
	  wd.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")).click();
	  
	  //Select dropdown list
	  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/a")).click();
	  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/ul/li[4]/a")).click();
	  Select dropdown = new Select( wd.findElement(By.id("select-demo")));
	   //dropdown.selectByVisibleText("Sunday");
	  //or you can select by test or index.
	  dropdown.selectByIndex(5);
	  
	  //Multi select list.
	  Select dropdown1 = new Select( wd.findElement(By.id("select-demo")));
	  dropdown1.selectByIndex(5);
	  wd.findElement(By.id("printAll")).click();
	  
	  //Contact us today page.
	  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/a")).click();
	  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/ul/li[5]/a")).click();
	  wd.findElement(By.name("first_name")).click();
	  wd.findElement(By.name("first_name")).sendKeys("Jitu");
	  wd.findElement(By.name("last_name")).click();
	  wd.findElement(By.name("last_name")).sendKeys("Sawant");
	  wd.findElement(By.name("email")).click();
	  wd.findElement(By.name("email")).sendKeys("sawant.jitendra0@gmail.com");
	  wd.findElement(By.name("phone")).click();
	  wd.findElement(By.name("phone")).sendKeys("Sawant");
	  wd.findElement(By.name("address")).click();
	  wd.findElement(By.name("address")).sendKeys("Andheri");
	  wd.findElement(By.name("city")).click();
	  wd.findElement(By.name("city")).sendKeys("Mumbai");
	  Select statelist = new Select( wd.findElement(By.name("state")));
	  statelist.selectByIndex(2);
	  scrolltoElement(wd.findElement(By.name("zip")));
	  wd.findElement(By.name("zip")).click();
	  wd.findElement(By.name("zip")).sendKeys("400093");
	  wd.findElement(By.name("website")).click();
	  wd.findElement(By.name("website")).sendKeys("www.google.com");
	  wd.findElement(By.xpath("//*[@id='contact_form']/fieldset/div[10]/div/div[1]/label/input")).click();
	  wd.findElement(By.name("comment")).click();
	  wd.findElement(By.name("comment")).sendKeys("Automation testing");
	  wd.findElement(By.xpath("//*[@id='contact_form']/fieldset/div[13]/div/button")).click();
	 
	  //jquery select dropdown.
	  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/a")).click();
	  wd.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/ul/li[7]/a")).click();
	  Select ddrcountry = new Select( wd.findElement(By.id("country")));
	  ddrcountry.selectByVisibleText("India");
	  scrolltoElement( wd.findElement(By.id("country")));
	  
	  //jquery multi select- Search and select mulitpal state.
	  Select ddrstate = new Select( wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/select")));
	  ddrstate.selectByVisibleText("Alabama");
	  ddrstate.selectByVisibleText("Alaska");
	  
	  //drop down with disabled value.
	  Select ddter = new Select( wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[2]/select")));
	  ddter.selectByVisibleText("American Samoa");
	 
	  //drop down with category related option.
	  Select cateopt = new Select( wd.findElement(ByLinkText.id("files")));
	  wd.findElement(By.xpath("//*[@id='files']/optgroup[2]/option[3]")).click();
	  
	  
	  // click on dowload button.
	  wd.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
	  wd.findElement(By.id("downloadButton"));
	  Thread.sleep(2000);
	  
	  
	}
	catch (Exception e){
		
		e.printStackTrace();
		Assert.assertTrue(false,"Test Failed");
		
	}
}



@AfterSuite
public void testend(){
	System.out.println("Entered in after suite method.");
	
	wd.quit();
	
}

}
