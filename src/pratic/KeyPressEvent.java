package pratic;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class KeyPressEvent {
public static WebDriver dr;
public static String url,userId;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
				url="https://www.gmail.com";
				
				
				userId="sawant.jitendra0";
				//1.Lounch Driver.
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
				
				dr = new ChromeDriver();
				dr.get(url);
				dr.findElement(By.id("identifierId")).sendKeys("userId");
				dr.findElement(By.xpath("//*[@id='identifierNext']/div[2]")).click();
				dr.findElement(By.xpath("")).sendKeys("Hiii");
				dr.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		     
				//find dropdown
				WebElement dropdownoption = dr.findElement(By.xpath(""));
				
				//list of dropdown option need store in webelement.
				 List<WebElement> dropdownlist = dr.findElements(By.tagName(""));
				
				//print  dropdown 
				System.out.println("First value is-->"+dropdownlist.get(0).getText());
				
				//error message
				String eMsg =dr.findElement(By.xpath("")).getText();
				
				System.out.println("message is-->"+eMsg);
				
				dr.findElement(By.xpath("")).sendKeys(Keys.ENTER);
				
				//handle and display error message of java script alert box.
				Alert alert = dr.switchTo().alert();
				System.out.println("java script alert msg is-->"+alert.getText());
				//close alert message.
				alert.accept();

	}

}
