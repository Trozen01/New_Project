package praticone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendMailFromGmail {
public static String vUrl, userId, password;
public static WebDriver dr;

	public static void main(String[] args) {
		try {
			vUrl="https://www.gmail.com";
			userId = "sawant.jitendra0@gmail.com";
			password = "9869868899";
			//Lunch Driver.
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
			
			dr = new ChromeDriver();
			dr.get(vUrl);
			
			dr.manage().window().maximize();
		    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    Thread.sleep(2000);
		    
		    dr.findElement(By.id("identifierId")).sendKeys(userId);
		    
			dr.findElement(By.id("identifierNext")).click();	
			dr.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
			dr.findElement(By.id("passwordNext")).sendKeys(Keys.ENTER);
			
			//dr.switchTo().frame("embedded_data_iframe");
			
			dr.findElement(By.xpath("//div[@id=':lf']//div[@role='button' and @tabindex='0']")).click();
			
			
			dr.findElement(By.xpath("//div[@id=':qa']//textarea[@id=':qn']")).sendKeys(userId);
			dr.findElement(By.xpath("//input [@id=':vy']")).sendKeys("testmail");
			dr.findElement(By.xpath("//div [@id=':up']")).sendKeys("mail body");
			dr.findElement(By.xpath("//div [@id=':zr']")).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
