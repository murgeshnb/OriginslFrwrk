package intervwPgms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class noofocc {
	
	public static void main(String[] args) {
		
		String s1="hellooo";
	
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s1.length(); i++) {
			
			set.add(s1.charAt(i));
			
		}
		
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s1.length(); i++) {
				if(ch.equals(s1.charAt(i)))
				{
					count++;
				}

			}

		}
		for (Character ch : set) {
			System.out.println(ch);
			
		}
		
		

	}

}
