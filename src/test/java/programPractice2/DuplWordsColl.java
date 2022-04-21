package programPractice2;

import java.util.HashSet;

import org.testng.annotations.Test;

public class DuplWordsColl {
	@Test
	public void duplWords(){
		String[] s={"java","java1","mava","java","gang","java","gang"};
		HashSet<String> hs=new HashSet<String>();
		
		for (int i = 0; i < s.length; i++) {
			hs.add(s[i]);
		}
		
		for (String str : hs) {
			int count=0;
			for (int i = 0; i < s.length; i++) {
				if(str.equals(s[i]))
				{
					count++;
				}
			}
			if(count>=2){
				System.out.println(str+" "+count);
			}
			
		}
		
	}

}
