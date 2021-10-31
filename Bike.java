package inheritance;

import java.util.Scanner;

public class Bike extends Vehicle{

	Scanner sc=new Scanner(System.in);
	int discountRate;
	 Bike()
	 {
		 System.out.println("bike starts with keek..starts.");
		 
	 }
		 void input() {
			 System.out.println(" Enter discount rate:");
			 discountRate=sc.nextInt();
			 
		 }
		 
		 void display() {
			 
			 System.out.println("discountRate is:"+discountRate);
			 
		 
			 
		 }
			 
		 }
	 

