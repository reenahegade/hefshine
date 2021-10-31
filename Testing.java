package Multithreading;

public class Testing extends Thread{
	

	  private char[] isDeamon;

	public void run() {
		  
		  for(int i=0;i<5;i++) {
			  System.out.println("thread running...");
			  System.out.println(Thread.currentThread().getName());
		  }}

	public static void main(String[] args) {


 	   Testing  t1=new Testing();
 	   t1.setName("Thread1");
 	   t1.start();
			  
			  for(int i=0;i<5;i++) {
				  System.out.println(" main thread running...");
				  System.out.println(Thread.currentThread().getName());
		          System.out.println(t1.isDeamon);

	}}}


