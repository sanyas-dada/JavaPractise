package com.sanyasdada.reversedString.Arithmetic;
import static java.lang.Math.*;
public class Airthmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n = -5.6f;
		float abs = Math.abs(n);
		System.out.println("Absoulete value of -5.6 :"+abs);
		
		double n1 = 3.9;
		float d2 = 4.3f;
		double floor = floor(n1);
		double ceil = Math.ceil(d2);
		System.out.println("The floor value of 3.9:"+floor);
		System.out.println("the ceiling values of 4.3:"+ceil);
		
		System.out.println("sanya\ts\tdada");
		System.out.println("sanyas\b\bdada");
		System.out.println("sanyasdada\ndream:\n\nI am going to make a powerful software application in this world");
		System.out.println("powerful\f software \rappliction");
		
		

	 char[] greeting = {'h','e','l','l','o'};
	 String helloString = new String(greeting);
	 System.out.println(helloString);
	  String quote = "my memory is smart";
	  String repeat = quote.repeat(3);
	  System.out.format("%s%n",repeat);
	  String number="7.5";
	  float parseFloat = Float.parseFloat(number);
	  System.out.println(parseFloat);
	  int i =78;
	  String valueOf = String.valueOf(i);
	  String intToString = Integer.toString(i);
	  System.out.println(valueOf);
	  System.out.println(intToString);
	  
	  // String.valueOf(int i) and Integer.toString(i) methods are same.Coverting
	  // Integer to String.
	  
	         
	      
	}

}
