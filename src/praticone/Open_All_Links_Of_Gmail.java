package praticone;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_All_Links_Of_Gmail {
public static WebDriver wd;
public static String url;

	public static void main(String[] args) throws InterruptedException {
		url ="https://www.gmail.com/";
		 System.out.println(System.getProperty("user.dir"));
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");

			//2.open crome driver.
			wd =  new ChromeDriver();	
			wd.get(url);
			wd.manage().window().maximize();
		    wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	    
		    
		    
		    List<WebElement> link = wd.findElements(By.tagName("a"));
		    System.out.println(link.size());

		    
		    for (WebElement link2: link) {
		    	
		    	//print the links i.e. http://google.com or https://www.gmail.com
		    	System.out.println(link2.getAttribute("href"));

		    	//print the links text
		    	 System.out.println(link2.getText());
              }

	}

}
