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

public class DragandDrop {
	WebDriver driver;
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void drag() throws InterruptedException {
	     WebElement drag1 = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
	     WebElement drag2 = driver.findElement(By.xpath("//div[.='Mobile Cover']"));
	     WebElement drag3 = driver.findElement(By.xpath("//div[.='Laptop Charger']"));
	     WebElement drag4 = driver.findElement(By.xpath("//div[.='Laptop Cover']"));
	     WebElement drag5 = driver.findElement(By.xpath("//div[.='Mobile Accessories']"));
	     WebElement drag6 = driver.findElement(By.xpath("//div[.='Laptop Accessories']"));

			Actions action = new Actions(driver);
			action.dragAndDrop(drag1, drag5).perform();
			action.dragAndDrop(drag2, drag5).perform();
			action.dragAndDrop(drag3, drag6).perform();
			action.dragAndDrop(drag4, drag6).perform();

		
		
		
	
	}
	
	
	

}


