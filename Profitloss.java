import java.util.Scanner;

public class Profitloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
	
		
		double cp,sp,profit,loss;
		System.out.println("Enter the Cost price of a product:");
		cp=sc.nextDouble();
		

		System.out.println("Enter the selling price of a product:");
		sp=sc.nextDouble();
		
		profit=((sp-cp)*100)/cp;
		loss=((cp-sp)*100)/cp;
		
		if(sp > cp) {
		System.out.println("The profit is:"+profit);
		
	}
		else
		{
			System.out.println("the loss is:"+loss);
		}
	}
}


