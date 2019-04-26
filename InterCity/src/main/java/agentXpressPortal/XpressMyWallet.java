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

public class XpressMyWallet extends XpressLogin {
	final static By myWallet 						= By.xpath("//a[text()='My Wallet']");
	final static By readAmount 						= By.xpath("//div[@class='h3 font-md']");
	final static By rechargeWallet 					= By.xpath("//button[@class='btn btn-primary']");
	final static By enterRechargeAmount 			= By.xpath("//input[@placeholder='Enter Amount']");
	final static String ENTERRECHARGEAMOUNT 		= "300";
	final static By confirmrechargeAmount 			= By.xpath("(//button[@class='btn btn-primary'])[2]");
	final static By confirmrechargAlert 			= By.xpath("(//button[@class='btn btn-primary'])[2]");
	final static By netBankingPayNow 				= By.xpath("//button[@id='netBankingButton']");
	final static By cashFreeSuccess 				= By.xpath("(//button[@type='submit'])[1]");
	String AvailableBalance;

	

	String NAME;
	
	
	
	
	
	@Test(priority = 1, invocationCount = 1, enabled = true)
//	Make sure method level argument should be same as no. of argument in Excel. [String username, String password, String isLoggedIn]
	public void xpressMyWallet() throws IOException, InterruptedException {
		try {
			
//			Bellow we are creating new anonymous inner class will be created during compile time & return us current method name.
			class Local {};
			NAME = Local.class.getEnclosingMethod().getName();
			System.out.println("Entered in >>"+NAME);
//			----------------------------------------------------------------------------------------------------------------
			Thread.sleep(2000);
			Utility.getScreenshot(driver, NAME + "_ScreenShot");	
			
			System.out.println(NAME);
			
//========================----------------------========================			
/*			
Start Write code/TC here...

*/
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(myWallet).click();
			
//==========----------Read The text(AvilableBalance)-----=======================
			AvailableBalance= driver.findElement(readAmount).getText();
			System.out.println("Before reharge Available Balance: "+AvailableBalance);
//==========-----------------------------------------------======================
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(rechargeWallet).click();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(enterRechargeAmount).sendKeys(ENTERRECHARGEAMOUNT);
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(confirmrechargeAmount).click();
			Thread.sleep(4000);
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(confirmrechargAlert).click();
//============----------Enter To Recharge Page-------==================
			Thread.sleep(4000);
			
			driver.navigate().refresh();
			System.out.println(driver.getCurrentUrl());
			
			
			Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(netBankingPayNow).click();
			
//============----------------CashFree Page--------========================
			Thread.sleep(4000);
			
			driver.navigate().refresh();
			System.out.println(driver.getCurrentUrl());
			
			
			Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(cashFreeSuccess).click();
			Thread.sleep(6000);
//=============-------------------------------------=========================
			
//==========----------Read The text(AvilableBalance)-----=======================
			AvailableBalance= driver.findElement(readAmount).getText();
			System.out.println("After Recharge Available Balance: "+AvailableBalance);
//==========-----------------------------------------------======================			  
			 
	
		
		
			
			
			
			
			 

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
