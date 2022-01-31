package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConfigTest {
	
	@BeforeClass
	public void configBC()
	{
		System.out.println("Launching the browser");
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("Close the browser");
	}
	
	@BeforeMethod
	public void configBM()
	{
		
		System.out.println("Logging in");
	}
	
	@AfterMethod
	public void configAM()
	{
		System.out.println("Logout");
		
	}
	
	@Test
	public void OrgContact()
	{
		System.out.println("Navigate to contact");
		System.out.println("Creating contact");
	}
	
	@Test
	public void createContact2()
	{
		System.out.println("Navigate to contact");
		System.out.println("Creating contact");
	}
	
	@Test
	public void createContact3()
	{
		System.out.println("Navigate to contact");
		System.out.println("Creating contact");
	}

}
