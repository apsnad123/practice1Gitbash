package TestYantra;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario13 {
	WebDriver driver;
//Write a script to enter data into Text field?
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void anchorlink() throws InterruptedException {
 List<WebElement> allLink = driver.findElements(By.xpath("//a"));
System.out.println(allLink.size());

for(WebElement singleLink:allLink) {
	System.out.println(singleLink.getAttribute("href"));
}

//for(int i=0;i<allLink.size();i++) {
//	System.out.println(allLink.get(i).getText());
//}
	 
 
		
		

		
		Thread.sleep(3000);
		
	}

}

