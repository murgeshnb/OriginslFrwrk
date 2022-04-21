package intervwPgms;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void prac()
	{
		String s="mohan kumar singh";
		String[] spl = s.split(" ");
		
		for (int i = 0; i < spl.length-1; i++) 
		{
			System.out.print(spl[i].charAt(0)+" ");
		}
			System.out.print(spl[spl.length-1]);
		}
		
}
