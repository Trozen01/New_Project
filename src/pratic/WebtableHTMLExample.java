package pratic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebtableHTMLExample {
public static WebDriver dr;
public static String vUrl,vExpectedValue,vActualValue,vFirstValue;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          vUrl="www.google.com";
          //Expected value
          vExpectedValue="Clock Tower Hotel";
          //find row value.
          try {
			
          for(int i= 0;i<=5;i++)
          {
        	  vFirstValue=dr.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();
        	  System.out.println("first value is"+vFirstValue);
        	  
        	  if (vFirstValue.equalsIgnoreCase(vExpectedValue))
        	  {
        	  //find column value
        	  for(int j=0; i<=5;j++)
        	  {
        		  vFirstValue=dr.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
        		  
        	  }
        	  }
          }
          } catch (Exception e) {
  			// TODO: handle exception
        	  screenshot();
  		}
          finally {
			dr.close();
		}
		
	}
	
	public static void screenshot() throws Exception
	{
		 File scrFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
		
	}

}
