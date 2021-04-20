package pratic;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static String vUrl;
public static WebDriver dr;
	
	public static void main(String[] args) throws Exception {

		try {
		
			vUrl="https://demoqa.com/droppable/";
			//Lunch Driver.
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\BrowserEXE\\chromedriver.exe");
			
			dr = new ChromeDriver();
			dr.get(vUrl);
			
			dr.manage().window().maximize();
		    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    Thread.sleep(2000);

		    //Actions class method to drag and drop 
		    Actions builder = new Actions(dr);
		    
		    WebElement from = dr.findElement(By.id("draggable"));
		    
		    WebElement to = dr.findElement(By.id("droppable")); 
		    
		    
		    //Perform drag and drop
		    builder.dragAndDrop(from, to).perform();
		    
		    //verify text changed in to 'Drop here' box 
		    String textTo = to.getText();
		    
		    if(textTo.equals("Dropped!")) {
		    System.out.println("PASS: Source is dropped to target as expected");
		    }else {
		    System.out.println("FAIL: Source couldn't be dropped to target as expected");
		    }
		    
		    Thread.sleep(2000);
		    
		    dr.close();
		    Screenshot();
		    
		} 
		
		catch (Exception e) {
			Screenshot();
		}
		
		
	}
	public static void Screenshot() throws AWTException, IOException{
		
		Robot robot = new Robot();
		String format = "jpg";
        String path = "D:\\jitu\\migration\\selenium\\New_Project\\screeshot\\screeshot.jpg";
        
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
        ImageIO.write(screenFullImage, format, new File(path));
        System.out.println("A full screenshot saved!");
	}
	

}
