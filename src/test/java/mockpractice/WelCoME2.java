package mockpractice;

import java.util.LinkedHashSet;

public class WelCoME2 {

	public static void main(String[] args) 
	{
		
		String s="welcome";
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			hs.add(s.charAt(i));
		}
		
		int count=0;
		for (Character ch : hs) 
		{	
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
		}
		System.out.println(s+" "+count);
		

	}

}
