package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Rannum {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sht = book.getSheet("Sheet1");
		
		for(int i=0;i<sht.getLastRowNum();i++){
			Row r = sht.getRow(i);
			String value = r.getCell(0).getStringCellValue();
			System.out.println(value);
			}
			System.out.println();
		}

	}


