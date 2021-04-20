package TypeOfWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static WebDriver dr;

	public static void main(String[] args) throws InterruptedException {

		String url = "http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html";
		
		// 1.lunch driver.
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\Browserexe\\chromedriver.exe");

		// 2.open crome driver.
		dr = new ChromeDriver();
		dr.get(url);
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// Click on timer button to start
		dr.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		// Create object of WebDriverWait class and it will wait max of 20 seconds. By default it will accepts in Seconds
		WebDriverWait wait = new WebDriverWait(dr, 20);

		// Here we will wait until element is not visible, if element is visible then it will return web element or else it will throw exception
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

		// if element found then we will use- In this example I just called isDisplayed method
		boolean status = element.isDisplayed();

		// if else condition
		if (status) {
			System.out.println("===== WebDriver is visible======");
		} else {
			System.out.println("===== WebDriver is not visible======");
		}
	}

}
