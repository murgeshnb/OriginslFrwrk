package programming;

import java.util.LinkedHashSet;

public class PrintUnq {

	public static void main(String[] args) {
		
		String s="hello";
		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			ls.add(s.charAt(i));
		}
		
		for (Character ch : ls) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(ch);
			}
		}

	}

}
