package Multithreading;

public class NoDemoMain {

	public static void main(String[] args) {
      
		System.out.println("Alphabets from a to z Are : ");
		AlphabetDemo ad=new AlphabetDemo();
		Thread t1=new Thread(ad);
		t1.setName("Tread1");
		t1.start();
	
		NoDemo nd=new NoDemo();
		Thread t=new Thread(nd);
		t.setName("Tread2");
		t.start();
	}
}

