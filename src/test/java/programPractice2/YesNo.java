package programPractice2;

import org.testng.annotations.Test;

public class YesNo {
	@Test
	public void yess(){
		String s="aaabb";
		int count1=0;
		int count2=0;
		for (int i = 0; i < s.length(); i++) {
			try{
				if(s.charAt(i)==s.charAt(i+1)){
					count1++;
				}else{
					for (int j = i+1; j < s.length(); j++) {
						count2++;
					}
			}
			
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}

}
