package arrayPgms;

public class MAxStringLength {

	public static void main(String[] args) {
		
		String[] s={"hello","all","Welcome","to","Welcome","Welcome"};
		
		String maxLength = s[0];
		for (int i = 1; i < s.length; i++) 
		{
			if(maxLength.length()<s[i].length())
			{
				maxLength=s[i];
			}
		}
		
		for (int i = 0; i < s.length; i++) 
		{
			if(maxLength.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
			
		}

	}

}
