package leetcodeproblem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class LongestSubstingWihoutRepeatingCharacter {
	 public static int lengthOfLongestSubstring(String s) {
		 Set<Character>seen = new LinkedHashSet<>();
			int max = 0,i = 0;
		     for(int j= 0;j<s.length();j++) {
		    	 char c = s.charAt(i);
		    	 while(seen.contains(c)) {
		    		 seen.remove(s.charAt(i++));
		    	 }
		    	 seen.add(c);
		    	 System.out.println(c);
		    	 max = Math.max(max, j-i+1);
		     }
		     System.out.println(seen);
		     return max;
	 }
	public static void main(String[] args) {
		  int n = lengthOfLongestSubstring("sanyas");
		  System.out.println("lengthofLongestSubstring:"+n);
       
		char[] vowels =  new char[] {'a','e','i','o','u'};
		String  vowels2 = new String(vowels);
		System.out.println("Converting charcter into String:" +vowels2);
		String s = "sanyas";
		
		boolean contains = s.contains("san");
		if(contains) {
			System.out.println("I am feeling good");
		}else {
			System.out.println("i work my ass off");
		}
	
		// substring method takes index number and
		// return the string at starting index number to the end
		Set<Character> mean = new HashSet<>();
		for(int i = 0;i<s.length();i++) {
			char b = s.charAt(i);
			
			mean.add(b);
		}
		System.out.println(mean);
		
		
		
		
	    	 
	    	 
	    	
	    	
	     
	
	     // how to check the order of element of the sstring in \
	     // you must be figured out the answer of this question kanccha
	     /// you can do it do it right now 
	     // do it right now 
	     // do it rigt nwo 
	     // do ti d rieg now f
	     // do it rig now 
	     // do it right now 
	     // do it right nwo 
	     // do it right now 
	     // do it right now 
	     // do it right now 
	     
	}

}
