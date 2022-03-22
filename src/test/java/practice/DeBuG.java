package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Vtiger.comcast.repositoryLib.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeBuG
{
	@Test
	public void debuGG()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		Login lp=new Login(driver);
		lp.login(driver);

		
	}

}
