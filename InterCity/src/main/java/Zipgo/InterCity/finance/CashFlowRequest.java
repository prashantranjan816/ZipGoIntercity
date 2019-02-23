package Zipgo.InterCity.finance;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Zipgo.InterCity.LoginPage;
import library.Utility;

public class CashFlowRequest extends LoginPage{
	
	final static By finance = By.xpath("//a[text()='Finance']");
	final static By cashFlowRequests = By.xpath("//a[text()='Cash Flow Requests']");
	String name;

	@Test(priority = 1, invocationCount = 1, enabled = true)
	public void cashFlowRequests() throws IOException, InterruptedException {
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
			driver.findElement(finance).click();
			driver.findElement(cashFlowRequests).click();
			Thread.sleep(3000);
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
