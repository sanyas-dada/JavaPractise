package express.sanyadada.coding;

class Engineer {
	protected int age;

	public void setAge(int age) {
		if (age < 21 || age > 59) {
			throw new IllegalArgumentException("Invalid age");		
		}
		this.age = age;
	}
}

public class ExceptionalHandlingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Engineer newEngineer = new Engineer();
			int age  = 18;
			newEngineer.setAge(age);

		} catch (IllegalArgumentException ex) {
			System.err.println(ex);
		}
	}

}
