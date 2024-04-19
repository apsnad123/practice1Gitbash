package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleShadowLogoScreenshot {
@Test
	public void download() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement h01= driver.findElement(By.tagName("ntp-app"));
	SearchContext t01= h01.getShadowRoot();
	WebElement h02= t01.findElement(By.id("logo"));
	SearchContext t02= h02.getShadowRoot();
	WebElement to1= t02.findElement(By.id("logo"));

	
	}
}
