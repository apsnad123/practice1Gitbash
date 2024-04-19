
package TestYantra_ShadowRoot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorsHubShadowRoot {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		WebElement shadowHost1 = driver.findElement(By.cssSelector("#userName"));
		SearchContext ShadowRoot1 = shadowHost1.getShadowRoot();
		ShadowRoot1.findElement(By.cssSelector("#kils")).sendKeys("Aparna");
		
		WebElement shadowHost2 = ShadowRoot1.findElement(By.cssSelector("#app2"));
		SearchContext ShadowRoot2 = shadowHost2.getShadowRoot();
		ShadowRoot2.findElement(By.cssSelector("#pizza")).sendKeys("Magreta");

		
		

}
}