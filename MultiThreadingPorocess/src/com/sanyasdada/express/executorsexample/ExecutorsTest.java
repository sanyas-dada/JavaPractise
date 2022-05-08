package com.sanyasdada.express.executorsexample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsTest {

	public static void main(String[] args) {

		ExecutorService pool = Executors.newSingleThreadExecutor();

		/*
		 * Runnable task = new Runnable() { public void run() {
		 * System.out.println(Thread.currentThread().getName()); System.out.
		 * println("i am going to get job in the software company soon.bless me good");
		 * 
		 * } }; pool.execute(task); pool.shutdown();
		 */

		Callable<Integer> task1 = new Callable<Integer>() {

			@Override
			public Integer call() { 
				try {
					// fake computation time
					Thread.sleep(5000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				return 1000;
			}

		};
		Future<Integer> result = pool.submit(task1);
		try {
			Integer returnValue = result.get();
			System.out.println("Return value = " + returnValue);
		} catch (InterruptedException | ExecutionException ex) {
			ex.printStackTrace();

		}
		pool.shutdown();

	}

}
