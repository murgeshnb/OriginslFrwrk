package com.crm.comcast.contactTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Vtiger.comcast.repositoryLib.ContactCreation;
import com.Vtiger.comcast.repositoryLib.ContactsInformationPage;
import com.Vtiger.comcast.repositoryLib.ContactsPage;
import com.Vtiger.comcast.repositoryLib.CreatingNewOrganization;
import com.Vtiger.comcast.repositoryLib.Home;
import com.Vtiger.comcast.repositoryLib.OrganizationInformation;
import com.Vtiger.comcast.repositoryLib.Organizations;
import com.crm.GenericLibrary.Baseclass;

@Listeners(com.crm.GenericLibrary.ListImpClass.class)
public class ContactTest extends Baseclass {
	
	
	@Test(groups="smoke")
	public void createContactTest() throws EncryptedDocumentException, IOException{
		
		/*Read data from Excel*/
		String ContactName = eLib.getDatafromExcel("contact", 1, 2)+jLib.getRandomNumber();
		
		/*NAvigating to contcat*/
		Home h=new Home(driver);
		h.getContactlink().click();
		
		/*NAvigate to Createcontact*/
		ContactsPage cpage=new ContactsPage(driver);
		cpage.getCreatecontimg().click();
		
		/*Creating new Contact*/
		ContactCreation creation=new ContactCreation(driver);
		creation.lastnameSend(ContactName);
		
		/*Verifying*/
		ContactsInformationPage cinfo=new ContactsInformationPage(driver);
		String header = cinfo.getHeader().getText();
		boolean msgcont = header.contains(ContactName);
		Assert.assertTrue(false);
	}
	
	
	@Test(groups="regression")
	public void createContactWithOrgTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
	
		/*Read data from Excel*/
		String orgName = eLib.getDatafromExcel("Org", 1, 1)+jLib.getRandomNumber();
		String ContactName = eLib.getDatafromExcel("contact", 1, 2);
		
		/* step3:Navigating to oraganisation*/
		Home h=new Home(driver);
		h.getOrganisation().click();
		
		/* step4:navigate to create org page*/
		Organizations org=new Organizations(driver);
		org.getCreateOrgImg().click();
		
		/* step5: create Organisation*/
		CreatingNewOrganization cOrg=new CreatingNewOrganization(driver);
		cOrg.createOrg(driver, orgName);
		
		/*Wait for header*/
		OrganizationInformation oinfo=new OrganizationInformation(driver);
		wLib.waitForElementVisibility(driver, oinfo.getHeader());
		
		/*NAvigating to contcat*/
		h.getContactlink().click();
		
		/*NAvigate to Createcontact*/
		ContactsPage cpage=new ContactsPage(driver);
		cpage.getCreatecontimg().click();
		
		/*Creating new Contact*/
		ContactCreation creation=new ContactCreation(driver);
		creation.lastnameSend(ContactName,orgName);
		
		/*Verifying*/
		ContactsInformationPage cinfo=new ContactsInformationPage(driver);
		String ActOzname = cinfo.getActOrgName().getText();
		System.out.println(ActOzname);
		Assert.assertEquals(ActOzname.trim(), orgName);
		
	}

}
