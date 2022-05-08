package com.sanyasdada.express.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
	private int workerNumber;

	WorkerThread(int number) {
		workerNumber = number;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 100; i += 20) {
			System.out.println("Worker Number:" + workerNumber + ", percent complete: " + i);
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}

		}

	}
}

public class ThreadPoolTest {

	public static void main(String[] args) {
		 int numWorkers = Integer.parseInt(args[0]);
		 int threadPoolSize = Integer.parseInt(args[1]);
	     ExecutorService types = Executors.newFixedThreadPool(threadPoolSize);
	     WorkerThread[] workers = new WorkerThread[numWorkers];
	     for(int i=0; i<numWorkers; i++) {
	    	 workers[i] = new WorkerThread(i);
	    	 types.execute(workers[i]);
	     }
	     types.shutdown();

	}

}
