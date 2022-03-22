package xpath;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Sample 
{
	@Test
	public void simple()
	{
		String s1="i am from gulbarga";
		String s2=" i am indian";
		
		String s=s1+s2;
		String[] spl = s.split(" ");
		
		LinkedHashSet<String> sl=new LinkedHashSet<String>();
		for (int i = 0; i < spl.length; i++) 
		{
			sl.add(spl[i]);
		}
		
		for (String str : sl) 
		{
			System.out.print(str+" ");
		}
	}

}
