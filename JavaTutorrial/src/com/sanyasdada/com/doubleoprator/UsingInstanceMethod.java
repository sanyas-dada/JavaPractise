package com.sanyasdada.com.doubleoprator;
@FunctionalInterface
interface myFunctionalInterface{
	boolean isEvenNumber(int i);
}

public class UsingInstanceMethod {
	// instance method
	boolean myImplementation(int i) {
		return i % 2 == 0;
	}

	public static void main(String[] args) {
		UsingInstanceMethod demo = new UsingInstanceMethod();
		MyFunctionalInterface1 demo2 = new UsingInstanceMethod()::myImplementation;
		MyFunctionalInterface1 demo3 = demo::myImplementation;
		System.out.println(demo2.isEvenNumber(20));
		System.out.println(demo3.isEvenNumber(409));
	}
}
