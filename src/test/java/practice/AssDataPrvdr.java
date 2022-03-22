package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Vtiger.comcast.repositoryLib.CreatingNewOrganization;
import com.Vtiger.comcast.repositoryLib.Home;
import com.Vtiger.comcast.repositoryLib.OrganizationInformation;
import com.Vtiger.comcast.repositoryLib.Organizations;
import com.crm.GenericLibrary.Baseclass;

public class AssDataPrvdr extends Baseclass {
	
	
	@Test(dataProvider="orgInd")
	public void createOrgWithInd(String value,String Industry) throws EncryptedDocumentException, IOException
	{
	
		
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
	
	@DataProvider
	public Object[][] orgInd() throws EncryptedDocumentException, IOException{
		
		
		Object[][] obj=new Object[4][2];
		int count = eLib.getRowCount("Org");
		
		/*Read data from Excel*/
		for(int i=0;i<count;i++)
		{
			obj[i][0] = eLib.getDatafromExcel("Org", i+1, 1)+jLib.getRandomNumber();
			obj[i][1] = eLib.getDatafromExcel("Org", i+1, 2);
		}
		
		return obj;
	}
}
