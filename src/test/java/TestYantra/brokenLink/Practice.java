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

public class Practice {

	public static void main(String[] args) throws IOException  {

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.ksrtc.in/oprs-web/");
		
		
		try {
			List<WebElement> allLink = driver.findElements(By.xpath("//a"));
			for (WebElement eachLink : allLink) {
				String link = eachLink.getAttribute("href");
				URL url= null;
				int statusCode=0;
				  url = new URL(link);
				 HttpURLConnection http = (HttpURLConnection)url.openConnection();
				
				 statusCode = http.getResponseCode();
				if(statusCode>=400) {
					System.out.println(statusCode+"--->"+link+" : "+http.getResponseMessage());
				}
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
