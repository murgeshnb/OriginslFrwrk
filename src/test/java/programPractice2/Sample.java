package programPractice2;
public class Sample 
{
	static{
		System.out.println("p");
	}
	static{
		System.out.println("r");
	}
	static{
		System.out.println("q");
	}
	{
		System.out.println("Non static 2");
	}
	{
		System.out.println("Non static 1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		new Sample();
	}
	
}
