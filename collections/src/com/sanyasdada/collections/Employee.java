package com.sanyasdada.collections;

public class Employee implements Comparable<Employee> {
	int age;
	int salary;
	String name;
	String depName;

	/*
	 * // // // public int getAge() { // return age; // } // // public void
	 * setAge(int // age) { // this.age = age; // } // // public int getSalary() {
	 * // return // salary; // } // // public void setSalary(int salary) { //
	 * this.salary = // salary; // } // // public String getName() { // return name;
	 * // } // // // public void setName(String name) { // this.name = name; // } //
	 * // public // String getDepName() { // return depName; // } // // public void
	 * // setDepName(String depName) { // this.depName = depName; // }
	 */
	public Employee(int age, int salary, String name, String depName) {

		this.age = age;
		this.salary = salary;
		this.name = name;		
		this.depName = depName;
	}

	@Override
	public int compareTo(Employee employee) {
		// TODO Auto-generated method stub
		return employee.salary - this.salary;
		
	}

	@Override
	public String toString() {
		return String.format("(%s %d %d %s)", name, age, salary, depName);
		
	}

}
