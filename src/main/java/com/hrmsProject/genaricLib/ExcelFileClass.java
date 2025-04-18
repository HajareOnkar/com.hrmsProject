package com.hrmsProject.genaricLib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileClass {
	
	public  Cell getExceldata(String sheet,int r,int c) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Autoconstant.ExceldataFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheet).getRow(r).getCell(c);
	}

}
