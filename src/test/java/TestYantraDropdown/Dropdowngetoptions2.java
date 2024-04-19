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

public class Dropdowngetoptions2 {
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
	Select selectcountry= new Select(countryDropdown);
	List<WebElement> allCountry = selectcountry.getOptions();
	System.out.println("The total number of the country are= "+allCountry.size());
	for (WebElement oneCountry : allCountry) {
		String nameOFtheCountries = oneCountry.getText();
		System.out.println( nameOFtheCountries);
		selectcountry.selectByVisibleText(nameOFtheCountries);
		Thread.sleep(3000);
		if(oneCountry.isSelected()) {
			System.out.println("pass");
			}else {
				System.out.println("pass");
		    }
	}
	
	 
	}

}


