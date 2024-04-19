package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis= new FileInputStream("./src/test/resources01/ReadDataFromExcel.xlsx");
		Workbook workbook= WorkbookFactory.create(fis);
		Sheet sheet= workbook.getSheet("data01");
		
//		Row row= sheet.getRow(1);
//		Cell cell= row.getCell(3);
//		String cellvalue1= cell.getStringCellValue();
		String cellvalue1=sheet.getRow(1).getCell(3).getStringCellValue();
		System.out.println("cellvalue for email:"+ cellvalue1);
//		Row row2= sheet.getRow(1);
//		Cell cell2= row2.getCell(1);
//		Long cellvalue2= (long)cell2.getNumericCellValue();
		Long cellvalue2= (long)sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println("cellvalue for phoneno:"+ cellvalue2);
		
		

		
	}

}
