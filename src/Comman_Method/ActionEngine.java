package Comman_Method;

import org.openqa.selenium.By;
import org.testng.Assert;




public class ActionEngine extends TestEngine {
	
	public static boolean click(By locator, String locatorName) throws Throwable {
		boolean flag = false;
		try {
			dr.findElement(locator).click();

			flag = true;
		}
		catch (Exception e) {
			Assert.assertTrue(flag, "Unable to click on " + locatorName);
			e.printStackTrace();
		}

		return flag;
	}
	
	public static boolean waitForElementPresent(By by, String locator)throws Throwable {
		boolean flag = false;
		try {
			for (int i = 0; i < 5000; i++) {
				if (dr.findElement(by).isDisplayed()) {
					flag = true;
					return true;

				} else {
					Thread.sleep(100);

				}
			}

		} catch (Exception e) {

			Assert.assertTrue(flag,"Wait For requested Element Present : Falied to locate element ");

			e.printStackTrace();

			return false;
		} 

		return flag;

	}
	
	public static boolean type(By locator, String testdata, String locatorName)
			throws Throwable {
		boolean flag = false;
		try {
			dr.findElement(locator).click();
			dr.findElement(locator).clear();
			dr.findElement(locator).sendKeys(testdata);
			flag = true;

		} catch (Exception e) {
			Assert.assertEquals(false, true," type : Data typing action is not performed on  "
							+ locatorName);

			e.printStackTrace();
		
		}
		return flag;
	}

}
