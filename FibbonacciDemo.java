package Multithreading;

public class FibbonacciDemo implements Runnable{

	  synchronized  public void run() {
	    	
	    	int no1=0,no2=1,sum;
	    	
	    	for(no2=0;no2<10;no2++)
	    	{
	    		sum=no1+no2;
	    		sum=no2+sum;
	    		System.out.println("Fibbonnacci Series is : "+sum);
               	    		
	    	}
	    	
	    }
	
	
}
