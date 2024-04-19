package TestYantraActionClassMethod;

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

public class ActiveElement {
	WebDriver driver;
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void click() throws InterruptedException {
 
Actions action = new Actions(driver);
action.sendKeys(driver.switchTo().activeElement()).sendKeys("aparnanandanshait@gmail.com").sendKeys(Keys.TAB).sendKeys("Mocking123@").sendKeys(Keys.ENTER).build().perform();
//	or
		
//driver.switchTo().activeElement().sendKeys("aparnanandanshait@gmail.com");
//driver.switchTo().activeElement().sendKeys(Keys.TAB);
//Thread.sleep(3000);
//driver.switchTo().activeElement().sendKeys("MOCKING123@");
//driver.switchTo().activeElement().submit();
		
		//or

//driver.switchTo().activeElement().sendKeys("aparnanandanshait@gmail.com");
//driver.switchTo().activeElement().sendKeys(Keys.TAB);
//Thread.sleep(3000);
//driver.switchTo().activeElement().sendKeys("MOCKING123@");
//driver.switchTo().activeElement().sendKeys(Keys.TAB);
//driver.switchTo().activeElement().sendKeys(Keys.ENTER);
//Thread.sleep(3000);
//driver.switchTo().activeElement().sendKeys(Keys.TAB);
//driver.switchTo().activeElement().sendKeys(Keys.ENTER);
//Thread.sleep(3000);


		
		
		
	
	}
	
	
	

}


