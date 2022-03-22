package programming;

import java.util.Iterator;
import java.util.HashSet;

public class OccuranceOfChar {

	public static void main(String[] args) {
		
		String s="hello";
		//step1
		HashSet<Character> hs=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		
		//step2 compare 
		for (Character ch : hs)
		{			//set   h e l o
			int count=0;
			for(int i=0;i<s.length();i++)	//string
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}

	}

}
