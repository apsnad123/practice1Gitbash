package TestYantra.brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokeninkTest {

	public static void main(String[] args) {
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  
  
  driver.get("https://www.ksrtc.in/oprs-web/");
  
  	
  List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
  System.out.println(allLinks.size());
  for (WebElement eachLink : allLinks) {
	String link = eachLink.getAttribute("href");
	URL url= null;
	int statusCode=0;
	try {
	  url = new URL(link);
	HttpURLConnection httpconnection=(HttpURLConnection)url.openConnection();
	 statusCode = httpconnection.getResponseCode();
	if(statusCode>=400) {
		System.out.println(statusCode+"--->"+link);
	}}
	catch(Exception e) {
		
	}
}
  driver.manage().window().maximize();
   driver.quit();  
	}

	}

