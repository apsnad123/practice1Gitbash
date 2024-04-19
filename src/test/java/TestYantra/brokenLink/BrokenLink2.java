package TestYantra.brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink2 {

	public static void main(String[] args) throws IOException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ksrtc.in/oprs-web/");
		 List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		 System.out.println(allLink.size());
		 for (WebElement eachLink : allLink) {
			String link = eachLink.getAttribute("href");
			try {
			URL url = new URL(link);
			HttpURLConnection http=(HttpURLConnection)url.openConnection();
			int response = http.getResponseCode();
			if(response>=400 && response!=0) {
				System.out.println(response+" ---> "+link);
			}
			}catch(Exception e) {
				
			}
		}
	}

}
