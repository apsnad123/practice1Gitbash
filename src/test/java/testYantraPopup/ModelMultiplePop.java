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

public class ModelMultiplePop {


	
	@Test
	public void downloadfile() throws AWTException, InterruptedException{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
    driver.findElement(By.id("multiModalButton")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("multiClosemodal")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//p[.='This is the secondary modal']/../following-sibling::section/button")).click();
    Thread.sleep(3000);


    
	 
//	driver.manage().window().minimize();
//    driver.quit();
	}
}
