package pratic;

import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipal_element {
public static WebDriver dr;
public static String url;
public static int i;

public static void main(String[] args) {
	// TODO Auto-generated method stub
	url="https://www.gmail.com";
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
    dr = new ChromeDriver();
	dr.get(url);
    
	dr.findElement(By.xpath("")).click();
	
	//Find Dropdown list.
	WebElement dropdown=dr.findElement(By.xpath(""));
    
	//extract all value from drop down list.
	java.util.List<WebElement> dropdownlist = dr.findElements(By.tagName("Option"));

	System.out.println("First value from list-->"+dropdownlist.get(0).getText());
	
	System.out.println("Total value is-->"+dropdownlist.size());
	
	
	
	for (i=0;i<dropdownlist.size();i++)
	{
		System.out.println("value from list-->"+dropdownlist.get(i).getText());
		i++;
		
	}
	
}

}
