package inheritance;

import java.util.Scanner;

public class Vehicle {

	
	Scanner sc=new Scanner(System.in);
	
	 char vName;
	 int model_no;
     int price;
     int serviceStationNumber;
     

 	    
           void input() {
    	 
    	 Scanner sc=new Scanner(System.in);
    	 
    	 System.out.println("Enter the name of vehicle:");
    	 System.out.println("Enter model no:");
    	 model_no=sc.nextInt();
    	 System.out.println("Enter price:");
    	 price=sc.nextInt();
    	 System.out.println("Servise station number:);");
    	 
    	 serviceStationNumber=sc.nextInt();
    	 
    	 
     }
     
     void display()
     {

    	 System.out.println("the name of vehicle is "+vName);
    	 System.out.println(" model no is "+model_no);
    	 
    	 System.out.println(" price is "+price);
    	 
    	 System.out.println("Servise station number"+serviceStationNumber);
    	 
    	 
    	 
     
     
     
}
}
