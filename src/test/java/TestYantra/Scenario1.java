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

public class Scenario1 {
	WebDriver driver;
//Write a script to enter data into Text field?
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/login");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void login() throws InterruptedException {
//		WebElement emailTextfield = driver.findElement(By.id("email"));
//		emailTextfield.sendKeys(Keys.chord("aparnanandanshiat@gmail.com"));
//driver.findElement(By.cssSelector("#email")).sendKeys(Keys.chord("aparnanandanshiat@gmail.com"));
		driver.findElement(By.cssSelector("[id='email'][placeholder='Enter your email']")).sendKeys(Keys.chord("aparnanandanshiat@gmail.com"));
		
		//driver.findElement(By.cssSelector("[id='email']")).sendKeys(Keys.chord("aparnanandanshiat@gmail.com"));
		
		//driver.findElement(By.cssSelector("[input]")).sendKeys(Keys.chord("aparnanandanshiat@gmail.com"));

		WebElement passwordTextfield = driver.findElement(By.id("password"));
		passwordTextfield.sendKeys(Keys.chord("MOCKING123@"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		
	}

}
