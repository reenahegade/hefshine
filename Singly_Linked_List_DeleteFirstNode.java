

package CollectionProgram;

import CollectionProgram.Singly_Linked_LIst.Node;
public class Singly_Linked_List_DeleteFirstNode  {
	
	
    static class Node{
   	 
		Node next;
   	    int data;
   	 
   	 public Node(int d)
   	   {
   		 data=d;
   		 next=null;
   		 
    	 }
    }
    
    
    

	static Node head=null;
	Node tail=null;

    public void addNode(int data)
    {
       Node node=new Node(data);
       

	   if(head==null)  //check list empty
       {
    	  head=node;    //head & tail points to new node
    	  tail=node;
    	   
       }
	   else {
		   tail.next=node;     //
		   tail=node;
		   
	   }
       
    
    }
    
    
    
    public void DeleteFirstNode() {
    	
    	if (head==null) {                         //empty list
    		System.out.println("list is empty...");
    	}
    	else {
    		
    		if(head!=tail) {     //list has nodes
    			
    			head=head.next;
    		}
    		else {
    			head=tail=null;    //list has only 1 node 
    			
    		}
    	}
    	
    	
    }
    
    
    public void display_Nodes() {
   	      
    	Node current=head;
    	
           
           while(current!=null)
           {
        	   System.out.println("Node-"+current.data+"\n");   
        	   
        	   current=current.next;
        	   
           }
        
    }
    

	public static void main(String[] args) {

		Singly_Linked_List_DeleteFirstNode   list=new Singly_Linked_List_DeleteFirstNode ();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		list.display_Nodes();
		
		
		while(head!=null) {
			
		
			list.DeleteFirstNode();
			list.display_Nodes();
		}
	}

}
