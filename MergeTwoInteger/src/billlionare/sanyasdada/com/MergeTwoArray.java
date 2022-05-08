package billlionare.sanyasdada.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MergeTwoArray {
	public static void main(String[] args) {
		char str1[] = { 'a', 'b', 'c' };
		char str2[] = { 'd', 'e' };

		String jack = new String(str1);
		String pack = new String(str2);
		System.out.println(jack.concat(pack));

		List<String> strings = List.of("Java", "is", "cool");
		String message = String.join(" ", strings);
		String join = String.join("#", strings);
		// message returned is: "Java is cool"
		System.out.println(message);
		System.out.println(join);

		Set<String> strings2 = new LinkedHashSet<>(List.of("Java", "is", "very", "cool"));
		String message1 = String.join("-", strings2);
		// message returned is: "Java-is-very-cool"
		System.out.println(message1);

		

		int[] nums1 = { 1, 2, 3, 4, 5 };
		int[] nums2 = { 6, 7, 8, 9 };
		int length = nums1.length + nums2.length;
		int[] mergedArray = new int[length];
		int pos = 0;

		for (int number : nums1) {
			mergedArray[pos] = number;
			pos++;
		}
		// return the string representation of the contents of the specified array
		System.out.println(Arrays.toString(mergedArray));
		for (int number : nums2) {
			mergedArray[pos] = number;
			pos++;
		}
		System.out.println(Arrays.toString(mergedArray));

		/*
		 * String concat2 = Arrays.toString(nums1).concat(Arrays.toString(nums2));
		 * System.out.println(concat2); String dada = new
		 * String(Arrays.toString(nums1)); String sanyas = new
		 * String(Arrays.toString(nums2)); System.out.println(dada.concat(sanyas));
		 */
		List<Integer> nawa = List.of(2, 3, 5, 6, 7);
		System.out.println(nawa);

	}

}
