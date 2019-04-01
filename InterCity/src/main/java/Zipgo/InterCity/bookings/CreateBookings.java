package Zipgo.InterCity.bookings;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Zipgo.InterCity.LoginPage;
import library.Utility;

public class CreateBookings extends LoginPage {
	final static By bookings 				= By.xpath("//a[text()='Bookings']");
	final static By bookingsList 			= By.xpath("//a[text()='Bookings List']");
	final static By createbookings 			= By.xpath("//a[text()='Create Booking']");
	final static By fromCity 				= By.xpath("(//input[@class='rbt-input-main form-control rbt-input '])[1]");
	final static By toCity 					= By.xpath("(//input[@class='rbt-input-main form-control rbt-input '])[2]");
	final static By booingAgent 			= By.xpath("(//input[@class='rbt-input-main form-control rbt-input '])[3]");
	final static By searchButton 			= By.xpath("//button[@class='btn btn-info btn-block']");
	String name;
	String FROMECITY 						= "chandigarh";
	String TOCITY 							= "Delhi";
	String BOOKINGAGENT 					= "Prashu Kala Jain";

	@Test(priority = 1, invocationCount = 1, enabled = true)
	public void createBooking() throws IOException, InterruptedException {
		try {

			// Bellow we are creating new anonymous inner class will be created during
			// compile time & return us current method name.
			class Local {
			}
			;
			name = Local.class.getEnclosingMethod().getName();
			System.out.println("Entered in >>" + name);
			// ----------------------------------------------------------------------------------------------------------------
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(bookings).click();
			driver.findElement(createbookings).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Utility.getScreenshot(driver, name + "_ScreenShot");
			Thread.sleep(2000);
			driver.findElement(fromCity).sendKeys(FROMECITY,Keys.ENTER);
			Thread.sleep(3000);
//			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			driver.findElement(toCity).sendKeys(TOCITY,Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
//			driver.findElement(booingAgent).sendKeys(BOOKINGAGENT,Keys.ENTER);
//			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(searchButton).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
