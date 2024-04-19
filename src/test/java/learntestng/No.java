package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class No {
	@Test(priority = 2)
	public void facebook() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("aparnanandanshiat@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("@notredame@1");
		driver.findElement(By.name("login")).submit();
	}
	
	
	@Test(priority = 3, invocationCount = 3, dependsOnMethods  = "facebook")
	public void linkdin() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/home");
		driver.findElement(By.id("session_key")).sendKeys("aparnanandanshiat@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("mockING123@");
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
		Reporter.log("-----done-----------");

	}
	
	@Test(priority = 4, dependsOnMethods  = "linkdin")
	public void instagram() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[.='Log in with Facebook']")).click();
	}

}
