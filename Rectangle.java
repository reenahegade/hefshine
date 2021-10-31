package inheritance;

public class Rectangle extends Square{

    float area;
    
	int l,b;
	
	Rectangle()
	{
		System.out.println("rectangle has length and breadth are two equal sides....");
		System.out.println("Enter the length:");
	    l=sc.nextInt();
		System.out.println("Enter the breadth:");
		b=sc.nextInt();	}
	
	void area()
	{
		area=l*b;
		
	}
  
	void display() {
		System.out.println("area is:"+area);
		
	}}

