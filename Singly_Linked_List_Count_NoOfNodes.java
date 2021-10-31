

	package CollectionProgram;

	import CollectionProgram.Singly_Linked_LIst.Node;

	public class Singly_Linked_List_Count_NoOfNodes {
		
		
	    static class Node{
	   	 
			Node next;
	   	    int data;
	   	 
	   	 public Node(int d)
	   	   {
	   		 data=d;
	   		 next=null;
	   		 
	    	 }
	    }
	    
	    
	    

		Node head=null;
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
	    
	    
	    
	    public int CountNodes(){
	    	
	    	int count=0;
	    	
	    	Node current=head;
	    	
	    	while(current!=null)
	    	{
	    		count++;
	    		current=current.next;
	    	}
	    	
	    	return count;
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

			Singly_Linked_List_Count_NoOfNodes  list=new Singly_Linked_List_Count_NoOfNodes ();
			
			list.addNode(1);
			list.addNode(2);
			list.addNode(3);
			list.addNode(4);
			list.addNode(5);
			
			list.display_Nodes();
			
			
			System.out.println("Nodes Present In List:");
			System.out.println(list.CountNodes());
			
		}

	
	}

