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

public class MultipleFrameandFetchingData
{
	WebDriver driver;
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void frame() throws InterruptedException {
 

        String emailText = driver.findElement(By.xpath("//p[.='Email:Admin@gmail.com']")).getText();
        String passwordText = driver.findElement(By.xpath("//p[.='Password : Admin@1234']")).getText();
        String confirmPasswordText = driver.findElement(By.xpath("//p[.='Confirm Password : Admin@1234']")).getText();

        WebElement parentframe = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		 driver.switchTo().frame(parentframe);
		 driver.findElement(By.id("email")).sendKeys(emailText);
		 driver.findElement(By.id("password")).sendKeys(passwordText);
		 driver.findElement(By.id("confirm-password")).sendKeys(confirmPasswordText);
		 Thread.sleep(4000);
		 driver.findElement(By.id("submitButton")).submit();
		 driver.switchTo().defaultContent();
		 
		 String signemailText = driver.findElement(By.xpath("//p[.='Email:SuperAdmin@gmail.com']")).getText();
	        String signpasswordText = driver.findElement(By.xpath("//p[.='Password : SuperAdmin@1234']")).getText();
         WebElement childframe = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		 driver.switchTo().frame(childframe);
		 driver.findElement(By.id("username")).sendKeys(signemailText);
		 driver.findElement(By.id("password")).sendKeys(signpasswordText);
		 Thread.sleep(3000);
		 driver.findElement(By.id("submitButton")).submit();
		 Thread.sleep(3000);
		
		
		 
		
		
		
		
	
	}
	
	
	

}


