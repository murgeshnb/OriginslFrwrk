package programming;

public class HappyNo 
{
	public static void main(String[] args)
	{
		int no=568;
		int n=no;
		
		while(n>9)
		{
			int sum=0;
			while(no>0)
			{
				int rem=no%10;
				sum=sum+rem;
			}
		}

	}

}
