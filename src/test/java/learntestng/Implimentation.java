package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Implimentation {

 WebDriver driver;

	@BeforeTest
	public void preCondition() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	@AfterTest
	private void postCondition() {
    driver.manage().window().minimize();
    driver.quit();
	}
	
	@Test(priority = 2)
	public void vtigerlogin() throws InterruptedException {
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernametextfield= driver.findElement(By.id("username"));
		usernametextfield.clear();
		usernametextfield.sendKeys("admin");
		WebElement passwordtextfield= driver.findElement(By.id("password"));
		passwordtextfield.clear();
		passwordtextfield.sendKeys("admin");
		driver.findElement(By.xpath("button[text()='Sign in']")).submit();
		Thread.sleep(2000);	
	}
	@Test(priority = 1)
	public void facebooklogin() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("admin");
		 driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.xpath("button[text()='login in']")).submit();
		Thread.sleep(2000);	
	}
}
