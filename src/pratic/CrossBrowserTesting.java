package pratic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {
	public static WebDriver driver;
	public static String url;
	public static String browser;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		browser = "chrome";
		url = "http://www.google.com";
		switch (browser) {
		case "firefox":

			// step1: launch driver.
			System.setProperty(
					"webdriver.gecko.driver",
					System.getProperty("user.dir")
							+ "\\src\\test\\resources\\BrowserEXE\\geckodriver.exe");
			// step2: launch driver.
			driver = new FirefoxDriver();
			break;

		case "chrome":

			// step1: launch driver.
			System.setProperty(
					"webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ "\\src\\test\\resources\\BrowserEXE\\chromedriver.exe");

			driver = new ChromeDriver();
			break;

		case "ie":

			// step1: launch driver.
			System.setProperty(
					"webdriver.ie.driver",
					System.getProperty("user.dir")
							+ "\\src\\test\\resources\\BrowserEXE\\IEDriverServer.exe");

			// step2: launch driver.
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("browser name is wrong-->" + browser);

			break;
		}
		driver.get(url);
		driver.quit();
	}

}
