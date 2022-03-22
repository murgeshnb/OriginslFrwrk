package mockPractice2;

import java.util.Date;

public class SeparateCharac {

	public static void main(String[] args) 
	{
		Date d=new Date();
		String crntd = d.toString();
		System.out.println(crntd);
		String[] dts = crntd.split(" ");
		String yyyy = dts[5];
		String mm = dts[1];
		String dd = dts[2];
		
		System.out.println(dd+"-"+mm+"-"+yyyy);
	}

}
