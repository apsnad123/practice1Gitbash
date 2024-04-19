package testYantraWindowhandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandelUsingItertor {
	
	@Test
	public void window() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		driver.findElement(By.id("browserButton3")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> iterator = windowHandles.iterator();
		String parentWindow = iterator.next();
		String childWindow1 = iterator.next();		
		String childWindow2 = iterator.next();
		String childWindow3 = iterator.next();
		
		driver.switchTo().window(childWindow3);
		driver.findElement(By.id("email")).sendKeys("aparnanandanshiat@gmail.com");
		driver.findElement(By.id("password")).sendKeys("MOCKING123@");
		driver.findElement(By.id("confirm-password")).sendKeys("MOCKING123@");
		driver.findElement(By.xpath("//button[.='Sign Up']")).submit();
	
		driver.switchTo().window(childWindow2);
		driver.findElement(By.id("username")).sendKeys("APARNA NANDAN");
		driver.findElement(By.id("email")).sendKeys("aparnanandanshiat@gmail.com");
		driver.findElement(By.id("password")).sendKeys("MOCKING123@");
		driver.findElement(By.xpath("//button[.='Sign Up']")).submit();
	
		driver.switchTo().window(childWindow1);
		driver.findElement(By.id("username")).sendKeys("APARNA NANDAN");
		driver.findElement(By.id("password")).sendKeys("MOCKING123@");
		driver.findElement(By.xpath("//button[.='Login']")).submit();
	

		driver.switchTo().window(parentWindow);

		
		
		driver.manage().window().maximize();
        driver.quit();
	}

}
