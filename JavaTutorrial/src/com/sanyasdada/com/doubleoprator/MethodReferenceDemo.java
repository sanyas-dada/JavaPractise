package com.sanyasdada.com.doubleoprator;

@FunctionalInterface 
interface MyFunctionalInterface1 {
	boolean isEvenNumber(int i);
}

public class MethodReferenceDemo {
	static boolean myImplementation(int i) {
		return i%2 == 0;
	}
	public static void main(String[] args ) {
		//Lambda Example
		MyFunctionalInterface1 mi = i -> i%2 ==0;
		
		  System.out.println(mi.isEvenNumber(15));
		  System.out.println(mi.isEvenNumber(10));
		 
		//using static method
		  MyFunctionalInterface1 mi2 = MethodReferenceDemo::myImplementation;
		  System.out.println(mi2.isEvenNumber(15));
		  System.out.println(mi2.isEvenNumber(10));
		
	}

}
