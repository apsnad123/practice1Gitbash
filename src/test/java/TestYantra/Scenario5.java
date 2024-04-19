package TestYantra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario5 {
	WebDriver driver;
//Write a script to handle prompt alerts?
//Write a script to get the text from prompt alert?
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2&scenario=6");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void prompt() throws InterruptedException {
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(3000);
		String promptMsg = driver.switchTo().alert().getText();
		System.out.println("the PROMPT msg is: "+ promptMsg);
		Thread.sleep(3000);
	    driver.switchTo().alert().sendKeys("yes");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	    }
	}
	


