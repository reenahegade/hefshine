package Exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args)

 {  int num1,num2,result;
 
      Scanner sc=new Scanner(System.in);
      
     System.out.println("Enter the num1:");
     num1=sc.nextInt();

     System.out.println("Enter the num2:");
     
     num2=sc.nextInt();
     
     
     try {
    	 
     
     result=num1/num2;
     System.out.println("the result is:"+result);
     }
     
     catch(ArithmeticException e) {
    	 System.out.println("INFINITE");
    	 
     }
     
     finally {
     }
     System.out.println("invalid");
     
     }
     
 }
	
       
