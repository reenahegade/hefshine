package Constructor;

import java.util.Scanner;

public class Salary {
	
	float basicsal,special_Allowance,hra;
	
	Scanner sc=new Scanner(System.in);
	  
	
	Salary(){
		System.out.println("Enter the basic salary:");
		basicsal=sc.nextFloat();
		
		System.out.println("Enter the special allowance:");
		special_Allowance=sc.nextFloat();
		
		System.out.println("Enter the hra:");
		hra=sc.nextFloat();
		
	}

	void calculateSalary() {
		float salary;
		
		salary=basicsal+(basicsal*special_Allowance/100)+(basicsal*hra/100);
		

		System.out.println(" the salary is:"+salary);
		
	}
	
	void display() {
		System.out.println(" the basic salary is :"+basicsal);
		
		
		System.out.println(" the special allowance:"+special_Allowance);
	
		
		System.out.println("the hra:"+hra);
		
		
		
		
		
		
		
		
	}
	
	public static void main(String args[])
	{
		Salary s=new Salary();
		s.display();
		s.calculateSalary();
		
	}
}
