package testYantraWindowhandle;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowHandleQspider {
	
	
	
	@Test
	public void irctc() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.xpath("//a[.='Open in new window']")).click();
		
		Set<String> allWindow = driver.getWindowHandles();
		for (String singlewindow : allWindow) {
			driver.switchTo().window(singlewindow);
			String title = driver.getTitle();
			if(title.contains("Demoapps | Qspider")) {
				WebElement emailTextfield = driver.findElement(By.id("email"));
				emailTextfield.clear();
				emailTextfield.sendKeys("aparnanandanshiat@gmail.com");
				WebElement passwordTextfield = driver.findElement(By.id("email"));
				passwordTextfield.clear();
				passwordTextfield.sendKeys("MOCKING123@");
				WebElement confirmpasswordTextfield = driver.findElement(By.id("confirm-password"));
				confirmpasswordTextfield.sendKeys("MOCKING123@");
		driver.findElement(By.xpath("//button[.='Sign Up']")).submit();
		break;
			}
			
		}
		
		

		driver.manage().window().minimize();
		driver.quit();
	}
	
	
}
