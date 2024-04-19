package testYantraAutoSuggestion;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoSuggestion{

	@Test
	public void autosug() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[.=' BUSES ']")).click();
		Set<String> allwind = driver.getWindowHandles();
		for (String singleWind : allwind) {
			driver.switchTo().window(singleWind);
			String title = driver.getTitle();
			
			if (title.equals("IRCTC Bus - Online Bus Ticket Booking | Bus Reservation")) {
				WebElement departedFrom = driver.findElement(By.xpath("//input[@id='departFrom']"));
				Actions action = new Actions(driver);
				action.scrollToElement(departedFrom);
				departedFrom.sendKeys("Banglore");
				 List<WebElement> autosug = driver.findElements(By.xpath("//li/div[@class='ui-menu-item-wrapper']"));
			  for (WebElement sug : autosug) {
				  String sugText=sug.getText();
				  System.out.println(sugText);
				  
				  if(sugText.contains("Banglore")) {
					  driver.findElement(By.xpath("//button[.='Search Bus ']")).click();
					  break;
				  }
//				
//			}
			}
		}
		
		//driver.manage().window().minimize();
//        driver.quit();
	}
	}
}
