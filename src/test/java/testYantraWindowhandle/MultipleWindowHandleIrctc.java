package testYantraWindowhandle;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testYantra.genericUtility.WebdriverUtilities;

public class MultipleWindowHandleIrctc {
	
	
	
	@Test
	public void qspider() throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebdriverUtilities util= new WebdriverUtilities();
		driver.findElement(By.xpath("//a[.=' BUSES ']")).click();
		util.switchWindow(driver, "home");
		WebElement departfrom = driver.findElement(By.id("departFrom"));
		Actions action= new Actions(driver);
		action.scrollToElement(departfrom);
		departfrom.sendKeys("Bangalore");
		driver.findElement(By.id("goingTo")).sendKeys("Patna");
		Thread.sleep(3000);
		driver.close();
		
		util.switchWindow(driver, "train-search");
		driver.findElement(By.xpath("//a[.=' FLIGHTS ']")).click();
		util.switchWindow(driver, "air.irctc.co.in");
		driver.findElement(By.id("stationFrom")).sendKeys("Bengaluru (BLR)");
		driver.findElement(By.id("stationTo")).sendKeys("Patna (PAT)");
		Thread.sleep(3000);
		driver.close();
		


  

		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	}
	
	
}
