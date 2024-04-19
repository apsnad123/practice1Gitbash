package TestYantraConnectingTotheDatabase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GettingDataFromMaven {
	public static WebDriver driver;
	@Test
	public void sampleTest() {
	String BROWSER = System.getProperty("browser");	
	String URL = System.getProperty("url");	
	String USERNAME = System.getProperty("username");	
	String PASSWORD = System.getProperty("password");	
      
	if(BROWSER.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
	}else if(BROWSER.equalsIgnoreCase("firefox")) {
		driver= new FirefoxDriver();
	}else {
		System.out.println("invalid browser");;
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(URL);
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).submit();

	}
	

}
