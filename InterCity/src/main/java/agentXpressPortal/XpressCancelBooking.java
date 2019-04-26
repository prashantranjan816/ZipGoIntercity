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

public class XpressCancelBooking extends XpressLogin {
	final static By myBookings 						= By.xpath("//a[text()='My Bookings']");
	final static By bookingid 						= By.xpath("//td[@tabindex='1']");
	final static By cancelBookingForm 				= By.xpath("(//a[@class='nav-link'])[5]");
	final static By selectSeatForcancel 			= By.xpath("(//input[@type='checkbox'])[1]");
	final static By customerRefund 					= By.xpath("(//input[@class='form-control'][@value='0'])[2]");
	final static By confirn_cancell 				= By.xpath("//button[@class='btn btn-danger btn-lg btn-block']");
	final static By confirn_alert					= By.xpath("//button[@class='btn btn-primary']");
	final static By logout							= By.xpath("//button[@class='text-white btn btn-link']");
	

	String NAME;
	
	
	
	
	
	@Test(priority = 1, invocationCount = 1, enabled = true)
//	Make sure method level argument should be same as no. of argument in Excel. [String username, String password, String isLoggedIn]
	public void xpressCancelBooking() throws IOException, InterruptedException {
		try {
			
//			Bellow we are creating new anonymous inner class will be created during compile time & return us current method name.
			class Local {};
			NAME = Local.class.getEnclosingMethod().getName();
			System.out.println("Entered in >>"+NAME);
//			----------------------------------------------------------------------------------------------------------------
			Thread.sleep(2000);
			Utility.getScreenshot(driver, NAME + "_ScreenShot");	
			
			System.out.println(NAME);
			
//		========================----------------------========================			
/*			
Start Write code/TC here...

*/
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(myBookings).click();
			
			
			  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			  driver.findElement(bookingid).click();
			  
			  Thread.sleep(2000); driver.manage().timeouts().implicitlyWait(3,
			  TimeUnit.SECONDS); driver.findElement(cancelBookingForm).click();
			  
			  Thread.sleep(2000); driver.manage().timeouts().implicitlyWait(3,
			  TimeUnit.SECONDS); driver.findElement(selectSeatForcancel).click();
			  
			  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			  driver.findElement(customerRefund).sendKeys("100");
			  
			  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			  driver.findElement(confirn_cancell).click();
			  
			  Thread.sleep(2000); driver.manage().timeouts().implicitlyWait(3,
			  TimeUnit.SECONDS); driver.findElement(confirn_alert).click();
			
		 

//		==============---------------------------===================================
		  Thread.sleep(4000); Utility.getScreenshot(driver, NAME + "_ScreenShot");
		  System.out.println(NAME);
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
	
	
//	Use DataProvider to get data from excel (Web1.xlsx) & user above by put dataProvider = "testData" in @Test.
//	Excel is in location testData folder
	
	
	 @DataProvider(name = "testData", parallel = false)
	    public static Object[][] getTestData() throws IOException, URISyntaxException {
	        ExcelContext context = new ExcelContext();
	        context.setExcelFile("testData/Web.xlsx");
	        context.setSheetName("login");
	        Excel excelObj = new Excel(context);
	        String[][] testData = excelObj.getData("username", "password", "isLoggedIn");
	        return testData;
	    }
	
	

}
