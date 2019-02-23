package Zipgo.InterCity.allTrips;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Zipgo.InterCity.LoginPage;
import library.Utility;

public class AllTrips extends LoginPage {
	final static By alltrips = By.xpath("//a[text()='All Trips']");
	final static By alltrips1 = By.xpath("//a[text()='All Trips']");
	String name;

	@Test(priority = 1, invocationCount = 1, enabled = true)
	public void allTrips() throws IOException, InterruptedException {
		try {

			// Bellow we are creating new anonymous inner class will be created during
			// compile time & return us current method name.
			class Local {
			}
			;
			name = Local.class.getEnclosingMethod().getName();
			System.out.println("Entered in >>" + name);
			// ----------------------------------------------------------------------------------------------------------------
			Thread.sleep(3000);
			driver.findElement(alltrips).click();
			driver.findElement(alltrips1).click();

			Utility.getScreenshot(driver, name + "_ScreenShot");
			/*
			 * Write code here.. 1 2 3...
			 * 
			 */

		} catch (Exception e) {
			// TODO Auto-generated catch block
			Utility.getScreenshot(driver, name + "_Fail_ScreenShot");
			System.out.println("please re-check method >>" + name);
			e.printStackTrace();
		}

		finally {
			closeBrowser();
		}

	}

}
