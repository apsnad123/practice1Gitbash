package testYantraPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MicTestPopForhandlingMicroPop {


	
	@Test
	public void downloadfile() throws AWTException, InterruptedException{
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--use-fake-ui-for-media-stream");
	WebDriver driver= new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://mictests.com/");
    driver.findElement(By.id("mic-launcher")).click();

    
	 
//	driver.manage().window().minimize();
//    driver.quit();
	}
}
