package inheritance;

import java.util.Scanner;

public class Square {
	
	Scanner sc=new Scanner(System.in);
	
    
	float area;
	int side;
	
	Square()
	{
		System.out.println(" square has 4 sides.....");
		System.out.println("Enter the side:");
		side=sc.nextInt();
	}
	 void area()
	 {
		  area =side*4;
		 
		 			
		}
	 void display() {
		 System.out.println("area of square is:"+area);
		 
	}
}
