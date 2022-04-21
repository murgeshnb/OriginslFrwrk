package cignetSoln;

public class RightAngle {

	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = i+1; j < 4; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >=0 ; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}



