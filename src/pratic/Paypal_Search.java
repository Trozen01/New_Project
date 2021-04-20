package pratic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paypal_Search {
public static WebDriver dr;
public static String vUrl; 
	
	public static void main(String[] args) {
		try{
		vUrl="https://www.paypal.com";
		
		// TODO Auto-generated method stub
		//Lunch driver
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
		//open website 
		dr = new ChromeDriver();
		dr.get(vUrl);
		dr.findElement(By.linkText("Send")).click();
		dr.findElement(By.xpath("//*[@id='to_email']")).sendKeys("jitu");
		dr.findElement(By.xpath("//*[@id='amount_send']")).sendKeys("1000");
		dr.findElement(By.xpath("//*[@id='currency_code']")).sendKeys("AUD");
		dr.findElement(By.xpath("//*[@id='sendmoney-step-1']")).click();
		
		dr.quit();
	}
		catch(Exception e)
		{
			
			
		}
	}


}
