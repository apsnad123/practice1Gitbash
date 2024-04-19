package TestYantraDropdown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdowngetoptions {
	WebDriver driver;
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void dropdown() throws InterruptedException {

	 
	 WebElement countryDropdown = driver.findElement(By.xpath("//label[.='Country']/../div/select"));
	 Select select3= new Select(countryDropdown);
	 List<WebElement> options = select3.getOptions();
	 System.out.println("the following options size are: "+ options.size());
	 for (WebElement element : options) {
		String nameOfCountry = element.getText();
		System.out.println("name of all the country is "+ nameOfCountry);
//		if(nameOfCountry.equalsIgnoreCase("India")) {
//			System.out.println("passed testcase");
//			break;
//		}else {
//			System.out.println("failed testcase");
//	}
		//its wrong
	}
	 
	}

}


