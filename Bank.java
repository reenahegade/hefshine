package Constructor;

public class Bank {

	 int total;
	 int amount=5000;
	 
	  Bank()
	 {
		 
		  
			 System.out.println("No amount will be added to the account");
		 
	 }
	 
	 public Bank(int dep)
         {
		 
         
		 System.out.println("add deposite :"+dep);
		 
		 
		 total=amount+dep;
		 System.out.println("the deposited amount is:"+total);
		 }
	 
	 int display()
	 {
		 System.out.println(" total amount is:"+total);
		 return total;
	 }
	 
}
		 
	 

