package intervwPgms;

import java.util.HashSet;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DupNos 
{
	@Test
	public void dupNo()
	{
		int[] arr={10,40,50,10,60,10,50,90,80};
		
		HashSet<Integer> set=new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for (Integer no : set) {
			int count=0;
			for (int i = 1; i < arr.length; i++) {
				if(no==arr[i])
				{
					count++;
				}
			}
			System.out.println(no+" "+count);
		}
	}

}
