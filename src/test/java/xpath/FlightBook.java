package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.reactivex.rxjava3.functions.Action;

public class FlightBook {

	@Test
	public void launching()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//step1: mavigate to fipkart
		driver.get("https://www.makemytrip.com/");
		String month="March 2022";
		String date="11";
		
		Actions act=new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//div[.='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']")).click();

	}

}
