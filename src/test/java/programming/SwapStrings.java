package programming;

public class SwapStrings {

	public static void main(String[] args) {
		
//		String s1="javaJung";
//		String s2="mava";
//		
//		s1=s1+s2;
//		s2=s1.substring(0, s1.length()-s2.length());
//		s1=s1.substring(s2.length());
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
//		String s1="javaJung";
//		String s2="mava";
//		s1=s1+s2;
//		s2=s1.substring(0,s1.length()-s2.length());
//		s1=s1.substring(s2.length());
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
		String s1="RCb bengaluru";
		String s2="India	 	 	";
		s1=s1+s2;
		
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		
		
	

	}

}
