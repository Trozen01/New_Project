package demo.automationTsting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTestingSite {
	public static WebDriver wd;
	public static String url;

	public static void main(String[] args) {

		try {
			System.out.println("entering before suite");

			url = "http://demo.automationtesting.in/Register.html";
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\Browserexe\\chromedriver.exe");

			// 2.open crome driver.
			wd = new ChromeDriver();
			wd.get(url);
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);

		} catch (Exception e) {

		}

	}

}
