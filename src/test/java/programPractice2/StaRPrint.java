package programPractice2;

import java.util.ArrayList;
import java.util.Date;

import org.testng.annotations.Test;

public class StaRPrint {
	@Test
	public void star()
	{
		for (int i = 4; i >=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i<=2; i++) {
			for (int j = 0; j <=i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
