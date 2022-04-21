package programming;

import java.util.HashSet;

public class WordsOccurence {

	public static void main(String[] args) 
	{
		String s="Welcome to india Welcome to mandya to";
		String[] spl = s.split(" ");
		
		HashSet<String> hs=new HashSet<String>();
		
		for(int i=0;i<spl.length;i++)
		{
			hs.add(spl[i]);
		}
		
		for (String word : hs) 
		{
			int count=0;
			for(int i=0;i<spl.length;i++)
			{
				if(word.equals(spl[i]))
				{
					count++;	
				}
			}
			System.out.println(word+" "+count);
			
		}

	}

}
