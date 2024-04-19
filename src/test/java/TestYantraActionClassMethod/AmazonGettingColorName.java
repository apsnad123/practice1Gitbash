package TestYantraActionClassMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class AmazonGettingColorName {
	@Test
	public void color() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);
		driver.findElement(By.xpath("//u[.='+4 colours/patterns']")).click();
		
		 List<WebElement> allColor1 = driver.findElements(By.xpath("//img[@class='imgSwatch']"));
		for (WebElement onecolor : allColor1) {
			String colorname = onecolor.getAttribute("alt");
			System.out.println(colorname);
		}
		 
		
	}

}
