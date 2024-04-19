package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingJsPopups {
	
	WebDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
//	@AfterMethod
//	public void postCondition() {
//		driver.manage().window().minimize();
//		driver.quit();
//	}
	
	@Test
	public void interupted() throws InterruptedException {
	driver.get("file:///C:/Users/aparn/OneDrive/Desktop/New%20folder%20(2)/popup/Alert%20popup.html");	
	driver.findElement(By.xpath("//button[text()='Display Messages']")).click();
	//	driver.findElement(By.xpath("//button[text()='Try it']")).click();

	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	


	}
	
	@Test
	public void confirmation() throws InterruptedException {
		driver.get("file:///C:/Users/aparn/OneDrive/Desktop/New%20folder%20(2)/popup/confirm%20popup.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save Data']")).click();
     	Thread.sleep(2000);
		String confirmationMsg= driver.switchTo().alert().getText();
		System.out.println("the Message is: "+ confirmationMsg);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}
	
	@Test
	public void promptMsg() throws InterruptedException {
		driver.get("file:///C:/Users/aparn/OneDrive/Desktop/New%20folder%20(2)/popup/prompt.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
     	Thread.sleep(2000);
		String confirmationMsges= driver.switchTo().alert().getText();
		System.out.println("the Message is: "+ confirmationMsges);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Aparna Nandan");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
	}
	
	@Test
	public void hiddenDivisionPopup() throws InterruptedException {
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		Thread.sleep(2000);

		//this we do when we have to neglect the hiddenDivisionPopup
//		Actions action= new Actions(driver);
//		action.click().perform();
		
			//this is when we are going to enter the credentials
		driver.findElement(By.xpath("//div/input[@type='text']")).sendKeys("Aparna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/input[@type='email']")).sendKeys("aparnanandanshiat@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).submit();
		Thread.sleep(2000);
	}
	
@Test
	public void notification() {
//	 ChromeOptions opts= new ChromeOptions();
//	 opts.addEncodedExtensions("--disable-notifications");
//	 driver= new ChromeDriver(opts);
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.justdial.com/");
			
	}

@Test
  public void fileUpload() throws InterruptedException {
	driver.get("https://demo.guru99.com/test/upload/");
	driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\aparn\\OneDrive\\Desktop\\javaScript.txt");
	Thread.sleep(3000);
	driver.findElement(By.id("terms")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("submitbutton")).click();
	Thread.sleep(3000);
}
	
@Test
   public void fileDownload() throws InterruptedException, AWTException {
	driver.get("https://www.selenium.dev/downloads/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(1000);
	driver.findElement(By.linkText("4.17.0")).click();
	driver.get("chrome://downloads/");
	WebElement shadowHost01=driver.findElement(By.tagName("downloads-manager"));
	SearchContext shadowRoot01= shadowHost01.getShadowRoot();
	WebElement shadowHost02= shadowRoot01.findElement(By.id("frb0"));
	SearchContext shadowRoot02= shadowHost02.getShadowRoot();
	WebElement keepButtonTargetElement=shadowRoot02.findElement(By.cssSelector("cr-button[focus-type='save']"));
	keepButtonTargetElement.click();
	Robot robot= new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}


}
