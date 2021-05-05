package pratic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class DropDown_SelectOptions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/tutor_connect/index.php"; driver.get(url);
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      Select s = new Select(driver.findElement(By.xpath("//select[@name=’selType’]")));
	      // select an option by value method
	      s.selectByValue("name");
	      Thread.sleep(1000);
	      // select an option by index method
	      s.selectByIndex(0);
	      Thread.sleep(1000);
	      // select an option by visible text method
	      s.selectByVisibleText("By Subject");
	      Thread.sleep(1000);
	      driver.quit();
	}

}
