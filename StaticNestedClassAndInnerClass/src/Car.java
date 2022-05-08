
public class Car {
	private int weight;
	private static int numMirror;

	static class Wheel {
		// we can access only static members of the Car class
		// we can access any member except static using refernce of the class which is
		// shwon in below.
		private int spokes;
		private String name;

		public void rotate() {
			int spokes = 34;
			String name = "Lamborghini";
			numMirror = 3;
			System.out.println("Numbers of spokes:" + spokes);
			System.out.println("Car model:" + name);
			System.out.println("Number of the mirror in the lamborghini:" + numMirror);
		}

		public void test(Car car) {
			car.weight = 500;
			System.out.println("The wheel is rotating..." + car.weight);

		}

		public int getSpokes() {

			return spokes;
		}

		public void setSpokes(int spokes) {

			this.spokes = spokes;
		}

		public String getName() {
			if (name != " " || name != null) {
				return name;
			} else {
				System.out.println("it is not a valid name.");

			}
			return name;
		}

		public void setName(String name) {
			this.name = name;

		}

		public static void main(String[] args) {
			Car car = new Car();
			Car.Wheel wheel = new Car.Wheel();
			wheel.rotate();
			wheel.test(car);
			wheel.setName(" ");
			wheel.setSpokes(50);
			System.out.println("Car model name:" + wheel.getName());
			System.out.println("Car Spokes name:" + wheel.getSpokes());
		}

	}
}
