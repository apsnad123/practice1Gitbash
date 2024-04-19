package testYantraKeyboardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsageOfEnumInSendKeys {

	@Test
	public void key() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		
//		WebElement emailTextField = driver.findElement(By.id("email"));
//		emailTextField.sendKeys(Keys.chord("Aparnanandanshait@gmail.com"));
//		
//		WebElement passwordTextField = driver.findElement(By.id("password"));
//		passwordTextField.sendKeys(Keys.chord("MsadaOCKNG123!",Keys.CONTROL+"ac"));
//	
//	
//		WebElement confirmpasswordTextField = driver.findElement(By.id("confirmPassword"));
//       confirmpasswordTextField.sendKeys(Keys.CONTROL+"v",Keys.ENTER);

		
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys(Keys.chord("Aparnanandanshait123@gmail.com"+Keys.CONTROL+"ac"));
		
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.sendKeys(Keys.CONTROL+"v");

	
		WebElement confirmpasswordTextField = driver.findElement(By.id("confirmPassword"));
       confirmpasswordTextField.sendKeys(Keys.CONTROL+"v",Keys.ENTER);

		
	}
}
