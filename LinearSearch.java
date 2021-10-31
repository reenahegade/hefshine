package Searching;

import java.util.Scanner;

public class LinearSearch {
	
	void linear() {
	Scanner sc=new Scanner(System.in);
	

	System.out.println("Enter no of elements :");
	int n=sc.nextInt();

	
	System.out.println("Enter the elements :");
	for (int e=0;e<n;e++) {
	int elements=sc.nextInt();
	
	}
	int array[]=new int[n];
	
	System.out.println("enter search element :");
	int search=sc.nextInt();
	
	
	
	for (int e=0;e<n;e++){
		
		if(search==array[e]) {
			System.out.println("element present at");
			break;
		}
		else
		{
			System.out.println("elements absent..");
		}
		
	}
	}

	public static void main(String[] args) {
  
	LinearSearch ls=new LinearSearch();
	ls.linear();
		
	}

}
