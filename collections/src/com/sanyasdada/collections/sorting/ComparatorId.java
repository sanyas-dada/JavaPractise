package com.sanyasdada.collections.sorting;

import java.util.Comparator;

public class ComparatorId implements Comparator<Employee3>{

	@Override
	public int compare(Employee3 emp1, Employee3 emp2) {
		return  emp1.getId()-emp2.getId();
				
	}

}
