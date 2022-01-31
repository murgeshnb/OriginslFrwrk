package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.crm.GenericLibrary.Baseclass;

public class SampleforScreenshot extends Baseclass{
	
	@Test
	public void screnshotsamplescript() throws IOException{
		
		System.out.println("Pgm for shot");
		EventFiringWebDriver efire=new EventFiringWebDriver(driver);
		File src = efire.getScreenshotAs(OutputType.FILE);
		
		File dstn=new File("./screenshot/test.png");
		
		FileUtils.copyFile(src, dstn);
		
	}

}
