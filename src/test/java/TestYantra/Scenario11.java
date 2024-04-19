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

public class Scenario11 {
	WebDriver driver;
//Write a script to enter data into Text field?
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void signup() throws InterruptedException {
	WebElement nameTextfield = driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input[@id='name']"));
		nameTextfield.sendKeys(Keys.chord("APARNA NANDAN"));
		
		WebElement emailTextfield = driver.findElement(By.xpath("//input[@id='email']/preceding-sibling::label[text()='Email Id']"));
		String textInEmail = emailTextfield.getText();
		System.out.println("the text is=  "+ textInEmail);

		
		WebElement passwordTextfield = driver.findElement(By.xpath("//div/descendant::input[@id='password']"));
		passwordTextfield.sendKeys(Keys.chord("MOCKING123@"));
		

		
		Thread.sleep(3000);
		
	}

}

