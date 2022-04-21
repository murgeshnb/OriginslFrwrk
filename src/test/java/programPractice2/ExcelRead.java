package programPractice2;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelRead {
	@Test
	public void read() throws Throwable{
	//	try{
//		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
//		 Workbook book = WorkbookFactory.create(fis);
//		 Sheet sht = book.getSheet("Sheet1");
		 
//		Iterator<Row> rowit = sht.iterator();
//		while(rowit.hasNext()){
//				Row row = rowit.next();
//				Iterator<Cell> cellit = row.cellIterator();
//				
//				while(cellit.hasNext()){
//					Cell cell = cellit.next();
////					switch(cell.getCellType()){
////				
////						break;
////					}
//				}
//		}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//		 
//		// book.close();
		
		
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		 Workbook book = WorkbookFactory.create(fis);
		 Sheet sht = book.getSheet("Sheet1");
	}

}
