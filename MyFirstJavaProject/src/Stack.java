
public class Stack {
	public static int size = 10;
	public static int top =0;
	public static int[] S = new int[size+1];
	
	public static boolean isEmpty() {
		if(top ==0)
			return true;
		return false;
	}
	public static void push(int x) {
		top = top+1;
		if(top>size) 
			System.out.println("stack is overflow");
		else S[top] = x;	
	}
	public static int pop() {
		if(isEmpty()) {
			System.out.println("stackunderflow");
		    return -1000;
		}
		else {
			top = top-1;
			return S[top+1];
		}		        	
	}
	public static void main(String[] args) {
		pop();
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
		push(70);
		push(80);
	    push(90);
	    push(100);
	    for(int i =1;i<=size;i++) {
	    	System.out.println(S[i]);
	    	
	    }
	}
}
