package com.sanyasdada.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class SetTest {

	public static void main(String[] args) {
		List<Integer> listofInteger = Arrays.asList(1, 3, 4, 5, 6, 5, 7, 9, 3, 2, 4);
		System.out.println(listofInteger);
		
		List<Integer>listofInteger2 = Arrays.asList(1,3,5,6,5,9,10,7,2);
		Set<Integer> set2 = new TreeSet<>(listofInteger2);
		
		// unlike list, it is not allowed the repeating element in the set.
		// Unlike list, it is not allowed the repeating element in the set

		System.out.println("This is the differce Between the list and set");

		Set<Integer> set = new HashSet<>(listofInteger);
		System.out.println(set);

		// iterating element over the set
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// adding the element in the set
		set.add(10);
		System.out.println(set);

		// Checking the set is empty or not
		if (set.isEmpty()) {
			System.out.println("nothing in in this method");
		} else {
			System.out.println("I am going to make powerful software application in this world");
			System.out.println("I am going to make powerful software appllication in theis world");
		}

		Object[] array = set.toArray();
		System.out.println(array);

		// if set contains element then which code is executed
		if (set.contains(10)) {
			System.out.println("I am going to change my daily routine habits sounds  good, kanchha");
		} else {
			System.out.println("You must change your daily routine habit");
		}

		if (set.remove(4)) {
			System.out.println("you must get up early in the morning then ready to run");
		} else {
			System.out.println("You have no choices");
		}

		System.out.println(set);

		// it compares the two set it returns true if two set are equals
		// otherwise,false 
		boolean equals = set.equals(set2);
		System.out.println(equals);
		if (set.equals(set2)) {
			System.out.println("you must be enthusiastic everySingleDay");

		} else {
			System.out.println("think as much as you can");
		}

		// Size of the array
		int size = set.size();
		System.out.println(size);

	}

}
