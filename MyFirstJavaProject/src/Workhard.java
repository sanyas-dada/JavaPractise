
public class Workhard {
	int data ;
    Workhard next;
    Workhard(int data){
    	this.data = data;
    	this.next = null;
    }
}
class Genius{
	  Workhard head;
	  Genius(int data){
		 Workhard a = new Workhard(data);
		 head = a; 
	  }
	  public void traversal() {
		  Workhard temp = head;
		  while(temp!=null) {
			  System.out.println("temp.data");
			  temp = temp.next;
		  }
		  
	  }
	  public static void main() {
		  Genius g = new Genius(10);
		  Workhard b = new Workhard(30);
		  Workhard c = new Workhard(40);
		  Workhard d = new Workhard(50);
		  
		  g.head.next = b;
		  b.next = c;
		  c.next = d;
		   g.traversal();
	  }
}
