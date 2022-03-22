package programming;

import java.util.HashSet;

public class PrintDup {

	public static void main(String[] args) {
		
		String s="hello";
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		
		for (Character ch : hs)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>=2)
			{
				System.out.println(ch+" "+count);
			}
		}

	}

}
