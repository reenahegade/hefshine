package Constructor;

public class StaffMember extends Department {
  
	String memberName,Qualification;
	
	StaffMember(){
		
		
		System.out.println("Enter the member name :");
		memberName=sc.nextLine();
		
		System.out.println("Enter the Qualification of member");
		 Qualification=sc.nextLine();
		 
	}
	
	 void Staff_Detail(){
		
		 

	    	System.out.println("Member name is:"+memberName);
	    	System.out.println("Qualification is:"+Qualification);
	}
}
