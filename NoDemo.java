package Multithreading;

public class NoDemo extends Thread{

	
	synchronized public void run() {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
		}
	}
}
