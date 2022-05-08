
package com.sanyasdada.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee3 {
	private String firstName;
	private String lastName;
	private int id;

	public Employee3(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("%s:%s-%d", firstName, lastName, id);
	}

}

public class ListUsingComparator {
	public static void main(String[] args) {
		List<Employee3> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(new Employee3("sanyas", "dada", 02));
		listOfEmployee.add(new Employee3("nawaraj", "subedi", 39));
		listOfEmployee.add(new Employee3("babajee", "kingjun", 2));
		listOfEmployee.add(new Employee3("tuak", "love", 40));

		System.out.println("Before Sorting First Name:" + listOfEmployee);

		Collections.sort(listOfEmployee, new ComparatorFirstName());
		System.out.println("After Sorting First Name:" + listOfEmployee);
		System.out.println("Before Sorting Last Name:" + listOfEmployee);
		Collections.sort(listOfEmployee, new ComparatorLastName());
		System.out.println("After Sorting Second Name:" + listOfEmployee);
		System.out.println("before Sorting id:" + listOfEmployee);
		Collections.sort(listOfEmployee, new ComparatorId());
		System.out.println("After Sorting id:" + listOfEmployee);

		/*
		 * // since java 8 we can create the comparator more easily like this
		 * Collections.sort(listOfEmployee, (emp1, emp2) ->
		 * emp1.getLastName().compareTo(emp2.getLastName()));
		 * System.out.println("After Sorting Last Name:" + listOfEmployee);
		 * Collections.sort(listOfEmployee, (emp1, emp2) ->
		 * emp1.getFirstName().compareTo(emp2.getFirstName()));
		 * System.out.println("After Sorting First Name:" + listOfEmployee);
		 */
	}

}
