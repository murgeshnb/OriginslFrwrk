package april7;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HarshaDupl {

	public static void main(String[] args) {
		String s="harshavardhan";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)){
					count++;
				}
			}
		//	System.out.print(ch+""+count+" ");
		//	System.out.println();
			if(count==1)
			{
				System.out.println(ch+""+count+" ");
			}
		}
		
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(set.g);
//		}
	}

}
