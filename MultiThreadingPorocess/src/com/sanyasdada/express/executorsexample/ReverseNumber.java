package com.sanyasdada.express.executorsexample;

import java.util.Arrays;

public class ReverseNumber {
	public static void main(String[] args) {
		 int[] numbers = {1,2,3,4,5,6,6};
		 String string = Arrays.toString(numbers);
		 System.out.println(string);

		String s = "naban";
		//System.out.println("Real Number of s:" +Integer.parseInt(s));
		//int parseInt = Integer.parseInt(s);
		//System.out.println("Number as in the array form :" + Arrays.toString(parseInt));
		char charAt = s.charAt(0);
		System.out.println(charAt);
		char[] revNumber = new char[s.length()];
		int j = s.length();

		int k = 0;

		for (int i = 0; i <= s.length() / 2; i++) {
			revNumber[j - 1] = s.charAt(i);
			revNumber[k] = s.charAt(j-1);
			j--;
			k++;
		}
		System.out.println(revNumber);
		

	}

}
