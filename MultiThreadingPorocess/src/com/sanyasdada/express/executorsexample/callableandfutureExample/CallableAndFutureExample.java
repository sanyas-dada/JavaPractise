package com.sanyasdada.express.executorsexample.callableandfutureExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureExample {

	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(2);

		Future<Integer> sumResult = pool.submit(new SumCalculator(100));
		Future<Integer> FactorialResult = pool.submit(new FactorialCalculator(8));
		try {
			
			  Integer sumValue = sumResult.get(); 
			  System.out.println("Sum value = " + sumValue);
			  
			  Integer factorialValue = FactorialResult.get();
			  System.out.println("factorial Value = " + factorialValue);
			 
			/*
			 * Integer factorialValue = null; try { factorialValue = FactorialResult.get(3,
			 * TimeUnit.SECONDS);
			 * 
			 * } catch (TimeoutException ex) { ex.printStackTrace(); } if (factorialValue !=
			 * null) { System.out.println("Factorial Value = " + factorialValue); } else {
			 * boolean cancelled = FactorialResult.cancel(true);
			 * System.out.println("Task cancelled? " + cancelled); }
			 */
		} catch (InterruptedException | ExecutionException ex) {
			ex.printStackTrace();
		}
		pool.shutdown();

	}

}
