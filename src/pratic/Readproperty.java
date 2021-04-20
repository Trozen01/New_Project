package pratic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readproperty {
public static WebDriver dr;

	public static void main(String[] args) throws IOException {
		 try {

			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
				
				//2.open crome driver.
			    dr =  new ChromeDriver();	
			 
			    //find configuration properties file.
		        FileInputStream  fis  =new FileInputStream("D:\\jitu\\migration\\selenium\\New_Project\\Configuration.properties");
				
		        //make a object of the properties.
			    Properties prop = new Properties();
			    //load configuration properties file in properties objects.
			    prop.load(fis);

			     //get url from properties. `
				 dr.get(prop.getProperty("url"));
				 //get first name from properties. 
			     dr.findElement(By.name("first_name")).sendKeys(prop.getProperty("First"));
			     //get last name from properties.
			     dr.findElement(By.name("surname")).sendKeys(prop.getProperty("sname"));
			     //get last email from properties.
			     dr.findElement(By.name("email")).sendKeys(prop.getProperty("email"));
			     //get last Conform_email from properties.
			     dr.findElement(By.name("email_confirm")).sendKeys(prop.getProperty("emailconfirm"));
			     //get last uname from properties.
			     dr.findElement(By.name("username")).sendKeys(prop.getProperty("uname"));
			     //get last pword from properties.
			     dr.findElement(By.name("password")).sendKeys(prop.getProperty("pword"));
			     //get last passconfirm from properties.
			     dr.findElement(By.name("passwordconfirm")).sendKeys(prop.getProperty("passconfirm"));
			    
			    } catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
