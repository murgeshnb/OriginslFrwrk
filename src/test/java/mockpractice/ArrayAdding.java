package mockpractice;

public class ArrayAdding {

	public static void main(String[] args) {
		
		int[] a={1,2,3,8,9,0};
		int[] b={4,5,6,8};
		
		int count=a.length;
		if(b.length>a.length)
		{
			count=b.length;
		}
		for (int i = 0; i < count; i++) {
			try 
			{
				System.out.println(a[i]+b[i]);
			}
			catch (Exception e) 
			{
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.println(b[i]);
				}
				
			}
			
		}

	}

}
