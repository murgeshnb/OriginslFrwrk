package practice;

 class Pen{
	
	public Pen() {
	}
	
	 static void m(){
		System.out.println("Bengaluru");
	}

}
 
 class Runner1 extends Pen{
	  static void m(){
		 System.out.println("Googly");
	 }
 }

public class Runner2
{
	public static void main(String[] args) {
		Runner1 r1=new Runner1();
		r1.m();
		
	}
}
