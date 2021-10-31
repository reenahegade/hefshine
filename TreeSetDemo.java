package Collection;

import java.util.TreeSet;

public class TreeSetDemo {
	
	void treeset() {
		
		TreeSet ts=new TreeSet();
		

		ts.add("hii");
		ts.add("haans");
		ts.add("boll");
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());
		System.out.println(ts.higher("boll"));
		System.out.println(ts.iterator());
	}
	

	public static void main(String[] args) {
	
		TreeSetDemo t1=new TreeSetDemo();
		t1.treeset();
		
	}

}
