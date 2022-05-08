package com.sanyasdada.collections.sorting;

import java.util.Comparator;

public class ComparatorLastName implements Comparator<Employee3> {

	

	@Override
	public int compare(Employee3 emp1, Employee3 emp2) {
		// TODO Auto-generated method stub
		return emp1.getLastName().compareTo(emp2.getLastName());
	}

}
