package com.sanyasdada.collections.equalandhashtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	private String firstName;
	private String surName;
	private int id;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surName;
	}
	public void setSurname(String surname) {
		this.surName = surname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, String email, int id, int age) {
		this.firstName = name;
		this.surName = email;
		this.id = id;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return firstName +" "+surName+ "id:"+id;
	}
	@Override
	public int compareTo(Employee another) {
		int compareValue = this.firstName.compareTo(another.firstName);
		if(compareValue == 0) {
			return this.surName.compareTo(another.surName);
		}
		return compareValue;
	}
	
	
}
public class NaturalOrdering {
	public static void main(String[] args) {
		List<Employee> listEmployees = new ArrayList<>();
		listEmployees.add(new Employee("Steve","Jobs",1,24));
		listEmployees.add(new Employee("Bill","Gates",3,29));
		listEmployees.add(new Employee("Elon","Musk",10,35));
		listEmployees.add(new Employee("Larry","Page",9,40));
		listEmployees.add(new Employee("Tim","Cook",14,64));
		System.out.println("Before sorting: " + listEmployees);
		Collections.sort(listEmployees);
		System.out.println("After sorting:"+listEmployees);
	}

}
