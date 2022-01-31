package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelread {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/testdata2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sht = book.getSheet("Sheet1");
		for(int i=0;i<sht.getLastRowNum();i++)
		{
			Row r = sht.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++)
			{
				System.out.println(r.getCell(j).getStringCellValue());
			}
			System.out.println();
		}

	}

}
