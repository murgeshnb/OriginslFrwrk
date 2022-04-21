package xpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Sample 
{
	@Test
	public void simple()
	{
		int[] arr={23,4,5,4,8,9,0,11};
		ArrayList list=new ArrayList<>();
		
		for (int i : arr) {
			list.add(i);
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
//		while(true)
//		{
//			try{
//				s.charAt(i);
//				i++;
//			}catch (Exception e) {
//				break;
//			}
//		}
//		System.out.println(i);
		
		
//		String s1="i am from gulbarga";
//		String s2=" i am indian";
//		
//		String s=s1+s2;
//		String[] spl = s.split(" ");
//		
//		LinkedHashSet<String> sl=new LinkedHashSet<String>();
//		for (int i = 0; i < spl.length; i++) 
//		{
//			sl.add(spl[i]);
//		}
//		
//		for (String str : sl) 
//		{
//			System.out.print(str+" ");
//		}
	}

}
