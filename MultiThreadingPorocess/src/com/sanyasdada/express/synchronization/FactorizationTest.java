package com.sanyasdada.express.synchronization;

public class FactorizationTest {
	private static int factorial(int n) {
		// i am going to make a powerful software application in this world
		// i do my the best of the best version of myself
		// i do challenging stuff evey single day;
		// i do my best of the best version of myself
		// i do my best of the best version of mself
		// i am going to make a powerful software applciation in this world
		
		if (n > 1) {
			return Math.multiplyExact(n, factorial(n - 1));
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("factoral of 3 is:" + factorial(3));
		System.out.println("factoral of 4 is:" + factorial(4));
		System.out.println("factoral of 5 is:" + factorial(5));
		System.out.println("factoral of 6 is:" + factorial(6));
		System.out.println("factoral of 7 is:" + factorial(7));
		System.out.println("factoral of 8 is:" + factorial(8));
		System.out.println("factoral of 9 is:" + factorial(9));
		System.out.println("factoral of 10 is:" + factorial(10));
	
		int multiplyExact = Math.multiplyExact(4, 6);
		System.out.println(multiplyExact);
		
		int sum =1;
		for(int i = 1;i<= 5;i++) {
			sum = sum*i;
		}
	    System.out.println("factorial of 5:" +sum);

	}
	

}
