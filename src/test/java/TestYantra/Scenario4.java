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

public class Scenario4 {
	WebDriver driver;
//Write a script to handle a confirm alert?
//Write a script to get the text from confirm alert?
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1&scenario=5");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void confirm() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		String confirmMsg = driver.switchTo().alert().getText();
		System.out.println("the CONFIRM msg is: "+ confirmMsg);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
	}
	
}
