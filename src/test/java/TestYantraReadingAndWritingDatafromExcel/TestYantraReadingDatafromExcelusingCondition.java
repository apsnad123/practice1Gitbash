package TestYantraReadingAndWritingDatafromExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestYantraReadingDatafromExcelusingCondition {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources01\\ReadDataFromExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("data01");
		int rowCount = sh.getLastRowNum();
		int cellCount = sh.getRow(0).getLastCellNum();
		for(int i=0;i<=rowCount;i++) {
			String value = sh.getRow(i).getCell(0).toString();
			if(value.equalsIgnoreCase("ayush")) {
			for(int j=0;j<cellCount;j++) {
				String value2 = sh.getRow(i).getCell(j).toString();
				System.out.print(value2+" ");
			}
			System.out.println(" ");
			}
		}

	}

}
