package WaitAndTimes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncchronizationInSelenium {
public static WebDriver dr = null;
public static String url;
	

	public static void main(String[] args) {

		try {

			url = "https://www.facebook.com/";
			System.out.println(System.getProperty("user.dir"));

			// 1.lunch driver.
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\Browserexe\\chromedriver.exe");

			// 2.open crome driver.
			dr = new ChromeDriver();
			dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// implicitlyWait is always applied globally. --is available for all webelements.when driver is interacting to webelements then it will be applied for that element.   
			
			dr.get(url);
			WebElement email= dr.findElement(By.id("email"));
			WebElement pword= dr.findElement(By.id("pass"));
			WebElement login= dr.findElement(By.xpath("//button[@name='login']"));
			
			sendKey(email, 10, "abce");
			sendKey(pword, 11, "123466");
			clickOn(login, 7);

		} catch (Exception e) {

			System.out.println("Exception is:- " + e);
		}

	}
	
	public static void sendKey( WebElement locator,int timeout, String value)
	{
		WebDriverWait a = new WebDriverWait(dr, timeout);
		a.until(ExpectedConditions.visibilityOf(locator));
		locator.sendKeys(value);
	}
	
	public static void clickOn(WebElement element,int timeout){
		WebDriverWait a = new WebDriverWait(dr, timeout);
		a.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
}


// all wait is dynamic wait.(implicitly wait, explicit wait, pageloadTimeout) dynamic wait means if the page is load in 2sec rest time will ignore.
//Thread.sleep(2000) is static wait.
//implicitlyWait=1.It will Wait till given time if element is visible then he go head. if element is not visible in given time then he give exception as No Such Element Exception.
//               2.if element is found with in 2 second then selenium will ignore that 8 second and move for next action.

//We use explicity wait use for partical refreshment page(Ajax component)score from cricket website, banner form Ecommerce website.  	

// can we do the implicitly wait and explicit wait together? No, because implicitly wait is global wait and it will wait till 20 second and explicit wait also wait for 7 second so selenium will confuse which weight we following so in lager appliaction most of the time avoid implicitly wait.  
//we can override implicitly wait. we can declare many time in project in any where.

//explicit wait
//1.no explicit keyword or method.
//2.It avaliable with WebdriverWait with some Expectedcondiations.
//3.It is specific to elements
//4.Dynamic in nature.
//5.We should never use implicitly wait and explicit wait together.
//  Because Selenium WebDriver will wait for the element first because of IMPLICIt WAIT and then EXPLICIT WAIT will applied
//  hence total sync time will increase for each element.
//it execute on client machine where we write code it is clear coating to element 



//implicitly wait
//1.is always applied globally.
//2.It can be change any where and at a time in your code.
//3.Dynamic in nature.
//4.Executed on the remort side (browser side)  it used(Remort.Connection.execute();)

//Difference 

//--Ex Wait very well documented and defind behaviour.    --- IMP wait is undocumented 
//--Runs at local part of selenium code customize it      --- Runs on Remote side of selenium webdriver.
//--Not for only elements, also for other options.        --- Only work for selenium elements
//--Ignor the exceptions.                                 --- can not be customized.
//--We need specify 'Expected condiations'in ex wait     --- we need not specify 'Expected condiations'in IMP wait. 



















