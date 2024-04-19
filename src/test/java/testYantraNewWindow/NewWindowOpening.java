package testYantraNewWindow;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindowOpening {

	@Test
	public void window() {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.get("https://www.amazon.in/");
	 driver.switchTo().newWindow(WindowType.WINDOW);
	 driver.get("https://www.facebook.com/");
	 driver.switchTo().newWindow(WindowType.WINDOW);
	 driver.get("https://www.flipkart.com/");
	 
	 driver.manage().window().minimize();
	 driver.get(null);

	}
}
