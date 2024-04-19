package learntestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ReadTheDataFromXmlFile {
	
	WebDriver driver;
	@Parameters({"browser","url","username","password"})
	
	@Test
	public void login(String browser,String url, String username, String password) throws InterruptedException {
		if(browser.equals("chrome")) {
			driver= new ChromeDriver();	
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	WebElement	usernameTextField=driver.findElement(By.id("username"));
	Thread.sleep(2000);
	usernameTextField.clear();
	Thread.sleep(2000);
	usernameTextField.sendKeys(username);
	Thread.sleep(2000);
	WebElement	passwordTextField=driver.findElement(By.id("password"));
	Thread.sleep(2000);
	passwordTextField.clear();
	Thread.sleep(2000);
	passwordTextField.sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
		driver.manage().window().minimize();
		driver.quit();
	}

	
	

}
