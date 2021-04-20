package pratic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAlertsMsg {
public static WebDriver dr;
public static String url;

public static void main(String[] args) {
		// TODO Auto-generated method stub
	url = "https://mail.rediff.com/cgi-bin/login.cgi";
	//Lunch driver.
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
	dr = new ChromeDriver();
	//Open website
	dr.get(url);
	//Click on Go button for alert.
	dr.findElement(By.id("")).click();
	
	//handle alert message.
	Alert alert =dr.switchTo().alert();
	
	System.out.println("alert message is--->"+alert.getText());
	
	//Click on Ok button For accept the alert.
	alert.accept();
	
	//dismiss alert.
	alert.dismiss();
	
	dr.quit();
	
	
	}

}
