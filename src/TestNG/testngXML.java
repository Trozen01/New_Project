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

public class testngXML {
	public static WebDriver wd;
	public static String url;

	@BeforeSuite
	public void testsetup() throws InterruptedException {
		System.out.println("entering before suite");

		url ="https://www.google.com";
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+ "\\src\\Browserexe\\chromedriver.exe");

		// 2.open crome driver.
		wd = new ChromeDriver();
		wd.get(url);

		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println("before suite run successfully");
	}

	@Test
	public static void Fibonacci_Series() {

		int num, a = 0, b = 0, c = 1;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of times:-");
		//num = sc.nextInt();
        num = 10;
		
		System.out.println("Fibonacci Series of the number is:");

		for (int i = 0; i <= num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + "");
		}
	}
	
	
	
	@AfterSuite
	public void testend(){

		System.out.println("Entered in after suite method.");
		wd.quit();
		
	}

}
// testng xml file it is use for control to execution of testng test
// How does it control? ans:- By it can control by providing what packages
// Classes test can be included
// And excluded we can set dependances (we can set all the configurations.) 
// we have two ways for add new test case in suite and run 1. Add test case in class and run testngxml directly.. 2.add new test cases in xml file and then run.