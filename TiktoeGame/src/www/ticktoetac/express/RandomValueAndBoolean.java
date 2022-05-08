package www.ticktoetac.express;

import java.util.Random;

public class RandomValueAndBoolean {

	public static void main(String[] args) {
	
		String name = "sanyas";
		int i = 0;
		boolean name2 = true;
		boolean know = false;
		while (name2) {
			System.out.println(name);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
			System.out.println(i);
			if (i == 5) {
				name2 = false;
				know = true;
				System.out.println("i am going to say done method");
				System.out.println("i am going to get a job soon");
				System.out.println("then i changed the room which is avaialable for water 24 hours and bathroom is clean");
				System.out.println("what are you doing kachha, i am employed at software company");
			}
		}

		if (know) {
			System.out.println("i am done");
			System.out.println("i feel good, god i feel good god i feel god ifeel good i feel god if fell goddd");
		}
		// how to check
		int n = 9;

		for (int j = 0; j < n; j++) {
			if (j == 3) {
				System.out.println(j);
				break;
			}
			System.out.println("i am done");
		}

		Random random1 = new Random();
		int nextInt = random1.nextInt(45);
		System.out.println(nextInt);
		if (nextInt <= 15) {
			System.out.println("This is very smaller than you choose number");
		} else if (nextInt <= random1.nextInt(30)) {
			System.out.println("You are nearly equals of this value Try again");

		} else {
			System.out.println("You are almost nearly in these value");
			System.out.println("dont't waste time on unnecessary things . ");
			System.out.println("i will go to United States of America in this year.");
			System.out.println("that's my commiteement i will do it anyway");
			System.out.println("Try again");
		}

	}

}
