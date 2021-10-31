package Array;

import java.util.Scanner;

public class Matrix {
	int row,colm;
	
    int  Matrix[][]=new int[row][colm];
	
	Scanner sc=new Scanner(System.in);
	
    void getData() {
	  
	 System.out.println(" Enter the row value:");
	 row=sc.nextInt();
	 

	 System.out.println(" Enter the coulum:");
	 colm=sc.nextInt();
	 
	 try {
	 System.out.print("Enter the Matrix elements: ");
	 
     for(int i=0;i<row;i++) {
	  
	  for(int j=0;j<colm;j++)  
	  {
	 
	      Matrix[i][j]=sc.nextInt();
	    }
	  }
	  }catch(ArrayIndexOutOfBoundsException e) {
		  
	  }
	 display();
		  
  }

	 void display() {
		 
		  for(int i=0;i<row;i++) {
			  for(int j=0;j<colm;j++)  
			  {
    	 System.out.println("Matrix is:"+Matrix[i][j]+" ");
			  }}
	 }
	public static void main(String args[]) {
		
		Matrix m=new Matrix();
		m.getData();
		
		
	}

}
