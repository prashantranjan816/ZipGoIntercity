package headless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeHeadless {
	
	
	@Test
	public void chromeHeadlessTest() {
		
//		Following chrome options are required for Chrome HeadLess Browser: 
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("window-size=1400,800"); 
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.google.com");         
        WebElement element = driver.findElement(By.name("q"));	
        element.sendKeys("zipgo");	
        element.submit();         			
        System.out.println("#### Page title is: " + driver.getTitle());
        System.out.println("######################>>>   Badhae ho.. ChromeHeadless Headless testing is working  ###................");
        driver.quit();	

		
	}
	
	

}
