package pratic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseMovementWithActionClass {
public static WebDriver dr;
public static String vUrl ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         vUrl="http://www.americangolf.co.uk";
         
         System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
         dr = new ChromeDriver();
         Actions act = new Actions(dr);
         
         WebElement icon = dr.findElement(By.xpath(""));
         
         //need check
         //act.dragAndDropBy(icon, 50, 10)
		

	}

}
