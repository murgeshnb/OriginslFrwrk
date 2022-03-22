package programming;

import java.util.LinkedHashSet;

public class WordRemoveDupl {

	public static void main(String[] args) {
		
		String s="Welcome to india Welcome to mandya";
		String[] spl = s.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		
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
		}
		
		for (String str : hs) {
			System.out.print(str+" ");
		}

	}

}
