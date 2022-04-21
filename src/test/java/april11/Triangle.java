package april11;

import org.testng.annotations.Test;

public class Triangle {
	@Test
	public void traing(){
		for (int i = 3; i >=0; i--) {
			for (int j = i; j >0; j--) {
				System.out.print(" ");
			}
			for (int j = i; j <4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
