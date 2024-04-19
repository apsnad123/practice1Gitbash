package testyantraScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class FirefoxScreenshot {
    public static void main(String[] args) throws IOException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		File src=(FirefoxDriver)driver).getfullPageScreeshotAs(OutputType.FILE);
//		Files.copy(src, new File("./screeshot/"+"pic+".png"));
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./bugShot/"+"screen.png");
		FileUtils.copyFile(tempFile, permFile);
	}
}
