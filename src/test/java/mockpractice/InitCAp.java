package mockpractice;

public class InitCAp {

	public static void main(String[] args) {
		String spl="hi hello this is bengaluru";
		char ch=(char)(spl.charAt(0)-32);
		System.out.print(ch);
		
		for (int i = 1; i < spl.length(); i++) {
			
			if(spl.charAt(i)==' ')
			{
				char ch2=(char)(spl.charAt(i+1)-32);
				i++;
				System.out.print(" "+ch2);
			}
			else
			{
				System.out.print(spl.charAt(i));
			}
		}
	}

}
