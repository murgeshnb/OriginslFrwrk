package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incog {
	@Test
	public void incognito()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
	}

}
