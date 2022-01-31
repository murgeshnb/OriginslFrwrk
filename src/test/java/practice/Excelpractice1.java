package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelpractice1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sht = book.getSheet("Sheet1");
		
		int count = sht.getLastRowNum();
		
		for(int i=1;i<count;i++){
			Row row = sht.getRow(i);
			String fiscol = row.getCell(0).getStringCellValue();
			String seccol = row.getCell(1).getStringCellValue();
			System.out.println(fiscol+"\t"+seccol);
		}

	}

}
