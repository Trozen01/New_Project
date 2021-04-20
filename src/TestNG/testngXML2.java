package TestNG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngXML2 {
	
	public static WebDriver wd;
	public static String url;

	@BeforeSuite
	public void testsetup() throws InterruptedException {
		System.out.println("entering before suite");

		url ="https://www.google.com";
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\Browserexe\\chromedriver.exe");

		// 2.open crome driver.
		wd = new ChromeDriver();
		wd.get(url);

		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println("before suite complected successfully");
		
	}

		
	@Test
	public static void ScrollDown() throws InterruptedException{
		
		System.out.println("Scroll down testcase successfully start");
		 JavascriptExecutor js = (JavascriptExecutor) wd;
		    WebElement element = wd.findElement(By.name("q"));
		    element.sendKeys("SoftwareTestingHelp");
		    element.sendKeys(Keys.ENTER);
		    js.executeScript("window.scrollBy(0,1000)");
		    Thread.sleep(2000);
            wd.close();
            System.out.println("Scroll down successfully done");
         
	}
	
	@Test
	public static void PrimeNo(){
		
		int x = 47;
		boolean isprime = true;

		for (int i = 2; i <= x / 2; i++) {
			int a = x % i;
			
			if (x % i == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}
	}
	
	@AfterSuite
	public void testend(){

		System.out.println("Entered in after suite method.");
		wd.quit();
		
	}
	
	

}
