
public class Node{
	public int data;
	public Node next;
	public Node prev;
	
	public Node(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
    
} 
class LinkedList{
	public Node head;
	
	public LinkedList(int data) {
		Node a = new Node(data);
		head = a;
	}
    public void traversal()
	{
		Node temp = head;// temporary pointer to point to head
		while(temp!= null) {
			System.out.print(temp.data+"\t");
			temp = temp.next;	
		}
		System.out.println("");
		
	}
	// new node before head
	public void InsertAtFront(Node n) {
		n.next = head;
		head.prev = n;
		head = n;
	}
	// Insert new node at last
	public void InsertAtTail(Node n) {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}	
	   temp.next = n;
	   n.prev = temp;
	}
	// function to insert a node after a node
	public void InsertAfter(Node n,Node a) {
		n.next = a.next;
		a.next.prev = n;
		a.next = n;
		a.prev = a;
	}
	// Function to delete
	public void del(Node a ) {
		if(a.prev !=null) {
			//node is not head
			a.prev.next = a.next;
		}
		else {
	          //node is a head
			head = a.next;
		}
		if(a.next !=null) {
			a.next.prev = a.prev;
		}
			
	}
	
}
class List1{
	public static void main(String []args) {
		LinkedList l = new LinkedList(10);
		Node a= new Node(20);
		Node b = new Node(50);
		Node c = new Node(60);
		
		// connecting to linked list
        /*
          _____       _____       _____       _____
         |Head |---> | a   |---> | b   |---> |  c  | ---> NULL
         |     |     |     |     |     |     |     |
         |     |     |     |     |     |     |     |
         |_____|     |_____|     |____ |     |_____|
           
        */
	
	   l.head.next = a;
	   a.next = b;
	   b.next =c;
	   l.traversal();
	   Node z = new Node(0);
	   l.InsertAtFront(z);
	   z = new Node(-10);
	   l.InsertAtFront(z);
	   
	   z = new Node (100);
	   l.InsertAtTail(z);
	   
	   z = new Node(30);
	   l.InsertAfter(z, a);;
	   z = new Node(40);
	   l.InsertAfter(z, a.next);
	   z = new Node(500);
	   l.InsertAfter(z, z.next.next);
	   
	   l.traversal();
	   
	   l.del(l.head);
	   l.del(z);;
	   l.traversal();
	   
	}
}
