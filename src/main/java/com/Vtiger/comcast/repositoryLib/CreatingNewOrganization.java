package com.Vtiger.comcast.repositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganization {
	
	public CreatingNewOrganization(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountname")
	private WebElement orgName; 
	
	@FindBy(name="industry")
	private WebElement industries;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	public WebElement getIndustries() {
		return industries;
	}

	public void createOrg(WebDriver driver,String OrgNAme)
	{
		orgName.sendKeys(OrgNAme);
		savebtn.click();
	}
}
