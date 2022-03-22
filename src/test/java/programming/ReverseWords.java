package programming;

public class ReverseWords {

	public static void main(String[] args) {
		String s="EE sala cup namde";
		String[] spl = s.split(" ");
		for(int i=spl.length-1;i>=0;i--)
		{
			System.out.print(spl[i]+" ");
		}
	}

}
