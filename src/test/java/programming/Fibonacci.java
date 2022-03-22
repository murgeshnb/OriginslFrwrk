package programming;

public class Fibonacci {

	public static void main(String[] args) {
		
//		int a=0;
//		int b=1;
//		for(int i=0;i<=25;i++)
//		{
//			int c=a+b;
//			if(c<25){
//				
//				System.out.println(c);
//				a=b;
//				b=c;
//			}
//				else{
//					break;
//				}
//			}
		
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		
		for (int i = 0; i <10; i++) 
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}

}

