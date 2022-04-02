package intervwPgms;

import org.testng.annotations.Test;

public class SubStrinG 
{
	@Test
	public void stringii()
	{
		String[] arr={"Test","MyTester","IsTesting","India","Delhi","Test","SmartTEst"};
		
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			String s = arr[i];
			char[] lower = s.toLowerCase().toCharArray();
			
			String data="";
			for (int j = 0; j < lower.length; j++) 
			{
				data=data+""+lower[j];
			}
			
			if(data.contains("test"))
			{
				System.out.println(data);
				count++;
			}
		}
		
		System.out.println("No of times test repeated is "+count);
	}

}
