package Arithmatic;

import java.util.Scanner;

public class Division {
	
	Scanner sc=new Scanner(System.in);
	
	int result, num1,num2;

	interface I{
		public abstract void show();
		public static final int i=10;
		
	}
	
	void show()
	{
		System.out.println("....Division.....");
		System.out.println(result);
		
	}
	
	void calculate()
	{
		result=num1/num2;
		
	}
	
	void input() {
		System.out.println("Enter the num1:");
		num1 =sc.nextInt();	
		System.out.println("Enter the num2:");
		num2=sc.nextInt();
	}
	
	
	public static void main(String args[]) {
		
		Division a=new Division();
		a.input();
		a.calculate();
		a.show();
		
	}
}
