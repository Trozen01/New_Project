package TestNG.MultithreadTestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MultiThreadTestNG {
	//public static WebDriver wd;
	public static String url;

	
	@Test
	public static void ScrollDown() throws InterruptedException{
		
		
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\Browserexe\\chromedriver.exe");

		// 2.open crome driver.
		WebDriver wd = new ChromeDriver();
		url = "https://www.google.com";
		wd.get(url);

		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
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
	public static void JaguarClassicBlue() throws InterruptedException{
		
		
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\Browserexe\\chromedriver.exe");

		// 2.open crome driver.
		WebDriver wdd = new ChromeDriver();
		url = "https://www.jaguar-fragrances.com/en";
		wdd.get(url);

		wdd.manage().window().maximize();
		wdd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wdd.close();
        System.out.println("JaguarClassicBlue find successfully");
         
	}
	
	@Test
	public static void ArmafClubDeNote() throws InterruptedException{
		
		
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\Browserexe\\chromedriver.exe");

		// 2.open crome driver.
		WebDriver wdw = new ChromeDriver();
		url = "https://smellalike.in/collections/armaf-perfumes-online-india";
		wdw.get(url);

		wdw.manage().window().maximize();
		wdw.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wdw.close();
		System.out.println("ArmafClubDeNote find successfully");
         
	}

}
