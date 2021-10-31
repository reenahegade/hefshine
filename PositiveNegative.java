import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no;
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter a the no:");
		   no=sc.nextInt();
		   
		   if(no <0)
		   {
			   System.out.println("Negative no...........");
		
		   }
		   else if(no >0)
		   {
			   System.out.println("Positive no..........");
		   }
		   else if(no==0)
		   {
			   System.out.println("no is zeo............");
		   }
		   else {
			   System.out.println("wrong no:");
		   }
	}

}
