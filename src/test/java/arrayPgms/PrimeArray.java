package arrayPgms;

public class PrimeArray {

	public static void main(String[] args) {
		
		int[] a={3,5,8,9,1};
		for (int i = 0; i < a.length; i++) {
			int no=a[i];
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
				System.out.println("Prime no "+no);
			}
			else
			{
				System.out.println("NOt a prime "+no);
			}
		}

	}

}
