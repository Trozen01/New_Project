package pratic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_captures {
public static WebDriver dr;
public static String vUrl;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
		vUrl="https://www.hdfcbank.com/";
		//1.Lounch Driver.
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get(vUrl);
		getscreenshot();
		
		}
		catch(Exception ex){
			
			getscreenshot();
		}
		finally {
			dr.close();
		}
		}
	
	public static void getscreenshot() throws Exception 
    {
		    // Call getScreenshot method to create image file.
            File scrFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);      
         
            //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("D:\\jitu\\migration\\selenium\\New_Project\\screeshot\\screenshot.png"));
    }

}