package testyantraInterviewPOintQuestion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OpenaskManger {

	@Test
	public void taskmanger() throws AWTException, IOException {
		//opening TaskManger
		//Robot rob= new Robot();
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_SHIFT);
//		rob.keyPress(KeyEvent.VK_ESCAPE);
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//		rob.keyRelease(KeyEvent.VK_SHIFT);
//		rob.keyRelease(KeyEvent.VK_ESCAPE);
		
		//closing chrome without opening it
		Runtime r= Runtime.getRuntime();
		Process proc=r.exec("taskkill /im chrome.exe /f /t");
		
		//if execute testscript browser should not open but execution should happen
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--headless");
//		ChromeDriver driver = new ChromeDriver(opt);
//		driver.get("https://www.facebook.com/");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
		
		//lauching the browser in Incognito mode
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--incognito");
//		ChromeDriver driver = new ChromeDriver(opt);
//		driver.get("https://www.facebook.com/");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
		
		//launching in different language
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--lang=ja");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
}
