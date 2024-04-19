package TestYantra_xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProKabaddiXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.prokabaddi.com/");
		WebElement prokabaddi = driver.findElement(By.xpath("//h1[contains(.,'Pro Kabaddi League Points Table')]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", prokabaddi);
		String team_name="Patna Pirates";
		List<WebElement> prokabaddiinfo = driver.findElements(By.xpath("//p[.='"+team_name+"']/ancestor::div[@class='row-head']/child::div/p[@class!='position-indicator position-up']"));

		for (WebElement kabadi : prokabaddiinfo) {
			String text = kabadi.getText();
			System.out.println(text);
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}

