package agentXpressPortal;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.Utility;
import utils.Excel;
import utils.ExcelContext;

public class Demo extends XpressLogin {
	
	String NAME;
	
	
	@Test(priority = 1, invocationCount = 1, enabled = true)
//	Make sure method level argument should be same as no. of argument in Excel. [String username, String password, String isLoggedIn]
	public void XpressDemo() throws IOException, InterruptedException {
		try {
			
//			Bellow we are creating new anonymous inner class will be created during compile time & return us current method name.
			class Local {};
			NAME = Local.class.getEnclosingMethod().getName();
			System.out.println("Entered in >>"+NAME);
//			----------------------------------------------------------------------------------------------------------------
			Thread.sleep(2000);
			Utility.getScreenshot(driver, NAME + "_ScreenShot");	
			
			
/*			
Start Write code/TC here..

*/
	
			
			
			
			
			
	 

//		=============------------------=======================
			Thread.sleep(4000); Utility.getScreenshot(driver, NAME + "_ScreenShot");
			XpressLogin.XpressLogout();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Utility.getScreenshot(driver, NAME + "_Fail_ScreenShot");
			System.out.println("##ERROR msg:>>please re-check method >>"+NAME);
			e.printStackTrace();
		}
		
		
		finally {
			closeBrowser();
		}
	
	}
	
	

}
