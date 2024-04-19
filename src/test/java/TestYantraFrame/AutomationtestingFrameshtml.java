package TestYantraFrame;

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

public class AutomationtestingFrameshtml {
	WebDriver driver;
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://demo.automationtesting.in/Frames.html");
	}
	
//	@AfterMethod
//	public void postcondition(){
//		driver.manage().window().minimize();
//		driver.quit();
//	}
	
	@Test
	public void frame() throws InterruptedException {
		 
		WebElement box1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(box1);
        WebElement text= driver.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("hiiii");
	
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		WebElement box2 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(box2);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aparna");
	    
		
		
	}
	
	
	

}


