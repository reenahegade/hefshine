package Methos;

import java.util.Scanner;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop obj=new Laptop();
		
		
		System.out.println("       WELCOME             ");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1.add");
		System.out.println("2.substract");
		System.out.println("3.multiply");
		System.out.println("4.Quet");
		
		System.out.println("ENTER YOUR CHOICE: ");
		int ch=sc.nextInt();
		int choice;
		for( ch=1;ch>4;ch++) {
			
		}
		if(ch==1) {
			obj.add();
		}
		else if(ch==2) {
			obj.substract();
			
		}
		else if(ch==3) {
			obj.multiply();
			
		}else
		{
			obj.quet();
			
		}
		

	}

}
