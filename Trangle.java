package inheritance;

public class Trangle extends Square {

	
	float side1,side2,side3;
	
	
	Trangle()
	{
		System.out.println("trangle has 3 equal sides....");
		System.out.println("Enter the side1:");
		side1=sc.nextInt();
		System.out.println("Enter the side2:");
		side2=sc.nextInt();
		System.out.println("Enter the side3:");
		side3=sc.nextInt();
	}
	
	void area()
	{
		 area=side1*side2*side3;
	
	}
	
	void disply() {
		System.out.println("area is:"+area);
		
	}
}
