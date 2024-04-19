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

public class Rightclick {
	WebDriver driver;
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void rightclick() throws InterruptedException {
      //button1
		WebElement rightclickButton1 = driver.findElement(By.id("btn30"));
		Actions action = new Actions(driver);
		action.contextClick(rightclickButton1).perform();
		WebElement yesButton1 = driver.findElement(By.xpath("//div[.='Yes']"));
		yesButton1.click();
		WebElement answer1 = driver.findElement(By.xpath("//span[.='You selected \"Yes\"']"));
        String text = answer1.getText();
        if(text.equals("You selected \"Yes\"")){
        	System.out.println("you selected yes");
        }else {
        	System.out.println("you selected no");
        }
		
		 //button2
		WebElement rightclickButton2 = driver.findElement(By.id("btn31"));
		action.contextClick(rightclickButton2).perform();
		WebElement yesButton2 = driver.findElement(By.xpath("//div[.='Yes']"));
		action.contextClick(yesButton2).perform();
		
		 //button3
		WebElement rightclickButton3 = driver.findElement(By.id("btn32"));
		action.contextClick(rightclickButton3).perform();
		WebElement yesButton3 = driver.findElement(By.xpath("//div[.='5']"));
		action.contextClick(yesButton3).perform();
		
		
		
		
	
	}
	
	
	

}


