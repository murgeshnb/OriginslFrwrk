package mockpractice;

public class AssNoOfVowelsArray {

	public static void main(String[] args) {
		
//		String[] arr={"apple","mango","banana","chiku"};
//		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			int count=0;
//			for (int j = 0; j < arr[i].length(); j++)
//			{
//				char ch=arr[i].charAt(j);
//				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//				{
//					count++;
//				}
//			}
//			
//			System.out.println(arr[i]+" "+count);
//		}
//
		
		String[] arr={"apple","mango","banana","chiku"};
		for (int i = 0; i < arr.length; i++) 
		{
			int count=0;
			for (int j = 0; j < arr[i].length(); j++) 
			{
				char ch = arr[i].charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
			}
			
			System.out.println(arr[i]+" "+count);
		}
	}

}
