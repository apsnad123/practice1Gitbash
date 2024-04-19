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

public class DropdownMultiSelect {
	WebDriver driver;
//Write a script to enter data into Text field?
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

	 WebElement countryCodeDropdown = driver.findElement(By.id("phoneInput"));
	 Select select1= new Select(countryCodeDropdown);
	 select1.selectByVisibleText("+91");
	 driver.findElement(By.id("keypoint")).sendKeys("6388860243");
	 
	 
	 WebElement genderDropdown = driver.findElement(By.id("select40"));
	 Select select2= new Select(genderDropdown);
	 select2.selectByVisibleText("Female");
	 
	 WebElement countryDropdown = driver.findElement(By.xpath("//label[.='Country']/../div/select"));
	 Select select3= new Select(countryDropdown);
	 select3.selectByValue("India");
	 
	 WebElement stateDropdown = driver.findElement(By.xpath("//label[.='State']/../div/select"));
	 Select select4= new Select(stateDropdown);
	 select4.selectByValue("Bihar");
	 
	 WebElement cityDropdown = driver.findElement(By.xpath("//label[.='City']/../div/select"));
	 Select select5= new Select(cityDropdown);
	 select5.selectByValue("Patna");
	 
	 WebElement quantityDropdown = driver.findElement(By.xpath("//section[@class='flex']/following-sibling::section/select"));
	 Select select6= new Select(quantityDropdown);
	 select6.selectByValue("3");
	 driver.findElement(By.xpath("//button[.='Continue']")).submit();
		
		

		
		Thread.sleep(3000);
		
	}

}

