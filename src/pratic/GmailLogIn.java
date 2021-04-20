package pratic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogIn {
public static String vUrl, vId, vPassword, vTitle, vCurrentTitle, vExpectedTitle, PageUrl, PageSource;
public static WebDriver dr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//url="https://www.gmail.com/";
			vUrl="https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier";
			vId="sawant.jitendra0";
			vPassword="jiytr";
		//System.out.println(System.getProperty("user.dir"));
		//Lunch Driver.
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
		//step3: open website.
		dr = new ChromeDriver();
		dr.get(vUrl);
		vExpectedTitle = "Gmail";
		vCurrentTitle = dr.getTitle();
		PageUrl = dr.getCurrentUrl();
		System.out.println("current page URL is-->"+PageUrl);
		PageSource = dr.getPageSource();
		System.out.println("page source is-->" +PageSource);
		if(vExpectedTitle.equals(vCurrentTitle))
		{
		Thread.sleep(5000l);
		//dr.findElement(By.id("identifierId")).sendKeys("sawant.jiterndra");
		
		dr.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(vId);
		Thread.sleep(5000l);
		dr.findElement(By.xpath("//*[@id='next']")).click();
		Thread.sleep(5000l);
		dr.findElement(By.xpath("//*[@id='password']")).sendKeys(vPassword);
		Thread.sleep(5000l);
		dr.findElement(By.xpath("//*[@id='passwordNext']")).click();
		Thread.sleep(5000l);		
		dr.quit();
		}
		else
		{
			System.out.println("Current tile is not match with Expected Title");
			dr.quit();	
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception message-->" +e);
			
		}
		finally {
			dr.quit();
		}
		
		
	}

}
