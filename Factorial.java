package Basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		int i,fact=1,no;
		Scanner sc=new Scanner (System .in);

		System.out.println("enter the no:");
		no=sc.nextInt();
		
		for(i=1;i<no;i++)
		{
			int result=fact*i;
			

			System.out.print("factorial of "+no +" is:"+result+",");
			
			
		}
		

	}

}
