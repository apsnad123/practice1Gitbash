package TestYantra;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario8 {
	WebDriver driver;
//Write a script to upload file using selenium?

	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void autheticationwindow() throws InterruptedException {
		WebElement chooseFile = driver.findElement(By.id("fileInput"));
		Thread.sleep(3000);
		chooseFile.sendKeys("C:\\Users\\aparn\\OneDrive\\Desktop");
		Thread.sleep(3000);

	    }
	}
	



