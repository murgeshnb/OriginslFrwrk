package april11;

import org.testng.annotations.Test;

public class WithoutSort {
	@Test
	public void withoutSort(){
		int[] arr={10,5,7,8,3,2,1,9};
		int max=0;
		int secmax=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]){
				secmax=max;
				max=arr[i];
			}
			else if(secmax<max){
				secmax=arr[i];
			}
		}
		System.out.println(max+" "+secmax);
		
//		for (int i = 0; i < arr.length; i++) {
//			if(max<arr[i]){
//				secmax=max;
//				max=arr[i];
//			}
//			else if(secmax<arr[i]){
//				secmax=arr[i];
//			}
//		}
	
	}

}
