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

public class BrokenLink3 {

	public static void main(String[] args) throws IOException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in");
		List<WebElement> allLink = driver.findElements(By.xpath("//a|//link"));
		System.out.println(allLink.size());
		for (WebElement eachLink : allLink) {
			String link = eachLink.getAttribute("href");
			URL url =null;
			int responseCode =0;
			try {
			url = new URL(link);
			HttpURLConnection http= (HttpURLConnection)url.openConnection();
			 responseCode = http.getResponseCode();
			if(responseCode>=400 && responseCode!=0) {
				System.out.println(responseCode+" -----> "+link);
			}}catch (Exception e) {
			}
		}
	}

}
