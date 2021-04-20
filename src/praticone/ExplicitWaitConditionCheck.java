package praticone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConditionCheck {
public static WebDriver wd;
public static String url;

	public static void main(String[] args) throws InterruptedException {
		
		 url ="https://www.google.com";
		 System.out.println(System.getProperty("user.dir"));
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");

			//2.open crome driver.
			wd =  new ChromeDriver();	
			wd.get(url);
			wd.manage().window().maximize();
		    wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    Thread.sleep(2000);
		    
		    WebElement element = wd.findElement(By.name("q"));
		    element.sendKeys("Testing");
		    element.submit();
		    
		    //Explicit Wait Condition.
		    WebDriverWait wait = new WebDriverWait(wd, 20);
		    WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Software testing - Wikipedia")));
		    
		    element2.click();

	}

}
