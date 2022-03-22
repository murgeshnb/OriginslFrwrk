package programming;

public class SumOfEach {

	public static void main(String[] args) {
		int no=12345;
		int sum=0;
		while(no!=0)
		{
			int dig = no%10;
			sum=sum+dig;
			no=no/10;
		}
		System.out.println(sum);

	}

}
