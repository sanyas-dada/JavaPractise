package com.sanyasdada.reversedString;

import java.util.stream.IntStream;

public class CapatalizedPharsed {
	public static void main(String[] args) {
		String pharse ="I am get\nSting better and better everysingleday";
		String upperCase = pharse.toUpperCase();
		System.out.println(upperCase);
	 String[] split = pharse.split("\\R");
	 System.out.println(split);
	 System.out.println(pharse);
	 
	}

}
