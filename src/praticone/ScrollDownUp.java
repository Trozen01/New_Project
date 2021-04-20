package praticone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUp {
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

		    JavascriptExecutor js = (JavascriptExecutor) wd;
		    WebElement element = wd.findElement(By.name("q"));
		    element.sendKeys("SoftwareTestingHelp");
		    element.sendKeys(Keys.ENTER);
		    js.executeScript("window.scrollBy(0,1000)");
            wd.close();

	}

}
