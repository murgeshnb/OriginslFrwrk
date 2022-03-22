package programming;

import java.util.LinkedHashSet;

public class VowelsRemoveDup {

	public static void main(String[] args)
	{
		String s="india";
		s=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch : set)
		{
			int count=0;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
					System.out.println(ch+" "+count);
				}
		}

	}

}
