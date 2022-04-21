package april7;

public class CharNextNo {

	public static void main(String[] args) {
		String s="aabbbeecc";
		int count=1;
		for (int i = 0; i < s.length(); i++) {
			try{
				if(s.charAt(i)==s.charAt(i+1))
				{
					count++;
				}
				else{
					System.out.print(s.charAt(i)+""+count);
					count=1;
				}
			}
			catch (Exception e) {
		
			}
		}
		
		if(count==2){
			System.out.print(s.charAt(s.length()-1)+""+count);
		}

	}

}
