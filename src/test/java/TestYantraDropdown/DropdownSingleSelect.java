package TestYantraDropdown;

import java.time.Duration;
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


/*            SCENARIO
 * 1. How to select the value from the single select dropdown ?
 * 2. How to select the values from the Multi select dropdown ?
 * 3  Select all the valid options from all drop down and click on continue button.[not done]
 * 4. How to select the values from the country drop-down by using the visibletext method.
 * 5. How to select the values from the state drop-down by using the selectByvalue method.
 * 6. How to select the values from the city drop-down by using the selectByIndex method.

 */
public class DropdownSingleSelect {
	WebDriver driver;
//Write a script to enter data into Text field?
	@BeforeMethod
	public void precondition(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	}
	
	@AfterMethod
	public void postcondition(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
	@Test
	public void dropdown() throws InterruptedException {

	 WebElement countryCodeDropdown = driver.findElement(By.id("select1"));
	 Select select1= new Select(countryCodeDropdown);
	 select1.selectByValue("+91");
	 driver.findElement(By.id("phone")).sendKeys("6388860243");
	 
	 WebElement genderDropdown = driver.findElement(By.id("select2"));
	 Select select2= new Select(genderDropdown);
	 select2.selectByValue("female");
	 
	 WebElement countryDropdown = driver.findElement(By.id("select3"));
	 Select select3= new Select(countryDropdown);
	 select3.selectByVisibleText("India");
	 
	 WebElement stateDropdown = driver.findElement(By.id("select5"));
	 Select select4= new Select(stateDropdown);
	 select4.selectByValue("Bihar");
	 
	 WebElement cityDropdown = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
	 Select select5= new Select(cityDropdown);
	 select5.selectByIndex(5);
	 
	 WebElement quantityDropdown = driver.findElement(By.id("select7"));
	 Select select6= new Select(quantityDropdown);
	 select6.selectByValue("3");
	 driver.findElement(By.id("continuebtn")).submit();
		
		

		
		Thread.sleep(3000);
		
	}

}

