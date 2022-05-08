package listiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] numberList = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> arrylist = Arrays.asList(3, 4, 5, 7, 8, 9, 20, 34);
		List<Integer> arrylist1 = new ArrayList<>();
		List<String> nameList = Arrays.asList("Aama", "dae", "didi", "vattu", "guru", "friends");

		Iterator<String> listOfPeople = nameList.iterator();

		while (listOfPeople.hasNext()) {
			String next = listOfPeople.next();
			System.out.println(next);

		}

		arrylist1.add(11);
		arrylist1.add(32);
		arrylist1.add(53);
		arrylist1.add(74);
		arrylist1.add(95);
		arrylist1.add(116);

		System.out.println(arrylist);
		System.out.println(arrylist1);
		System.out.println(nameList);

		Iterator<Integer> it = arrylist.iterator();
		while (it.hasNext()) {
			// return the next element in the iteration
			Integer next = it.next();
			System.out.println(next);
		}

		ListIterator<Integer> it2 = arrylist.listIterator(4);
		while (it2.hasPrevious()) {
			// return the index of the element that would return the subsequent to the
			// previous.
			int previousIndex = it2.previousIndex();
			System.out.println("indexNumber:" + previousIndex);
			// Returns the previous element in the list and move the cursor position
			// backwards
			int previous = it2.previous();
			System.out.println("previousElement:>" + previous);

		}
		ListIterator<Integer> it3 = arrylist.listIterator(4);
		while (it3.hasNext()) {
			// return the next element in the
			int nextIndex = it3.nextIndex();
			System.out.println("nextINDex element:" + nextIndex);
			Integer it31 = it3.next();
			System.out.println(it31);
		}
		ListIterator<Integer> it4 = arrylist.listIterator(arrylist.size());
		while (it4.hasPrevious()) {

			int previousIndex = it4.previousIndex();
			System.out.println("indexNumber:" + previousIndex);
			Integer previous = it4.previous();
			System.out.println("previousElement:>" + previous);

		}

	}

}
