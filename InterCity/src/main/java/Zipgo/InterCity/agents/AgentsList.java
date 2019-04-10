package Zipgo.InterCity.agents;

import java.io.IOException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Zipgo.InterCity.LoginPage;
import library.Utility;
import utils.Excel;
import utils.ExcelContext;

public class AgentsList extends LoginPage {
	
	final static By agents 				= By.xpath("//a[text()='Agents']");
	final static By AgentList 			= By.xpath("//a[text()='Agents List']");
	final static By search 				= By.xpath("//input[@type='text']");
	String searchtaxt 					="abc";
	String name;
	
	
	@Test(priority = 1, invocationCount = 1, enabled = true)
//	Make sure method level argument should be same as no. of argument in Excel. [String username, String password, String isLoggedIn]
	public void AgentsListmethod() throws IOException, InterruptedException {
		try {
			
//			Bellow we are creating new anonymous inner class will be created during compile time & return us current method name.
			class Local {};
		      name = Local.class.getEnclosingMethod().getName();
			System.out.println("Entered in >>"+name);
//			----------------------------------------------------------------------------------------------------------------
			Thread.sleep(3000);
			driver.findElement(agents).click();
			driver.findElement(AgentList).click();
			Thread.sleep(3000);
//			driver.findElement(search).sendKeys(username);
//			driver.findElement(search).clear();
//			driver.findElement(search).sendKeys(password);
			driver.findElement(search).sendKeys(searchtaxt);
			Utility.getScreenshot(driver, name + "_ScreenShot");
/*			
Write code here..
1
2

*/			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Utility.getScreenshot(driver, name + "_Fail_ScreenShot");
			System.out.println("please re-check method >>"+name);
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
