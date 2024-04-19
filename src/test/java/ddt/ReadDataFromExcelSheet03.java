package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromExcelSheet03 {
 public static WebDriver driver;
	public static void main(String[] args) throws IOException {
 
		FileInputStream fis1= new FileInputStream("./src/test/resources01/commondata04.properties");
		Properties proj= new Properties();
		proj.load(fis1);
		FileInputStream fis2= new FileInputStream("./src/test/resources01/ReadDataFromExcel.xlsx");
		Workbook workbook= WorkbookFactory.create(fis2);
		Sheet sheet=workbook.getSheet("data01");
		String browsername=proj.getProperty("browser");
		if(browsername.equals("chrome")) {
			driver= new ChromeDriver();
		}else if(browsername.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(proj.getProperty("url"));
		//driver.get(sheet.getRow(1).getCell(4).getStringCellValue())
		driver.findElement(By.id("email")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());
		driver.findElement(By.id("pass")).sendKeys(sheet.getRow(1).getCell(3).getStringCellValue());
        driver.findElement(By.xpath("//button[text()='Log in']")).submit();
		driver.manage().window().minimize();
		driver.quit();

	}

}
