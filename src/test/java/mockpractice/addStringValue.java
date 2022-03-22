package mockpractice;

import org.testng.annotations.Test;

public class addStringValue 
{
	@Test
	public void addValues()
	{
		String s="4567india4567";
		String rev="";
		int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				rev=rev+s.charAt(i);
			}
		}

		int no=Integer.parseInt(rev);
		while(no!=0)
		{
			sum=sum+no%10000;
			no=no/10000;
		}
		System.out.println(sum);
		
		
	
	}

}
