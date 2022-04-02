package programPractice2;

import org.testng.annotations.Test;

public class ThreeAddi {
	@Test
	public void addition3()
	{
		int[] arr={1,4,6,3,2,2,5,6,3};
		int[] brr=new int[arr.length-2];
		
		for (int i = 0; i < arr.length-2; i++) {
			int b=0;
			for (int j = i; j <=i+2; j++) {
				b=b+arr[j];
			}
			
			for (int j = 0; j < brr.length; j++) {
				brr[i]=b;
			}
		}
		
		for (int i = 0; i < brr.length; i++) {
			System.out.println(brr[i]);
		}
	}

}
