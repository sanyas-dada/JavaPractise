package sanyasdada.com;

import java.util.function.Function;

public class FunctionInterfaceDemo {
	public static void main(String[] args) {
		
		
		// it takes one argument and returns one output 
		// in predicate we used to take 1 input and return type is always boolean
		// in function return type is not fixed hence we declare both input type and return type.
		
		Function<Integer, Integer> sqaureMe = i -> i*i*i;
		System.out.println("cube of 3 is "+ sqaureMe.apply(5));
	}

}
