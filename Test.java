package Multithreading;

public class Test extends Thread{

	  public void run() {
		  
		  for(int i=0;i<5;i++) {
			  System.out.println("thread running...");
			  System.out.println(Thread.currentThread().getName());
			  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		  }
	  }
       public static void main (String[] args ) {
    	   
    	   Test thread=new Test();
    	   thread.setName("Thread1");
    	   thread.start();

 		  for(int i=0;i<5;i++) {
 			  System.out.println("Main thread running...");
 			  System.out.println(Thread.currentThread().getName());
 			  
 		  }
       }
}
