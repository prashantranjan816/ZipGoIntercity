package Zipgo.InterCity;


import java.io.File;
import java.io.FileInputStream;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Zipgo.InterCity.base.BasePage;

import library.Utility;


public class LoginPage extends BasePage{
	
	final static String FileLocation 			= "./src/main/resources/intercityDashBoard.properties";
	final static String ChromeFileLocation 		= "./src/main/resources/chromedriver 3";
	final static String SelectURL 				= "BetaUrl";
	final static By Login 						= By.linkText("Login");
	final static By email 			 			= By.xpath("//input[@type='email']");
	final static By password 			 		= By.xpath("//input[@type='password']");
	final static By next 			 			= By.xpath("(//*[@class='RveJvd snByac'])[1]");
	final By loginPassword 						= By.id("loginPassword");
	final By signInButton 						= By.xpath("//input[@value='Sign in']");
	final static String mailid 					= "prashant.ranjan@zipgo.in";
	final static String mailpwd 				= "ZipgoMay@123";
	static String dateFinal; 	
	
//	protected WebDriver driver;  // use WebDriver protected so all child class can use it by extends.
	
	
	@BeforeClass()
	public void loginIntercityDashboard() throws IOException, InterruptedException {

		// --- ---- --- use Java calendar concept---------------------------
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 0);// insted of 0 we can use +-1 to increase or decrease current date.
		dateFinal = df.format(cal.getTime());
		// ------------------------------------------------------------
		
		File src = new File(FileLocation);
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println("Property class loaded");
		
		//-----Below four line code for Chrome headless.
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("window-size=1400,800"); 
		options.addArguments("headless");
		
		driver = new ChromeDriver(options);   // for launche headless chrome
		
//		driver = new ChromeDriver();    // for launch normal chrome(with GUI)
		

		driver.get(pro.getProperty(SelectURL));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(Login).click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(email).sendKeys(mailid);
		driver.findElement(next).click();
		Thread.sleep(3000);
		driver.findElement(password).sendKeys(mailpwd);
		driver.findElement(next).click();
		System.out.println("Login Successful");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Utility.getScreenshot(driver, dateFinal + "firstScreenShot");

	}
	@AfterClass()
	public static void afterclass() throws MalformedURLException, EmailException {
		Mail.ReportEmail_Send.sendMail();
	}

	
	
	
}
