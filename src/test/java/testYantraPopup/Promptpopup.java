package testYantraPopup;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.math3.analysis.function.Add;
import org.checkerframework.checker.units.qual.kg;
import org.openqa.selenium.Alert;
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

public class Promptpopup {
	WebDriver driver;
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void alert() throws InterruptedException {
		 
	WebElement promptPopup = driver.findElement(By.id("buttonAlert1"));
	promptPopup.click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
     	alt.sendKeys("yes");
		Thread.sleep(3000);
		alt.accept();
		WebElement ele = driver.findElement(By.xpath("//p[@class=\"pt-2 text-center\"]"));
		String textAns = ele.getText();
		if(textAns.contains("yes")) {
			System.out.println("you selected yes");
		}else {
			System.out.println("you selected no");
		}
		
			
		
	}
	
	
	

}


