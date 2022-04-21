package intervwPgms;

import org.testng.annotations.Test;

public class ChAfterNo 
{
	@Test
	public void charNo(){
		String s="aaabbddcca";
		int count=1;
		for (int i = 0; i < s.length(); i++) {
			try{
				if(s.charAt(i)==s.charAt(i+1))
				{
					count++;
				}
				else{
					System.out.print(count+""+s.charAt(i));
					count=1;
				}	
			}
			catch (Exception e) {
			}
		}
		
		if(count==1){
			System.out.print(count+""+s.charAt(s.length()-1));
		}
	}

}
