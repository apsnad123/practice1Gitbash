package testYantraWindowhandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandelandItertorUsingWhile {
	
	@Test
	public void window() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		String parenWindow = driver.getWindowHandle();
		driver.findElement(By.id("browserButton3")).click();
		
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> iterator = allWindow.iterator();
		
		while (iterator.hasNext()) {
			String wind =  iterator.next();
			String url = driver.switchTo().window(wind).getCurrentUrl();
//or
			//String url = driver.switchTo().window(iterator.next()).getCurrentUrl();
			System.out.println(url);
			if(url.contains("SignUpPage")) {
				driver.findElement(By.id("email")).sendKeys("aparnanandanshiat@gmail.com");
				driver.findElement(By.id("password")).sendKeys("MOCKING123@");
				driver.findElement(By.id("confirm-password")).sendKeys("MOCKING123@");
				driver.findElement(By.xpath("//button[.='Sign Up']")).submit();
			}else if(url.contains("SignUp")) {
				driver.findElement(By.id("username")).sendKeys("APARNA NANDAN");
				driver.findElement(By.id("email")).sendKeys("aparnanandanshiat@gmail.com");
				driver.findElement(By.id("password")).sendKeys("MOCKING123@");
				driver.findElement(By.xpath("//button[.='Sign Up']")).submit();
			}else if(url.contains("Login")) {
				driver.findElement(By.id("username")).sendKeys("APARNA NANDAN");
				driver.findElement(By.id("password")).sendKeys("MOCKING123@");
				driver.findElement(By.xpath("//button[.='Login']")).submit();
			}
			
		}		
		driver.manage().window().maximize();
        driver.quit();
	}

}
