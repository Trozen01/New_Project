package pratic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Captcha {
public static WebDriver dr;
public static String vUrl,vName,vEmail,vLocation,vTextvalue,vFinalValue;
public static int vNum1,vNum2,vTotal;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vUrl="www.timesofindia";
		//1.Lounch Driver.
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
		dr = new ChromeDriver();
		
		dr.get(vUrl);
		dr.findElement(By.xpath("")).sendKeys(vName);
		dr.findElement(By.xpath("")).sendKeys(vEmail);
		dr.findElement(By.xpath("")).sendKeys(vLocation);
		vTextvalue=dr.findElement(By.xpath("")).getText();
		
		//get value from text box.
		System.out.println(vTextvalue.substring(0,1));
        System.out.println(vTextvalue.substring(2,1));
        
        //convert values from string to int.
        vNum1=Integer.parseInt(vTextvalue.substring(0,1));
        vNum2=Integer.parseInt(vTextvalue.substring(2,1));
        
        //convert total value int to string.
        vTotal= vNum1+vNum2;
        System.out.println("Total is->"+vTotal);
        vFinalValue=String.valueOf(vTotal);
        dr.findElement(By.xpath("")).sendKeys(vFinalValue);
        
	}

}