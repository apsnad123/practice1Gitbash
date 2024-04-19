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
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario9 {
	WebDriver driver;
//Write a script to handle notification popup?


	@BeforeMethod
	public void precondition(){
		ChromeOptions opts= new ChromeOptions();
		opts.addArguments("--disable-notification");
		driver=new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0&scenario=1");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void autheticationwindow() throws InterruptedException {
		WebElement notifictionButton = driver.findElement(By.id("browNotButton"));
		Thread.sleep(3000);
		

	    }
	}
	




