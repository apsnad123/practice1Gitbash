package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis= new FileInputStream("./src/test/resources01/ReadDataFromExcel.xlsx");
		Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet= workbook.getSheet("data01");
        WebDriver driver= new ChromeDriver();        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.get(sheet.getRow(1).getCell(4).getStringCellValue()); 
       // WebElement usernameTextField= driver.findElement(By.id("email"));
//        usernameTextField.sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());
        driver.findElement(By.id("email")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());

        //WebElement passwordTextField= driver.findElement(By.id("pass"));
        long ab = (long)sheet.getRow(1).getCell(1).getNumericCellValue();
        String str=String.valueOf(ab);
        String str2=Long.toString(ab);
        String str1=ab+"";
        driver.findElement(By.id("pass")).sendKeys(str1);


        driver.manage().window().minimize();
  
	}

}
