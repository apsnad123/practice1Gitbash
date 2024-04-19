package TestYantra_xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccCricketXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		Thread.sleep(5000);
		List<WebElement> countryNames = driver.findElements(By.xpath("//h3[@class='si-team-name']/span[@class='si-fname si-text']"));
		System.out.println(countryNames.size());
		Thread.sleep(5000);
		boolean flag=false;
		for (WebElement country : countryNames) {
			String name = country.getText();
			Thread.sleep(5000);
			if(name.equalsIgnoreCase("SRI LANKA")) {
				flag=true;
				break;
			}
		}
		if(flag)
		{
		System.out.println("present");	
		}else {
		System.out.println("not-present");	
	
		}
	}

}
