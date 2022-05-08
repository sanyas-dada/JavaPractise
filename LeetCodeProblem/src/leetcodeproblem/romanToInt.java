package leetcodeproblem;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Spliterator;
import java.util.TreeMap;

public class romanToInt {

	public static void main(String[] args) {
		Map<Character, Integer> mapping = new HashMap<>();
		mapping.put('I', 1);
		mapping.put('V', 5);
		mapping.put('X', 10);
		mapping.put('L', 50);
		mapping.put('C', 100);
		mapping.put('D', 500);
		mapping.put('M', 1000);
		System.out.println(mapping);
		
		
		Collection<Integer> values = mapping.values();
		System.out.println(values);
		Integer integer = mapping.get('I');
		System.out.println(integer );
	
		
		
		
		Collection<Character> character = mapping.keySet();
		System.out.println(character);
		int size = character.size();
		System.out.println(size);
		
		int sum=0;
		Iterator<Character> it = mapping.keySet().iterator();
		while(it.hasNext()) {
			Character next = it.next();
			Integer integer2 = mapping.get(next);
			sum = integer2 + sum;
		}
		System.out.println(sum);

		/*
		 * char[] romanSymol = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' }; int temp = 0;
		 * String s = new String(romanSymol);
		 */
		//System.out.println(s);
		int temp=0;
		String s1 ="XVIII";
		int i = 1;
		int c = mapping.get(s1.charAt(0)); 
		while(c>=mapping.get(s1.charAt(i))) {
			
		    temp = temp+c;
		    c = mapping.get(s1.charAt(i));
		   
		}
		System.out.println(temp);
			
	
			
		
			
		
			
		
		


	}

}
