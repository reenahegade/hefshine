package Methos;

import java.util.Scanner;

public class OrganizationMain {

	public static void main(String[] args) {
	Organizatin obj=new Organizatin();
	Scanner sc=new Scanner(System.in);
	
	obj.input();
	int year ;
	System.out.println("enter the year of service:");
	year=sc.nextInt();
	
	
	if(year >=5) {
		obj.calculate();
	}
	else
	{
		obj.calculate1();
	}
	
	
	obj.display();
	
	}

}
