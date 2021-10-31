package CollectionProgram;

import javax.xml.soap.Node;

public class Singly_Linked_LIst {
	
	
	         Node head;
	         
	         static class Node{
	        	 
				Node next;
	        	 int data;
	        	 
	        	 public Node(int d)
	        	 {
	        		 data=d;
	        		 next=null;
	        		 
	        	 }
	         }

	         
	         public void display() {
	        	 
	        	 Node current=head;
	        	 
	        	 while(current!=null) {
	       
	        		 System.out.println(current.data);
	        		 
	        		 current=current.next;
	         }
	         }
	         
	         
	public static void main(String[] args) {

		Singly_Linked_LIst sl=new Singly_Linked_LIst();
		
		sl.head=new Node(100);
		Node second=new Node(200);
		Node third=new Node(300);
		
		
		sl.head.next=second ;
		second.next=third;
		sl.display();
		
	}

}
