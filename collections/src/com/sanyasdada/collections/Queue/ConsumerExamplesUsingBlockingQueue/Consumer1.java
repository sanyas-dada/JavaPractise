package com.sanyasdada.collections.Queue.ConsumerExamplesUsingBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer1 implements Runnable {
	private BlockingQueue<Integer> queue;

	public Consumer1(BlockingQueue<Integer> queue) {
		this.queue = queue;

	}

	@Override
	public void run() {
		try {
			while (true) {
				Integer number = queue.take();

				if (number == null || number == -1) {
					break;
				}
				consume(number);
				Thread.sleep(1000);
			}
			System.out.println(" Consumer STOPPED.");

		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

	private void consume(Integer number) {
		System.out.println("Consuming number <= " + number);

	}

}
