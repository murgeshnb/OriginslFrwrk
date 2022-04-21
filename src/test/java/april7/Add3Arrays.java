package april7;

public class Add3Arrays {

	public static void main(String[] args) {
		int[] arr={1,4,6,3,2,2,5,6,3};
		int[] brr=new int[arr.length-2];
		
		for (int i = 0; i < arr.length-2; i++) {
			int sum=0;
			for (int j = i; j <=i+2; j++) {
				sum=sum+arr[j];
			}
			brr[i]=sum;
		}
		
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i]+" ");
		}
		
		int min=brr[0];
		for (int i = 0; i < brr.length; i++) {
			if(min>brr[i]){
				min=brr[i];
			}
		}
		System.out.println();
		System.out.println(min);

	}

}
