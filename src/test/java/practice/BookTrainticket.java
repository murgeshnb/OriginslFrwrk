package practice;

import java.awt.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTrainticket {
	
	@Test(dataProvider="ticketdata")
	public void bookticket(String src, String dstn)
	{
		System.out.println("Book ticket from "+src+"=====>to "+dstn);
		
		
	}
	
	@DataProvider
	public Object[][] ticketdata()
	{
		Object[][] objarr=new Object[6][2];
		
		objarr[0][0]="Bengaluru";
		objarr[0][1]="Mysore";
		
		objarr[1][0]="bengaluru";
		objarr[1][1]="Kalaburagi";
		
		objarr[2][0]="Mysore";
		objarr[2][1]="OOty";
		
		objarr[3][0]="Bengalru";
		objarr[3][1]="Long";
		
		objarr[4][0]="Bng";
		objarr[4][1]="Bmg";
		
		objarr[5][0]="Bgv";
		objarr[5][1]="Hubli";
		
		return objarr;
	}

}
