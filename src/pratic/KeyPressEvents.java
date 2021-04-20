package pratic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressEvents {
public static WebDriver dr;
public static String url,userId,password, eValve;

	
public static void main(String[] args) {
	
	try {
		
	// TODO Auto-generated method stub
	url="https://www.gmail.com";
	userId="sawant.jitendra0";
	//1.Lounch Driver.
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
	//2.open website.
	dr = new ChromeDriver();
	dr.get(url);
	Thread.sleep(1000l); 
	dr.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("userId");
	Thread.sleep(1000l);
	dr.findElement(By.id("")).sendKeys(Keys.ENTER);
	Thread.sleep(1000l);
	dr.findElement(By.xpath("//*[@id='password']")).sendKeys("vPassword");
	Thread.sleep(1000l);
	dr.findElement(By.id("")).sendKeys(Keys.ENTER);
    eValve =dr.findElement(By.id("")).getText();
    System.out.println("Error message is -->"+eValve);
	} catch (Exception e) {
	System.out.println("Exception is-->"+e);
	
	}
	
}

}


