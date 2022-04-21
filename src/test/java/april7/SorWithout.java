package april7;

public class SorWithout {

	public static void main(String[] args) {
		int[] arr={102,100,12,43,54,101,78,9,99};
		int maximum=arr[0];
		int secmax=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(maximum<arr[i])
			{
				secmax=maximum;
				maximum=arr[i];
			}
			if(secmax>maximum){
				maximum=secmax;
			}
		}
		System.out.println(maximum+" "+secmax);

	}

}
