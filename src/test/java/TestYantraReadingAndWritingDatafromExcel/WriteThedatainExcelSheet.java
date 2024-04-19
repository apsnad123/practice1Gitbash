package TestYantraReadingAndWritingDatafromExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteThedatainExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(".\\\\src\\\\test\\\\resources01\\\\ReadDataFromExcel.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.createSheet("data02");
	    sh.createRow(5).createCell(0).setCellValue("rajeev");
		FileOutputStream fos = new FileOutputStream(".\\\\src\\\\test\\\\resources01\\\\ReadDataFromExcel.xlsx");
      wb.write(fos);
      wb.close();
	}

}
