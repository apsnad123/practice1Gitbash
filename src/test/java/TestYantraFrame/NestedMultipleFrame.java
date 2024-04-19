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

public class NestedMultipleFrame {
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
 
//  WebElement parentframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
//  driver.switchTo().frame(parentframe);
//  
//  WebElement childframe = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
//  driver.switchTo().frame(childframe);
//  
//  WebElement grandchildframe1 = driver.findElement(By.xpath("(//div[@class='form-group']/iframe)[1]"));
//  driver.switchTo().frame(grandchildframe1);
//  driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
//  driver.switchTo().parentFrame();
//  
//  WebElement grandchildframe2 = driver.findElement(By.xpath("(//div[@class='form-group']/iframe)[2]"));
//  driver.switchTo().frame(grandchildframe2);
//  driver.findElement(By.id("password")).sendKeys("Admin@123");
//  driver.switchTo().parentFrame();
//
//  WebElement grandchildframe3 = driver.findElement(By.xpath("(//div[@class='form-group']/iframe)[3]"));
//  driver.switchTo().frame(grandchildframe3);  
//  driver.findElement(By.id("confirm")).sendKeys("Admin@123");
//  driver.switchTo().parentFrame();
//
//  WebElement grandchildframe4 = driver.findElement(By.xpath("(//div[@class='form-group']/iframe)[4]"));
//  driver.switchTo().frame(grandchildframe4);  
//  driver.findElement(By.id("submitButton")).click();
//  Thread.sleep(5000);
//
//
//	or
		//using frame index
	 WebElement parentframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
	  driver.switchTo().frame(parentframe);
	  
	  WebElement childframe = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
	  driver.switchTo().frame(childframe);
	  
	  driver.switchTo().frame(0);
	  driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	  driver.switchTo().parentFrame();
	  
	  driver.switchTo().frame(1);
	  driver.findElement(By.id("password")).sendKeys("Admin@123");
	  driver.switchTo().parentFrame();
	
	  driver.switchTo().frame(2);  
	  driver.findElement(By.id("confirm")).sendKeys("Admin@123");
	  driver.switchTo().parentFrame();
	
	  driver.switchTo().frame(3);  
	  driver.findElement(By.id("submitButton")).click();
	  Thread.sleep(5000);
	

		
	  
       
		
	
	}
	
	
	

}


