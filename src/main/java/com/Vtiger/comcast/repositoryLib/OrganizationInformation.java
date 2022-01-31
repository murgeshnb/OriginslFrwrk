package com.Vtiger.comcast.repositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformation {
	
	public OrganizationInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement header;
	
	@FindBy(xpath="//span[@id='dtlview_Industry']")
	private WebElement indudtryVer;

	public WebElement getIndudtryVer() {
		return indudtryVer;
	}

	public WebElement getHeader() {
		return header;
	}
	

}
