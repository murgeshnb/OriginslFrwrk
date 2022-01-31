package com.crm.comcast_OrganisationPOMTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.comcast.repositoryLib.CreatingNewOrganization;
import com.Vtiger.comcast.repositoryLib.Home;
import com.Vtiger.comcast.repositoryLib.Login;
import com.Vtiger.comcast.repositoryLib.OrganizationInformation;
import com.Vtiger.comcast.repositoryLib.Organizations;
import com.crm.GenericLibrary.Baseclass;
import com.crm.GenericLibrary.Excelutility;
import com.crm.GenericLibrary.Fileutility;
import com.crm.GenericLibrary.Javautility;
import com.crm.GenericLibrary.WebDriverutility;

public class Organisation extends Baseclass {
	
		@Test(groups="smoke")
		public void createOrgTest() throws EncryptedDocumentException, IOException{
			
		/*Reading data from excel*/
		String orgName = eLib.getDatafromExcel("Org", 1, 1)+jLib.getRandomNumber();
		
		
		/* step3:Navigating to oraganisation*/
		Home h=new Home(driver);
		h.getOrganisation().click();
		
		/* step4:navigate to create org page*/
		Organizations org=new Organizations(driver);
		org.getCreateOrgImg().click();
		
		/* step5: create Organisation*/
		CreatingNewOrganization cOrg=new CreatingNewOrganization(driver);
		cOrg.createOrg(driver, orgName);
		
		/* step:6 Verification*/
		OrganizationInformation orgInfo=new OrganizationInformation(driver);
		wLib.waitForElementVisibility(driver, orgInfo.getHeader());
		 String actMsg = orgInfo.getHeader().getText();
		 boolean msgcont = actMsg.contains(orgName);
		 Assert.assertTrue(msgcont, orgName);
	}
		
		@Test(groups="regression")
		public void createOrgWithInd() throws EncryptedDocumentException, IOException
		{
			
			/*Read data from Excel*/
			String value = eLib.getDatafromExcel("Org", 1, 1)+jLib.getRandomNumber();
			String Industry = eLib.getDatafromExcel("Org", 2, 2);
			
			
			/*Navigating to organisation*/
			Home h=new Home(driver);
			h.getOrganisation().click();
			
			/*Navigate to create Org page*/
			Organizations org=new Organizations(driver);
			org.getCreateOrgImg().click();
			
			/*Create Org*/
			CreatingNewOrganization corg=new CreatingNewOrganization(driver);
			WebElement ind = corg.getIndustries();
			wLib.select(Industry, corg.getIndustries());
			corg.createOrg(driver, value);

			
			/*Org verification*/
			OrganizationInformation oinfo=new OrganizationInformation(driver);
			String verText = oinfo.getIndudtryVer().getText();
			
			Assert.assertEquals(verText, Industry);
			
		}
}
