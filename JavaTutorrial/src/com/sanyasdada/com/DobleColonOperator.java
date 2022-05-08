package com.sanyasdada.com;

import java.util.Arrays;

import java.util.Iterator;
import java.util.List;

public class DobleColonOperator {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("planning", "hardWork", "consistence", "creative","Discipline");
		String string = list.get(0);
	
		// we can't add any elements as you specified Arrays.asList. it is also called unmutable
		//list.add("Feeling good");
		System.out.println(string);

		System.out.println("_______^^^^_______");
		System.out.println("using for loop method");

		// using for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		System.out.println("_______^^^^_______");

		System.out.println("using Iterator method");
		// Using iterator method
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String aName = it.next();
			System.out.println(aName);
		}

		System.out.println("_______^^^^_______");
		System.out.println("using for each loop method");
		// using for each Methods
		for (String items : list) {
			System.out.println(items);
		} //
		System.out.println("I am going to make a solid plan for 3 months"); // print
		System.out.println("Start acting now, kanchha");
		System.out.println("Start acting now, kanchha");
		// using lambda System.out.println("_______^^^^_______");
		System.out.println("using lambda method");
		
		list.forEach(item -> System.out.println(item));
         // This means for each element in the listNames, print the name to the console.
		
		
		// Using :: operator 
		// java method reference makes it even more shorter and
		// readable
		list.forEach(System.out::println);

		// using static method

	}

}
