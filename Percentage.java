import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float sub1,sub2,sub3,sub4,sub5;
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks of five subjects:");
		System.out.println("subject1:");
		sub1=sc.nextFloat();
		
		System.out.println("subject2:");
		sub2=sc.nextFloat();
		
		System.out.println("subject3:");
		sub3=sc.nextFloat();
		
		System.out.println("subject4:");
		sub4=sc.nextFloat();
		
		System.out.println("subject5:");
		sub5=sc.nextFloat();
		
		float sum=(int) (sub1+sub2+sub3+sub4+sub5);
		float percentage=(sum/5)%100;
		
		if(percentage >=90)
		{
			System.out.println("Gade A:");
			
		}
		else if(percentage >=80) {
			System.out.println("Gade B:");
		}
		else if(percentage >=70)
		{
			System.out.println("Gade c:");
		}
		else if(percentage >=60)
		{
			System.out.println("Gade D:");
			
		}
		else if(percentage >=50)
		{
			System.out.println("Gade E:");
		}
		else if(percentage >=40)
		{
			System.out.println("Gade F:");
		}
		else {
			System.out.println("fail student");
		}
		
		
		
	}

}
