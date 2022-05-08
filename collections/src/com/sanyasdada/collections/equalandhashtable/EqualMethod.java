package com.sanyasdada.collections.equalandhashtable;

import java.util.HashSet;
import java.util.Set;

class Student {
	private String name;
	private String id;
	private String email;
	private int age;

	public Student(String name, String id, String email, int age) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		String studentInfo = "Student " + id;
		studentInfo += ":" + name;
		studentInfo += ":" + email;
		studentInfo += ":" + age;
		return studentInfo;
	}

	@Override
	public int hashCode() {

		return 31 + id.hashCode();

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student another = (Student) obj;
			if (this.id.equals(another.id) && this.name.equals(another.name) && this.email.equals(another.email)
					&& this.age == another.age) {
				return true;
			}
		}
		return false;
	}

}

public class EqualMethod {
	public static void main(String[] args) {

		Student student1 = new Student("sanyas", "01", "sanyasdada@gmail.com", 24);
		Student student2 = new Student("sanyas", "01", "sanyasdada@gmail.com", 24);
		Student student3 = new Student("laxmi", "02", "laxmipoudel@gmail.com", 25);
		Set<Student> setStudents = new HashSet<Student>();

		setStudents.add(student1);
		setStudents.add(student2);
		setStudents.add(student3);

		// Using the lambda function
		setStudents.forEach(student -> System.out.println(student));

		System.out.println("student1 == student2:" + (student1 == student2));
		System.out.println("student1.equals(student2): " + (student1.equals(student2)));
		System.out.println("student2.equals(student3): " + (student2.equals(student3)));

		/*
		 * equals() method is designed to compare two objects semantically(by comparing
		 * the data members of the class), whereas the == operator compares two objects
		 * technically(by comparing their reference i.e memory address).
		 */

		String s = new String("sanyas dada");
		String s2 = new String("sanyas dada");
		boolean check1 = s == s2;
		boolean check2 = s.equals(s2);
		System.out.println("s==s2 :" + check1);
		System.out.println("s.equal(s2) :" + check2);

	}

}
