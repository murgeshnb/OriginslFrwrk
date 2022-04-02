package programPractice2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws Throwable, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement eles : links) {
		String url =eles.getAttribute("href");
		
		HttpURLConnection urlconn = (HttpURLConnection)new URL(url).openConnection();
		urlconn.connect();
		int statuscode = urlconn.getResponseCode();
		
		if(statuscode>=400){
			System.out.println("Broken-link: "+url+" code: "+statuscode);
		}else{
			System.out.println("valid-link: "+url+" code: "+statuscode);
		}
		}
		driver.close();
		
		
		//fluent wait, pageloadtimeout, setscript timeout
		FluentWait wait=new FluentWait(driver);
		wait.wait(10000);
		wait.pollingEvery(Duration.ofSeconds(2));//1 sec 500ms
		wait.until(ExpectedConditions.alertIsPresent());
		wait.ignoring(NoAlertPresentException.class);
	}

}
