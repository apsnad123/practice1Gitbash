package testYantraPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadpopup {

//	@Test
//	public void defaultfile(){
//	WebDriver driver= new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
//	WebElement fileupload = driver.findElement(By.xpath("//input[@id='fileInput']"));
//	fileupload.sendKeys("C:\\Users\\aparn\\OneDrive\\Desktop\\commondata03.properties");
//	
//	driver.manage().window().minimize();
//    driver.quit();
//	}
	
//	@Test
//	public void customfile(){
//	WebDriver driver= new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
//	WebElement fileupload = driver.findElement(By.xpath("//div[.='Upload File']"));
//	fileupload.sendKeys("C:\\Users\\aparn\\OneDrive\\Desktop\\commondata03.properties");
//	
//	driver.manage().window().minimize();
//    driver.quit();
//	}
	
//	@Test
//	public void uploadingMultipleFile() throws AWTException{
//	WebDriver driver= new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
//	WebElement fileupload = driver.findElement(By.xpath("//input[@id='fileInput']"));
//	fileupload.sendKeys("C:\\Users\\aparn\\OneDrive\\Desktop\\commondata03.properties");
//	fileupload.sendKeys("C:\\Users\\aparn\\OneDrive\\Desktop\\Qcom testcase.txt");
//	
//	  List<WebElement> allfiletext = driver.findElements(By.xpath("//li[@class='flex']"));
//    for (WebElement filetext : allfiletext) {
//		System.out.println(filetext.getText());
//	}
    
	@Test
	public void customfile(){
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	WebElement fileupload = driver.findElement(By.id("fileInput"));
	fileupload.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources01\\mytextfile.txt");
//	driver.manage().window().minimize();
//    driver.quit();
	}
	 

}
