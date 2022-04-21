package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class all {

	WebDriver driver;
	@Test
	public void sheets() throws Throwable
	{	
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
  driver.get("https://www.flipkart.com/");
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  List<WebElement> ge = driver.findElements(By.xpath("//a"));
  
  
  for (WebElement read : ge) {
	
	 String se = read.getText();
	 System.out.println(se);
}
 driver.close();
	}
}
