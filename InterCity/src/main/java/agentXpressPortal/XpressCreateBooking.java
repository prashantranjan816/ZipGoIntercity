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

public class XpressCreateBooking extends XpressLogin {
	final static By fromCIty 				= By.xpath("//input[@placeholder='eg. Delhi']");
	final static By fromCItyList 			= By.xpath("//a[@class='dropdown-item']");
	final static By toCity 					= By.xpath("//input[@placeholder='eg. Manali']");
	final String FROMCITY					= "chan";
	final String TOCITY						= "delhi";
	final static By tripDate 				= By.xpath("//*[@name='your_unique_id']");
	final static By search 					= By.xpath("//*[@class='searchButton btn btn-secondary']");
	final static By tripNameSelect 			= By.xpath("(//a[@class='view-trip'])[1]");
	final static By selectSeat	 			= By.xpath("(//td/span[@class='label'])[40]");  //Change the seat no.
	final static By cxName	 				= By.xpath("//input[@name='customerName']");
	final String CXNAME						= "AutomationKing1";
	final static By cxNumber	 			= By.xpath("//input[@name='customerNo']");
	final String CXNUMBER					= "9876543210";
	final static By cxEmail	 				= By.xpath("//input[@name='customerName']");
	final static By passengerGender	 		= By.xpath("(//input[@name='gender_0'])[1]");
	final static By pickuppoint	 			= By.xpath("(//select[@class='form-control'])[1]");
	final static By droppoint	 			= By.xpath("(//select[@class='form-control'])[2]");
	final static By cxFare	 				= By.xpath("//input[@name='customerFare']");
	final String FAREAMOUNT					= "300";
	final static By bookSeatsButton	 		= By.xpath("//button[@class='bookButton pull-right btn btn-success btn-lg']");	
	String NAME;
	
	
	@Test(priority = 1, invocationCount = 1, enabled = true)
//	Make sure method level argument should be same as no. of argument in Excel. [String username, String password, String isLoggedIn]
	public void xpressCreateBooking() throws IOException, InterruptedException {
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
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(fromCIty).sendKeys(FROMCITY);
		Thread.sleep(2000);
		driver.findElement(fromCIty).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(fromCIty).sendKeys(Keys.TAB);
	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(toCity).sendKeys(TOCITY);
		Thread.sleep(2000);
		driver.findElement(toCity).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(toCity).sendKeys(Keys.TAB);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(tripDate).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(tripDate).clear();
		Thread.sleep(2000);
		calender(2); 		//use base class method to get Booking date		 
		driver.findElement(tripDate).sendKeys(dateFinal);  
//		driver.findElement(tripDate).sendKeys("04/25/2019");  // MAnually serach date
		
		Thread.sleep(2000);
		driver.findElement(search).click();
		
		Thread.sleep(2000);
		driver.findElement(tripNameSelect).click();
		
		Thread.sleep(4000);
		driver.findElement(selectSeat).click();
		

//		===========--------------------------=========================
		
		WebElement TxtBoxContent1 = driver.findElement(selectSeat);
		TxtBoxContent1.getText();
		System.out.println("Printing getText() "+TxtBoxContent1);
		
//		===========--------------------------=========================

			  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			  driver.findElement(cxName).sendKeys(CXNAME);
			  
			  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			  driver.findElement(cxNumber).sendKeys(CXNUMBER);
			  
			  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			  driver.findElement(passengerGender).click();
			  
			  Select Select_Pickuppoint = new Select(driver.findElement(pickuppoint));
			  Select_Pickuppoint.selectByIndex(1);
			  
			  Thread.sleep(2000); Select Select_Droppoint = new
			  Select(driver.findElement(droppoint)); Select_Droppoint.selectByIndex(1);
			  
			  Thread.sleep(2000); driver.findElement(cxFare).sendKeys(FAREAMOUNT);
			  
			  Thread.sleep(2000); driver.findElement(bookSeatsButton).click();
			  
	
//		=============------------------=======================
			Thread.sleep(4000); Utility.getScreenshot(driver, NAME + "_ScreenShot");
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
	
	
	
//============================------------------------======================================================
	
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
