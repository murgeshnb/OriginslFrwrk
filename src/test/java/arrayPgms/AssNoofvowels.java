package arrayPgms;

public class AssNoofvowels {

	public static void main(String[] args) {
		
		
		String[] s={"apple","banana"};
		for (int i = 0; i < s.length; i++)
		{
			int count=0;
			for (int j = 0; j < s[i].length(); j++)
			{
				char ch=s[i].charAt(j);
		
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
				
			}
			System.out.println(s[i]+" "+count);
		}

	}

}
