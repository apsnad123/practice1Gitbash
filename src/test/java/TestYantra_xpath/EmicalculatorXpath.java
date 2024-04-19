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

public class EmicalculatorXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://emicalculator.net/");
		WebElement chart = driver.findElement(By.id("emibarchart"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", chart);
	List<WebElement> allPoints = driver.findElements(By.xpath("//*[name()='svg' and @class='highcharts-root']/parent::div[@id='highcharts-zla8zwj-4']/descendant::*[name()='path' and @class='highcharts-point']"));
	System.out.println(allPoints.size());
	for (WebElement point : allPoints) {
		 point.click();
	}
		driver.manage().window().minimize();
		driver.quit();

	}

}

