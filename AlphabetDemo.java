package Multithreading;

public class AlphabetDemo extends Thread{

	
synchronized public void run() {
		
		for(char i='a';i<='z';i++) {
			
			System.out.println(i);
		}
	}
}
