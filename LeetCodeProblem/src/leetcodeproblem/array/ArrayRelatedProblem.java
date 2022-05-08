package leetcodeproblem.array;

import java.util.Arrays;
import java.util.List;

public class ArrayRelatedProblem {

	public static void main(String[] args) {

		// adding a new element(number:90) at first index by using Array

		int[] nums2 = { 2, 4, 6, 8, 10, 12, 14, 16 };
		int n = nums2.length;
		int[] numsPlusOne = new int[n + 1];
		for (int i = n - 1; i >= 0; i--) {
			numsPlusOne[i + 1] = nums2[i];
		}
		numsPlusOne[0] = 9;

		for (int i = 0; i < numsPlusOne.length; i++) {
			System.out.println(numsPlusOne[i]);
		}
		System.out.println();

		// adding a new elements at specific index 5 ( value = 8)
		// int[] anotherArray = new int[3];
		int[] primeNumber = { 1, 2, 3, 5, 7, 9, 11 };
		int n1 = primeNumber.length;
		int[] newPrimeNumber = new int[n1 + 1];

		for (int i = 0; i < primeNumber.length; i++) {
			if (i <= 4) {
				newPrimeNumber[i] = primeNumber[i];
			} else {
				newPrimeNumber[i + 1] = primeNumber[i];
			}

		}
		newPrimeNumber[5] = 8;
		// {1,2,3,5,7,8,9,11}
		// have a think deeeply, kachha you can do it
		for (int i = 0; i < newPrimeNumber.length; i++) {
			System.out.println(newPrimeNumber[i]);

		}
		int[] nums = { 1, 0, 2, 3, 0, 4, 5 };
		// outPut of this forms is [1,0,0,2,3,0,0]
		int k = nums.length;
		int j = 0;
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				temp = temp + 1;
			}
		}
		int[] nums1 = new int[temp + k];
		int numberOfAddedArray = nums1.length;
		System.out.println(numberOfAddedArray);
		System.out.println("I am feeling good");

		for (int i = 0; i < nums.length; i++) {
			nums1[j] = nums[i];
			if (nums[i] == 0) {
				nums1[i + 1] = nums[i];
				nums1[j+1] = nums[i];
				nums[j] = nums[i];
				i++;
			}
			j++;
		
		}
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]);
		}

	}
}
