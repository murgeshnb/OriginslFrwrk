package intervwPgms;

class India
{
	India(String s)
	{
		System.out.println(s);
	}
	
}
class Sample extends India
{
	Sample(char c)
	{
		super("hi");
		System.out.println(c);
	}
}

class Doosra extends Sample
{
	Doosra(double y)
	{
		super('a');
		System.out.println(y);
	}
}

class Benglr extends Doosra 
{
	Benglr(int x)
	{
		super(10.50);
		System.out.println(x);
	}
}

public class MainClass 
{
	 public static void main(String[] args) {
		 new Benglr(10);
	}
		
}
