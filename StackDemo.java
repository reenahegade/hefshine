package Collection;

import java.util.Stack;

public class StackDemo {
	
	
	void stack() {
		Stack s=new Stack();
		
		s.add("kajal");
		s.add("hina");
		System.out.println("stack is:"+ s);
		
		s.push("damini");
		System.out.println("stack is:"+ s);
		s.capacity();
		System.out.println(s.capacity());
		
		System.out.println(s.clone());
		
		System.out.println(s.firstElement());
		
	}

	public static void main(String[] args) {

		
		StackDemo sd=new StackDemo();
		sd.stack();
		
	}

}
