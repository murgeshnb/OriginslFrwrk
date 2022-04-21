package programPractice2;

public class Greater10 {

	public static void main(String[] args) {
		int[] arr={23,87,94,98,91};
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			int no=arr[i];
			while(no>0){
				int rem=no%10;
				sum=sum+rem;
				no=no/10;
			}
			
			if(sum>9){
				int sum2=0;
				while(sum>0){
					int rem=sum%10;
					sum2=sum2+rem;
					sum2=sum2/10;
				}
				System.out.print(sum2+" ");
			}else{
				System.out.print(sum);
			}
			
		}

	}

}
