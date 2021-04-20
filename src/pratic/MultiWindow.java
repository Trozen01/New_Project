package pratic;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {
	public static WebDriver dr;
	public static String vUrl,vMainWindow,vSecondwindow;

		public static void main(String[] args) {
			
			vUrl="https://www.hdfcbank.com/";
			//1.Lounch Driver.
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.get(vUrl);
			
			//Create hash set and object 
			Set<String> winido=dr.getWindowHandles();
			//provide instraction to webdriver to iterate from one window to other window.
			Iterator<String> iterator=winido.iterator(); 
			
			//click on link and open new window.
			dr.findElement(By.xpath("")).click();//webdriver open second window.
			
			//get id of the each window(first window).
			winido=dr.getWindowHandles();
			iterator=winido.iterator();
			vMainWindow=iterator.next();// fatch current value.
			System.out.println("first Value is:-->"+vMainWindow);

			//get id of the second window.
			winido=dr.getWindowHandles();
			iterator=winido.iterator();
			vSecondwindow=iterator.next();
			System.out.println("second value is:"+vSecondwindow);
			
			//now make a focus on second window because mouse click showes on first window. 
			dr.switchTo().window(vSecondwindow);
			dr.close();
			
			//close first window.
			dr.switchTo().window(vMainWindow);
			dr.close();
			
			
		}

	}
