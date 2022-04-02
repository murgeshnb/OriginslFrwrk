package intervwPgms;

import org.testng.annotations.Test;

public class ThSuperC {
	ThSuperC(double d)
	{
		System.out.println(d);
	}
	
	ThSuperC(int x)
	{
		this(10.50);
		System.out.println(x);
	}
	
	ThSuperC(char c)
	{
		this(10);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		new ThSuperC('a');
	}

}


