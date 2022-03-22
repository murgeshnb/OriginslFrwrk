package xpath;

public class JavaPgm 
{

	public static void main(String[] args) 
	{
		String n = "32400121200";
		
		for (int i = 0; i < n.length(); i++) 
		{
			if(n.charAt(i)=='0')
			{
				System.out.print(n.charAt(i));
			}
		}
		
		for (int i = 0; i < n.length(); i++) 
		{
			if(n.charAt(i)!='0')
			{
				System.out.print(n.charAt(i));
			}
		}

	}

}
