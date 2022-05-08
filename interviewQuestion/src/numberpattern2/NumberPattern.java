package numberpattern2;

public class NumberPattern {

	public static void main(String[] args) {

		for (int s = 1; s <= 5; s++) {
			for (int k = 1; k <= s; k++) {
				System.out.print(k);
			}
			for(int j = s; j > 0; j--) {
				if (s > j) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		/*
		 * System.out.println("i didn't go to a bed unless i solved it");
		 * 
		 *
		 */
		for (int i = 1; i <=5; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
