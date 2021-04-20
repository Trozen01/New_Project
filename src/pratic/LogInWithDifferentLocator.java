package pratic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInWithDifferentLocator {
public static WebDriver dr;
public static String vUrl, vId, vPassword, vpageTitle, vExpectedTitle, vPageUrl,vPageSource ;
	
	public static void main(String[] args) {
		try{
		// TODO Auto-generated method stub
        vUrl ="https://www.gmail.com";
        vId="sawant";
        vPassword = "565656";
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
        dr = new ChromeDriver();
        vpageTitle = dr.getTitle();
        vPageUrl = dr.getCurrentUrl();
        System.out.println("Current page URl is-->"+vPageUrl);
        vPageSource = dr.getPageSource();
        System.out.println("current page source is-->"+vPageSource);
        vExpectedTitle = "Gmail";
         if(vExpectedTitle.equals(vpageTitle))
         {
         dr.findElement(By.id("identifierId")).sendKeys(vId);
         dr.findElement(By.linkText("Next")).click();
         dr.findElement(By.xpath("//*[@id='password']")).sendKeys("vPassword");
         dr.findElement(By.linkText("Next")).click();
         dr.quit();
         }
         else
         {
        	 dr.quit();
         }
         
		
		} 
		catch(Exception e)
		{
			System.out.println("exception is-->"+e);
			dr.quit();
		}
	
	}

}