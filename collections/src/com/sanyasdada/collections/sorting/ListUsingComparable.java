package com.sanyasdada.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee1 implements Comparable<Employee1>{
	private String firstName;
	private String lastName;
	private int id;
	public Employee1(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
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
		return String.format("(%s,%s,%d):",firstName,lastName,id);
	}
	@Override
	public int compareTo(Employee1 other) {
		// TODO Auto-generated method stub
	    int compareTo = this.getFirstName().compareTo(other.getFirstName());
	    if(compareTo==0) {
	    	 return this.getLastName().compareTo(other.getLastName());
	    }
	    return compareTo;
	  
	}
	
	
	
	
	
}
public class ListUsingComparable {

	public static void main(String[] args) {
		List<Employee1>listOfEmployee = new ArrayList<>();
	  listOfEmployee.add(new Employee1("Steve","job",10));
	  listOfEmployee.add(new Employee1("Bill","Gate",96));
	  listOfEmployee.add(new Employee1("Elon","Musk",98));
	  listOfEmployee.add(new Employee1("Tim","Cook",707));
	  listOfEmployee.add(new Employee1("Larry","Ellsion",98));
	  
	  System.out.println("Before sorting:"+listOfEmployee);
	  Collections.sort(listOfEmployee);
	  System.out.println("After sotring: "+listOfEmployee);

	}

}
