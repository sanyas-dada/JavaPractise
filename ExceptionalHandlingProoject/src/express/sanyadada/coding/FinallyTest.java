package express.sanyadada.coding;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String firstArg = args[0];
			System.out.println("First Argument" +firstArg);
			
		}catch(IndexOutOfBoundsException ex) {
			System.out.println("There is no argument");
		}finally {
			System.out.println("Finally gets executed");
			System.out.println("No matter how method is excuted finally method is called");
		}

	}

}
