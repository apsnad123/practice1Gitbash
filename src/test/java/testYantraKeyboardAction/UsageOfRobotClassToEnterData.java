package testYantraKeyboardAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsageOfRobotClassToEnterData {

	@Test
	public void key() throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		
		driver.findElement(By.id("email")).click();
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CAPS_LOCK);
		rob.keyRelease(KeyEvent.VK_CAPS_LOCK);
		String text="aparnanandanshait@gmail.com";
		for(char c:text.toCharArray()) {
			int finaltext=KeyEvent.getExtendedKeyCodeForChar(c);
			rob.keyPress(finaltext);
			rob.keyRelease(finaltext);

		}
		
		


		
	}
}
