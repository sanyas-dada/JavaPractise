
class Node3{
	public int data;
	public Node3 next;
	public Node3(int data) {
		this.data = data;
		next = null;
	}
}
public class Stack2 {
	public Node3 head;
	public Node3 top;
	public Stack2() {
		head = null;
		top = null;
	}
	public void traversal() {
		Node3 temp = this.head;
		while(temp !=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("");
	}
	public boolean isEmpty() {
		if(this.top == null)
			return true;
		return false;
		
	}
	public void push(Node3 n) {
		if(this.isEmpty()) {
			this.head = n;
			this.top = n;
		}
		else {
			this.top.next = n;
			this.top = n;
		}
	}
	public int pop(){
		if(this.isEmpty()) {
			System.out.println("Stack is underflow\n");
			return -1000;
		}
		else {
			int x = this.top.data;
			if(this.head == this.top) {
				// only one node
				this.top = null;
				this.head = null;
			}
			 else {
					Node3 temp = this.head;
					while(temp.next != this.top)
						temp = temp.next;
					temp.next = null;
					this.top = temp;
				 }
			  return x;	
			}	
	    }
	}
	
	 class StackMain2{
		public static void main(String[] args) {
			Stack2 s = new  Stack2();
			Node3 a = new Node3(10);
			Node3 b = new Node3(20);
			Node3 c = new Node3(30);
			s.pop();
			s.push(a);
			s.push(b);
			s.push(c);
			
			s.traversal();
			s.pop();
			s.traversal();
			
			
		}
	}
	

