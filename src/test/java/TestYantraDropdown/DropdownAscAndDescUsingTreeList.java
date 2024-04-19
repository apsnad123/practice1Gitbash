package TestYantraDropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownAscAndDescUsingTreeList {
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
	TreeSet<String> set = new TreeSet<String>();
	List<WebElement> allcountry = selectcountry.getOptions();
	System.out.println(allcountry.size());
	for (WebElement singlecountry : allcountry) {
		set.add(singlecountry.getText());	
	}
	System.out.println(set);
	 System.out.println(set.descendingSet());
	 for (String finalCountry : set) {
		System.out.println(finalCountry);
	}
	}

}


