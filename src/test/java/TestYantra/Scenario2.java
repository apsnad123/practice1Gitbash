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

public class Scenario2 {
	WebDriver driver;
	//Write a script to validate placeholder is present in the textbox?
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
		WebElement emailTextfield = driver.findElement(By.id("email"));
		String emailplaceText = emailTextfield.getAttribute("placeholder");
		WebElement passwordTextfield = driver.findElement(By.id("password"));
		String passwordplaceText = passwordTextfield.getAttribute("placeholder");
		if(emailplaceText.equals("Enter your email") && passwordplaceText.equals("Enter your password")) {
			System.out.println("correct placeText is shown...PASSED");
			emailTextfield.sendKeys(Keys.chord("aparnanandanshiat@gmail.com"));
			Thread.sleep(3000);
			passwordTextfield.sendKeys(Keys.chord("MOCKING123@"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Login']")).submit();
			Thread.sleep(3000);

		}else {
			System.out.println("wrong placeText is shown...Failed");
			
			}

		}
		
	}



