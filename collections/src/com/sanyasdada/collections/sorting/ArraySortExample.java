package com.sanyasdada.collections.sorting;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

class Employee implements Comparable<Employee> {
	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("(%s,%d)", name, salary);

	}

	@Override
	public int compareTo(Employee employee) {

		return this.age - employee.age;
	}

}

public class ArraySortExample {
	public static void main(String[] args) {
		/*
		 * List<Integer>listOfInteger = Arrays.asList(3,5,6,7,8,9,12,24,56,67,45,65);
		 * System.out.println("Before sorting:" +listOfInteger);
		 * Collections.sort(listOfInteger);
		 * System.out.println("After sorting:"+listOfInteger);
		 */
		/*
		 * int[] numbers = {3,4,5,687,39,45,23,12,5};
		 * 
		 * System.out.println("before Sorting :"+Arrays.toString(numbers));
		 * Arrays.sort(numbers); System.out.println("after Sortin:"
		 * +Arrays.toString(numbers));
		 * 
		 */
		Employee[] employee = new Employee[4];
		 employee[0] = new Employee("sanyas", 24, 20000000);
		 employee[1] = new Employee("poshraj", 30, 3000);
		 employee[2] = new Employee("laxmi", 23, 400000);
		 employee[3] = new Employee("krishna", 30, 400000);

		System.out.println("Before sorting: " + Arrays.toString(employee));
		Arrays.sort(employee);
		System.out.println("After sorting:" + Arrays.deepToString(employee));
          
		//Sorting an array of  Strings 
		String[] fruits = {"orange","apple","pearls","banana","papaya","stewberry"};
		System.out.println("Before sorting: "+Arrays.toString(fruits));
		Arrays.sort(fruits);
		System.out.println("After sorting: "+Arrays.toString(fruits));
		Arrays.sort(fruits, Collections.reverseOrder());
		System.out.println("Reversing order: "+Arrays.toString(fruits));
		
	
	
		
		
		
		
		
		
		// Sorting  of Dates
		Date[] dates =  new Date[3];
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		
		
		try {
			
			dates[0] = dateFormatter.parse("2012-09-05");
			dates[1] = dateFormatter.parse("2013-05-7");
			dates[2] = dateFormatter.parse("2011-05-05");
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Before sorting: "+ Arrays.toString(dates));
		Arrays.sort(dates);
		System.out.println("After sorting: "+Arrays.toString(dates));
		
	}

}
