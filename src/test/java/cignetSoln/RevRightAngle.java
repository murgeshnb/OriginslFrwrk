package cignetSoln;

public class RevRightAngle {

	public static void main(String[] args) {
		for (int i = 3; i >=0; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print(" ");
			}
			for (int j = i; j <4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
