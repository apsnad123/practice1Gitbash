package testYantraPopup;

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

public class notificationOnSite {
	
//	@Test
//	void news18() {
//		ChromeOptions option= new ChromeOptions();
//		option.addArguments("--disable-notification");
//		WebDriver driver = new ChromeDriver(option);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.news18.com/");
//		driver.manage().window().minimize();
//		driver.quit();
//	}
	
	@Test
	public void irctc() {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[.=' BUSES ']")).click();
		
		Set<String> allwind = driver.getWindowHandles();
		System.out.println(allwind);
		
		Iterator<String> itertor = allwind.iterator();
		String parentwindow = itertor.next();
		String childwindow = itertor.next();

		driver.switchTo().window(childwindow);
		Actions action = new Actions(driver);
		WebElement departFrom = driver.findElement(By.id("departFrom"));
		action.scrollToElement(departFrom);
		departFrom.sendKeys("Banglore");
		WebElement goingTo = driver.findElement(By.id("goingTo"));
		action.scrollToElement(goingTo);
		goingTo.sendKeys("Patna");
		driver.switchTo().window(parentwindow);

		driver.manage().window().minimize();
		driver.quit();
	}
	
	
}
