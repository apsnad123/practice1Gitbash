package TestYantra_Assignment;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment {
	public WebDriver driver;
	
	@BeforeMethod
	public void lauchingBrowser()
	{
		 
	      driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void Question1() {
		//1.  If you have 10 windows, how to close 7th window?
		
		for ( int i = 1; i <= 10; i++) {
			driver.switchTo().newWindow(WindowType.WINDOW);
			if(i==7) {
				driver.get("https://www.facebook.com/");
			}
		}
//		Set<String> allWindow = driver.getWindowHandles();
//		Iterator<String> iterator = allWindow.iterator();
//		while (iterator.hasNext()) {
//			String wind = iterator.next();
//			String title = driver.switchTo().window(wind).getTitle();
//			if(title.equalsIgnoreCase("Facebook – log in or sign up"))
//				break;
//		}
//		driver.close();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String wind : allWindow) {
			String title = driver.switchTo().window(wind).getTitle();
			if(title.equalsIgnoreCase("Facebook – log in or sign up")) 				
				break;
		}
		driver.close();

	}
	
    @Test
	public void Question2() throws InterruptedException {
      // 2. 'https://www.aveda.de'  xpath in makeup, select all the products listed
    driver.get("https://www.aveda.com/");
      Actions action = new Actions(driver);
      WebElement iframe = driver.findElement(By.xpath("//iframe[@class='ab-in-app-message  ab-html-message ab-modal-interactions']"));
      driver.switchTo().frame(iframe);
      WebElement close = driver.findElement(By.xpath("//button[@aria-label='Close Message']/descendant::*[name()='path']"));
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      wait.until(ExpectedConditions.visibilityOf(close));
      action.click(close).perform();
      driver.switchTo().parentFrame();
      
      WebElement skinAndBody = driver.findElement(By.xpath("//div[@id='node-96']/descendant::a[.='SKIN & BODY' and @aria-label='SKIN & BODY']']"));
      action.moveToElement(skinAndBody).perform();
      
//      WebElement makeUp = driver.findElement(By.xpath("//a[ .='FACE & BODY']/parent::li[contains(@class,'menu__item menu__item--lvl-1 menu__item--category js-menu-item-category no-active')]/descendant::a[.='make up']"));
//      action.moveToElement(makeUp).perform();
//      List<WebElement> allProducts = driver.findElements(By.xpath("//div[contains(@class,'js-product ')]"));	
//      List<WebElement> addToCarts = driver.findElements(By.xpath("//div[contains(@class,'js-product ')]/descendant::a[@aria-label='Add to Cart']"));	
//		System.out.println(allProducts.size());
//		int count=0;
//		for (WebElement addToCart : addToCarts) {
//			count++;
//			addToCart.click();
//		}
//		System.out.println(count);
//    	
	}
    
    @Test
    public void question3() {
//    	3. 'https://www.maccosmetics.com'  Write xpath for 'shop Now' button
     driver.get("https://www.maccosmetics.com");
     driver.findElement(By.xpath("//span[.='SHOP NOW']")).click();
	}
    

    @Test
    public void question4(String url) {
    	//4. Develop a new FrameWork(Scenario): Launch the browser open two tabs, 1st tab i need open the google and 2nd tab i need open facebook
    	
    	//WebdriverUtility
    	for (int i = 0; i < 3; i++) {
    		driver.switchTo().newWindow(WindowType.TAB);
        	driver.get(url);	
		}
    	
    	//Script
//    	Assignment ass = new Assignment();
//    	ass.question4("https://www.google.com/");
//    	ass.question4("https://www.facebook.com/");
    	
	}
    
    @Test
    public void question5() {
	//5. Asked me to find the Xpath of lastName text field?---> https://www.hyrtutorials.com/p/add-padding-to-containers.html
    	driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
    	driver.findElement(By.xpath(" //label[.='Last Name']/following-sibling::input[@name='name']")).sendKeys("NANDAN");
	}
    
    @Test
    public void question6() throws InterruptedException {
		//6.  Open the youtube type song in search text field, it shows multiple suggestions how to perform click action on "song new"? What is your approach?
    	driver.get("https://www.youtube.com/");
    	Thread.sleep(4000);
    	WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
    	Thread.sleep(4000);
    	Actions action = new Actions(driver);
    	action.sendKeys(search, "song").perform();
    	List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='sbsb_b']/li"));
    	for (WebElement option : alloptions) {
			String text = option.getText();
			System.out.println(text);
			if(text.contains("new")) {
				option.click();
				break;
			}
		}
	}
    @Test
    public void question7() {
//		7. Flipkart finding xpath For samsung in tv n appliances after mouseover
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("samsung",Keys.ENTER);
	driver.findElement(By.xpath("//a[.='Home Entertainment']/parent::div/descendant::*[name()='svg']")).click();
	driver.findElement(By.xpath("//a[.='TVs']")).click();
	driver.findElement(By.xpath("//div[.='SAMSUNG 108 cm (43 inch) Full HD LED Smart Tizen TV 2023 Edition']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).click();
	
	}

    
    @Test
    public void question8() throws EncryptedDocumentException, IOException {
//		8.  Read the price of iPhone 13 and store it in Excel sheet amazon.com
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 13",Keys.ENTER);
	WebElement price = driver.findElement(By.xpath("//span[.='Apple iPhone 13 (128GB) - Blue']/ancestor::div[contains(@class,'a-section a-spacing-none')]/descendant::span[ .='Sponsored']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole']"));
	Actions action = new Actions(driver);
	action.scrollToElement(price).perform();
	String text = price.getText();
	System.out.println(text);
	FileInputStream fis = new FileInputStream("./src/test/resources01/ReadDataFromExcel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("data02");
	sh.createRow(0).createCell(0).setCellValue(text);
	FileOutputStream fOut= new FileOutputStream("./src/test/resources01/ReadDataFromExcel.xlsx");
	wb.write(fOut);
	wb.close();
	}
    
    @Test
    public void question9() {
//   	9. Can you write the script for the two scenarios and validation.
//	     Scenario 1: Valid username and password then validate it.
//	     Scenario 2: Invalid username and password then validate it.
   String expectedusername="aparnanandanshiat@gmail.com" ;
   String expectedpassword="123mock";
 driver.get("https://www.facebook.com/");
 WebElement actualusername = driver.findElement(By.id("email"));
 actualusername.sendKeys("aparnanandanshiat@gmail.com");
 WebElement actualpassword = driver.findElement(By.id("email"));
 actualpassword.sendKeys("aparnanandan");
 if(actualusername.equals(expectedusername) && actualpassword.equals(expectedpassword)) {
	 driver.findElement(By.name("login")).submit();
	 System.out.println("valid username and password");
 }else {
	 System.out.println("Invalid username and password");
 }		
	}
    
    
    @Test
    public void question10() {
 //   	10. Launch the browser navigate to https://www.myntra.com/ application
//    		Pick list from Home-living under  Home-Decor sent into List the print one by one in console
//    		Write single method having string apramter, which click on select selection.
//    		Navigate to Mens-jackets  get the count how many images/records displaying in the page
//    		Select the "recommended" from dropdown value is " Custom rating"
//    		Then search-box for Mango-Man form the search list then assert "Mango-man shirts displaying
//    		Select 2 row - 2 column item
//    		Then select any size then click on "Add to Bag" button
//    		Once you add bag you should need to verify the number # 1 item is displaying or not.
	driver.get("https://www.myntra.com/");
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[.='Home & Living']"))).perform();

	List<WebElement> allList = driver.findElements(By.xpath("//li[@class='desktop-oddColumnContent' and @data-reactid='89']/ul/li/a"));
    for (WebElement list : allList) {
		String text = list.getText();
		System.out.println(text);
	}
	
	action.moveToElement(driver.findElement(By.xpath("//a[.='Men']"))).perform();
	driver.findElement(By.xpath("//a[.='Jackets']")).click();
	driver.switchTo().alert().dismiss();
	List<WebElement> allRecords = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/ancestor::li[@class='product-base']"));
	System.out.println(allRecords.size());
     WebElement recomendedDropDown = driver.findElement(By.xpath("//span[@class='myntraweb-sprite sort-downArrow sprites-downArrow']"));
     Select selectRecomendedDropDown = new Select(recomendedDropDown);
     selectRecomendedDropDown.selectByValue("Customer Rating");
     driver.findElement(By.xpath("//input[@placeholder='Search for Brand']/following-sibling::span[contains(@class,'myntraweb')]")).sendKeys(Keys.ENTER,"Mango-Man");
     driver.findElement(By.xpath("//input[@placeholder='Search for Brand']/following-sibling::span[contains(@class,'myntraweb')]")).click();
    	
	}
    
    
    
    
	
    
    
    
    
    
    
    
    




//    		
}
