package testYantraPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileDownloadpopup {


	
	@Test
	public void downloadfile() throws AWTException{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
	driver.findElement(By.id("writeArea")).sendKeys("hi there how are you");
	driver.findElement(By.id("downloadButton")).click();
	

	 
	 
//	driver.manage().window().minimize();
//    driver.quit();
	}
}
