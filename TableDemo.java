package Multithreading;

     public class TableDemo implements Runnable{
     
	int no=5;
	
	synchronized public void run() {
		
		 System.out.println("Table of 5 is :");
		 for(int i=1;i<=10;i++)
		 {
			int table=no*i;
			 System.out.println(table);
		 }
		
	}
}
