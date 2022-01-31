package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excelamazon {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/testdata2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sht = book.getSheet("Sheet1");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<links.size();i++){
			Row ro = sht.createRow(i);
			Cell cl = ro.createCell(0);
			cl.setCellValue(links.get(i).getAttribute("href"));
		}
		FileOutputStream fout=new FileOutputStream("./data/testdata2.xlsx");
		book.write(fout);
		
		

	}

}
