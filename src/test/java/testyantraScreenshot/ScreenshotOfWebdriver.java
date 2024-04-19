package testyantraScreenshot;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ScreenshotOfWebdriver {

	@Test
	public void taskmanger() throws AWTException, IOException {
		

		//launching in different language
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--lang=ja");
		ChromeDriver driver = new ChromeDriver(opt);
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./bugshots/" + timeStamp+ "webpage.png");
		FileUtils.copyFile(tempFile, permFile);

		
		
	}
}
