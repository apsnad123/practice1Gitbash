

package TestYantraCalendarPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcCalenderPopUp {

	public static void main(String[] args) {
 
	String month="July";
		int date=25;
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//p-calendar/span")).click();
		//driver.findElement(By.xpath("//a[.='"+date+"']")).click();
		for(;;) {
		try {
			driver.findElement(By.xpath("//span[.='"+month+"']"));
			driver.findElement(By.xpath("//a[.='"+date+"']")).click();
			break;

		} catch (Exception e) {
			driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-next')]")).click();

		}

		}
			driver.manage().window().maximize();
            driver.quit();


	}
	}

	

