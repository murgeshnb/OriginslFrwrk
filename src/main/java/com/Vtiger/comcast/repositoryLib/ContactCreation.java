package com.Vtiger.comcast.repositoryLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLibrary.WebDriverutility;

public class ContactCreation extends WebDriverutility {
	
	WebDriver driver=null;
	public ContactCreation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
	private WebElement OrgLookup;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;

	public WebElement getLastname() {
		return lastname;
	}
	
	public void lastnameSend(String Last){
		lastname.sendKeys(Last);
		savebtn.click();
	}
	
	public void lastnameSend(String Last,String Orgname) throws InterruptedException{
		lastname.sendKeys(Last);
		OrgLookup.click();
		switchToWindow(driver, "Accounts&action");
		Organizations org=new Organizations(driver);
		org.getSearchText().sendKeys(Orgname);
		org.getSearchNow().click();
		driver.findElement(By.xpath("//a[text()='"+Orgname+"']")).click();
		switchToWindow(driver, "Contacts&action");
		savebtn.click();
	}
	
	
	

}
