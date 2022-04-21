package programPractice2;

import org.testng.annotations.Test;

public class DuplWordsWithoutColl {
	@Test
	public void withoutColl(){
		String[] s={"java","mava","java","java","java23","java23"};
		int maxlength=s[0].length();
		
		for (int i = 0; i < s.length; i++) {
			if(maxlength<s[i].length()){
				maxlength=s[i].length();
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			if(maxlength==s[i].length()){
				System.out.println(s[i]);
			}
		}
	}

}
