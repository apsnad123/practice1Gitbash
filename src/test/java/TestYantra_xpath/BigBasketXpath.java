package TestYantra_xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bigbasket.com/");
		int totalQuantityno=3;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='Header___StyledQuickSearch2-sc-19kl9m3-0 gzbZOD']//input[@placeholder='Search for Products...']")).sendKeys("apple",Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement add = driver.findElement(By.xpath("//h3[.='Apple - Royal Gala Economy']/ancestor::div[@class='SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP']/descendant::div[@class='relative flex flex-col w-full lg:h-8 xl:h-9 overflow-hidden']/button[.='Add']"));
		Actions action = new Actions(driver);
		action.moveToElement(add).click().build().perform();
		
		for(;;) {
			try {
				WebElement presentQuantity = driver.findElement(By.xpath("//div[@class='SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP' and contains(.,'Apple - Royal Gala Economy')]//span[.='"+totalQuantityno+"']"));
				if (presentQuantity.equals(totalQuantityno)) {
					break;
				}
			} catch (Exception e) {
				driver.findElement(By.xpath("//h3[.='Apple - Royal Gala Economy']/ancestor::div[@class='SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP']/descendant::*[name()='svg' and @class='CtaOnDeck___StyledPlusIcon-sc-orwifk-12 kyqQMg'] ")).click();	
				}
		}
		driver.quit();

	}

}

