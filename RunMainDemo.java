package Multithreading;

public class RunMainDemo {

	public static void main(String[] args) {

	    RunDemo r=new RunDemo();
		Thread thread=new Thread(r);
		thread.setName("Thread1");
		thread.start();
		
		TableDemo t=new TableDemo();
		Thread thread1=new Thread(t);
		thread1.setName("Thread2");
		thread1.start();
		
		FibbonacciDemo f=new FibbonacciDemo();
		Thread thread2=new Thread(r);
		thread2.setName("Thread3");
		thread2.start();
		
		
		
		
		
		
	}

}
