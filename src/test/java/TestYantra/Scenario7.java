package TestYantra;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario7 {
	WebDriver driver;
//Write a script to handle authentication popup?

	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void autheticationwindow() throws InterruptedException {
		driver.findElement(By.id("//a[text()='Login']")).click();
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://demoapps.qspiders.com/ui/browser/SignUpPage");
   String username = "admin";
   String password = "admin";
   String url = "https://"+username+":"+password+"@"+"basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
    driver.get(url);

	    }
	}
	



