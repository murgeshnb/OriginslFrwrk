package com.crm.GenericLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Vtiger.comcast.repositoryLib.Home;
import com.Vtiger.comcast.repositoryLib.Login;

public class Baseclass {
	
	public WebDriver driver=null;
	public static WebDriver sdriver;
	/*Creating Objects*/
	public Fileutility fLib=new Fileutility();
	public Javautility jLib=new Javautility();
	public Excelutility eLib=new Excelutility();
	public WebDriverutility wLib=new WebDriverutility();
	
	
	@BeforeSuite(groups={"smoke","regression"})
	public void configBS()
	{
		System.out.println("Connecting to database");
	}
	
	//@Parameters("browser")
	@BeforeClass(groups={"smoke","regression"})
	public void configBC(/*String BROWSER*/) throws IOException
	{
		String BROWSER = fLib.getPropertyKeyValue("browser");
		
		/*Step1 Launch the browser*/
		if(BROWSER.equalsIgnoreCase("firefox")){
			System.out.println("Launching the firefox browser");
			driver=new FirefoxDriver();  
			
		}
		else if(BROWSER.equalsIgnoreCase("chrome")){
			System.out.println("Launching the chrome browser");
			driver=new ChromeDriver();
		}
		 
		wLib.waitUntilPageLoad(driver);
	}
	
	
	@BeforeMethod(groups={"smoke","regression"})
	public void configBM() throws IOException
	{
		/*Reading common data*/
		String URL = fLib.getPropertyKeyValue("url");
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		
		
		/* step2:Login to Application*/
		driver.get(URL);
		 sdriver=driver;
		Login lp=new Login(driver);
		lp.loginToApp(USERNAME, PASSWORD);
	}
	
	
	@AfterMethod(groups={"smoke","regression"})
	public void configAM()
	{
		 /* step7:Logging out*/
		Home h=new Home(driver);
		 h.Logout(driver);

	}
	@AfterClass(groups={"smoke","regression"})
	public void configAC()
	{
		 /*CLose the browser*/
		 driver.quit();	
	}
	
	@AfterSuite(groups={"smoke","regression"})
	public void configAS()
	{
		System.out.println("disConnecting to database");
	}
	

}
