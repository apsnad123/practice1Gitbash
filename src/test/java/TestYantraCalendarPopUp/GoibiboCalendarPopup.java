package TestYantraCalendarPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboCalendarPopup {

	public static void main(String[] args) {
 
//		String datenMonth="";
//		int date=26;
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.goibibo.com/");
//		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
//		driver.findElement(By.xpath("//span[.='Departure']")).click();
//		//driver.findElement(By.xpath("//div[.='March 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='26']")).click();
//		driver.findElement(By.xpath("//div[.='"+datenMonth+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']")).click();
		
		//----------------------------------------------------------------------------
		
		String datenMonth1="March 2024";
		int date1=26;
		String datenMonth2="April 2025";
		int date2=1;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		for (;;) {
			try {
			driver.findElement(By.xpath("//div[.='"+datenMonth1+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date1+"']")).click();
			break;
			}catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}}
			//----------------------------------------------
			driver.findElement(By.xpath("//span[.='Return']")).click();
			for (;;) {
				try {
				driver.findElement(By.xpath("//div[.='"+datenMonth2+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date2+"']")).click();
				break;
				}catch (Exception e) {
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				}
		}

			driver.manage().window().maximize();
            driver.quit();


	}
	}

	
