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

public class Scenario6 {
	WebDriver driver;
//Write a script to handle new window popup?
//Write a script to transfer control from one window to another?

	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0&scenario=2");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void window() throws InterruptedException {
//		driver.findElement(By.id("browserLink1")).click();
//			Set<String> allWindids = driver.getWindowHandles();
//		for(String newWind: allWindids) {
//			String newwidTitle = driver.switchTo().window(newWind).getTitle();
//			System.out.println("title: "+ newwidTitle);
//			if(newwidTitle.equals("DemoApps | Qspiders | Browser Windows")) {
//				System.out.println("passed");
//			}else {
//				System.out.println("failed");
//			}	
//		}
		driver.findElement(By.id("browserLink1")).click();
		Set<String> windHandle = driver.getWindowHandles();
		Iterator<String> iterator = windHandle.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.id("email")).sendKeys("aparnanandanshait@gmail.com");
		driver.findElement(By.id("password")).sendKeys("MOCKING123@");
		driver.findElement(By.xpath("//button[text()='Sign Up']")).submit();
		driver.switchTo().window(parentWindow);

		
		
	    }
	}
	





