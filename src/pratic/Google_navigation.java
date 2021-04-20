package pratic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google_navigation {
public static WebDriver dr;
public static String url;

	
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
	
	dr = new ChromeDriver();
	dr.navigate().to(url);
	Thread.sleep(1000l);
	dr.findElement(By.id("")).click();
	Thread.sleep(2000l);
	dr.navigate().back();
	Thread.sleep(2000l);
	dr.navigate().forward();
	dr.navigate().back();
	
}
}
