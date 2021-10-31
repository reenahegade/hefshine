package Methos;

import java.util.Scanner;

public class Organizatin {
	
	
	int salary,id,totalsalary;
	Scanner sc=new Scanner(System.in);
	
	void input()
	{
		 String name;
		
		System.out.println(" Enter the id of employee");
		id=sc.nextInt();
		
		System.out.println("Enter the salary:");
		salary=sc.nextInt();
		
		
		
	}

	void calculate() {
		int no=135;
		totalsalary=(no/100)*salary;
	}
	
	void calculate1()
	{
		int no1=15;
		totalsalary=(no1/100)*salary;
		
	}
	void display()
	{
		
		System.out.println("the id is:"+id);
		System.out.println("salary is:"+salary);
		System.out.println("total salary is:"+totalsalary);
		
		
	}
}
