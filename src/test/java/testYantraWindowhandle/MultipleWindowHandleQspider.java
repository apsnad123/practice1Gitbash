package testYantraWindowhandle;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testYantra.genericUtility.WebdriverUtilities;

public class MultipleWindowHandleQspider {
	
	
	
	@Test
	public void qspider() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");

		//multiple tabs
//		WebdriverUtilities util = new WebdriverUtilities();
//		driver.findElement(By.id("browserButton2")).click();
//		util.switchWindow(driver, "SignUp");
//		driver.findElement(By.id("email")).sendKeys("aparnanandanshiat@gmail.com");
		
	WebdriverUtilities util = new WebdriverUtilities();
 	driver.findElement(By.id("browserButton2")).click();
 	util.switchWindow(driver, "SignUpPage");
	driver.findElement(By.id("email")).sendKeys("aparnanandanshiat@gmail.com");
    driver.close();
     
    util.switchWindow(driver, "Login");
	driver.findElement(By.id("password")).sendKeys("MOCKING123@");
    

			
		
		
		

		driver.manage().window().minimize();
		//driver.quit();
	}
	
	
}
