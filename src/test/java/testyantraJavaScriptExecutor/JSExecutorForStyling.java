package testyantraJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.graphbuilder.curve.Point;

public class JSExecutorForStyling {

	@Test
	public void highlight() {
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         JavascriptExecutor js = (JavascriptExecutor)driver;
         
         //Launching the Browser
   js.executeScript("window.location=arguments[0]", "https://www.amazon.in");
		  
         //Generating alert
 // js.executeScript("alert('hello hi')");
         
         //Entering Data
  //WebElement element = driver.findElement(By.id("name"));
  //js.executeScript("arguments[0].value='aparnanandan'",element);
  
       //Retrieving Data  ...not working...
//WebElement element2 = driver.findElement(By.xpath("//h1[.='Register']"));
//String text = (String)js.executeScript("return arguments[0].value;", element2);
//System.out.println(text);
		
  //clicking
//WebElement element3 = driver.findElement(By.id("browserLink1"));
//js.executeScript("arguments[0].click()",element3);

     //Highlighting
//WebElement element4 = driver.findElement(By.id("name"));
//js.executeScript("arguments[0].setAttribute('style','border:2px solid red'",element4);


  //Scrolling using scrollTo
//js.executeScript("window.scrollTo(0,4000)");
//   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//   js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

   
WebElement element5 = driver.findElement(By.xpath("//span[.='English']"));
 //js.executeScript("argument[0],argument[1]", element5.getLocation().x,element5.getLocation().y);
// org.openqa.selenium.Point loc = element5.getLocation();
//   int x = loc.getX();
//   int y = loc.getY();
//   js.executeScript("window.scrollTo("+x+","+y+")");
js.executeScript("arguments[0].scrollIntoView", element5);
	} 

}
