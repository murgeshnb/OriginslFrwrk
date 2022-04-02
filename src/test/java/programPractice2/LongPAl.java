package programPractice2;

import org.testng.annotations.Test;

public class LongPAl {
	@Test
	public void longest()
	{
		String[] s={"malayalam","kirik","gadag","chandru","mom","jajajajajaj"};
		int maxlength=0;
		
		for (int i = 0; i < s.length; i++) {
			String word = s[i];
			String rev="";
			for (int j = word.length()-1; j >=0 ; j--) {
				rev=rev+word.charAt(j);
			}
			
			if(word.equals(rev))
			{
				
				if(rev.length()>maxlength)
				{
					maxlength=rev.length();
				}	
			}
			
		}
		for (int i = 0; i < s.length; i++) {
			if(maxlength==s[i].length()){
				System.out.println(s[i]+" "+maxlength);
			}
		}
	}

}
