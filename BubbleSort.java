package SortTechniques;

import java.util.Scanner;

public class BubbleSort {

	
    int  bubble[]=new int[10];
	
	Scanner sc=new Scanner(System.in);
	
    void getData() {
	  
	 System.out.println(" Enter the values:");
	 int values=sc.nextInt();
    }
	 
	 void bubbleSort() {
		 
		   for(int i=0;i<bubble.length;i++) {
			   
			   for(int j=0;j<bubble.length;j++) {
				   if(bubble[i]>bubble[j]) {
					   System.out.println(bubble[i]);
				   }else {
					   System.out.println(bubble[j]);
				   }
			   }
		   }}
			void display() {

				   for(int i=0;i<bubble.length;i++) {
					   
					   for(int j=0;j<bubble.length;j++) {
						   bubbleSort();
						   
					   }
				   }
			
			}}
	 
	 
    
