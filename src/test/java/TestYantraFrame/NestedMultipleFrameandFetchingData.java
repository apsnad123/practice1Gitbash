package TestYantraFrame;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.math3.analysis.function.Add;
import org.checkerframework.checker.units.qual.kg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedMultipleFrameandFetchingData {
	WebDriver driver;
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void frame() throws InterruptedException {
 

		
	    WebElement parentframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
	    driver.switchTo().frame(parentframe);
		String emailText = driver.findElement(By.xpath("//p[.='Admin@gmail.com']")).getText();
		
		WebElement childframe = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
		driver.switchTo().frame(childframe);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(emailText);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(parentframe);
        String passwordText = driver.findElement(By.xpath("(//p[.='Admin@1234'])[1]")).getText();
        driver.switchTo().frame(childframe);
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys(passwordText);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(parentframe);
        String confirmpasswordText = driver.findElement(By.xpath("(//p[.='Admin@1234'])[2]")).getText();
        driver.switchTo().frame(childframe);
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys(confirmpasswordText);
		

		  driver.switchTo().parentFrame();	 
		  driver.switchTo().frame(3);
		  //Thread.sleep(5000);
		  driver.findElement(By.id("submitButton")).click();
		  //driver.switchTo().defaultContent();
		  
			
		
		//or
		
//		WebElement pp = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
//		driver.switchTo().frame(pp);
//		 String de = driver.findElement(By.xpath("//p[.='Admin@gmail.com']")).getText();
//
//		WebElement cc = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
//		driver.switchTo().frame(cc);
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("email")).sendKeys(de);
//		
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(pp);
//		 String dp = driver.findElement(By.xpath("(//p[.='Admin@1234'])[1]")).getText();
//		 driver.switchTo().frame(cc);
//			driver.switchTo().frame(1);
//			driver.findElement(By.id("password")).sendKeys(dp);
//			
//			driver.switchTo().defaultContent();
//			driver.switchTo().frame(pp);
//			 String cdp = driver.findElement(By.xpath("(//p[.='Admin@1234'])[1]")).getText();
//			 driver.switchTo().frame(cc);
//				driver.switchTo().frame(2);
//				driver.findElement(By.id("confirm")).sendKeys(cdp);
//				
//				
//				driver.switchTo().defaultContent();
//				driver.switchTo().frame(pp);
//				 driver.switchTo().frame(cc);
//					driver.switchTo().frame(3);
//					driver.findElement(By.id("submitButton")).click();

					



			

		
		

		
		
		
	
	}
	
	
	

}


