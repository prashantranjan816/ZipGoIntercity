package agentXpressPortal;

import java.io.IOException;

import org.testng.annotations.Test;

/* 
 * Pre condition:-
 * To test login page first disable @ BeforeClass() from XpressLogin.java 
 * Use Method of XpressLogin.java and  here with different  combination.
 */

public class LoginAllTestCases extends XpressLogin{
	String name;
	
	
	
	@Test(priority=1)
	public void loginWithHappyFlow() {
		class Local {};
	      name = Local.class.getEnclosingMethod().getName();
		System.out.println("Entered in >>"+name);
		
		BrowserOption();											// Launch Browser // without parameter normal GUI
		
		enterURL();
		
		loginHappyFlow();
		
		closeBrowser();
		
		
	}
	
//	@Test(priority=2)
	public void loginWithForgotPINFlow() throws InterruptedException {
		class Local {};
	      name = Local.class.getEnclosingMethod().getName();
		System.out.println("Entered in >>"+name);
		
		BrowserOption();											// Launch Browser // without parameter normal GUI
		try {
			select_URL();
		} catch (IOException e) {
			System.out.println("Please check URL");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}															//select URL
		
		
		pagedetailVerification();									//Verify the page details
		
		phoneNumber();												//Select phone number
		
		pin();														//select PIN
		
		forgotPIN();												//click on forgot PIN 
		sendOTP_Button();
		
		Thread.sleep(30000);										//Script sleep and Fill the OTP in this 30Sec.
		
		resetPIN();
		driver.findElement(clickOnReSetPIN).click();
		
//		loginLink();
		
		
//		closeBrowser();
		

	}

	
	public void loginWithoutNumber() {
		
	}
	
	public void loginWithwrongNumber() {
		
	}
	
	public void loginWithoutPIN() {
		
	}
	
	public void loginWithwrongPIN() {
		
	}
	
	public void validatePageTitle() {
		pagedetailVerification();									//Verify the page details
	}
	
	public void validatePageURL() {
		
	}
	
	public void validateMobileNumberLimit() {
		
	}
	
	public void validatePINNumberLimit() {
		
	}
	
	public void ValidatewrongOTP() {
		
	}
	
	public void ValidatecorrectOTP() {
		
	}
	
	public void ValidateSetNewPINlimit() {
		
	}
	
	public void ValidateConfirmPINlimit() {
		
	}

	public void ValidateResetButton() {
		
	}
	
	public void enterURL() {
		try {
			select_URL();
		} catch (IOException e) {
			System.out.println("Please check URL");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
