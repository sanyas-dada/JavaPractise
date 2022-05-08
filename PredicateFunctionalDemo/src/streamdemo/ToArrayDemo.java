package streamdemo;

import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {
	// we can use this method to copy elements presents n the stream to specified array
	// We can use this method to copy elements present in the stream to specified array

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(23,45,12,34,17,13,14);
		
		System.out.println(number);
		Object[] array = number.stream()
			  .filter(i -> i>=12)
		      .toArray();
		for(Object o:array) {
			System.out.println("elements in the array is:"+o);
		}
		
		

	}

}
