package Constructor;

import java.util.Scanner;

public class Department {
	
   String	deptName, HODName;
   Scanner sc=new Scanner(System.in);
    
   Department(){
    	


	   
	   System.out.println("Enter the department name:");
	   deptName=sc.nextLine();
	   
	   System.out.println("Enter the HODname:");
	   HODName=sc.nextLine();
	   
	   
	   
   }
    void show_department_details() {
    
    	System.out.println("Department name is:"+deptName);
    	System.out.println("HOD Name is:"+HODName);
    }
 
    public static void main(String args[]) {
  
    	
    	Department d=new Department();
    	d.show_department_details();
    	
    	StaffMember m=new StaffMember();
    	m.Staff_Detail();
    	
    	
    }
}
