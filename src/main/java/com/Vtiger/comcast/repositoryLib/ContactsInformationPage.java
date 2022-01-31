package com.Vtiger.comcast.repositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInformationPage {
	
	public ContactsInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement header;
	
	@FindBy(id="mouseArea_Organization Name")
	private WebElement ActOrgName;
	
	public WebElement getActOrgName() {
		return ActOrgName;
	}

	public WebElement getHeader() {
		return header;
	}
}
