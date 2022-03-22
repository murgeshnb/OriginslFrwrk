package mockpractice;

public class ReverseFirstLast {

	public static void main(String[] args) {
		
		String s="Hi welcome to Nammoru";
		String[] spl = s.split(" ");
		String temp=spl[0];
		spl[0]=spl[spl.length-1];
		spl[spl.length-1]=temp;
		
		for (int i = 0; i < spl.length; i++) {
			System.out.print(spl[i]+" ");
		}

	}

}
