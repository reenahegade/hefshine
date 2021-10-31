package Collection;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	
	void vectorSet() {
		
		Vector v=new Vector();
		
		//add method
		v.add("reena");
		v.add("priya");
		v.add("arati");
		v.add("smita");
		
		
		//addElements
		v.addElement("yogini");
		v.addElement("pooja");
		
		
		
		System.out.println(v);
		
		
		if(v.contains("smita"))
		{	System.out.println("present  ");
		
		}else
		{	System.out.println("not present ");
		
		}
	}
	
   
	

	public static void main(String[] args) {
       
		VectorDemo vs=new VectorDemo();
		
		vs.vectorSet();
		
}}
