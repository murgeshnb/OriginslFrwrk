package april7;

public class Add2Array {

	public static void main(String[] args) {
		int[] a={1,2,3,4,8,8,0};
		int[] b={4,5,6,7};
		
		int max=a.length;
		if(a.length<b.length){
			max=b.length;
		}
		
		for (int i = 0; i < max; i++) {
			try{
				System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e) {
				if(a.length>b.length)
				{
					System.out.print(a[i]+" ");
				}else{
					System.out.print(b[i]+" ");
				}
			}
			
		}

	}

}
