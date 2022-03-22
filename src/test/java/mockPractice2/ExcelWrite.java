package mockPractice2;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelWrite 
{
	@Test
	public void writeData() throws EncryptedDocumentException, IOException
	{
//		WebDriver driver=new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.amazon.com");
		//List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("Sheet1");
		
		for (int i = 0; i < sht.getLastRowNum(); i++) {
			System.out.println(sht.getLastRowNum());
			Row r = sht.getRow(i);
			System.out.println(r.getLastCellNum());
			
			for (int j = 0; j < r.getLastCellNum(); j++) {
				System.out.print(r.getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		
		//driver.close();
		
	}

}
