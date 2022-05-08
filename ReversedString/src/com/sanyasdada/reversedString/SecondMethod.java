package com.sanyasdada.reversedString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SecondMethod {

	public static void main(String[] args) {
		String s = "sanyas";
//		Map<Integer,Character> mapping = new TreeMap<>();
//		for (int i=0; i< s.length(); i++) {
//			mapping.put(i,s.charAt(i));
//			
//			
//			//what is your intention of doing this problem??
//			// my intention is figure out the longest substring
//			// without repeating character;
//
//		}
//		System.out.println(mapping);
		
		Set<Character>substring = new HashSet<>();
		for (int i=0; i< s.length(); i++) {
			substring.add(s.charAt(i));
		}
		Set<Character> substring3 = new LinkedHashSet<>();
		for(int i =0;i<s.length();i++) {
			substring3.add(s.charAt(i));
		}
		System.out.println(substring);
		System.out.println(substring.size());
		
		System.out.println(substring3);
			
		Set<Integer>substring2 = new TreeSet<>();
		
		substring2.add(0);
		substring2.add(13);
		substring2.add(20);
		substring2.add(50);
		substring2.add(40);
		substring2.add(24);
		System.out.println(substring2);
		System.out.println("____^^^^______");
		for(Integer sub:substring2) {
			System.out.print(Arrays.asList(sub));
		}
		

		

	}

}
