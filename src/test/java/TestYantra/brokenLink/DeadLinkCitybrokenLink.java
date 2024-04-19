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

public class DeadLinkCitybrokenLink {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.deadlinkcity.com/");
		 List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		 for (WebElement link : allLink) {
			String linkHref = link.getAttribute("href");
			try {
				URL url = new URL(linkHref);
				HttpURLConnection http=(HttpURLConnection)url.openConnection();
				int responseCode = http.getResponseCode();
				String responseMsg = http.getResponseMessage();
				if(responseCode>=400) {
					System.out.println(responseCode+"--> "+linkHref+" : "+responseMsg);
				}	
			} catch (Exception e) {

			}
			
		}
	}

}
