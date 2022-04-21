package arrayExtra;

public class AddingArray {

	public static void main(String[] args) {
		
		int[] a={2,3,4,5,6,7};
		int[] b={5,3,1,4,7,8,9,0,5};
		
		int maxlength=a.length;
		if(b.length>a.length){
			maxlength=b.length;
		}
		for (int i = 0; i < maxlength; i++) {
			try{
				System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e) {
				if(a.length>b.length){
					System.out.print(a[i]+" ");
				}else{
					System.out.print(b[i]+" ");
				}
			}
		}

	}

}
