package String;

import java.util.Scanner;

public class TwoDArray {

	int i,j;
	Scanner sc=new Scanner(System.in);
	
	 	System.out.println("Enter the Size : ");
	 	int size=sc.nextInt();
	 	

	 	System.out.println("Enter the Array 1 : ");
	 	int a= sc.nextInt();
	 	int A1[][]=new int[size][size]; 	

	 	System.out.println("Enter the Array 2 : ");
	 	int b= sc.nextInt();
	 	
	 	int A2[][]=new int[size][size];
	 	
 	void sum() {
 		
 	    for(i=0;i<A1.length;i++) {

 	 	    for(j=0;j<A2.length;j++) {
 	    

 	 	int sum[][]=new int[i][j];
 	 	sum[i][j]=A1[i][j]+A2[i][j];
 	 	
 	}}}
 	public static void main(String args[]) {
 		TwoDArray t=new TwoDArray();

 		t.sum();
 	}
 	}
 	
 	
 	
 
