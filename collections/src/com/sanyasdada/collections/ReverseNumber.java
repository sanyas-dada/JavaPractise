package com.sanyasdada.collections;

public class ReverseNumber {
	public static void main(String[] args) {
		String s = "laxmisubedi";
		int codePointAt = s.codePointAt(4);
		int codePointCount = s.codePointCount(1, 5);
		System.out.println(codePointCount);
		System.out.println(codePointAt);
		int n = s.length();
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.charAt(n - 1));

		char[] revNumber = new char[n];
		int i = 0;

		while (i <= s.length() / 2) {
			// ch = s.charAt(i);
			revNumber[n - 1] = s.charAt(i);
			revNumber[i] = s.charAt(n - 1);
			i++;
			n--;

		}
		System.out.println(revNumber);

	}

}
