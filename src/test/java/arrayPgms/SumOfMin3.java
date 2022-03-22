package arrayPgms;

public class SumOfMin3 {

	public static void main(String[] args)
	{
		int[] arr={2,7,6,13,5};
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//sum of first 3 min
		int sum=0;
		for (int i = 0; i < 3; i++) 
		{
			System.out.println(arr[i]);
			sum=sum+arr[i];
		}
		System.out.println("Sum of first 3 min elements "+sum);

	}

}
