package www.sanyasdada.com.api;

import java.util.Arrays;

public class javaStreamExample {
	public static void main(String[] args) {
		int[] numbers = {20,13,14,15,15,16,17,18,39,17,18,29};
		
		/*
		 * the distinct() operation returns a stream consisting of the distinct elements
		 * (no duplicates) by comparing objects via their equals() methods
		 */
		Arrays.stream(numbers)
		      .distinct()
		      .forEach(i -> System.out.print(i + " "));

	}

}
