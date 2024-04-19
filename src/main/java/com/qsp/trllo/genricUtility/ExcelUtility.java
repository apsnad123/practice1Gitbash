package com.qsp.trllo.genricUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String readTheString(String sheetname, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("");
		Workbook workbook= WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row= sheet.getRow(rowIndex);
		Cell cell= row.getCell(cellIndex);
		String value= cell .getStringCellValue();
		return value;	
	}
	
	public double readTheDoubleNumericData(String sheetname, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("");
		Workbook workbook= WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row= sheet.getRow(rowIndex);
		Cell cell= row.getCell(cellIndex);
		double value= cell .getNumericCellValue();
		return value;	
	}
	
	public long readTheLongNumericData(String sheetname, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("");
		Workbook workbook= WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row= sheet.getRow(rowIndex);
		Cell cell= row.getCell(cellIndex);
		long value= (long)cell .getNumericCellValue();
		return value;	
	}
}
