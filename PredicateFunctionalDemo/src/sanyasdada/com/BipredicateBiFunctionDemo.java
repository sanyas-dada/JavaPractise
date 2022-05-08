package sanyasdada.com;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BipredicateBiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiPredicate<Integer, Integer> checkSumOfTwo = (a,b) -> a+b >=5;
		System.out.println("sum of 2 and 5 is greter than 5 :" +checkSumOfTwo.test(2, 5));
		System.out.println("sum of 2 and 2 is greter than 5 :" +checkSumOfTwo.test(2, 2));
		
		BiFunction<Integer,Integer,Integer> multiplyBoth = (a,b) -> a*b;
		System.out.println("Multicipication of 5 and 10 :" +multiplyBoth.apply(5,10));
	}

}
