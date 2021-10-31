package Exception;

import java.util.Scanner;

public class Finally {

	
	int A[]=new int[5];
	int i;
	

	   Scanner sc=new Scanner(System.in);
	
	void method1() {
		
        System.out.println(" how many elements you have to be entered....:");
		
		A[i]=sc.nextInt();

		System.out.println(" Enter the array element1:");
		
		A[1]=sc.nextInt();
		
        System.out.println(" Enter the array element2:");
		
		A[2]=sc.nextInt();
		
        System.out.println(" Enter the array element3:");
		
		A[3]=sc.nextInt();
		
        System.out.println(" Enter the array element4:");
		
		A[4]=sc.nextInt();
		
        System.out.println(" Enter the array element5:");
		
		A[5]=sc.nextInt();
		
			
			try {

				for(A[i]=0;A[i]<=5;A[i]++) {

				System.out.println("right number entered...");
				}
				
			}
			
			catch(ArrayIndexOutOfBoundsException e){

				System.out.println("Wrong number...");
				
				   
			}
			
			finally {
				
				

				System.out.println("array elements are:"+A[i]);
				
			}
		}
	
	public static void main(String args[]) {
		
		Finally f=new Finally();
		f.method1();
		
	}
	
}
