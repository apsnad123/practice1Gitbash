package TestYantraActionClassMethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.math3.analysis.function.Add;
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

public class singleclick {
	WebDriver driver;
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void rightclick() throws InterruptedException {
      //button1
		WebElement yesButton1 = driver.findElement(By.id("btn20"));
		Actions action = new Actions(driver);
		action.click(yesButton1).perform();
		
		
		//button2
				WebElement yesButton2 = driver.findElement(By.id("btn22"));
				action.click(yesButton2).perform();
		
		//button3
				WebElement yesButton3 = driver.findElement(By.id("btn28"));
				action.click(yesButton3).perform();
			
			
		
		
		
	
	}
	
	
	

}


