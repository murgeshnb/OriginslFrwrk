package programPractice2;



public class wordocc {
	public static void main(String[] args) {
		
		String s1="sachin123!@#";
		String s="";
		String s2="";
		String s3="";
		
	
		for (int i = 0; i<s1.length(); i++) {
			
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z'||s1.charAt(i)>='A'&&s1.charAt(i)>='Z')
			{
				s=s+s1.charAt(i);
			}
			else if(s1.charAt(i)>=48&&s1.charAt(i)<=57)
			{
				s2=s2+s1.charAt(i);
			}
			else
			{
				s3=s3+s1.charAt(i);
			}
			
		}
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
	}

}
