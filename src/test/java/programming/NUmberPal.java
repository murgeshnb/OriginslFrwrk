package programming;

public class NUmberPal {

	public static void main(String[] args) {
		int no=1001;
		int temp=no;
		int rev=0;
		
		while(temp!=0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==no){
			System.out.println("palindrome "+rev);
		}
		else
		{
			System.out.println("Not a pali "+rev);
		}
}
}