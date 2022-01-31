package com.Vtiger.comcast.repositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {		//rule1
	
	public Home(WebDriver driver)		//rule3
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations")		//rule2
	private WebElement organisation;
	
	@FindBy(linkText="Contacts")
	private WebElement contactlink;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImg;
	
	@FindBy(linkText="Sign Out")
	private WebElement Signoutlink;
	
	public WebElement getOrganisation() {
		return organisation;
	}
	
	public WebElement getContactlink() {
		return contactlink;
	}

	public WebElement getAdministratorImg() {
		return administratorImg;
	}

	public WebElement getSignoutlink() {
		return Signoutlink;
	}
	
	public void Logout(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(administratorImg).perform();
		Signoutlink.click();
	}

	

}
