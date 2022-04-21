package programPractice2;

import java.util.ArrayList;
import java.util.Date;

import org.testng.annotations.Test;

public class StaRPrint {
	@Test
	public void star()
	{
//		for (int i = 4; i >=1; i--) {
//			for (int j = i; j >=1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i<=2; i++) {
//			for (int j = 0; j <=i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
	
//		int no=568;
//		int n=no;
//		while(n>9)
//		{
//			int sum=0;
//			while(n>0){
//				int rem=n%10;
//				sum=rem+sum;
//				n=n/10;
//			}
//			n=sum;
//		}
//		System.out.println(n);
		
		String s="aabb";
		int count1=1;
		int count2=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count1++;
			}else
			{
				for (int j = i+1; j < s.length(); j++) {
					count2++;
				}break;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
		
	}

}
