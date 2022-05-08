package com.sanyasdada.reversedString.Arithmetic;

public class ReversedString {
	
	

	public static void main(String[] args) {
		String name1 = "13531";
	double parseDouble = Double.parseDouble(name1);
	System.out.println(parseDouble);
	
	
	
	   int parseInt = Integer.parseInt(name1);
	    String name ="sanynas";
		System.out.println(parseInt);
		int n = name.length();
		char[] revName = new char[n];
		
		for(int i =0; i<=name.length()/2 ;i++) {
			revName[n-1] = name.charAt(i);
			revName[i]=name.charAt(n-1);
			n--;
			
		}
		System.out.println(revName);

	}

}
