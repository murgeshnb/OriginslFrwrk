package april11;

import org.testng.annotations.Test;

public class StaR {
	
//	@Test
//	public void printing(){
//		for (int i = 4; i >=1; i--) {
//			for (int j = i; j < 4; j++) {
//				System.out.print(" ");
//			}
//			for (int j = i; j >=1; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	
//	@Test
//	public void rightAngle(){
//		for (int i = 0; i <=3; i++) {
//			for (int j = 0; j <=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	@Test
	public void belowAngle(){
		for (int i = 0; i <=3; i++) {
			for (int j = i; j >0; j--) {
				System.out.print(" ");
			}
			for (int k = i; k <4; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
