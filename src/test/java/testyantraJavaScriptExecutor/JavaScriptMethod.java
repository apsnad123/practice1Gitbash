package testyantraJavaScriptExecutor;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptMethod {
 @Test
	public void lauchingBrowser() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Launching the url
		js.executeScript("window.location=arguments[0]", "https://www.amazon.in");
		
		//Scroll till bottom of the page
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//Scroll top of the page
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		//Scroll Till Element
		//WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
        //js.executeScript("arguments[0].scrollIntoView()", ele);
		
		//sendKeys
		//WebElement ele2 = driver.findElement(By.id("twotabsearchtextbox"));
        //js.executeScript("arguments[0].value=arguments[1]", ele2,"iphone");
    
		
     	//WebElement ele3 = driver.findElement(By.linkText("Sell"));
        //js.executeScript("arguments[0].click()", ele3);
		
		//get the Text
		WebElement ele4 = driver.findElement(By.linkText("Amazon miniTV"));
         String text=(String)js.executeScript("return arguments[0].value;", ele4);
      System.out.println(text);
		
		
	}
	
}
