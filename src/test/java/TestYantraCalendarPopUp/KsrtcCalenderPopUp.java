

package TestYantraCalendarPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KsrtcCalenderPopUp {

	public static void main(String[] args) {
 
	
		int date1=26;
		int date2=17;

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@value='Date Of Departure']")).click();
		driver.findElement(By.xpath("//a[.='"+date1+"']")).click();
		
		driver.findElement(By.xpath("//input[@value='Date Of Return']")).click();
		driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		driver.findElement(By.xpath("//a[.='"+date2+"']")).click();

		
//			driver.manage().window().maximize();
//            driver.quit();


	}
	}

	

