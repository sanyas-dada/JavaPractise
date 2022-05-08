package sanyasdada.com;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void  main(String[] args) {
		//PredicateDemo demo = new PredicateDemo();
		//System.out.println(demo.chekingboolean("sanyasdada"));
		
		Predicate<String> checkLength = s -> s.length() >=10;
		System.out.println("The  length of string is greater than 10 :" +checkLength.test("sanyasdada"));
		
	}

	/*
	 * private boolean chekingboolean(String s) { // TODO Auto-generated method stub
	 * if(s.length() <=10) { return true; }else {
	 * System.out.println("this is even number"); return false; }
	 * 
	 * }
	 */

}
