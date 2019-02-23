package Zipgo.InterCity.agentsGroup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import library.Utility;

public class AgentGroupsList extends CreateGroup {
	final static By agentGroups = By.xpath("//a[text()='Agent Groups']");
	final static By agentsGroupsList = By.xpath("//a[text()='Agent Groups List']");
	
	String name;

	
	
	
	@Test(priority = 1, invocationCount = 1, enabled = true)
	public void createGroup() throws IOException, InterruptedException {
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
			driver.findElement(agentGroups).click();
			Thread.sleep(3000);
			driver.findElement(agentsGroupsList).click();
			
			
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
