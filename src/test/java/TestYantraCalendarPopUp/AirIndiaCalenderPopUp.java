

package TestYantraCalendarPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaCalenderPopUp {

	public static void main(String[] args) throws InterruptedException {
 
	
		int date=26;
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.sastasafar.com/");
		driver.findElement(By.id("dateNew")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[@aria-label='26/03/2025']")).click();
				break;

			} catch (Exception e) {
				driver.findElement(By.xpath("//div[@title='Next month']")).click();
			}
			Thread.sleep(5000);
		}
		

		
//			driver.manage().window().maximize();
//            driver.quit();


	}
	}

	

