package agentXpressPortal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Mail.ReportEmail_Send;
import Zipgo.InterCity.base.BasePage;
import library.Utility;

public class XpressLogin extends BasePage {
	
	final static String FileLocation 			= "./src/main/resources/agentXpressPortal.properties";
	final static String ChromeFileLocation 		= "./src/main/resources/chromedriver";
//	final static String SelectURL 				= "ProductionUrl";
	final static String SelectURL 				= "BetaUrl";
	final static By phoneNumber 				= By.xpath("//*[@id='mobileLogin']");
	final String PHONENUMBER 					= "8861364477";
	final static By pin1 			 			= By.xpath("(//*[@class='pincode-input-text'])[1]");
	final String PIN1 			 				= "1";
	final static By pin2 			 			= By.xpath("(//*[@class='pincode-input-text'])[2]");
	final String PIN2 			 				= "2";
	final static By pin3 			 			= By.xpath("(//*[@class='pincode-input-text'])[3]");
	final String PIN3 			 				= "3";
	final static By pin4 			 			= By.xpath("(//*[@class='pincode-input-text'])[4]");
	final String PIN4 			 				= "4";
	final static By r_pin1 			 			= By.xpath("(//*[@class='pincode-input-text'])[5]");
	final String r_PIN1 			 			= "1";
	final static By r_pin2 			 			= By.xpath("(//*[@class='pincode-input-text'])[6]");
	final String r_PIN2 			 			= "2";
	final static By r_pin3 			 			= By.xpath("(//*[@class='pincode-input-text'])[7]");
	final String r_PIN3 			 			= "3";
	final static By r_pin4 			 			= By.xpath("(//*[@class='pincode-input-text'])[8]");
	final String r_PIN4 			 			= "4";
	final static By login 			 			= By.xpath("//*[@class='btn btn-primary btn-block']");
	final static By loginLink 			 		= By.xpath("//button[@class='px-0 btn btn-link']");
	final static By loginPassword 				= By.id("loginPassword");
	final static By forgotPIN 					= By.xpath("//button[@class='px-0 btn btn-link']");
	final static By clickOnSendOTP 				= By.xpath("//button[@class='btn btn-primary btn-block']");
	final static By clickOnReSetPIN 			= By.xpath("//button[@class='btn btn-primary btn-block']");
	final static By signInButton 				= By.xpath("//input[@value='Sign in']");
	final static String mailid 					= "prashant.ranjan@zipgo.in";
	final static String mailpwd 				= "ZipgoMay@123";
	final static By logout						= By.xpath("//button[@class='text-white btn btn-link']");
	String NAME;
	

	@BeforeClass()
	public void loginIntercityDashboard() throws IOException, InterruptedException {
		BrowserOption("headless");											// Launch Browser // without parameter normal GUI
		select_URL();												//select URL
		pagedetailVerification();									//Verify the page details
		loginHappyFlow();
	
	}
	

	@AfterClass()
	public static void afterclass() throws MalformedURLException, EmailException {
		ReportEmail_Send.sendMail("prashant.ranjan@zipgo.in");
	}
	
	
	
	
//===================--------------All test Case------------==========================================

	public void loginHappyFlow() {
		class Local {};
	      NAME = Local.class.getEnclosingMethod().getName();
		System.out.println("Entered in >>"+NAME);
		phoneNumber();												//Select phone number
		pin();														//select PIN
		loginbutton();     					 						//Click On login Button

	}
	
	public static void XpressLogout() {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); 
		driver.findElement(logout).click();
		System.out.println("PageLogout!!!");
		// TODO Auto-generated method stub
		
	}
	
	public void loginWithRegisterPhone() {
		class Local {};
	      NAME = Local.class.getEnclosingMethod().getName();
		System.out.println("Entered in >>"+NAME);
		
		
		
		
		
	}
	
	public void pagedetailVerification() {
		System.out.println("Page URL: >> "+driver.getCurrentUrl());
		System.out.println("Page Title: >> "+driver.getTitle());
		
		 Assert.assertEquals(driver.getTitle(),"zipgoXpress - Online bus booking");
		 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Utility.getScreenshot(driver, dateFinal + "firstScreenShot");
	}
	
	public void phoneNumber() {
		driver.findElement(phoneNumber).sendKeys(PHONENUMBER);
	}
	
	public void phoneNumber(String invalid) {
		driver.findElement(phoneNumber).sendKeys(PHONENUMBER);
	}
	
	public void pin() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin1).sendKeys(PIN1);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin2).sendKeys(PIN2);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin3).sendKeys(PIN3);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin4).sendKeys(PIN4);
	}

	public void pin(String invalid) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin1).sendKeys(PIN1);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin2).sendKeys(PIN2);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin3).sendKeys(PIN3);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin4).sendKeys(PIN4);
	}
	
	public void forgotPIN() {
		driver.findElement(forgotPIN).click();
		System.out.println("click on forgot PIN??");
	}
	
	public void BrowserOption() {
		driver = new ChromeDriver();    // for launch normal chrome(with GUI)
		System.out.println("launched normal chrome(with GUI)");
	
	}
	
	public void BrowserOption(String GUI) {
		//-----Below four line code for Chrome headless.
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("window-size=1400,800"); 
		options.addArguments("headless");
		driver = new ChromeDriver(options);   // for launche headless chrome
		System.out.println("launched headless chrome(No GUI)");
		
		
	
	}
	
	public void loginbutton() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(login).click();
		System.out.println("Login Successful");
		browsweScreen();	//Maximize the browser screen
	}
	
	public void select_URL() throws IOException {

		File src = new File(FileLocation);
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println("Property class loaded");
		driver.get(pro.getProperty(SelectURL));
		System.out.println("You have login to Staging(beta) page...");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void select_URL(String production) throws IOException{

		File src = new File(FileLocation);
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println("Property class loaded");
		driver.get(pro.getProperty(SelectURL));
		System.out.println("Warning: You have login to production page...");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void sendOTP_Button(){
		
		driver.findElement(clickOnSendOTP).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		System.out.println("OTP has sent to registor mobile number please check and fill OTP manually (W/o 15Sec...)");
	}
	
	public void loginLink(){
		
		driver.findElement(loginLink).click();
		System.out.println("You have click on login? link so please login again.");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void resetPIN() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin1).sendKeys(PIN1);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin2).sendKeys(PIN2);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin3).sendKeys(PIN3);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(pin4).sendKeys(PIN4);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(r_pin1).sendKeys(r_PIN1);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(r_pin2).sendKeys(r_PIN2);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(r_pin3).sendKeys(r_PIN3);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(r_pin4).sendKeys(r_PIN4);
		
		
		
	}
		

	
}
