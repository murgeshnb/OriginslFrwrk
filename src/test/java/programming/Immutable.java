package programming;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="sachin";
//		s=s.concat("Tendulkar");
		
		String s1="sachin";
		String s2="sachin";
		
		System.out.println(s1+" "+s2);
		
		String s3=new String("java");
		String s4=new String("java");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));

	}

}
