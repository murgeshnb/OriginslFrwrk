package arrayPgms;

public class SumOfMax3 {

	public static void main(String[] args) {
		
		int[] arr={2,6,4,5,9,1};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		//sum of first 3 max ele's
		int sum=0;
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
			sum=sum+arr[i];
		}
		System.out.println("First 3 max sum "+sum);

	}

}
