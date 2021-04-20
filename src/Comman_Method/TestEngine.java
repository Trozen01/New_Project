package Comman_Method;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestEngine {
public static WebDriver dr;
static Properties prop = new Properties();



	public static void setupSuite() throws Throwable {

		try {

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\Browserexe\\chromedriver.exe");

			// 2.open crome driver.
			dr = new ChromeDriver();

			// find configuration properties file.
			FileInputStream fis = new FileInputStream("D:\\jitu\\migration\\selenium\\New_Project\\src\\Comman_Method\\Configuration.propeties");
			
			// make a object of the properties.
			
			// load configuration properties file in properties objects.
			prop.load(fis);
			// get url from properties. `
			dr.get(prop.getProperty("baseUrl"));
		
		    
			String username =prop.getProperty("username");
		    String password =prop.getProperty("password");
		   	ActionEngine.waitForElementPresent(Locator.Username, "Username file Present");
		   	ActionEngine.type(Locator.Username, username,"UserID Entered Sucessfully");
	        ActionEngine.waitForElementPresent(Locator.Password, "Password Present");
		  	ActionEngine.type(Locator.Password, password,"Password Entered Sucessfully");
	     	ActionEngine.click(Locator.loginButton,"Login Button Clicked Successfully");
			

		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		
}
