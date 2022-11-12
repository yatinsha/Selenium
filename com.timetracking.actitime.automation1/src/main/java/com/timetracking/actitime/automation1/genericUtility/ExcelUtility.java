package com.timetracking.actitime.automation1.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String fetchDataFromExcelSheet(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("/home/yatinsharma/Desktop/exceldata.xlsx");
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(row).getCell(cell).toString();
	}

}
