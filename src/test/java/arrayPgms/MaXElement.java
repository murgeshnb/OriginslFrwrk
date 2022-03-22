package arrayPgms;

public class MaXElement {

	public static void main(String[] args) {
		
		int[] arr={21,98,76,55,5};
		
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
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("First maximum element "+arr[arr.length-1]);
		
		System.out.println("Second max element "+arr[arr.length-2]);
		
		System.out.println("First min element "+arr[0]);
		
		System.out.println("Second min element "+arr[1]);

	}

}
