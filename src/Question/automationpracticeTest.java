package Question;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class automationpracticeTest {
	public static String url; 	
	public static WebDriver dr;	
	
  @Test
  public void Task() throws InterruptedException {
	  
		url ="http://automationpractice.com/index.php";
        System.out.println(System.getProperty("user.dir"));

		//1.lunch driver.
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\Browserexe\\chromedriver.exe");
		
		//2.open crome driver.
	    dr =  new ChromeDriver();	
	    dr.get(url);
	    dr.manage().window().maximize();
	    dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    
	    dr.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account' and @title='Log in to your customer account']")).click();
	 
        //Log In.
        dr.findElement(By.id("email")).sendKeys("abcd01.jitendra0@gmail.com");
        dr.findElement(By.id("passwd")).sendKeys("Abcde");
        dr.findElement(By.id("SubmitLogin")).click();
        
        
        Actions action = new Actions(dr);
        WebElement women = dr.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category' and @title='Women']"));
        action.moveToElement(women).perform();
        
        
        dr.findElement(By.xpath("//a[@title='Women']//parent::li//ul//ul//li[1]//a[@title='T-shirts']")).click();
        
        dr.findElement(By.xpath("//*[@id='center_column']//ul//li//div//div[1]//div//a[1]//img")).click();
        
        
       dr.switchTo().frame(0);
       Thread.sleep(3000);
       
       dr.findElement(By.xpath("//form[@id='buy_block']//div//p//a//i[@class='icon-plus']")).click();
        
       dr.findElement(By.xpath("//p[@id='add_to_cart']")).click();

       dr.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();

       

       String productprice =  dr.findElement(By.id("total_product")).getText();
       String replace = productprice.replace("$","");
       float  Productprice = Float.valueOf(replace.trim());
       System.out.println("Two Tshart price: "+Productprice);

       String productchar = dr.findElement(By.id("total_shipping")).getText();
       String replaceone = productchar.replace("$","");
       float  Productpriceone = Float.valueOf(replaceone.trim());
       System.out.println("Total shipment charges is:-" +Productpriceone);
       
       String producttotpurch = dr.findElement(By.id("total_price_container")).getText();
       String replacethree = producttotpurch.replace("$","");
       float  totalprice = Float.valueOf(replacethree.trim());
       System.out.println("Total Price of Tow Tshart and shiping charges is " +totalprice);
              
       
       if(totalprice >= 0){
    	   
    	   
    	   float Vertotalprice = Float.sum(Productprice,Productpriceone);
    	   
    	   if(Vertotalprice == totalprice)
    	   {
    		   System.out.println("Total cost of Two Tshart and shipment chartes match with total invoice Amount ");
    	   }
    	   else
    	   {
    		   System.out.println("Total cost of Two Tshart and shipment chartes not match with total invoice Amount ");
    	   }
    		   
       }
       else{
    	   
    	   System.out.println("Please do the check out process properlly");
       }

  
       dr.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")).click();
       dr.findElement(By.xpath("//button[@name='processAddress']")).click();
       
       dr.findElement(By.id("cgv")).click();
       dr.findElement(By.xpath("//button[@name='processCarrier']")).click();
     
       dr.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?fc=module&module=bankwire&controller=payment'] ")).click();
       dr.findElement(By.xpath("//*[@id='cart_navigation']/button")).click();
       
       
       String  ab = dr.findElement(By.xpath("//*[@id='center_column']/div")).getText();
       System.out.println(ab);
       
       String[] arrOfStr = ab.split("reference "); 
       
       String a = arrOfStr[1];
       
       String[] arrOfStrr = a.split(" ");
       
       String b = arrOfStrr[0];
       
       System.out.println(b); 
     
       
       //Go to Order history and details.
       dr.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account' and @title='View my customer account']")).click();
       dr.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=history' and @title='Orders']")).click();
       
       
       
	  
	  
  }
}
