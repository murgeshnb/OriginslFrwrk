package cignetSoln;

import java.util.LinkedHashSet;

public class AbcdAbcd {

	public static void main(String[] args) {
		String s="abcd abcd abcd abcd";
		
		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			ls.add(s.charAt(i));
		}
		
		for (Character ch : ls) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)){
					System.out.print(s.charAt(i));
				}
			}
			System.out.print(" ");
		}

	}

}
