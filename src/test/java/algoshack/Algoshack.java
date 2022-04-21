package algoshack;

public class Algoshack {

	public static void main(String[] args) {
		
		String s="AlgoShackPrivateLimited";
		char[] str=s.toCharArray();
		

	      for(int i=0;i<str.length;i++)
	      {
		for(int j=i+1;j<str.length;j++)
		{
		  if(str[i]<str[j])
		  {
			char temp=str[i];
			str[i]=str[j];
			str[j]=temp;
		  }
		}
		
	     }

			for(int i=0;i<str.length;i++)
			{
				System.out.print(str[i]+"");
		}

	}

}
