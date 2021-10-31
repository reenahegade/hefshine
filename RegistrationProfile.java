package Exception;

import java.util.Scanner;

public class RegistrationProfile {
	
	int age,mobno;
	String Name,country;
	
	Scanner sc=new Scanner(System.in);
	
	void input() {
		System.out.println("Enter the name: ");
		Name=sc.next();
		
		System.out.println("Enter the Country name: ");
		country=sc.next();
		
		System.out.println("Enter the age: ");
		age=sc.nextInt();
        

		System.out.println("Enter the MOBILE NO: ");
		mobno=sc.nextInt();
		
		try {
			if(country.equalsIgnoreCase("india")==false)
			{
				throw new InvalidCountryNameException("Invalid");
				

				System.out.println("you are not eligeble...");
			}
			else {
				System.out.println("invalid country..");
			}
		}catch(InvalidCountryNameException e ) {
			
			
			System.out.println("Country name should be india....");
			
		}
		
		finally {

			System.out.println("Registration successfull...........: ");
		}
	}
	
	void display() {
		

		System.out.println("the Name is : "+Name);
		

		System.out.println("the country is : "+country);

		System.out.println("the age is : "+age);
		

		System.out.println("the mobile no is : "+mobno);
	}
	
	public static void main(String args[]) {
		
		RegistrationProfile r=new RegistrationProfile();
		r.input();
		r.display();
		
	}

}
