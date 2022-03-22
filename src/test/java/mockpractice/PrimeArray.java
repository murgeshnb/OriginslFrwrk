package mockpractice;

public class PrimeArray {

	public static void main(String[] args) {
		
		int[] arr={3,34,56,97,57,31,93};
		for (int i = 0; i < arr.length; i++) {
			int no=arr[i];
			int j=2;
			
			while(i<no)
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
			
			if(j==no){
				System.out.println("Prime no "+no);
			}
			else{
				System.out.println("Not a prime "+no);
			}
			
		}
	}

}
