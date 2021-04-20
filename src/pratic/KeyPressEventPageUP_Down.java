package pratic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressEventPageUP_Down {
public static WebDriver dr;
public static String url,mPoint;

	
public static void main(String[] args) throws InterruptedException {
	  // TODO Auto-generated method stub
   //lounch driver.
	url="https://www.gmail.com";
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
  Thread.sleep(1000l);
	dr = new ChromeDriver();
	//open website.
  dr.get(url);
  Thread.sleep(1000l);
  dr.findElement(By.linkText("")).click();
  Thread.sleep(1000l);
  mPoint=dr.findElement(By.id("")).getText();
  Thread.sleep(1000l);
  System.out.println("main pointing text is-->"+mPoint);
  //Page up Event. 
  Thread.sleep(1000l);
  dr.findElement(By.id("")).sendKeys(Keys.PAGE_DOWN);
  
  //Page Down Event.
  Thread.sleep(1000l);
  dr.findElement(By.id("")).sendKeys(Keys.PAGE_UP);
  
  //Go to back page.
  dr.findElement(By.id("")).sendKeys(Keys.BACK_SPACE);
  Thread.sleep(1000l);
  dr.close();
}
}
