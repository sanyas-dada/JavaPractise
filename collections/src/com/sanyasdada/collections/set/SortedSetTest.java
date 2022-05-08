package com.sanyasdada.collections.set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/*the key characteristic of a SortedSet is that, 
  it sorts elements according to their natural ordering
  or by a specified comparator. So considering using a
  a TreeSet when you want a collection that satisfies the following conditions:
	 . Duplicate elements are not allowed
	 . Elements are sorted by their natural ordering(default) or by a specified comparator
*/

public class SortedSetTest {
	public static void main(String[]args) {
	 SortedSet<Integer> setNumbers = new TreeSet<>();
	 setNumbers.addAll(Arrays.asList(2,1,4,5,1,7,8,9,2,5,4,6,3,23,45,67,87));
	 System.out.println("sorted set:" + setNumbers);
   
	 
		/*
		 * in addition to basic collection operation and normal set operations, the
		 * SortedSet provides the following types of operations: 
		 *  .Range view: extracts a portion of the set, i.e. range
		 *  .Endpoints: returns the first and the last element in the sorted set
		 *  .Comparator access: returns the comparator,if an,used to sort the set.
		 * 
		 */
	 Integer first = setNumbers.first();
	 System.out.println("First element: " + first);
	 Integer last = setNumbers.last();
	 System.out.println("last element: "+ last);
	 
	 SortedSet<Integer> subSet = setNumbers.subSet(9,12);
	 System.out.println("subset:"+subSet);
	 
	 // it returns the less than given values
	 SortedSet<Integer> headSet = setNumbers.headSet(5);
	 System.out.println("headset: "+ headSet);
	 
	 // it returns the list of integer whose values is equals to 5 or greater than 5
	 SortedSet<Integer> tailSet = setNumbers.tailSet(5);
	 System.out.println("tailSet: "+tailSet);
	 
	 
	}

}
 