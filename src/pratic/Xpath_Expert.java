package pratic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Expert {
	public static String vUrl, vId, vPassword, vTitle, vCurrentTitle,vExpectedTitle, PageUrl, PageSource;
	public static WebDriver dr;

	public static void main(String[] args) {
		try {
			vUrl="https://www.expedia.co.in/";
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
			
			dr = new ChromeDriver();
			dr.get(vUrl);
			PageSource = "MUMBAI";
			vCurrentTitle = dr.getTitle();
			PageUrl = dr.getCurrentUrl();
			
			dr.findElement(By.xpath("//input[@id='hotel-destination-hp-hotel']")).sendKeys(PageSource);
			//dr.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys("3/10/2019");
			dr.findElement(By.xpath("//button[@type='button' and @class='datepicker-cal-date' and @data-day='3' and @data-month='9']")).click();
			
			
			//button[@type='button' and @class='datepicker-cal-date' and @data-day='3' and @data-month='9']
			
			//tbody[@class='datepicker-cal-dates']//button[@type='button' and @class='datepicker-cal-date' and @data-day='3' and @data-month='10']
			
			
			
		} catch (Exception e) {

		}

	}

}
