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
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollTO {
	WebDriver driver;
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void click() throws InterruptedException {
	
//		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
//		Point loction = ele.getLocation();
//		int x=loction.getX();
//		int y=loction.getY();
//		Actions action= new Actions(driver);
//        action.scrollByAmount(x, y).perform();
//   
		//or
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		Actions action= new Actions(driver);
        action.scrollToElement(ele).perform();
   


		
		
	
	}
	
	
	

}


