package Zipgo.InterCity.agents;
import java.io.IOException;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Zipgo.InterCity.LoginPage;
import library.Utility;

public class InvitedAgents extends LoginPage {
	
	
	
	final static By agents 				= By.xpath("//a[text()='Agents']");
	final static By invitedAgent 		= By.xpath("//a[text()='Invited Agents List']");
	final static By search 				= By.xpath("//input[@type='text']");
	String searchtaxt 					="abc";
	String name;
	
	
	
	
	
	@Test(priority = 1, invocationCount = 1, enabled = true)
	public void InvitedAgentsList() throws IOException, InterruptedException, EmailException {
		Mail.ReportEmail_Send.sendMail();
//		try {
			
//			Bellow we are creating new anonymous inner class will be created during compile time & return us current method name.
			class Local {};
		      name = Local.class.getEnclosingMethod().getName();
			System.out.println("Entered in >>"+name);
//			----------------------------------------------------------------------------------------------------------------
			Thread.sleep(3000);
			driver.findElement(agents).click();
			driver.findElement(invitedAgent).click();
			Thread.sleep(3000);
			driver.findElement(search).sendKeys(searchtaxt);
			Thread.sleep(3000);
			Utility.getScreenshot(driver, name + "_ScreenShot");
/*			
Write code here..
1
2

*/			
		/*	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Utility.getScreenshot(driver, name + "_Fail_ScreenShot");
			System.out.println("please re-check method >>"+name);
			e.printStackTrace();
		}
		
		
		finally {
			closeBrowser();
		}*/
	
	}

	
	
	
	
	
	
	

}
