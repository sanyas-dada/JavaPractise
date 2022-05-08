
public class Node1 {
    public int data;
	public Node1 next ;
	
	public Node1(int data) {
		this.data = data;
		this.next = null;
	}
}
class CircularLinkedList {
	public Node1 last;
	public CircularLinkedList(int data) {
		Node1 z = new Node1(data);
		z.next = z;
		this.last = z;
	}
	public void traversal() {
		Node1 temp = this.last;
		System.out.println(temp.data + "\t");
		temp =temp.next;
		while(temp !=this.last) {
			System.out.println(temp.data + "\t");
		}
	  }
	public void InsertAfter( Node1 n ,Node1 a) {
		n.next = a.next;
		a.next = n;
	}
	public void InsertAtLast( Node1 n) {
		n.next = this.last.next;
		this.last.next =n;
		this.last = n;
	}
	public void Delete(Node1 n) {
		Node1 temp = this.last;
		while(temp.next != n) {
			temp = temp.next;
		}
		if(n== this.last) {
			//last node1
			if(n.next == n) {
				this.last = null;
			}
			else {
				temp.next = n.next;
				this.last = temp;
			}
		}
		else {//not last Node
			temp.next = n.next;
		}
	}
}
class CircularMain{
	public static void main(String[] args)
	{
	   CircularLinkedList l = new CircularLinkedList(10);
	   Node1  a = new Node1(20);
	   Node1  b = new Node1(30);
	   Node1  c = new Node1(40);
	   
	   l.last.next = a;
	   a.next = b;
	   b.next = c;
	   c.next = l.last;
	   
	   l.traversal();
	   
	    Node1 z = new Node1(50);
	    l.InsertAfter(z, c);
	    z = new Node1(25);
	    l.InsertAfter(z, a);
	    z = new Node1(100);
	    l.InsertAtLast(z);
	    
	    l.traversal();
	    l.Delete(l.last);
	    l.Delete(b);
	    l.toString();	    
	   
	}
}
	   