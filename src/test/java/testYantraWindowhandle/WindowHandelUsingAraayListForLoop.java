package testYantraWindowhandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandelUsingAraayListForLoop {
	
	@Test
	public void window() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		driver.findElement(By.id("browserButton3")).click();
		
        ArrayList<String> allWindows = new ArrayList<String>(driver.getWindowHandles());		
		
        for (int i = 0; i < allWindows.size(); i++) {
			driver.switchTo().window(allWindows.get(i));
			driver.close();
		}
		
		
//		driver.manage().window().maximize();
//        driver.quit();
	}

}
