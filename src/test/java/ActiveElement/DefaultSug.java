package ActiveElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultSug {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");		
		driver.switchTo().activeElement().click();
		List<WebElement> defaultsug=driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
		for(WebElement sug:defaultsug) {
			String sugtext=sug.getText();
			System.out.println(sugtext);
			if(sugtext.equals("happy valentines day wishes quotes")) {
				sug.click();
				break;
			}
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
