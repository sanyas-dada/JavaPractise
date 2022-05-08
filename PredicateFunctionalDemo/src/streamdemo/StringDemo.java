package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<>();
 		arrayList.add(14);
		arrayList.add(16);
		arrayList.add(34);
		arrayList.add(28);

		List<Integer> newAl = new ArrayList<>();
		newAl = arrayList
				.stream()
				.filter(x -> x>= 15)
				.collect(Collectors.toList());
		newAl.stream().forEach(x -> System.out.println(x));
		System.out.println("______");
		
		Stream<Integer> s = arrayList.stream().filter(i -> i%2 ==0);
		s.forEach(x->System.out.println(x));
		System.out.println();
	
		
		arrayList.stream()
		         .filter(i -> i%2==0)
		         .forEach(x -> System.out.println(x));
		
	}

	/*
	 * //withoutStream List<Integer> arrayListFromMethod = findElements(arrayList);
	 * for (Integer i : arrayListFromMethod)
	 *  { System.out.println(i); } }
	 * 
	 * private static List<Integer> findElements(List<Integer> arrayList2) {
	 * List<Integer> newArrayList = new ArrayList<Integer>(); for (Integer i :
	 * arrayList2) { if (i >= 15) { newArrayList.add(i); }
	 * 
	 * } return newArrayList;
	 * 
	 * }
	 */

}
