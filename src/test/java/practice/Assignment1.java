package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		
		Properties po=new Properties();
		po.load(fis);
		
		String browser = po.getProperty("browser");
		String url = po.getProperty("url");
		String username = po.getProperty("username");
		String password = po.getProperty("password"); 
		
		FileInputStream fis2=new FileInputStream("./data/testdata.xlsx");
		Workbook book=WorkbookFactory.create(fis2);
		Sheet s = book.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		
		if(browser.equals("firefox")){
			driver=new FirefoxDriver();
		}
		else if(browser.equals("chrome")){
			driver=new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(value);
		driver.findElement(By.name("button")).click();
		
		String header = driver.findElement(By.className("dvHeaderText")).getText();
		if(header.contains("First")){
			System.out.println("TItle contains "+header);
		}
		else{
			System.out.println("title doesn't contains "+header);
		}
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
		

	}

}
