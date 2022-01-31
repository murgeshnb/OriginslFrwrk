package com.crm.comcast.orgTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.GenericLibrary.Excelutility;
import com.crm.GenericLibrary.Fileutility;
import com.crm.GenericLibrary.Javautility;
import com.crm.GenericLibrary.WebDriverutility;

public class CreateOrgWithIndustry {

	public static void main(String[] args) throws IOException {
		
		//Object creation
				Fileutility fLib=new Fileutility();
				Excelutility eLib=new Excelutility();
				Javautility jLib=new Javautility();
				WebDriverutility wLib=new WebDriverutility();
				
				int randomnum = jLib.getRandomNumber();
				//Excel read
				String value = eLib.getDatafromExcel("Org", 1, 1)+randomnum;
				
				String USERNAME = fLib.getPropertyKeyValue("username");
				String PASSWORD = fLib.getPropertyKeyValue("password");
				String BROWSER = fLib.getPropertyKeyValue("browser");
				String URL = fLib.getPropertyKeyValue("url");
				WebDriver driver=null;
				if(BROWSER.equalsIgnoreCase("firefox")){
					driver=new FirefoxDriver();
				}
				wLib.waitUntilPageLoad(driver);
				driver.get(URL);
				
				driver.findElement(By.name("user_name")).sendKeys(USERNAME);
				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
				driver.findElement(By.id("submitButton")).click();
				
				driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				driver.findElement(By.name("accountname")).sendKeys(value);
				WebElement dd = driver.findElement(By.name("industry"));
				wLib.select("Education", dd);
				driver.findElement(By.name("button")).click();
				String header = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if(header.contains(value))
				{
					System.out.println(header);
					System.out.println("Tscript1 passed");
				}
				WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				
				wLib.mouseHover(driver, element);
				driver.findElement(By.xpath("//a[.='Sign Out']")).click();
				driver.quit();
			

	}

}
