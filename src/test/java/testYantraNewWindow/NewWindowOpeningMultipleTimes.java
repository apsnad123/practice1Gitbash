package testYantraNewWindow;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindowOpeningMultipleTimes {

	@Test
	public void window() {
		
		WebDriver driver = new ChromeDriver();
	 for(int i=1;i<=4;i++) {
		 driver.switchTo().newWindow(WindowType.WINDOW);
	 }
	 
	
	}
}
