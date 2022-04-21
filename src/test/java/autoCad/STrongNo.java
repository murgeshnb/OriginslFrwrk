package autoCad;

public class STrongNo {

	public static void main(String[] args) {
		int no=145;
		int copy=no;
		int total=0;
		
		while(no!=0){
			total=total+fact(no%10);
			System.out.println(total);
			no=no/10;
		}
		if(copy==total){
			System.out.println("Strong no "+copy);
		}else{
			System.out.println("Not a strong "+copy);
		}

	}
	
	public static int fact(int rem)
	{
		int no=rem;
		int fact=1;
		for (int i = no; i>1; i--) {
			fact=fact*i;
		}
		return fact;
	
	}

}
