package programPractice2;

import org.testng.annotations.Test;

public class MaxLength {
	@Test
	public void maxii()
	{
		String[] str={"hi","virat","welcome","to","Bengaluru"};
		int maxlength=0;
		for (int i = 0; i < str.length; i++) {
			if(str[i].length()>maxlength)
			{
				maxlength=str[i].length();
			}
		}
		System.out.println(maxlength);
	}

}
