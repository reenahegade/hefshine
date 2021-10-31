package Basic;

public class FibbonacciSeries {

	public static void main(String[] args) {

		int t1=0,t2=1,n=10;
		
		System.out.println("fibbonnaci series is : ");

		System.out.println(t1);
		System.out.println(t2);
		
		for(int i=0;i<n;i++)
		{
			int sum=t1=t2;
			t2=sum;
			sum=t1;
			System.out.println(sum);
		}
		
		
		
		
	}

}
