package testYantraPopup;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;



public class SavingAFileToASpecificLocationAndValidatingIt {

	String location= System.getProperty("user.dir")+"\\src\\test\\resources01" ;
	String expectedName="mytextfile.txt";
	
	@Test
	public void DownloadFile() {
		ChromeOptions options= new ChromeOptions();
		Map<Object, String> prefs= new HashMap<Object, String>();
		prefs.put("download.default_directory", location);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		
		driver.findElement(By.id("writeArea")).sendKeys("hi how are you");

		driver.findElement(By.id("downloadButton")).click();
		
        verifyDownloadFile();
		
	}
	
	public boolean verifyDownloadFile() {
		
		File folder = new File(location);
		File[] fileList = folder.listFiles();
		boolean isFileExist= false;
		for (File file : fileList) {
			if (file.isFile()) {
				String fileName = file.getName();
				System.out.println(fileName);
			   if (fileName.matches(expectedName)) {
				isFileExist=true;
			}
			}
		}
		
		return isFileExist;
		
	}
	
}
