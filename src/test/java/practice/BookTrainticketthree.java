package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTrainticketthree {
	
	@Test(dataProvider="bookticketswithnos")
	public void boowiththree(String src,String dstn,int no)
	{
		System.out.println("Book "+no+" tickets from "+src+" to destination "+dstn);
	}
	
	@DataProvider
	public Object[][] bookticketswithnos()
	{
		Object[][] objarr=new Object[3][3];
		
		objarr[0][0]="mumbai";
		objarr[0][1]="Gulbarga";
		objarr[0][2]=2;
		
		objarr[1][0]="Hyderabad";
		objarr[1][1]="Bengaluru";
		objarr[1][2]=3;
		
		objarr[2][0]="Odisssa";
		objarr[2][1]="Delhi";
		objarr[2][2]=5;
		
		return objarr;
	}


}
