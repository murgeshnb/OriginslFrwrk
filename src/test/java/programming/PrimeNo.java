package programming;

public class PrimeNo {

	public static void main(String[] args) {
		
//		int no=7;
//		int i=2;
//		
//		while(i<no)
//		{
//			if(no%i==0)
//			{
//				break;
//			}
//			else{
//				i++;
//			}
//		}
//		
//		if(i==no){
//			System.out.println("prime no "+no);
//		}else{
//			System.out.println("No a prime "+no);
//		}
		
		for (int i = 2; i <=100; i++) 
		{
			int no=i;
			int j=2;
			
			while(j<no)
			{
				if(no%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			
			if(j==no)
			{
				System.out.println(no);
			}
			
		}

	}

}
