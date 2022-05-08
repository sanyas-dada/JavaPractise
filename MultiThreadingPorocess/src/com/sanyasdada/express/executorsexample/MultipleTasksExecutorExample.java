package com.sanyasdada.express.executorsexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CountDownClock extends Thread {
	private String clockName;

	public CountDownClock(String clockName) {
		this.clockName = clockName;
	}

	public void run() {
		String threadName = Thread.currentThread().getName();
		for (int i = 4; i >= 0; i--) {
			System.out.printf("%s -> %s:%d\n", threadName, clockName, i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
	}
}

public class MultipleTasksExecutorExample {

	public static void main(String[] args) {
		// ExecutorService pool = Executors.newCachedThreadPool();

		// Java fixed Thread pool executor example
		// ExecutorService pool = Executors.newFixedThreadPool(2);

		// in this fixed Thread pool executor The clocks A and B run first, while
		// the clocks C and D are waiting in the Queue. After A and B completes
		// execution,
		// the 2 threads continue executing the clocks C and D. That's the key behaviours
		// of a fixed thread.
		// pool: limiting the number of concurrent threads and queuing additional tasks.

		// java Single-threaded pool Executor Example

		//ExecutorService pool = Executors.newSingleThreadExecutor();
		//ExecutorService pool = Executors.newFixedThreadPool(2);
		ExecutorService pool = Executors.newCachedThreadPool();
		//ExecutorService pool = Executors.newWorkStealingPool();

		pool.execute(new CountDownClock("A"));
		pool.execute(new CountDownClock("B"));
		pool.execute(new CountDownClock("C"));
		pool.execute(new CountDownClock("D"));
		pool.isShutdown();

	}

}
