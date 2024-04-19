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

public class FileDownloadInAFolder {


	
	@Test
	public void downloadfile() throws AWTException{
		ChromeOptions option= new ChromeOptions();
		HashedMap<String, Object> chromePrefs = new HashedMap<String, Object>();
		chromePrefs.put("download.default_directory", "C:\\Users\\aparn\\OneDrive\\Desktop\\testers");
		option.setExperimentalOption("prefs", chromePrefs);
	WebDriver driver= new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
	driver.findElement(By.id("writeArea")).sendKeys("hi there how are you");
	driver.findElement(By.id("downloadButton")).click();
	

 
	 
//	driver.manage().window().minimize();
//    driver.quit();
	}
}
