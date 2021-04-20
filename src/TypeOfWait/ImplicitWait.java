package TypeOfWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static WebDriver dr;

	public static void main(String[] args) throws InterruptedException {

		String url = "http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html";

		// 1.lunch driver.
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\Browserexe\\chromedriver.exe");

		// 2.open crome driver.
		dr = new ChromeDriver();
		dr.get(url);

		dr.manage().window().maximize();
		
		// It sets an implicit wait after the instantiation of WebDriver instance variable
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

	}

}
