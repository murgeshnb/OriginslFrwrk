package com.crm.GenericLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * this class contains generic methods for all webdriver actions
 */

public class WebDriverutility {
	/**
	 * this method will maximize the browser
	 * @param driver
	 */
	
	public void maximise(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will wait until page gets loaded
	 * @param driver
	 */
	public void waitUntilPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * This method waits until element visibility 
	 * @param driver
	 * @param element
	 */
	public void waitForElementVisibility(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method waits until element to be clicked and performs click action on it.
	 * @param element
	 * @throws InterruptedException
	 */
	public void waitAndClick(WebElement element) throws InterruptedException
	{
		int count=0;
		while(count<20)
		{
			try{
				element.click();
				break;
			}
			catch (Exception e) {
				Thread.sleep(2000);
				count++;
			}
		}
	}
	
	/**
	 * This method will select the element by index
	 * @param element
	 * @param index
	 */
	
	public void selectBYINDExx(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * This method will select the element by value
	 * @param element
	 * @param value
	 */
	public void select(WebElement element,String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * This method will select the element by visible text
	 * @param text
	 * @param element
	 */
	public void select(String text,WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	/**
	 * This method will double click on the user passed element
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * This method will right click on the user passed element
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This method will mouse hover on the passed element
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This method will drag and drop the element from src to dest
	 * @param driver
	 * @param element
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver,WebElement element,WebElement source,WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void getScreenShot(WebDriver driver,String screenshotname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+screenshotname+".PNG");
		Files.copy(src, dest);
	}
	
	public void switchToWindow(WebDriver driver,String partialWinTitle)
	{
		Set<String> whandles = driver.getWindowHandles();
		Iterator<String> itr=whandles.iterator();
		while(itr.hasNext())
		{
			 String winId = itr.next();
			 String title = driver.switchTo().window(winId).getTitle();
			 
			 if(title.contains(partialWinTitle))
			 {
				 break;
			 }
		}
		
	}
	
	public void scrolltoElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		int y = ele.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")", ele);
		
	}
	
	public void switchToframe(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToframe(WebDriver driver,String id)
	{
		driver.switchTo().frame(id);
	}
	
	public void switchToframe(String addofFrame,WebDriver driver)
	{
		driver.switchTo().frame(addofFrame);
	}
	
	public void switchToDefaultframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void switchToParentframe(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	
	public void enterKey(WebDriver driver) throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.get(driver.getCurrentUrl());
//		r.keyPress(KeyEvent.VK_F5);
//		r.keyRelease(KeyEvent.VK_F5);
		
		Actions act=new Actions(driver);
//		act.sendKeys(Keys.F5).perform();
	//	act.sendKeys(Keys.CONTROL+t);
		//Robot r=new Robot();
				//r.keyPress(KeyEvent.VK_CONTROL+KeyEvent.VK_T);
		
		
	}	

}
