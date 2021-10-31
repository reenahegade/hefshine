import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =new Scanner(System.in);
	    int year;
	    System.out.println("Enter year:");
	    year=sc.nextInt();
	    
	    if(year% 4==0)
	    {
	    	System.out.println("it is leap year...");
	    	System.out.println(year  +  "it has 365 days in it thats why is a leap year...:");
	    }
	    else {
	    	System.out.println("it is ordinary year..");
	    	System.out.println(year  +  "it has 366 days thats why is a not leap year");
	    }
	}

}
