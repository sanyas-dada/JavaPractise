package com.sanyasdada.collections.Queue.ConsumerExamplesUsingBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				queue.put(produce());
				Thread.sleep(500);
			}
			queue.put(-1);// indicates end of producing
			System.out.println("Producer STOPPED");

		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

	private Integer produce() {
		Integer number = (int) (Math.random() * 100);
		System.out.println("Producing number =>" + number);
		return number;

	}

}

class Program {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(20);
		Thread producer = new Thread(new Producer(queue));
		Thread consumer1 = new Thread(new Consumer2(queue));
		Thread consumer2 = new Thread(new Consumer2(queue));
		Thread consumer3 = new Thread(new Consumer2(queue));
		producer.start();
		consumer1.start();

		consumer2.start();
		consumer3.start();

	}
}
