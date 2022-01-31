package com.crm.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	
	/**
	 * Read the data from excel sheet based on arguments passed
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getDatafromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet(sheet);
		Row ro = sht.getRow(row);
		Cell cl = ro.getCell(cell);
		String value = cl.getStringCellValue();
		wb.close();
		return value;
	}
	
	/**
	 * used to get last used rownumber from excel
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getRowCount(String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis2=new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		Sheet sht = wb.getSheet(sheet);
		wb.close();
		return sht.getLastRowNum();
	}
	
	public void setDataExcel(String sheet,int rowNum,int cellNum,String data) throws Throwable, Throwable
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet(sheet);
		Row ronum = sht.getRow(rowNum);
		Cell cl = ronum.createCell(cellNum);
		cl.setCellValue(data);
		
		FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\testdata.xlsx");
		wb.write(fout);
		wb.close();
	}
}
