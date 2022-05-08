package com.sanyasdada.express.synchronization;

public class PrimeNumberTest {
	private static int factor(int i) {
		int sum = 0;
		for (int j = 1; j <= i / 2; j++) {
			if (i % j == 0) {
				sum++;
			} else if(sum == 2) {
				break;
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 100; i++) {
			if (factor(i) == 1) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Total number of prime number between 1 to 100 is " + count);

		for (int i = 0; i < 10; i++) {
			if (i == 6) {
				continue;
			}
			System.out.println(i);
		}
	}

}
