package headless;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import library.Utility;	

public class Phantom {
	
	final static String phantomfilelocation = "./src/test/resources/phantomjs-2.1.1-macosx/bin/phantomjs";
	static String name;
	
	/*	public static void main(String[] args) throws IOException {
        	        File file = new File(phantomfilelocation);								
        	        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
                    WebDriver driver = new PhantomJSDriver();	
                    driver.get("http://www.google.com");         
                    WebElement element = driver.findElement(By.name("q"));	
                    element.sendKeys("zipgo");					
                    element.submit();         			
                    System.out.println("#### Page title is: " + driver.getTitle());
                    System.out.println("######################>>>   Badhae ho.. Headless testing is working  ###................");
                    driver.quit();			
           }*/
		
		@Test
		public static void headlessSetup() {
//			Bellow we are creating new anonymous inner class will be created during compile time & return us current method name.
			class Local {};
		      name = Local.class.getEnclosingMethod().getName();
			System.out.println("Entered in >>"+name);
//			----------------------------------------------------------------------------------------------------------------
			 File file = new File(phantomfilelocation);								
 	        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
             WebDriver driver = new PhantomJSDriver();	
             driver.get("http://www.google.com");         
             WebElement element = driver.findElement(By.name("q"));	
             element.sendKeys("zipgo");	
             Utility.getScreenshot(driver, name + "_ScreenShot");
             element.submit();         			
             System.out.println("#### Page title is: " + driver.getTitle());
             System.out.println("######################>>>   Badhae ho.. Headless testing is working  ###................");
             driver.quit();	
			
			
		}
		
}
