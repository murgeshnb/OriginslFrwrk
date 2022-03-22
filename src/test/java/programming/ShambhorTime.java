package programming;

public class ShambhorTime {
	static int count=1;
	
	public static void run(String s){
		
		if(count<100)
		{
			System.out.println(s);
			count++;
			run(s);
	
		}
	}

	public static void main(String[] args) {
		run("Salaga");
		System.out.println(count);	
	
	}

}
