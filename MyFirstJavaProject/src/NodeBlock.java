
public class NodeBlock {
	public int data;
	public NodeBlock next;
	public NodeBlock(int data)
	{
		this.data = data;
		next = null;
	}
}
class LinkedList3
{
	public NodeBlock head;
	public LinkedList3(int data)
	{
		NodeBlock a = new NodeBlock(data);
		head = a;
	}
	public void traversal()
	{
		NodeBlock temp = head; //Temporary pointer point to head
		while(temp!= null)
		{
			System.out.print(temp.data+"\t");
			temp = temp.next;
		}
		System.out.println("");
	}
	//New node before head
	public void insertAtBegining(Node n)
	{
		n.next = head;
		head = n;
	}
	// Insert new node at last 
    public void insertAtLast(Node n)
    {
    	NodeBlock temp = head;
    	while(temp.next!= null)
    	{
    		temp = temp.next;
    	}
    	temp.next = n;
    }
    // function  to insert a node after a node 
    public void InsertNodeAfter(NodeBlock n ,NodeBlock a)
    {
    	n.next = a.next ;
    	a.next = n;
    }
    // function  to delete
    public void del(Node n)
    {
    	NodeBlock temp = head;
    	if(temp== n)
    	{
    		head = n.next;
    	}
    	else
    	{//node to be deleted is not head
    		while(temp!=null)
    		{
    			if(temp.next == n)
    			{
    		    	temp.next = n.next;
    		        break;// Breaking the Loop after deleting the deleting the node  
    		    }
    	     temp = temp.next;		
    	    }	
        } 	
    }
}
class ListMain{
   public static void main(String[]args) {
		LinkedList3 L = new LinkedList3(10);
		NodeBlock a = new NodeBlock(20);
		NodeBlock b = new NodeBlock(50);
		NodeBlock c = new NodeBlock(60);
		
		L.head.next = a;
		a.next = b;
		b.next = c;
		
		L.traversal();
		 NodeBlock z = new NodeBlock(0);
		 L.insertAtBegining(z);
		 z = new NodeBlock(-10);
        L.insertAtBegining(z);
        
        z= new NodeBlock(100);
        L.insertAtLast(z);
        
        z = new NodeBlock(30);
        L.insertAtBegining(z);
        z = new NodeBlock(40);
        L.InsertNodeAfter(z,a.next);
        z= new NodeBlock(50);
		L.InsertNodeAfter(z,a.next.next);
		
		L.traversal();
		L.del(L.head);
		L.del(z);
		L.traversal();

		
	}
}

