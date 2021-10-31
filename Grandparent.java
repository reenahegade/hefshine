package inheritance;

import java.util.Scanner;

public class Grandparent {
	
	
	int age,noOfChild;
	String name;
	

    Scanner sc=new Scanner(System.in);
	
      Grandparent(){
    	  

    		 System.out.println(".............Grandparent........ :");
	 System.out.println("Enter the name :");  
	 name=sc.nextLine();

	 System.out.println("Enter the Age :");

	 age=sc.nextInt();

	 System.out.println("Enter no of child:");
	 noOfChild=sc.nextInt();

 }
      void display() {
    	  

    		 
	 System.out.println("the name :"+name); 

	 System.out.println(" the Age :"+age);


	 System.out.println(" no of child:"+noOfChild);
	 

    	  
      }
      
      public static void main(String args[]) {
    	  
    	  
    	  Grandparent g=new Grandparent();
    	  g.display();
    	  
      }
}
