
public class SingletonTest {
  private static SingletonTest single_instance = null;
  private String s;
  private SingletonTest(){
	  s = "this is the part of the string";
	  System.out.println("when the object is instiated every time , i will be called");
  }
  // static method
  // Staic method to create instance of singleton Class
  public static SingletonTest getInstance() {
	  if(single_instance == null) {
		  single_instance = new SingletonTest();
		  
	  }
	  return single_instance;
  }

	public static void main(String[] args) {
		
		// Instantating singleton class with variable x
		SingletonTest x = SingletonTest.getInstance();
		
		// instantiating Singleton class with variable y
		SingletonTest y = SingletonTest.getInstance();
		SingletonTest z = SingletonTest.getInstance();
		
		System.out.println("HashCode for x is "+x.hashCode());
		System.out.println("HashCode for y is "+y.hashCode());
		System.out.println("HashCode for z is "+z.hashCode());
        
		
		// condition check
		if(x == y && y == z) {
			System.out.println("Three objects point to the same momory locatin on the on the heap i.e to the same object ");
		}
		else {
			System.out.println("Three objects Do Not point to the same memory location on  the heap ");
		}
		
		// now changing the variables of instance x   via toUpperCase()
		 x.s = (x.s).toUpperCase();
		 System.out.println("String from x is " +x.s);
		 System.out.println("String from y is " +y.s);
		 System.out.println("String from z is " +z.s);
		 System.out.println("\n");
	} 
}
