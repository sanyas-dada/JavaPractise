
package com.sanyasdada.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		List<Employee> employeelists = new ArrayList<Employee>();
		employeelists.add(new Employee(43, 40000, "Krishna", "Farmer"));
		employeelists.add(new Employee(25, 2000000000, "Sanyas", "SoftwareEnginner"));
		employeelists.add(new Employee(28, 300000, "Poshraj", "Literature"));

		System.out.println("Before Sortings:" + employeelists);
		Collections.sort(employeelists);

		System.out.println("After Sortings:" + employeelists);

		List<Integer> numbers = Arrays.asList(34, 45, 27, 46, 45);
		System.out.println("before sorting elements:" + numbers);
		Collections.sort(numbers);
		System.out.println("after sorting elements:" + numbers);
		Collections.reverse(numbers);
		System.out.println("____*****____");
		System.out.println("Reversing element:" + numbers);
	}
}

////		
////		List<String>names=Arrays.asList("Sanyasdada","Poshraj","Narayan","Krishna");
////		System.out.println("Before sorting names:"+names);
////		Collections.sort(names);
////		System.out.println("After Sorting name:"+names);
////		Collections.reverse(names);
////		System.out.println("Reversing the name:"+names);
////		
////		
////		
////		
////		
////		
////		
////	
////		
////	
////		List<String> arraylist = new ArrayList<String>();
////		List<Integer> intlist = new ArrayList<>();
////		
////		List<Integer> numberList = List.of(1,2,3,4,5,6);
////		System.out.println(numberList);
////		
////		
//////		for(int number:numberList) {
//////			System.out.println(number);
//////		}
////		arraylist.add("one");
////		arraylist.add("two");
////		arraylist.add("three");
////		arraylist.add("four");
////		System.out.println(arraylist);
////		System.out.println("________________");
////		
////		//Retrieving element from list
////		System.out.println(arraylist.get(0));
////		System.out.println(arraylist.get(1));
////		System.out.println(arraylist.get(3));
////		System.out.println("___________");
////		
////		//updating element form list using indexes
////		arraylist.set(2,"hundred");
////		arraylist.set(3, "twenty billion");
////		
////		//removing element form list by means of index
////		arraylist.remove(2);
////		System.out.println(arraylist);
////		
////		
////		int two = arraylist.size();
////		System.out.println(two);
////		
////		
////		List<String>linkedList = new LinkedList<String>();
////		linkedList.add("one");
////		linkedList.add("two");
////		linkedList.add("three");
////		System.out.println(linkedList);
////		
////		//iterating over element over linkedlist
////		Iterator<String>it = linkedList.iterator();
////		while(it.hasNext()) {
////			System.out.println(it.next());
////		}
////		//Searching for a element form a list
////		if(linkedList.contains("one")) {
////			System.out.println("there is one element in linkedList");
////		}else {
////			System.out.println("we arent found it");
////		}  
////		
//		if(linkedList.remove("one")) {
//			System.out.println("I  am going to  remove the one form the one elemet");
//		}else {
//			System.out.println("one isnot removed from the list");
//		}
//	   
//	
//	}
