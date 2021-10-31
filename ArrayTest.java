package Array;

import java.util.Scanner;

public class ArrayTest {
	int size,i;
	
	
	int Array[]=new int[5];
	Scanner sc=new Scanner(System.in);
	
	
	void input() {
		
	System.out.println("..........Enter 5 Arrays .....");
    System.out.println("  Enter arrays :");
    
     for (int i=0;i<Array.length;i++) {
    	 
     
     Array[i]=sc.nextInt();
     }
         
	}
	void display() {
		
		System.out.println(" Arrays are:");

	     for (int i=0;i<Array.length;i++) { 
	    	 System.out.println(Array[i]);
	     }
	     
	    	 try {
	    	    	
	    		    
	    	     if(Array[i]==10)
	    	     {
	    	    	 System.out.println(" Array contains value 10..");
	    	     }
	    	     else {
	    	    	 System.out.println(" Array not contain value 10..");
	    	     }
	    	    }catch(ArrayIndexOutOfBoundsException e) {
	    	    	System.out.println( "handle exception.");
	    	    }
	    	      
	     }
		
	
	
	public static void main(String args[]) {
		
		ArrayTest t=new ArrayTest();
		t.input();
		t.display();
	}
}

     
     
	

	

