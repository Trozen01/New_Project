package pratic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class TestiNG_Practical {
	
	@BeforeSuite
	public void initializationselenium()
	{
		System.out.println("Init selenium");
	}
	
	@BeforeTest
	  public void connectToDB() {
		System.out.println("It connecting to DB==>@beforeTest");
	  }
	
    @Test(priority=1)
     public void logIn() {
    	System.out.println("Merchant onboarding ");
     }
    
    @Test(priority=2)
    public void assetsSwap()
    {
    	System.out.println("swap assets from downgread to upgread");
    }
    
    @Test(priority=3)
    public void deleteMerchant()
    {
    	System.out.println("Merchant delete");
    }
    
    @BeforeMethod
    public void openBrowser() {
	  System.out.println("open The browser==>@beforemethod");
    }
    
    @AfterMethod
    public void closeBrowser() {
    System.out.println("close the browser==>@aftermethod");
    System.out.println("=======================");
    }
   
    @AfterTest
    public void closeConnection() {
	   System.out.println("closeConnection()");
    }
   
    @AfterSuite
   public void shutdownSelenium()
   {
	   System.out.println("selenium object is realised");
   }

}
