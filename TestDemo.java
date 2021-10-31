
package Collection;
import java.util.ArrayList;
import java.util.LinkedList;
public class TestDemo {

		
		void arraylistDemo() {
			
			ArrayList al=new ArrayList();
		    
		     al.add(12);
		     al.add("reena");
		     al.add(456.32);
		     al.add('x');
		     System.out.println("Array List- "+al);
		    
		}
		

		void linkedlistDemo() {
			
			LinkedList al=new LinkedList();
		    

		     al.add(45);
		     al.add("priya");
		     al.add(12.32);
		     al.add('k');
		     System.out.println("Linked List-"  +al);
		}
		public static void main(String args[]) {
			TestDemo t=new TestDemo();
			t.arraylistDemo();
			t.linkedlistDemo();
		}
}
