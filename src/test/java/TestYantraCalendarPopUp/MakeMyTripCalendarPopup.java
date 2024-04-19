package TestYantraCalendarPopUp;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripCalendarPopup {

	public static void main(String[] args) throws InterruptedException {
 
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		
		Actions actions = new Actions(driver);
		Thread.sleep(7000);
		actions.click().perform();
		driver.findElement(By.xpath("//span[.='Return']")).click();

		
		Thread.sleep(3000);
		for(;;) {
			try {
			driver.findElement(By.xpath("//div[.='March 2025']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='25']")).click();
			break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
		}
		


	}
	}

	
