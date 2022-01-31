package com.Vtiger.comcast.repositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {	// RULE1
	
	public Login(WebDriver driver)		//RULE3
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")		//RULE2
	private WebElement userName;
	
	@FindBy(name="user_password")
	private WebElement passWord;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;

	public WebElement getUserName() {			//RULE 4
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginToApp(String username,String password)			//RULE 5
	{
		userName.sendKeys(username);
		passWord.sendKeys(password);
		loginBtn.click();
	}

}
