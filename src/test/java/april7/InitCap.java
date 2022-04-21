package april7;

public class InitCap {

	public static void main(String[] args) {
		String s="welcome to tyss";
		
		char first = (char)(s.charAt(0)-32);
		System.out.print(first);
		
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)==' '){
				System.out.print(" "+(char)(s.charAt(i+1)-32));
				i++;
			}else{
				System.out.print(s.charAt(i));
			}
		}

	}

}
