package mockpractice;

public class MaxStringLength {

	public static void main(String[] args) 
	{
		String[] spl={"welcome", "to", "india", "welcome", "to", "Bengaluru"};	
		
		int maxLength = spl[0].length();
		for (int i = 0; i < spl.length; i++) 
		{
			if(maxLength<spl[i].length())
			{
				maxLength=spl[i].length();
			}
		}
		
		for (int j = 0; j < spl.length; j++) {
			if(maxLength==spl[j].length())
			{
				System.out.println(spl[j]);
			}
		}	
		
		
			
	}
}
