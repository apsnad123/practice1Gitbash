package ActiveElement;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterTheDatatoActiveElement {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
//		driver.switchTo().activeElement().sendKeys("aparnanandanshiat@gmail.com");
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys("@gmail.com");
//		driver.switchTo().activeElement().submit();
		
		Actions action= new Actions(driver);
		action.sendKeys(driver.switchTo().activeElement())
		.sendKeys("aparnanandanshiat@gmail.com").sendKeys(Keys.TAB).sendKeys("guyttffgb").sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
		
//		driver.manage().window().minimize();
//		driver.quit();

	}

}
