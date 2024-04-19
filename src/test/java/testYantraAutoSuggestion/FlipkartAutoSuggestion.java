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

public class FlipkartAutoSuggestion{

	@Test
	public void autosug() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Shirt");
		
		List<WebElement> autosug = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
			  for (WebElement sug : autosug) {
				  String sugText=sug.getText();
				  System.out.println(sugText);
				  
				  if(sugText.contains("in Casual Shirts")) {
					  sug.click();
					  break;
				  }
				
			}
			}
		
		
		//driver.manage().window().minimize();
//        driver.quit();
	
	}

