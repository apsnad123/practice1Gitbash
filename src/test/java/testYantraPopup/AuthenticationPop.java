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

public class AuthenticationPop {


	
	@Test
	public void downloadfile() throws AWTException{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

//	String username="admin";
//	 String password="admin";
//	 String url= "https://"+username+":"+password+"@"+"basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app";
//	 driver.get(url);
	 driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app");

//	driver.manage().window().minimize();
//    driver.quit();
	}
}
