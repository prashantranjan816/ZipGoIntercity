package mobileApp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.TouchShortcuts;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class AgentApp {
	
	
	
	final By enternumberhere                     = By.xpath("//*[@text='ENTER THE NUMBER HERE'][@resource-id='com.zipgo.agentapp.dev:id/editText']");
    final By nextbutton                          = By.xpath("//*[@text='next'][@resource-id='com.zipgo.agentapp.dev:id/nextBtn']");
	final By enterpin                            = By.xpath("//*[@NAF='true'][@resource-id='com.zipgo.agentapp.dev:id/editText']");
	final By signin                              = By.xpath("//*[@index='2'][@resource-id='com.zipgo.agentapp.dev:id/nextBtn']");
	final By enterfrom                           = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/editText'])[1]");
    final By enterto                             = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/editText'])[2]");
	final By enterdestination                    = By.xpath("//*[@text='Enter the city name'][@resource-id='com.zipgo.agentapp.dev:id/et_search']");
    final By clicktommorow                       = By.xpath("//*[@text='Tomorrow'][@resource-id='com.zipgo.agentapp.dev:id/tv_tomorrow']");
	final By searchbutton                        = By.xpath("//*[@text='Search'][@resource-id='com.zipgo.agentapp.dev:id/bt_search']");
    final By dayafertmrw                         = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/iv_next']");
	final By sourcetitle                         = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/tv_title'])[1]");	
	
	final By bustrip                             = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/cl_root']");
	final By selectseat                          = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/cl_seating'])[1]");
	final By selectnewseat                       = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/tv_label_seating']");
	final By cancelselectseat                    = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/cl_seating'])[3]");
	final By proceedbutton                       = By.xpath("(//*[@class='android.support.v7.app.ActionBar$Tab'])[1]");
	final By chargetocust                        = By.xpath("//*[@index='6'][@resource-id='com.zipgo.agentapp.dev:id/et_rs']");
	final By selectpoint                         = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/rb_select'])[1]");
	final By selectpoint2                        = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/rb_select'])[2]");
	
	final By contactname                         = By.xpath("(//*[@text='NAME'][@resource-id='com.zipgo.agentapp.dev:id/editText'])[1]");
	final By contactphone                        = By.xpath("(//*[@text='PHONE NUMBER'][@resource-id='com.zipgo.agentapp.dev:id/editText'])[1]");
    final By passengername                       = By.xpath("(//*[@text='NAME'][@resource-id='com.zipgo.agentapp.dev:id/editText'])[2]"); 
	final By secpsngrname                        = By.xpath("(//*[@text='NAME'][@resource-id='com.zipgo.agentapp.dev:id/editText'])[3]");
    final By enterage                            = By.xpath("//*[@text='AGE'][@resource-id='com.zipgo.agentapp.dev:id/editText']");
	final By clickmalebutton                     = By.xpath("//*[@text='Male'][@resource-id='com.zipgo.agentapp.dev:id/rb_male']");
	final By clickmalebut2                       = By.xpath("(//*[@text='Male'][@resource-id='com.zipgo.agentapp.dev:id/rb_male'])[2]");
	final By getpnrnum                           = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/tv_new_pnr']");
	final By closeticket                         = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/iv_clear']");
	final By checkbookingconfirm                 = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/iv_check']");
	final By mybooking                           = By.xpath("//*[@text='My Booking']");
	final By listpnrnum                          = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/tv_pnr']");
	
	final By walleticon                          = By.xpath("//*[@text='Wallet']");
	//final By orderidvalidate                     = By.xpath("//*[contains(@content-desc,'Amount')][@index='2']");
	final By passbook                            = By.xpath("//*[@text='Passbook']");
	final By gentratepassbok                     = By.xpath("//*[@text='Generate']");
	final By bookingnum                          = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/bookingNumberTv']");
	final By backfrompasbok                      = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/iv_back']");
	final By balancesection                      = By.xpath("//*[@text='Balance']");
	final By availbal                            = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/amountTv']");
	final By enteramountbal                      = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/editText']");
	final By addmoneyicon						 = By.xpath("//*[@text='Add money'][@resource-id='com.zipgo.agentapp.dev:id/addMoneyBtn']");	
	final By hdfcbankicon                        = By.xpath("//*[@NAF='true'][@index='6']");
	final By paynow                              = By.xpath("//*[@content-desc='PAY NOW']");
	
	final By netbanktab							 = By.xpath("//*[@content-desc=' Net Banking'][@index='2']");
	final By selectbank                          = By.xpath("(//*[@index='0'][@class='android.widget.RadioButton'])[2]");
	final By credittab							 = By.xpath("//*[@content-desc=' Credit Card'][@index='0']");
	final By cardnum                             = By.xpath("//*[@text='Enter card number']");
	final By cardname                            = By.xpath("//*[@text='Enter card holder's name']");
	final By monthdrop                           = By.xpath("//*[@content-desc='MM']");
	final By yeardrop	                         = By.xpath("//*[@content-desc='YYYY']");
    final By cvvtab                              = By.xpath("//*[@text='CVV']");
	final By monthselect                         = By.xpath("//*[@text='03 (Mar)']");
	final By yearselect                          = By.xpath("//*[@text='2021']");
	final By saveradiobut                        = By.xpath("//*[@content-desc='Save this card for future payments']");
	final By debitcardtab                        = By.xpath("//*[@content-desc=' Debit Card']");
	final By paybutton                           = By.xpath("//*[@resource-id='netBankingButton']");
	final By successbutton                       = By.xpath("//*[@content-desc=' Success']");
	
	
	final By viewmoredetails                     = By.xpath("//*[@text='View More Details']");
	final By getcontactnamee                     = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/tv_people_name'][@index='22']");
	final By getcontactmobile                    = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/tv_mobile'][@index='25']");
	final By passengerdetails                    = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/tv_indicator_passenger']");  
	final By passengernames                      = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/tv_people_name'][@index='1']");
	final By passengeragee                       = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/tv_age_g']");
	final By detailspgback                       = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/iv_back']");
	
	final By editticketbook                      = By.xpath("//*[@text='Edit Ticket']");
	final By editpickup                          = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/check'][@index='1'])[1]");
	final By editdrop                            = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/check'][@index='1'])[2]");
	final By editcontactname                     = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/editText'])[3]");
	final By editcontactphone                    = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/editText'])[1]");
	final By editcustname                        = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/editText'])[2]");
	final By editcustage                         = By.xpath("(//*[@resource-id='com.zipgo.agentapp.dev:id/editText'])[3]");
	final By editsucessok                        = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/tv_okay']");
	
	final By cancelticket                        = By.xpath("//*[@text='Cancel Tickets']");
	final By selectcancelseat                    = By.xpath("//*[@text='Cancel All Seats']");
	final By partialseat                         = By.xpath("(//*[contains(@text,'Seat')])[2]");
	final By clickcancelnext                     = By.xpath("//*[@text='Next']");
	final By cancelticketbut                     = By.xpath("//*[@text='Cancel Ticket']");
	final By refundtocust                        = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/et_rs']");
	final By cancleyes                           = By.xpath("//*[@resource-id='android:id/button1']");
	final By dismiss                             = By.xpath("//*[@text='Dismiss']");
	
	
	final By morebutton                          = By.xpath("//*[@text='More']");
	final By logoutbutton                        = By.xpath("//*[@text='Logout'][@resource-id='com.zipgo.agentapp.dev:id/logoutTv']");
	
	final By newbutton                           = By.xpath("//*[@text='New']");
	
	final By searchbar                           = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/et_search']");
	final By filter                              = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/iv_menu_item']");
	final By bookingdate                         = By.xpath("//*[@text='Booking Date']");
	final By bookfrom                            = By.xpath("//*[@text='FROM'][@resource-id='com.zipgo.agentapp.dev:id/editText']");
	final By bookto                              = By.xpath("//*[@text='TO'][@resource-id='com.zipgo.agentapp.dev:id/editText']");
	
	final By calanderdays                        = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/tv_day']");
	final By resetall                            = By.xpath("//*[@text='Reset All']");
	final By filterfrom                          = By.xpath("(//*[@text='FROM'])[2]");
	final By filterto                            = By.xpath("(//*[@text='TO'])[2]");
	final By entercityfrom                       = By.xpath("//*[@resource-id='com.zipgo.agentapp.dev:id/et_search']");
	
	final By confirmedtripradio                 = By.xpath("//*[@text='Confirmed Trips']");
	final By cancelledtripradio                 = By.xpath("//*[@text='Cancelled Trips']");
	final By confirmstatus                      = By.xpath("//*[@text='Confirmed']");
	final By cancelstatus                       = By.xpath("//*[@text='Cancelled']");
	
	
	
	
	
	 public WebDriver driver2;	

	 public AgentApp openagentapp() throws BiffException, IOException, InterruptedException  {
		   
		 
		 
		    DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			//capabilities.setCapability("deviceName", "emulator-5554");//TA385045DW			
			capabilities.setCapability("deviceName", "TA385045DW");			
			//capabilities.setCapability("deviceName", "ZF6222FKL5");
			capabilities.setCapability("platformVersion", "6.0.0");
			capabilities.setCapability("platformName", "Android");			 
			capabilities.setCapability("appActivity","com.zipgo.agentapp.dev");			 
			capabilities.setCapability("appActivity", "com.zipgo.agentapp.ui.modules.splash.SplashActivity"); 	
			driver2 = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);					
			Thread.sleep(3000);   
			//String a=(String) ((RemoteWebDriver) driver2).getCapabilities().getCapability("deviceName");
			String b=((RemoteWebDriver) driver2).getCapabilities().getCapability("deviceName").toString();
            //System.out.println(b);

            return null;
            
		 }
	 
	 
	  public AgentApp loginagentapp() throws InterruptedException {
		  
		  
		     Thread.sleep(2000);
		     driver2.findElement(enternumberhere).sendKeys("1000148835");
		     driver2.findElement(nextbutton).click();
			 Thread.sleep(2000);     
		     driver2.findElement(enterpin).sendKeys("0000");
		     Thread.sleep(1000);
		     driver2.findElement(signin).click();
		     Thread.sleep(2000);
		     return this;
	 }

	 public AgentApp bookaticket() throws InterruptedException, BiffException, IOException {
		 
		 
		     File datafile=new File("C:\\Users\\Lenovo\\oxygen_workspace\\ZipgoXpress\\src\\test\\resources\\testData\\XpressCustomerDetails.xls");
		     Workbook rwb=Workbook.getWorkbook(datafile);
		     int nous=rwb.getNumberOfSheets();
		     Sheet rsh=rwb.getSheet(0);
		     int nour=rsh.getRows();
		 	
		     String ContactName      =rsh.getCell(0, 1).getContents();
		     String ContactPhone     =rsh.getCell(1, 1).getContents();
		     String CustomerName     =rsh.getCell(2, 1).getContents();
		     String CustomerPhone    =rsh.getCell(3, 1).getContents();
		     String Customerage      =rsh.getCell(4, 1).getContents();
		     String chargertocust    =rsh.getCell(5, 1).getContents();
		     
		     
		     Thread.sleep(3000);
		     driver2.findElement(enterfrom).sendKeys("Chandigarh");
		     driver2.findElement(sourcetitle).click();
		     Thread.sleep(1000);
		     driver2.findElement(enterto).click();
		     driver2.findElement(enterdestination).sendKeys("Delhi");
		     driver2.findElement(sourcetitle).click();
		     driver2.findElement(clicktommorow).click();
		     driver2.findElement(searchbutton).click();
		     Thread.sleep(2000);
		     driver2.findElement(dayafertmrw).click();
		     Thread.sleep(2000);
             driver2.findElement(bustrip).click();
		     Thread.sleep(5000);
             // driver2.findElement(selectseat).click();
             //Dimension size = driver2.manage().window().getSize();
             //System.out.println(size);
		     List<WebElement> myElements = driver2.findElements(selectnewseat);	        
	         myElements.get(0).click();
		     Thread.sleep(5000);
             TouchAction a2 = new TouchAction((MobileDriver) driver2);
             a2.tap (530,870).perform();
             driver2.findElement(chargetocust).clear();
             driver2.findElement(chargetocust).sendKeys(chargertocust);
             ((MobileDriver) driver2).hideKeyboard();
		     Thread.sleep(4000);
             TouchAction a1 = new TouchAction((MobileDriver) driver2);
             a1.tap (270,870).perform();
		     Thread.sleep(4000);
             driver2.findElement(selectpoint).click();            
             driver2.findElement(selectpoint).click();
		     Thread.sleep(4000);            
             driver2.findElement(passengername).sendKeys(CustomerName);
		     Thread.sleep(4000);
             driver2.findElement(contactname).sendKeys(ContactName);  
             driver2.findElement(contactphone).sendKeys(ContactPhone);   
             ((MobileDriver) driver2).hideKeyboard();
		     Thread.sleep(3000);
		     Dimension size = driver2.manage().window().getSize();
	         int starty =(int)(size.height*0.7);
	         int endy   =(int)(size.height*0.3);
	         int x      =(int)(size.width*0.5);
	         ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
		     Thread.sleep(3000);
		     driver2.findElement(enterage).sendKeys(Customerage);
             ((MobileDriver) driver2).hideKeyboard();
		     Thread.sleep(3000);
		     driver2.findElement(clickmalebutton).click();
		     TouchAction a3 = new TouchAction((MobileDriver) driver2);
             a3.tap (530,870).perform();
             Thread.sleep(3000);		    
	         ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
	         TouchAction a4 = new TouchAction((MobileDriver) driver2);
             a4.tap (530,870).perform();
             Thread.sleep(3000);
             if(driver2.findElement(checkbookingconfirm).isDisplayed()) {
             Assert.assertTrue(true);
             System.out.println("Booking Confirmed");
             }
             else {
            	 Assert.assertTrue(false);
             System.out.println("Booking not Confirmed");
             }
             String pnrnum=driver2.findElement(getpnrnum).getText();
             String[] pnrnumsplit=pnrnum.split(" ");
             pnrnum=pnrnumsplit[1]; 
	         int pnrnumber=Integer.parseInt(pnrnum);
             System.out.println("PNRNUM= "+pnrnumber);             
             driver2.findElement(closeticket).click();
             Thread.sleep(2000);             
             driver2.findElement(mybooking).click();
             List<WebElement> myElements1 = driver2.findElements(listpnrnum);	        
	         String latestbookingpnr=myElements1.get(0).getText();
	         String[] listpnrnumsplit=latestbookingpnr.split(" ");
	         latestbookingpnr=listpnrnumsplit[1]; 
	         int listpnrnumber=Integer.parseInt(latestbookingpnr);
	         System.out.println("listpnrnumber= "+listpnrnumber);
	         if(listpnrnumber==pnrnumber) {
	        	 Assert.assertTrue(true);
	         }
	         else {
	        	 Assert.assertTrue(false);
	         }
	         

             
             Thread.sleep(3000);
		     return this;
	 }
	 
	 
	 public AgentApp view_more_ticket_details() throws BiffException, IOException, InterruptedException {
		 
		     
		     File datafile=new File("C:\\Users\\Lenovo\\oxygen_workspace\\ZipgoXpress\\src\\test\\resources\\testData\\XpressCustomerDetails.xls");
		     Workbook rwb=Workbook.getWorkbook(datafile);
		     int nous=rwb.getNumberOfSheets();
		     Sheet rsh=rwb.getSheet(0);
		     int nour=rsh.getRows();
		 	
		     String ContactName      =rsh.getCell(0, 1).getContents();
		     String ContactPhone     =rsh.getCell(1, 1).getContents();
		     String CustomerName     =rsh.getCell(2, 1).getContents();
		     String CustomerPhone    =rsh.getCell(3, 1).getContents();
		     String Customerage      =rsh.getCell(4, 1).getContents();
	         String chargertocust    =rsh.getCell(5, 1).getContents();
         
	         Thread.sleep(3000);
	         driver2.findElement(walleticon).click();  
	         driver2.findElement(mybooking).click();
	         Thread.sleep(3000);
             List<WebElement> myElements = driver2.findElements(listpnrnum);	        
             myElements.get(0).click();	   
	         Thread.sleep(5000);
	         driver2.findElement(viewmoredetails).click();
	         Dimension size2 = driver2.manage().window().getSize();
	         int starty2 =(int)(size2.height*0.9);
	         int endy2   =(int)(size2.height*0.1);
	         int x2      =(int)(size2.width*0.5);
	         ((TouchShortcuts) driver2).swipe(x2, starty2,x2,endy2,1000);
	         Thread.sleep(3000);
	         String getcontactname=driver2.findElement(getcontactnamee).getText();
	         String getcontactnumber=driver2.findElement(getcontactmobile).getText();
	         if(getcontactname.equals(ContactName) && getcontactnumber.equals(ContactPhone) ) {
	        	 
	        	 System.out.println(getcontactname+getcontactnumber+" = get Pass");
	        	 System.out.println(ContactName+ContactPhone+" = xL");
	        	 Assert.assertTrue(true);
	         }
	        	 
	         
	         else {
	        	 
	        	 System.out.println(getcontactname+getcontactnumber+" = get failed");
	        	 System.out.println(ContactName+ContactPhone+" = xL");
	        	 //Assert.assertTrue(false);
	         }
	         System.out.println("11111");
	         ((TouchShortcuts) driver2).swipe(x2, starty2,x2,endy2,1000);
	         Thread.sleep(2000);
	         System.out.println("2222");

	         driver2.findElement(passengerdetails).click();
	         Thread.sleep(2000);
	         ((TouchShortcuts) driver2).swipe(x2, starty2,x2,endy2,1000);
             String psngrname=driver2.findElement(passengernames).getText();
             String psngrage =driver2.findElement(passengeragee).getText();
             String[] ageofpsngr=psngrage.split(" ");
             psngrage=ageofpsngr[0]; 
	         //int psngragenum=Integer.parseInt(psngrage);
        	 System.out.println(psngrname+psngrage+" =psngrname");
             System.out.println(CustomerName+Customerage+" =customernameand age");
	         if(psngrname.equals(CustomerName) && psngrage.equals(Customerage)) {
	        	 
	        	 System.out.println("passssss");
	
	        	 Assert.assertTrue(true);
	         }
	         else {
	        	 System.out.println(psngrname+psngrage+" =get psngrname");
	             System.out.println(CustomerName+Customerage+" =XLcustomernameand age");
	        	 System.out.println(psngrname+psngrage+" failed");
	        	// Assert.assertTrue(false);
	         }
	         Thread.sleep(4000);
             driver2.findElement(detailspgback).click();
	         Thread.sleep(3000);
             driver2.findElement(detailspgback).click();

		     return this;
	 }
	 
	 
	 
	 public AgentApp edit_booking() throws BiffException, IOException, InterruptedException {
		 
		     File datafile=new File("C:\\Users\\Lenovo\\oxygen_workspace\\ZipgoXpress\\src\\test\\resources\\testData\\XpressCustomerDetails.xls");
		     Workbook rwb=Workbook.getWorkbook(datafile);
		     int nous=rwb.getNumberOfSheets();
		     Sheet rsh=rwb.getSheet(0);
		     int nour=rsh.getRows();
		 	
		     String EditContactName      =rsh.getCell(0, 7).getContents();
		     String EditContactPhone     =rsh.getCell(1, 7).getContents();
		     String EditCustomerName     =rsh.getCell(2, 7).getContents();
		     String EditCustomerPhone    =rsh.getCell(3, 7).getContents();
		     String EditCustomerage      =rsh.getCell(4, 7).getContents();
	         String Editchargertocust    =rsh.getCell(5, 7).getContents();
       
	         Thread.sleep(3000);
	         driver2.findElement(walleticon).click();  
	         driver2.findElement(mybooking).click();
	         Thread.sleep(3000);	         
             List<WebElement> myElements = driver2.findElements(listpnrnum);	        
             myElements.get(0).click();	   
	         Thread.sleep(3000);
	         Dimension size2 = driver2.manage().window().getSize();
	         int starty2 =(int)(size2.height*0.9);
	         int endy2   =(int)(size2.height*0.1);
	         int x2      =(int)(size2.width*0.5);
	         ((TouchShortcuts) driver2).swipe(x2, starty2,x2,endy2,1000);
	         
	         Thread.sleep(2000);
	         driver2.findElement(editticketbook).click();
	         Thread.sleep(2000);
             driver2.findElement(editpickup).click();
	         Thread.sleep(3000);
		     driver2.findElement(selectpoint2).click();		     
	         Thread.sleep(2000);
             driver2.findElement(editdrop).click();
	         Thread.sleep(2000);
		     driver2.findElement(selectpoint).click();	
	         Thread.sleep(2000);
		     driver2.findElement(editcontactname).sendKeys(EditContactName);
	         Thread.sleep(2000);
             ((MobileDriver) driver2).hideKeyboard();
	         Thread.sleep(2000);
	         ((TouchShortcuts) driver2).swipe(x2, starty2,x2,endy2,1000);
	         Thread.sleep(2000);
	         driver2.findElement(editcontactphone).sendKeys(EditContactPhone);
	         Thread.sleep(2000);
	         driver2.findElement(editcustname).sendKeys(EditCustomerName);
             ((MobileDriver) driver2).hideKeyboard();
	         Thread.sleep(2000);
	         driver2.findElement(editcustage).sendKeys(EditCustomerage);
             ((MobileDriver) driver2).hideKeyboard();
	         Thread.sleep(2000);
	         TouchAction a2 = new TouchAction((MobileDriver) driver2);
             a2.tap (530,870).perform();
	         Thread.sleep(2000);
             WebElement okay=driver2.findElement(editsucessok);
             if(okay.isDisplayed()) {
            	 Assert.assertTrue(true);
             }
             else {
            	 Assert.assertTrue(false);
             }
             okay.click();
             Thread.sleep(3000);
             driver2.findElement(detailspgback).click();
		     
		     return this;
	 }
	 
	 
	 public AgentApp cancel_booking() throws InterruptedException, BiffException, IOException {
	
		 
		    File datafile=new File("C:\\Users\\Lenovo\\oxygen_workspace\\ZipgoXpress\\src\\test\\resources\\testData\\XpressCustomerDetails.xls");
	        Workbook rwb=Workbook.getWorkbook(datafile);
	        int nous=rwb.getNumberOfSheets();
	        Sheet rsh=rwb.getSheet(0);
	        int nour=rsh.getRows();
	 	
	        String ContactName      =rsh.getCell(0, 13).getContents();
	        String ContactPhone     =rsh.getCell(1, 13).getContents();
	        String CustomerName     =rsh.getCell(2, 13).getContents();
	        String CustomerPhone    =rsh.getCell(3, 13).getContents();
	        String Customerage      =rsh.getCell(4, 13).getContents();
	        String chargertocust    =rsh.getCell(5, 13).getContents();
	     
	  /*   
	        driver2.findElement(enterfrom).sendKeys("Chandigarh");
	        driver2.findElement(sourcetitle).click();
	        Thread.sleep(1000);
	        driver2.findElement(enterto).click();
	        driver2.findElement(enterdestination).sendKeys("Delhi");
	        driver2.findElement(sourcetitle).click();
	        driver2.findElement(clicktommorow).click();
	        driver2.findElement(searchbutton).click();
	        Thread.sleep(2000);
	        driver2.findElement(dayafertmrw).click();
	        Thread.sleep(2000);
            driver2.findElement(bustrip).click();
	        Thread.sleep(5000);
            driver2.findElement(cancelselectseat).click();
            //Dimension size = driver2.manage().window().getSize();
            //System.out.println(size);
	        Thread.sleep(2000);
            TouchAction a2 = new TouchAction((MobileDriver) driver2);
            a2.tap (530,870).perform();
            driver2.findElement(chargetocust).clear();
            driver2.findElement(chargetocust).sendKeys(chargertocust);
            ((MobileDriver) driver2).hideKeyboard();
	        Thread.sleep(4000);
            TouchAction a1 = new TouchAction((MobileDriver) driver2);
            a1.tap (270,870).perform();
	        Thread.sleep(4000);
            driver2.findElement(selectpoint).click();            
            driver2.findElement(selectpoint).click();
	        Thread.sleep(4000);            
            driver2.findElement(passengername).sendKeys(CustomerName);
	        Thread.sleep(4000);
            driver2.findElement(contactname).sendKeys(ContactName);  
            driver2.findElement(contactphone).sendKeys(ContactPhone);   
            ((MobileDriver) driver2).hideKeyboard();
	        Thread.sleep(3000);
	        Dimension size = driver2.manage().window().getSize();
            int starty =(int)(size.height*0.7);
            int endy   =(int)(size.height*0.3);
            int x      =(int)(size.width*0.5);
            ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
	        Thread.sleep(3000);
	        driver2.findElement(enterage).sendKeys(Customerage);
            ((MobileDriver) driver2).hideKeyboard();
	        Thread.sleep(3000);
	        driver2.findElement(clickmalebutton).click();
	        TouchAction a3 = new TouchAction((MobileDriver) driver2);
            a3.tap (530,870).perform();
            Thread.sleep(3000);		    
            ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
            TouchAction a4 = new TouchAction((MobileDriver) driver2);
            a4.tap (530,870).perform();
            Thread.sleep(3000);
            if(driver2.findElement(checkbookingconfirm).isDisplayed()) {
            Assert.assertTrue(true);
            System.out.println("Booking Confirmed");
            }
            else {
        	 Assert.assertTrue(false);
            System.out.println("Booking not Confirmed");
            }
            String pnrnum=driver2.findElement(getpnrnum).getText();
            String[] pnrnumsplit=pnrnum.split(" ");
            pnrnum=pnrnumsplit[1]; 
            int pnrnumber=Integer.parseInt(pnrnum);
            System.out.println("PNRNUM= "+pnrnumber);             
            driver2.findElement(closeticket).click();
            Thread.sleep(2000);*/  
            driver2.findElement(walleticon).click();
            driver2.findElement(mybooking).click();
            Thread.sleep(3000);
            List<WebElement> myElements = driver2.findElements(listpnrnum);	        
            myElements.get(0).click();
            Thread.sleep(3000);
            Dimension size2 = driver2.manage().window().getSize();
            int starty2 =(int)(size2.height*0.9);
            int endy2   =(int)(size2.height*0.1);
            int x2      =(int)(size2.width*0.5);
            ((TouchShortcuts) driver2).swipe(x2, starty2,x2,endy2,1000);
            Thread.sleep(3000);
            driver2.findElement(cancelticket).click();
            Thread.sleep(3000);
           
            driver2.findElement(selectcancelseat).click();
            Thread.sleep(2000);
            TouchAction a2 = new TouchAction((MobileDriver) driver2);
            a2.tap (530,870).perform();
		    //driver2.findElement(clickcancelnext).click();
            Thread.sleep(2000);
            driver2.findElement(refundtocust).click();
		    driver2.findElement(refundtocust).sendKeys("10");
            Thread.sleep(2000);
            
            ((MobileDriver) driver2).hideKeyboard();
            Thread.sleep(5000);
            //driver2.findElement(cancelticketbut).click();
            TouchAction a3 = new TouchAction((MobileDriver) driver2);
            a3.tap (530,870).perform();
            Thread.sleep(7000);
            driver2.findElement(cancleyes).click();
            Thread.sleep(3000);
            driver2.navigate().back();

		     return this;
	 }

	 
	 public AgentApp multiple_booking() throws InterruptedException, BiffException, IOException {
		     
		     
		     File datafile=new File("C:\\Users\\Lenovo\\oxygen_workspace\\ZipgoXpress\\src\\test\\resources\\testData\\XpressCustomerDetails.xls");
	         Workbook rwb=Workbook.getWorkbook(datafile);
	         int nous=rwb.getNumberOfSheets();
	         Sheet rsh=rwb.getSheet(0);
	         int nour=rsh.getRows();
	 	
	         String ContactName      =rsh.getCell(0, 1).getContents();
	         String ContactPhone     =rsh.getCell(1, 1).getContents();
	         String CustomerName     =rsh.getCell(2, 1).getContents();
	         String CustomerPhone    =rsh.getCell(3, 1).getContents();
	         String Customerage      =rsh.getCell(4, 1).getContents();
	         String chargertocust    =rsh.getCell(5, 1).getContents();
	     
	     
	         driver2.findElement(enterfrom).sendKeys("Chandigarh");
	         driver2.findElement(sourcetitle).click();
	         Thread.sleep(1000);
	         driver2.findElement(enterto).click();
	         driver2.findElement(enterdestination).sendKeys("Delhi");
	         driver2.findElement(sourcetitle).click();
	         driver2.findElement(clicktommorow).click();
	         driver2.findElement(searchbutton).click();
	         Thread.sleep(2000);
		     
		     return this;
	 }

	 
	 
	 public AgentApp agentrecharge() throws InterruptedException {
		 
		     String rechargeamount ="100";
		     Thread.sleep(3000);
		     driver2.findElement(walleticon).click();
		     Thread.sleep(2000);
		     String availablebal=driver2.findElement(availbal).getText();
		     String[] availbalance=availablebal.split(" ");
		     availablebal=availbalance[1]; 
	         int availablebalance1=Integer.parseInt(availablebal.replaceAll(",", ""));
	         System.out.println("avilable bal "+availablebalance1);
	         driver2.findElement(passbook).click();
	         driver2.findElement(gentratepassbok).click();
	         Thread.sleep(4000);
	         List<WebElement> myElements = driver2.findElements(bookingnum);	        
	         String latestbookingnum=myElements.get(0).getText();
	         String latestbnum=latestbookingnum.substring(1);
	         int latesbooknnum=Integer.parseInt(latestbnum);
	         System.out.println(latesbooknnum+" intial");
	         Thread.sleep(2000);
	         driver2.findElement(backfrompasbok).click();
	         Thread.sleep(1000);
	         driver2.findElement(balancesection).click();
	         Thread.sleep(1000);

		     driver2.findElement(enteramountbal).sendKeys(rechargeamount);
             ((MobileDriver) driver2).hideKeyboard();
		     driver2.findElement(addmoneyicon).click();
		     Thread.sleep(5000);
		     Dimension size2 = driver2.manage().window().getSize();
	         int starty2 =(int)(size2.height*0.7);
	         int endy2   =(int)(size2.height*0.3);
	         int x2      =(int)(size2.width*0.5);
	         ((TouchShortcuts) driver2).swipe(x2, starty2,x2,endy2,1000);
		     Thread.sleep(5000);
		     driver2.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		     driver2.findElement(hdfcbankicon).click();
			 Thread.sleep(3000);
			 TouchAction a2 = new TouchAction((MobileDriver) driver2);
	         a2.tap (530,870).perform();
		     
		     
		     
		     
	         /*driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		     driver2.findElement(debitcardtab).click();
	         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		     driver2.findElement(debitcardtab).click();
		     Thread.sleep(2000);
		     driver2.findElement(netbanktab).click();
		     Thread.sleep(3000);
		     driver2.findElement(selectbank).click();
		     Dimension size2 = driver2.manage().window().getSize();
	         int starty2 =(int)(size2.height*0.7);
	         int endy2   =(int)(size2.height*0.3);
	         int x2      =(int)(size2.width*0.5);
	         ((TouchShortcuts) driver2).swipe(x2, starty2,x2,endy2,1000);
		     Thread.sleep(2000);
			 driver2.findElement(paybutton).click();*/
			 
			 
			 
		     
			
			 
			 Thread.sleep(6000);
	         driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		     driver2.findElement(successbutton).click();
		     Thread.sleep(5000);
		     String afterrechargebal=driver2.findElement(availbal).getText();
		     String[] availbalance1=afterrechargebal.split(" ");
		     afterrechargebal=availbalance1[1];    
		     int afterrechargeb=Integer.parseInt(afterrechargebal.replaceAll(",", ""));         
		     int actualrecharge=afterrechargeb-availablebalance1;
	         int rechargedamount=Integer.parseInt(rechargeamount);
	         System.out.println("afterrechargeb "+afterrechargeb);
	         if(rechargedamount==actualrecharge) {
	        	 Assert.assertTrue(true);
	         }
	         else {
	        	 Assert.assertTrue(false);
	         }
	         driver2.findElement(mybooking).click();
	         driver2.findElement(walleticon).click();
		     Thread.sleep(3000);
	         driver2.findElement(passbook).click();
		     Thread.sleep(4000);
	         driver2.findElement(gentratepassbok).click();
	         Thread.sleep(4000);
	         List<WebElement> myElements1 = driver2.findElements(bookingnum);	        
	         String latestbookingnum1=myElements1.get(0).getText();
	         String latestbnum1=latestbookingnum1.substring(1);
	         int latesbooknnum1=Integer.parseInt(latestbnum1);
	         System.out.println(latesbooknnum1+" second");
	         Thread.sleep(2000);
	         if(latesbooknnum1>latesbooknnum) {
	        	 System.out.println("it worked");

	        	 Assert.assertTrue(true);
	         }
	         else {
	        	 Assert.assertTrue(false);
	         }
		     Thread.sleep(3000);
	         driver2.findElement(backfrompasbok).click();
		     
		     
		  /*   if(driver2.findElements(selectbank).size()>0) {
			     Thread.sleep(3000);
		    	 Dimension size1 = driver2.manage().window().getSize();
		         int starty1 =(int)(size1.height*0.7);
		         int endy1   =(int)(size1.height*0.3);
		         int x1     =(int)(size1.width*0.5);
		         ((TouchShortcuts) driver2).swipe(x1, starty1,x1,endy1,1000);
				 driver2.findElement(paybutton).click();
				 Thread.sleep(4000);
			     driver2.findElement(successbutton).click();
				 Thread.sleep(4000);
			     String afterrechargebal=driver2.findElement(availbal).getText();
			     String[] availbalance1=afterrechargebal.split(" ");
			     afterrechargebal=availbalance1[1];    
			     int afterrechargeb=Integer.parseInt(afterrechargebal.replaceAll(",", ""));         
			     int actualrecharge=afterrechargeb-availablebalance1;
		         int rechargedamount=Integer.parseInt(rechargeamount);
		         System.out.println("afterrechargeb "+afterrechargeb);
		         if(rechargedamount==actualrecharge) {
		        	 Assert.assertTrue(true);
		         }
		         else {
		        	 Assert.assertTrue(false);
		         }
		         driver2.findElement(mybooking).click();
		         driver2.findElement(walleticon).click();
		         driver2.findElement(passbook).click();
		         driver2.findElement(gentratepassbok).click();
		         Thread.sleep(3000);
		         List<WebElement> myElements1 = driver2.findElements(bookingnum);	        
		         String latestbookingnum1=myElements1.get(0).getText();
		         String latestbnum1=latestbookingnum1.substring(1);
		         int latesbooknnum1=Integer.parseInt(latestbnum1);
		         System.out.println(latesbooknnum1 +" updated booking num");
		         if(latesbooknnum1>latesbooknnum) {
		        	 System.out.println("it worked");
		        	 Assert.assertTrue(true);
		         }
		         else {
		        	 Assert.assertTrue(false);
		         }

		     }
		     else {
		     Thread.sleep(3000);
		     driver2.findElement(debitcardtab).click();
		     driver2.findElement(debitcardtab).click();
		     driver2.findElement(netbanktab).click();
		     Thread.sleep(3000);
		     driver2.findElement(selectbank).click();
		     Dimension size2 = driver2.manage().window().getSize();
	         int starty2 =(int)(size2.height*0.7);
	         int endy2   =(int)(size2.height*0.3);
	         int x2      =(int)(size2.width*0.5);
	         ((TouchShortcuts) driver2).swipe(x2, starty2,x2,endy2,1000);
			 driver2.findElement(paybutton).click();
			 Thread.sleep(4000);
		     driver2.findElement(successbutton).click();
		     Thread.sleep(5000);
		     String afterrechargebal=driver2.findElement(availbal).getText();
		     String[] availbalance1=afterrechargebal.split(" ");
		     afterrechargebal=availbalance1[1];    
		     int afterrechargeb=Integer.parseInt(afterrechargebal.replaceAll(",", ""));         
		     int actualrecharge=afterrechargeb-availablebalance1;
	         int rechargedamount=Integer.parseInt(rechargeamount);
	         System.out.println("afterrechargeb "+afterrechargeb);
	         if(rechargedamount==actualrecharge) {
	        	 Assert.assertTrue(true);
	         }
	         else {
	        	 Assert.assertTrue(false);
	         }
	         driver2.findElement(mybooking).click();
	         driver2.findElement(walleticon).click();
	         driver2.findElement(passbook).click();
	         driver2.findElement(gentratepassbok).click();
	         Thread.sleep(4000);
	         List<WebElement> myElements1 = driver2.findElements(bookingnum);	        
	         String latestbookingnum1=myElements1.get(0).getText();
	         String latestbnum1=latestbookingnum1.substring(1);
	         int latesbooknnum1=Integer.parseInt(latestbnum1);
	         System.out.println(latesbooknnum1+" second");
	         if(latesbooknnum1>latesbooknnum) {
	        	 System.out.println("it worked");

	        	 Assert.assertTrue(true);
	         }
	         else {
	        	 Assert.assertTrue(false);
	         }

		     }
		     
		     
		     if(driver2.findElements(cardnum).size()>0){
		    	 driver2.findElement(cardnum).sendKeys("4111111111111111");
		    	 Thread.sleep(8000);
			     driver2.findElement(cardname).sendKeys("rajuuu");
			     driver2.findElement(monthdrop).click();
			     driver2.findElement(monthselect).click();
			     driver2.findElement(yeardrop).click();
			     driver2.findElement(yearselect).click();
			     driver2.findElement(cvvtab).sendKeys("123");
			     driver2.findElement(saveradiobut).click();
			     Thread.sleep(4000);
			     driver2.findElement(paybutton).click();
			     Thread.sleep(4000);
			     driver2.findElement(successbutton).click();
		     }
		     else {
		    	 
		     driver2.findElement(credittab).click();
		     driver2.findElement(cardnum).sendKeys("4111111111111111");
	    	 Thread.sleep(3000);
		     driver2.findElement(cardname).sendKeys("cardholder");
		     driver2.findElement(monthdrop).click();
		     driver2.findElement(monthselect).click();
		     driver2.findElement(yeardrop).click();
		     driver2.findElement(yearselect).click();
		     driver2.findElement(cvvtab).sendKeys("123");
		     driver2.findElement(saveradiobut).click();
		     Thread.sleep(4000);
		     driver2.findElement(paybutton).click();
		     Thread.sleep(4000);
		     driver2.findElement(successbutton).click();
		     
		     
		     }*/
		     
		 
		 
	         return this;

	 }
	 
	 
	 public AgentApp multple_ticket() throws InterruptedException, BiffException, IOException {
		 
		 
		    Thread.sleep(3000);
	        driver2.findElement(morebutton).click();
	        driver2.findElement(newbutton).click();
	        File datafile=new File("C:\\Users\\Lenovo\\oxygen_workspace\\ZipgoXpress\\src\\test\\resources\\testData\\XpressCustomerDetails.xls");
		    Workbook rwb=Workbook.getWorkbook(datafile);
		    int nous=rwb.getNumberOfSheets();
		    Sheet rsh=rwb.getSheet(0);
		    int nour=rsh.getRows();
		 	
		    String ContactName      =rsh.getCell(0, 1).getContents();
		    String ContactPhone     =rsh.getCell(1, 1).getContents();
		    String CustomerName     =rsh.getCell(2, 1).getContents();
		    String CustomerPhone    =rsh.getCell(3, 1).getContents();
		    String Customerage      =rsh.getCell(4, 1).getContents();
		    String chargertocust    =rsh.getCell(5, 1).getContents();
		     
		     
	        driver2.findElement(enterfrom).sendKeys("Chandigarh");
		    driver2.findElement(sourcetitle).click();
		    Thread.sleep(1000);
		    driver2.findElement(enterto).click();
		    driver2.findElement(enterdestination).sendKeys("Delhi");
		    driver2.findElement(sourcetitle).click();
		    driver2.findElement(clicktommorow).click();
		    driver2.findElement(searchbutton).click();
		    Thread.sleep(2000);
		    driver2.findElement(dayafertmrw).click();
		    Thread.sleep(2000);
            driver2.findElement(bustrip).click();
		    Thread.sleep(5000);
            //driver2.findElement(selectseat).click();
            List<WebElement> myElements = driver2.findElements(selectnewseat);	        
            myElements.get(0).click();
            myElements.get(1).click();
            Thread.sleep(2000);
            TouchAction a2 = new TouchAction((MobileDriver) driver2);
            a2.tap (530,870).perform();
            driver2.findElement(chargetocust).clear();
            driver2.findElement(chargetocust).sendKeys(chargertocust);
            ((MobileDriver) driver2).hideKeyboard();
		    Thread.sleep(4000);
            TouchAction a1 = new TouchAction((MobileDriver) driver2);
            a1.tap (270,870).perform();
		    Thread.sleep(4000);
            driver2.findElement(selectpoint).click();            
            driver2.findElement(selectpoint).click();
		    Thread.sleep(4000);            
            driver2.findElement(passengername).sendKeys(CustomerName);
		    Thread.sleep(4000);
            driver2.findElement(contactname).sendKeys(ContactName);  
            driver2.findElement(contactphone).sendKeys(ContactPhone);   
            ((MobileDriver) driver2).hideKeyboard();
		    Thread.sleep(3000);
		    Dimension size = driver2.manage().window().getSize();
	        int starty =(int)(size.height*0.7);
	        int endy   =(int)(size.height*0.3);
	        int x      =(int)(size.width*0.5);
	        ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
		    Thread.sleep(3000);
		    driver2.findElement(enterage).sendKeys(Customerage);
            ((MobileDriver) driver2).hideKeyboard();
		    Thread.sleep(3000);
		    driver2.findElement(clickmalebutton).click();
	        ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
		    Thread.sleep(3000);

            //driver2.findElement(secpsngrname).sendKeys(CustomerName);
            //((MobileDriver) driver2).hideKeyboard();
		    //driver2.findElement(enterage).sendKeys(Customerage);
            //((MobileDriver) driver2).hideKeyboard();
		    driver2.findElement(clickmalebut2).click();
		    Thread.sleep(3000);

		    TouchAction a3 = new TouchAction((MobileDriver) driver2);
            a3.tap (530,870).perform();
            Thread.sleep(3000);		    
	        ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
	        TouchAction a4 = new TouchAction((MobileDriver) driver2);
            a4.tap (530,870).perform();
            Thread.sleep(3000);
            if(driver2.findElement(checkbookingconfirm).isDisplayed()) {
            Assert.assertTrue(true);
            System.out.println("Booking Confirmed");
            }
            else {
           	 Assert.assertTrue(false);
            System.out.println("Booking not Confirmed");
            }
            String pnrnum=driver2.findElement(getpnrnum).getText();
            String[] pnrnumsplit=pnrnum.split(" ");
            pnrnum=pnrnumsplit[1]; 
	        int pnrnumber=Integer.parseInt(pnrnum);
            System.out.println("PNRNUM= "+pnrnumber);             
            driver2.findElement(closeticket).click();
            Thread.sleep(2000);             
            driver2.findElement(mybooking).click();
            List<WebElement> myElements1 = driver2.findElements(listpnrnum);	        
	        String latestbookingpnr=myElements1.get(0).getText();
	        String[] listpnrnumsplit=latestbookingpnr.split(" ");
	        latestbookingpnr=listpnrnumsplit[1]; 
	        int listpnrnumber=Integer.parseInt(latestbookingpnr);
	        System.out.println("listpnrnumber= "+listpnrnumber);
	        if(listpnrnumber==pnrnumber) {
	        	 Assert.assertTrue(true);
	        }
	        else {
	        	 Assert.assertTrue(false);
	        }
            
            Thread.sleep(3000);
		 
		    
		    return this;
	 }
	 
	 

	 
	 public AgentApp partial_cancel() throws InterruptedException, BiffException, IOException {
		 
		 
		 File datafile=new File("C:\\Users\\Lenovo\\oxygen_workspace\\ZipgoXpress\\src\\test\\resources\\testData\\XpressCustomerDetails.xls");
	        
		    Workbook rwb=Workbook.getWorkbook(datafile);
	        int nous=rwb.getNumberOfSheets();
	        Sheet rsh=rwb.getSheet(0);
	        int nour=rsh.getRows();
	 	
	        String ContactName      =rsh.getCell(0, 13).getContents();
	        String ContactPhone     =rsh.getCell(1, 13).getContents();
	        String CustomerName     =rsh.getCell(2, 13).getContents();
	        String CustomerPhone    =rsh.getCell(3, 13).getContents();
	        String Customerage      =rsh.getCell(4, 13).getContents();
	        String chargertocust    =rsh.getCell(5, 13).getContents();
            Thread.sleep(3000);
		    driver2.findElement(morebutton).click();
		    driver2.findElement(mybooking).click();
		    List<WebElement> myElements = driver2.findElements(listpnrnum);	   
		    String multipleticketpnr=myElements.get(0).getText();
            myElements.get(0).click();
            Thread.sleep(3000);
            Dimension size2 = driver2.manage().window().getSize();
            int starty2 =(int)(size2.height*0.9);
            int endy2   =(int)(size2.height*0.1);
            int x2      =(int)(size2.width*0.5);
            ((TouchShortcuts) driver2).swipe(x2, starty2,x2,endy2,1000);
            Thread.sleep(3000);
            driver2.findElement(cancelticket).click();
            Thread.sleep(3000);
           
            driver2.findElement(partialseat).click();
            Thread.sleep(2000);
            TouchAction a2 = new TouchAction((MobileDriver) driver2);
            a2.tap (530,870).perform();
		    //driver2.findElement(clickcancelnext).click();
            Thread.sleep(2000);
		    driver2.findElement(refundtocust).click();
		    driver2.findElement(refundtocust).sendKeys("10");
            Thread.sleep(4000);
            ((MobileDriver) driver2).hideKeyboard();
            Thread.sleep(5000);
            //driver2.findElement(cancelticketbut).click();
            TouchAction a3 = new TouchAction((MobileDriver) driver2);
            a3.tap (530,870).perform();
            Thread.sleep(5000);
            driver2.findElement(cancleyes).click();
            Thread.sleep(4000);
            driver2.navigate().back();
            //driver2.findElement(dismiss).click();
            Thread.sleep(3000);
		    //driver2.findElement(closeticket).click();
            driver2.findElement(morebutton).click();
		    driver2.findElement(mybooking).click();
		    List<WebElement> myElements1 = driver2.findElements(listpnrnum);	   
		    String multipleticketpnr1=myElements.get(0).getText();
		    if(multipleticketpnr1!=multipleticketpnr) {
		    	Assert.assertTrue(true);
		    }
		    else {
		    	Assert.assertTrue(false);
		    }
            
            
		     return this;
		 
	 }

	 
	 
	 public AgentApp filtercheck() throws InterruptedException, BiffException, IOException {
		    
		    Thread.sleep(3000);
	        
	        File datafile=new File("C:\\Users\\Lenovo\\oxygen_workspace\\ZipgoXpress\\src\\test\\resources\\testData\\XpressFilterCheck.xls");
		    Workbook rwb=Workbook.getWorkbook(datafile);
		    int nous=rwb.getNumberOfSheets();
		    Sheet rsh=rwb.getSheet(0);
		    int nour=rsh.getRows();
		 	
		    int[] pnr=new int[nour];
			for(int i=1;i<nour;i++ ){
		    String ContactName      =rsh.getCell(0, i).getContents();
		    String ContactPhone     =rsh.getCell(1, i).getContents();
		    String CustomerName     =rsh.getCell(2, i).getContents();
		    String CustomerPhone    =rsh.getCell(3, i).getContents();
		    String Customerage      =rsh.getCell(4, i).getContents();
		    String chargertocust    =rsh.getCell(5, i).getContents();
		     
		    driver2.findElement(morebutton).click();
		    Thread.sleep(3000);
	        driver2.findElement(newbutton).click();
	        driver2.findElement(enterfrom).sendKeys("Chandigarh");
		    driver2.findElement(sourcetitle).click();
		    Thread.sleep(1000);
		    driver2.findElement(enterto).click();
		    driver2.findElement(enterdestination).sendKeys("Delhi");
		    driver2.findElement(sourcetitle).click();
		    driver2.findElement(clicktommorow).click();
		    driver2.findElement(searchbutton).click();
		    Thread.sleep(2000);
		    driver2.findElement(dayafertmrw).click();
		    Thread.sleep(5000);
            driver2.findElement(bustrip).click();
		    Thread.sleep(5000);
            //driver2.findElement(selectseat).click();
            List<WebElement> myElements = driver2.findElements(selectnewseat);	        
            myElements.get(0).click();
            myElements.get(1).click();
            Thread.sleep(2000);
            TouchAction a2 = new TouchAction((MobileDriver) driver2);
            a2.tap (530,870).perform();
            driver2.findElement(chargetocust).clear();
            driver2.findElement(chargetocust).sendKeys(chargertocust);
            ((MobileDriver) driver2).hideKeyboard();
		    Thread.sleep(4000);
            TouchAction a1 = new TouchAction((MobileDriver) driver2);
            a1.tap (270,870).perform();
		    Thread.sleep(4000);
            driver2.findElement(selectpoint).click();            
            driver2.findElement(selectpoint).click();
		    Thread.sleep(4000);            
            driver2.findElement(passengername).sendKeys(CustomerName);
		    Thread.sleep(4000);
            driver2.findElement(contactname).sendKeys(ContactName);  
            driver2.findElement(contactphone).sendKeys(ContactPhone);   
            ((MobileDriver) driver2).hideKeyboard();
		    Thread.sleep(3000);
		    Dimension size = driver2.manage().window().getSize();
	        int starty =(int)(size.height*0.7);
	        int endy   =(int)(size.height*0.3);
	        int x      =(int)(size.width*0.5);
	        ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
		    Thread.sleep(3000);
		    driver2.findElement(enterage).sendKeys(Customerage);
            ((MobileDriver) driver2).hideKeyboard();
		    Thread.sleep(3000);
		    driver2.findElement(clickmalebutton).click();
	        ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
		    Thread.sleep(3000);

            //driver2.findElement(secpsngrname).sendKeys(CustomerName);
            //((MobileDriver) driver2).hideKeyboard();
		    //driver2.findElement(enterage).sendKeys(Customerage);
            //((MobileDriver) driver2).hideKeyboard();
		    driver2.findElement(clickmalebut2).click();
		    Thread.sleep(3000);

		    TouchAction a3 = new TouchAction((MobileDriver) driver2);
            a3.tap (530,870).perform();
            Thread.sleep(3000);		    
	        ((TouchShortcuts) driver2).swipe(x, starty,x,endy,1000);
	        TouchAction a4 = new TouchAction((MobileDriver) driver2);
            a4.tap (530,870).perform();
            Thread.sleep(5000);
            if(driver2.findElement(checkbookingconfirm).isDisplayed()) {
            Assert.assertTrue(true);
            System.out.println("Booking Confirmed");
            }
            else {
           	 Assert.assertTrue(false);
            System.out.println("Booking not Confirmed");
            }
            String pnrnum=driver2.findElement(getpnrnum).getText();
            String[] pnrnumsplit=pnrnum.split(" ");
            pnrnum=pnrnumsplit[1]; 
	        int pnrnumberone=Integer.parseInt(pnrnum);
            System.out.println("PNRNUM= "+pnrnumberone);  
            pnr[i]=pnrnumberone;
            System.out.println(pnr[i]+"iiii");
            driver2.findElement(closeticket).click();
            Thread.sleep(2000);
			}
			int firstorderpnr=pnr[1];
			int secondorderpnr=pnr[2];
			String pnroneasstring = new Integer(firstorderpnr).toString();
			String pnrtwoasstring=new Integer(secondorderpnr).toString();

            Thread.sleep(4000);
            driver2.findElement(mybooking).click();            
            List<WebElement> mypnrs = driver2.findElements(listpnrnum);	
            String listpnr1=mypnrs.get(0).getText();
            String listpnr2=mypnrs.get(1).getText();
            System.out.println(listpnr1+ "-Pnr1");
            System.out.println(listpnr1+"-listpnr1 "+listpnr2+"-listpnr2 "+pnroneasstring+" -pnroneasstring"+pnrtwoasstring+"-pnrtwoasstring");
            if(listpnr1.contains(pnrtwoasstring) && listpnr2.contains(pnroneasstring)) {
            	
            	
            	System.out.println("both worked");
            }
            else {
            	System.out.println("both not worked");
            }
            Thread.sleep(4000);
            driver2.findElement(searchbar).click();
            driver2.findElement(searchbar).sendKeys(pnroneasstring);
            List<WebElement> searchmypnrs = driver2.findElements(listpnrnum);	
            String searchlistpnr1=mypnrs.get(0).getText();
            if(searchlistpnr1.contains(pnrtwoasstring)) {
            	System.out.println("Search worked");
            }

            else {
            	System.out.println("Search  not worked");
            }
            driver2.findElement(searchbar).clear();
            String ContactName      =rsh.getCell(0, 1).getContents();
		    String ContactPhone     =rsh.getCell(1, 1).getContents();
            Thread.sleep(4000);
            driver2.findElement(searchbar).sendKeys(ContactName);
            List<WebElement> searchmypnrsbasedonname = driver2.findElements(listpnrnum);	
            String searchlistpnr2basedonname=mypnrs.get(0).getText();
            if(searchlistpnr2basedonname.contains(pnrtwoasstring)) {
            	System.out.println("Name Search worked");
            }
            else {
            	System.out.println("Name Search not worked");
            }
            Thread.sleep(2000);
            Dimension size = driver2.manage().window().getSize();
	        int starty =(int)(size.height*0.7);
	        int endy   =(int)(size.height*0.3);
	        int x      =(int)(size.width*0.5);
	        ((TouchShortcuts) driver2).swipe(x, endy,x,starty,1200);
            //driver2.findElement(searchbar).clear();
            Thread.sleep(4000);
            driver2.findElement(searchbar).sendKeys(ContactPhone);
            List<WebElement> searchmypnrsbasedonphone = driver2.findElements(listpnrnum);	
            String searchlistpnr2basedonphone=mypnrs.get(0).getText();
            if(searchlistpnr2basedonphone.contains(pnrtwoasstring)) {
            	System.out.println("Phone Search worked");
            }
            else {
            	System.out.println("Phone Search not worked");
            }
            Dimension size1 = driver2.manage().window().getSize();
	        int startyy =(int)(size1.height*0.7);
	        int endyy   =(int)(size1.height*0.3);
	        int xx      =(int)(size1.width*0.5);
	        ((TouchShortcuts) driver2).swipe(xx, endyy,xx,startyy,1200);
            //driver2.findElement(searchbar).clear();
            Thread.sleep(3000); 
            
            ///Date Search           
		    Thread.sleep(3000);
		    driver2.findElement(filter).click();
		    Thread.sleep(3000);
		    driver2.findElement(bookingdate).click();
		    Thread.sleep(3000);
		    driver2.findElement(bookfrom).click();
		    Thread.sleep(3000);
		    List<WebElement> days = driver2.findElements(calanderdays);	 
		    String timeStamp = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
		    int today=Integer.parseInt(timeStamp);
		    System.out.println(today+" sys today");
		    String calendartoday=days.get(today).getText();		   
		    System.out.println(calendartoday+"  calendartoday");
		    int getcalendartoday=Integer.parseInt(calendartoday);
		    int differencetoday=today-getcalendartoday;
		    int actualtoday=differencetoday+today+1;
		    System.out.println(actualtoday+"actualtoday");
		    if(actualtoday>31) {
			actualtoday=actualtoday+15;
			System.out.println(actualtoday+"  +15today");
			days.get(actualtoday).click();

		    }
		    else {
			actualtoday=actualtoday+1;
			System.out.println(actualtoday);
		    days.get(actualtoday).click();
		 
		    }
		    Thread.sleep(3000);
		    driver2.findElement(bookto).click();
		    if(actualtoday>31) {
			
			days.get(actualtoday+17).click();

		    }
		    else {
		    days.get(actualtoday+3).click();
		    }
		    Thread.sleep(3000);
		    TouchAction a1 = new TouchAction((MobileDriver) driver2);
            a1.tap (530,870).perform();
            Thread.sleep(3000);
            if(driver2.findElements(listpnrnum).size()>0) {
            List<WebElement> mypnrs1 = driver2.findElements(listpnrnum);	
            String listpnr11=mypnrs1.get(0).getText();
            String listpnr22=mypnrs1.get(1).getText();
            if(listpnr11.contains(listpnr1) && listpnr22.contains(listpnr2) ) {
            	System.out.println("Date Search Not Working");
            }
            else {
            	System.out.println("Date Search Working1");
            }
            }
            else {
            	System.out.println("Date Search Working2");
            }                       
            driver2.findElement(filter).click();
   		    Thread.sleep(3000);
            driver2.findElement(resetall).click();
   		    Thread.sleep(3000);
   		    
   		    
   		    
   		    /////////////////////////////////////////////////////////////////
   		    
   		 
		    driver2.findElement(mybooking).click();
		    Thread.sleep(3000);
		    driver2.findElement(filter).click();
		    Thread.sleep(3000);
		    driver2.findElement(bookingdate).click();
		    Thread.sleep(3000);
		    driver2.findElement(bookfrom).click();
		    Thread.sleep(4000);	
		    List<WebElement> days1 = driver2.findElements(calanderdays);	 
		    String timeStamp1 = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
		    int today1=Integer.parseInt(timeStamp1);
		    System.out.println(today1+" sys today1");
		    String calendartoday1=days1.get(today1).getText();		    
		    System.out.println(calendartoday1+"  calendartoday");
		    int getcalendartoday1=Integer.parseInt(calendartoday1);
		    int differencetoday1=today1-getcalendartoday1;
		    int actualtoday1=differencetoday1+today1;	
			days1.get(actualtoday1).click();		    
		    Thread.sleep(3000);
		    driver2.findElement(bookto).click();	
		    Thread.sleep(4000);
		    if(actualtoday1>31) {
		    	int actualtommorow=actualtoday1+10;
				days1.get(actualtommorow).click();	
		    	
		    }
		    else {
		    	int actualtommorow=actualtoday1+1;
				days1.get(actualtommorow).click();
		    	
		    }
				    
		    Thread.sleep(3000);
		    TouchAction a2 = new TouchAction((MobileDriver) driver2);
            a2.tap (530,870).perform();
            Thread.sleep(3000);
            if(driver2.findElements(listpnrnum).size()>0) {
            List<WebElement> mypnrs1 = driver2.findElements(listpnrnum);	
            String listpnr11=mypnrs1.get(0).getText();
            String listpnr22=mypnrs1.get(1).getText();
            if(listpnr11.contains(listpnr1) && listpnr22.contains(listpnr2) ) {
         	System.out.println("Date Search Working");
            }
            else {
         	System.out.println("Date Search Not Working1");
            }
            }
            else {
         	System.out.println("Date Search Not Working2");
            }                       
            driver2.findElement(filter).click();
		    Thread.sleep(3000);
            driver2.findElement(resetall).click();
		    Thread.sleep(3000);
   		    
		    //City Search
		    driver2.navigate().back();
		    Thread.sleep(3000);
		    Dimension size2 = driver2.manage().window().getSize();
	        int startby =(int)(size2.height*0.7);
	        int endby   =(int)(size2.height*0.3);
	        int bx      =(int)(size2.width*0.5);
	        ((TouchShortcuts) driver2).swipe(bx, endby,bx,startby,1200);
	        Thread.sleep(3000);
	        driver2.findElement(filter).click();
	        Thread.sleep(3000);
		    driver2.findElement(filterfrom).click();
			Thread.sleep(3000);
	        driver2.findElement(entercityfrom).sendKeys("Jaipur");
			Thread.sleep(5000);
	        driver2.findElement(sourcetitle).click();
			Thread.sleep(3000);
	        driver2.findElement(filterto).click();
			Thread.sleep(3000);
	        driver2.findElement(entercityfrom).sendKeys("Shimla");
	        Thread.sleep(5000);
	        driver2.findElement(sourcetitle).click();
	        Thread.sleep(3000);
	        TouchAction a3 = new TouchAction((MobileDriver) driver2);
            a3.tap (530,870).perform();
            Thread.sleep(3000);	        
	        if(driver2.findElements(listpnrnum).size()>0) {
	        List<WebElement> mypnrs1 = driver2.findElements(listpnrnum);	
	        String listpnr11=mypnrs.get(0).getText();
	        String listpnr22=mypnrs.get(1).getText();
	        if(listpnr11.contains(listpnr1) && listpnr22.contains(listpnr2) ) {
	        System.out.println("City Search Not Working");
	        }
	        else {
	        System.out.println("City Search Working1");
	        }
	        }
	        else {
	        System.out.println("City Search Working2");
	        }        
	        Thread.sleep(4000);
            ////////////////////////////////////////////////////////////////////
	        
	        Thread.sleep(2000);
		    Dimension size3 = driver2.manage().window().getSize();
	        int startcy =(int)(size3.height*0.7);
	        int endcy   =(int)(size3.height*0.3);
	        int cx      =(int)(size3.width*0.5);
	        ((TouchShortcuts) driver2).swipe(cx, endcy,cx,startcy,1200);
	        Thread.sleep(3000);
	        driver2.findElement(filter).click();			
			Thread.sleep(3000);
			driver2.findElement(filterfrom).click();
			Thread.sleep(3000);
		    driver2.findElement(entercityfrom).sendKeys("Chandigarh");
		    Thread.sleep(5000);
		    driver2.findElement(sourcetitle).click();
		    Thread.sleep(3000);
			Thread.sleep(1000);
	        driver2.findElement(filterto).click();
			Thread.sleep(1000);
	        driver2.findElement(entercityfrom).sendKeys("Delhi");
	        Thread.sleep(5000);
	        driver2.findElement(sourcetitle).click();
	        Thread.sleep(3000);
	        TouchAction a4 = new TouchAction((MobileDriver) driver2);
            a4.tap (530,870).perform();
            Thread.sleep(3000);	        
	        if(driver2.findElements(listpnrnum).size()>0) {
	        List<WebElement> mypnrs1 = driver2.findElements(listpnrnum);	
	        String listpnr11=mypnrs.get(0).getText();
	        String listpnr22=mypnrs.get(1).getText();
	        if(listpnr11.contains(listpnr1) && listpnr22.contains(listpnr2) ) {
	        System.out.println("City Search Working");
	        }
	        else {
	        System.out.println("City Search Not Working1");
	        }
	        }
	        else {
	        System.out.println("City Search Not Working2");
	        }              
	        
	        Dimension size4 = driver2.manage().window().getSize();
    	    int startdy =(int)(size4.height*0.7);
    	    int enddy  =(int)(size4.height*0.3);
    	    int dx    =(int)(size4.width*0.5);
    	    ((TouchShortcuts) driver2).swipe(dx, enddy,dx,startdy,1200);
    	    Thread.sleep(3000);
    	    driver2.findElement(filter).click();			
			Thread.sleep(3000);
    	    driver2.findElement(confirmedtripradio).click();
    	    TouchAction a5 = new TouchAction((MobileDriver) driver2);
            a5.tap (530,870).perform();
    	    Thread.sleep(3000);
    	    if(driver2.findElements(confirmstatus).size()>1) {
    	    	System.out.println("Confirmed Status is working fine");
    	    }
    	    else {
    	    	System.out.println("Confirmed Status is not working fine");
    	    }   	   
    	    Thread.sleep(3000);
    	    driver2.findElement(filter).click();
		    Thread.sleep(3000);
		    driver2.findElement(resetall).click();
		    Thread.sleep(3000);
		    driver2.findElement(cancelledtripradio).click();
		    TouchAction a6 = new TouchAction((MobileDriver) driver2);
            a6.tap (530,870).perform();
            Thread.sleep(3000);
            if(driver2.findElements(cancelstatus).size()>1) {
            	System.out.println("Cancel filter working fine");
            }
            else {
            	System.out.println("Cancel filter not working fine");
            }
            Thread.sleep(3000);
            driver2.findElement(filter).click();
            Thread.sleep(3000);
            driver2.findElement(resetall).click();	     
		    return this;
		 
	        }
	 
	 
	 public AgentApp test() throws InterruptedException {
		 
		 ///Date Search
		    Thread.sleep(3000);
		    driver2.findElement(mybooking).click();
		    Thread.sleep(3000);
		    driver2.findElement(filter).click();
		    Thread.sleep(3000);
		    driver2.findElement(bookingdate).click();
		    Thread.sleep(3000);
		    driver2.findElement(bookfrom).click();
		    Thread.sleep(3000);
		    List<WebElement> days = driver2.findElements(calanderdays);	 
		    String timeStamp = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
		    int today=Integer.parseInt(timeStamp);
		    System.out.println(today+" sys today");
		    String calendartoday=days.get(today).getText();		   
		    System.out.println(calendartoday+"  calendartoday");
		    int getcalendartoday=Integer.parseInt(calendartoday);
		    int differencetoday=today-getcalendartoday;
		    int actualtoday=differencetoday+today+1;
		    System.out.println(actualtoday+"actualtoday");
		    if(actualtoday>31) {
			actualtoday=actualtoday+15;
			System.out.println(actualtoday+"  +15today");
			days.get(actualtoday).click();

		    }
		    else {
			actualtoday=actualtoday+1;
			System.out.println(actualtoday);
		    days.get(actualtoday).click();
		 
		    }
		    Thread.sleep(3000);
		    driver2.findElement(bookto).click();
		    if(actualtoday>31) {
			
			days.get(actualtoday+17).click();

		    }
		    else {
		    days.get(actualtoday+3).click();
		    }
		    Thread.sleep(3000);
		    TouchAction a1 = new TouchAction((MobileDriver) driver2);
            a1.tap (530,870).perform();
            Thread.sleep(3000);
            if(driver2.findElements(listpnrnum).size()>0) {
            List<WebElement> mypnrs1 = driver2.findElements(listpnrnum);	
            String listpnr11=mypnrs1.get(0).getText();
            String listpnr22=mypnrs1.get(1).getText();
            if(listpnr11.contains("162295169") && listpnr22.contains("162294799") ) {
         	System.out.println("Date Search Not Working");
            }
            else {
         	System.out.println("Date Search Working1");
            }
            }
            else {
         	System.out.println("Date Search Working2");
            }                       
            driver2.findElement(filter).click();
		    Thread.sleep(3000);
            driver2.findElement(resetall).click();
		    Thread.sleep(3000);
		    
		    
		    /////////////////////////////////////////////////////////////////
		    
		    driver2.findElement(mybooking).click();
		    Thread.sleep(3000);
		    driver2.findElement(filter).click();
		    Thread.sleep(3000);
		    driver2.findElement(bookingdate).click();
		    Thread.sleep(3000);
		    driver2.findElement(bookfrom).click();
		    Thread.sleep(4000);	
		    List<WebElement> days1 = driver2.findElements(calanderdays);	 
		    String timeStamp1 = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
		    int today1=Integer.parseInt(timeStamp1);
		    System.out.println(today1+" sys today1");
		    String calendartoday1=days1.get(today1).getText();		    
		    System.out.println(calendartoday1+"  calendartoday");
		    int getcalendartoday1=Integer.parseInt(calendartoday1);
		    int differencetoday1=today1-getcalendartoday1;
		    int actualtoday1=differencetoday1+today1;	
			days1.get(actualtoday1).click();		    
		    Thread.sleep(5000);
		    driver2.findElement(bookto).click();	
		    Thread.sleep(1000);
		    if(actualtoday1>31) {
		    	int actualtommorow=actualtoday1+10;
				days1.get(actualtommorow).click();	
		    	
		    }
		    else {
		    	int actualtommorow=actualtoday1+1;
				days1.get(actualtommorow).click();
		    	
		    }
			int actualtommorow=actualtoday1+10;
			days1.get(actualtommorow).click();		    
		    Thread.sleep(3000);
		    TouchAction a2 = new TouchAction((MobileDriver) driver2);
            a2.tap (530,870).perform();
            Thread.sleep(3000);
            if(driver2.findElements(listpnrnum).size()>0) {
            List<WebElement> mypnrs1 = driver2.findElements(listpnrnum);	
            String listpnr11=mypnrs1.get(0).getText();
            String listpnr22=mypnrs1.get(1).getText();
            if(listpnr11.contains("162295169") && listpnr22.contains("162294799") ) {
      	    System.out.println("Date Search Working");
            }
            else {
      	    System.out.println("Date Search Not Working1");
            }
            }
            else {
      	    System.out.println("Date Search Not Working2");
            }                       
            driver2.findElement(filter).click();
		    Thread.sleep(3000);
            driver2.findElement(resetall).click();
		    Thread.sleep(3000);
		
         	/////////////////////////////////////////////////////////////////////////	
            Dimension size2 = driver2.manage().window().getSize();
    	    int startyy =(int)(size2.height*0.7);
    	    int endyy   =(int)(size2.height*0.3);
    	    int xx      =(int)(size2.width*0.5);
    	    ((TouchShortcuts) driver2).swipe(xx, endyy,xx,startyy,1200);
    	    Thread.sleep(3000);
    	    driver2.findElement(confirmedtripradio).click();
    	    TouchAction a3 = new TouchAction((MobileDriver) driver2);
            a3.tap (530,870).perform();
    	    Thread.sleep(3000);
    	    if(driver2.findElements(confirmstatus).size()>1) {
    	    	System.out.println("Confirmed Status is working fine");
    	    }
    	    else {
    	    	System.out.println("Confirmed Status is not working fine");
    	    }   	   
    	    Thread.sleep(3000);
    	    driver2.findElement(filter).click();
		    Thread.sleep(3000);
		    driver2.findElement(resetall).click();
		    Thread.sleep(3000);
		    driver2.findElement(cancelledtripradio).click();
		    TouchAction a4 = new TouchAction((MobileDriver) driver2);
            a4.tap (530,870).perform();
            Thread.sleep(3000);
            if(driver2.findElements(cancelstatus).size()>1) {
            	System.out.println("Cancel filter working fine");
            }
            else {
            	System.out.println("Cancel filter not working fine");
            }
            Thread.sleep(3000);
            driver2.findElement(filter).click();
            Thread.sleep(3000);
            driver2.findElement(resetall).click();
		    

         
		 
    	    return this;
		    }

	 
	 public AgentApp agentlogout() throws InterruptedException {
		 
		     Thread.sleep(6000);
		     driver2.findElement(morebutton).click();
		     Thread.sleep(3000);
		     driver2.findElement(logoutbutton).click();
		     return this;
	 }
	 
	 
		 
}
